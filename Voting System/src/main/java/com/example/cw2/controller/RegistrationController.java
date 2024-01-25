package com.example.cw2.controller;

import com.example.cw2.Service.UVCCodesService;
import com.example.cw2.Service.VoterService;
import com.example.cw2.domain.Election_Commission_Officer;
import com.example.cw2.domain.UVC_Codes;
import com.example.cw2.domain.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class RegistrationController {
    @Autowired
    VoterService vs;

    @Autowired
    UVCCodesService uvcCodesService;

    private static final List<String> validUvcCodes = Arrays.asList("2E5BHT5R", "2GYDT5D3", "2LJFM6PM", "2TEHRTHJ", "38NWLPY3",
            "5492AC6V", "556JTA32", "75NKUXAH", "7983XU4M", "7XUFD78Y", "8TEXF2HD", "9FCV9RMT", "9GTZQNKB", "B7DMPWCQ",
            "BBMNS9ZJ", "BKMKJN5S", "BQCRWTSG", "D5BG6FDH", "DBAD57ZR", "DBP4GQBQ", "DHKVCU8T", "G994LD9T", "HH64FWPE",
            "JA9WCMAS", "JF2QD3UF", "K3EVS3NM", "K96JNSXY", "KSM9NB5L", "KYMK9PUH", "LUFKZAHW", "LVTFN8G5", "ML5NSKKG",
            "N6HBFD2X", "NW9ETHS7", "PFXB8QXM", "Q452KVQE", "RXLNLTA6", "TH9A6HUB", "TZZZCJV8", "U5LGC65X", "UMT3RLVS",
            "UNP4A5T7", "UVE5M7FR", "VFBH8W6W", "W44QP7XJ", "WL3K3YPT", "WPC5GEHA", "YADA47RL", "Z93G7PN9", "ZSRBTK9S");

    @GetMapping("/VoterRegister")
    public String showRegistrationForm() {
        return "VoterRegister";
    }

    @PostMapping("/VoterRegister")
    public String submitRegistrationForm(@RequestParam String full_name, @RequestParam String DOB,
                                         @RequestParam String password, @RequestParam String UVC,
                                         @RequestParam int constituency_id) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        // Convert the hash to a hexadecimal string
        String hexHash = bytesToHex(hash);

        if (!validUvcCodes.contains(UVC)) {
            return "ErrorPage1";
        }

        UVC_Codes uvc = uvcCodesService.findByCode(UVC);
        if (uvc != null && uvc.getCode().equals(UVC)) {
            return "ErrorPage2";
        }
        UVC_Codes uvcCodes = new UVC_Codes(UVC);
        uvcCodesService.save(uvcCodes);
        Voter voter = new Voter(full_name, DOB, hexHash, UVC, constituency_id);
        vs.save(voter);

        return "Voter_Dashboard";
    }

    private static String bytesToHex(byte[] hash) {
        final StringBuilder builder = new StringBuilder();
        for (byte b : hash) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }

}
