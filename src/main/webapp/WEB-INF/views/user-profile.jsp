<html>
<head>
<title>User Profile</title>
</head>
	<body>
		<%@ include file="header.jsp" %>
		
		<h3>Your profile</h3>
		<div>User Name: <c:out value="${reader.userName}" /></div>
		<div>First Name: <c:out value="${reader.firstName}" /></div>
		<div>Last Name: <c:out value="${reader.lastName}" /></div>
	</body>
</html>