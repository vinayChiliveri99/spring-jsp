<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f4f4;
            font-family: Arial, sans-serif;
        }

        .login-form {
            width: 400px;
            height: auto;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            padding: 20px;
            border-radius: 20px;
            background-color: #ffffff;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        }

        h1, h2 {
            text-align: center;
        }
    </style>
</head>

<body>

    <h2>${errorMsg}</h2>
    <br><br><br>
    <h1>To-Do Application</h1>
    <br>
    <h2>Login Page</h2>
    <div class="login-form">

        <div class="container-fluid">
            <form method="post">
                <br>
                <label for="userId">UserID</label>
                <input type="text" id="userId" name="userId" class="form-control mt-3" required /><br>
                <label for="password">Password</label>
                <input type="password" id="password" name="password" class="form-control mt-3" required />
                <br>
                <div class="login-button">
                <button class="btn btn-dark btn-block mt-3">Login</button>
                </div>
                <div class="mt-3 text-center">
                    <a href="/forgot-password">Forgot Password?</a>
                </div>
            </form>
        </div>
    </div>

</body>
</html>
