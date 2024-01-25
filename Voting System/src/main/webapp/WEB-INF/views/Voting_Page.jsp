<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>GEVS</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
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
<body>
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
                        <a class="nav-link" href="/Voting_Page">VOTE FOR MP</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/">LOGOUT</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>
<main class="container"><br>
    <h2><b>Vote for your new MP</b></h2><br>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Candidate ID</th>
            <th>Candidate</th>
            <th>Party ID</th>
            <th>Constituency ID</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${candidates}" var="candidate">
            <tr>
                <td>${candidate.canid}</td>
                <td>${candidate.candidate}</td>
                <td>${candidate.party_id}</td>
                <td>${candidate.constituency_id}</td>
                <td>
                    <c:choose>
                        <c:when test="${!votingEnded}">
                            <a href="/vote/${candidate.canid}" class="btn btn-info">Vote</a>
                        </c:when>
                        <c:otherwise>
                            <button class="btn btn-info" disabled>Vote</button>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
</body>
</html>