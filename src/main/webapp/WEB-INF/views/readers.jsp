<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<h2>reader.jsp</h2>
	<c:forEach items="${readerList}" var="reader" >
		<li id="spittle_<c:out value="reader.id"/>">
		<div class="spittleMessage">
			<c:out value="${reader.message}" />
		</div>
		<div>
		<span class="spittleTime"><c:out value="${reader.time}" /></span>
		<span class="spittleLocation">
		(<c:out value="${reader.latitude}" />,
		<c:out value="${reader.longitude}" />)</span>
		</div>
		</li>
	</c:forEach>
</body>
</html>