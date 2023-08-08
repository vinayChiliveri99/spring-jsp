

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Todo App</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        .container {
            padding: 50px;
        }

        h1 {
            color: #333;
        }

        a {
            text-decoration: none;
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            border-radius: 4px;
        }

        a:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome ${userId} to the Todo App!</h1>
        <p>Manage your tasks and stay organized.</p>
        <br>
        <a href="list-todos">Get Started</a>
    </div>
</body>
</html>
