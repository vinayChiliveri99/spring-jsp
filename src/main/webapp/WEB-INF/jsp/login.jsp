<html>
<head>
	<title>Login Page</title>
	<link href ="webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
	
	<style>
		.login-form {
			width: 400px;
			height: 350px;
			position: absolute;
			background-color:red;
			border-radius: 20px;
			top: 50%;
			left: 50%;
			margin-right: -50%;
			transform: translate(-50%, -50%);
		}
		
		h3 {
			text-align: center;
		}
	</style>
</head>


<body>
	
	<h2>${errorMsg}</h2>
	<br><br><br>
	    <h3> Toyota Application Management System </h3>  
	<div class="login-form">
	
		<div class="container-fluid">
			<form method = "post">
			<br>
				<label>UserID</label>
				<input type = "text" name = "userId" class="form-control mt-3"/><br>
				<br>
				<label>Password</label>
				<input type = "password" name = "password" class="form-control mt-3" />
				<br><br>
				<button class="btn btn-dark btn-block mt-3">Login</button>
			</form>
		</div>
	</div>
	
</body>
</html>

