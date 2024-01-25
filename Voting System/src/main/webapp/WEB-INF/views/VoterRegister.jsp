<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<style>
    body {
        font-family: sans-serif;
        margin: 0;
        padding: 0;
    }

    nav {
        padding: 20px;
    }

    main {
        padding: 20px;
    }

    footer {
        background-color: #222;
        color: #fff;
        padding: 20px;
        position: fixed;
        bottom: 0;
        left: 0;
        right: 0;
    }
</style>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<header class="bg-dark text-white">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="/">GEVS</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="/">HOME</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>
<body>
<div class="container mt-4">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h2 class="mb-4">Voter Registration</h2>
            <form action="/VoterRegister" method="post">
                <div class="mb-3">
                    <label> Full Name </label>
                    <input type="text" class="form-control" id="full_name" name="full_name" required><br>
                    <label> DOB </label>
                    <input type="date" class="form-control" id="DOB" name="DOB" required><br>
                    <label> Password </label>
                    <input type="password" class="form-control" id="password" name="password" required><br>
                    <label> UVC </label>
                    <input type="text" class="form-control" id="UVC" name="UVC" required><br>
                    <div style="width: 500px" id="reader"></div>
                    <label> Constituency </label>
                    <input type="number" class="form-control" id="constituency_id" name="constituency_id" required><br>
                </div>
                <input type="submit" class="btn btn-primary" id="register" value="Register">
                <br><br>
            </form>
            <br>
        </div>
    </div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/html5-qrcode/2.3.8/html5-qrcode.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
    function onScanSuccess(decodedText, decodedResult) {
        // Handle on success condition with the decoded text or result.
        console.log(`Scan result: ${decodedText}`, decodedResult);
        $('#UVC').val(decodedText);
    }

    function onScanError(errorMessage) {

    }

    var html5QrcodeScanner = new Html5QrcodeScanner(
        "reader", { fps: 10, qrbox: 250 });
    html5QrcodeScanner.render(onScanSuccess, onScanError);

</script>

<footer>
</footer>
</body>
</html>
