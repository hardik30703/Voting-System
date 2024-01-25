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
    <title>Login Form</title>
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
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h2 class="mb-4">Election Commission Officer Login</h2>
            <form action="/ElectionCommissionOfficerLogin" method="post">
                <div class="mb-3">
                    <label>Username</label>
                    <input type="text" class="form-control" id="username" name="username" required><br>
                    <label>Password</label>
                    <input type="password" class="form-control" id="password" name="password" required><br>
                </div>
                <input type="submit" class="btn btn-primary" id="login" value="Login">
            </form>
            <br>
        </div>
    </div>
</div>
<footer>
</footer>
</body>
</html>
