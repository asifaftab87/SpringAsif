<html>
	<head>
		<title>Registration page</title>
	</head>
	
	<body>
		<%@ include file="header.jsp" %>
		<h1>Register</h1>
		<form method="POST">
			First Name: <input type="text" name="firstName" /><br/>
			Last Name: <input type="text" name="lastName" /><br/>
			Username: <input type="text" name="userName" /><br/>
			Password: <input type="password" name="password" /><br/>
			<input type="submit" value="Register" />
		</form>
	</body>
	
</html>