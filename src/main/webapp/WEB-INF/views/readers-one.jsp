<html>
<head>
<title>Reader one</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div class="spittleView">
		<div class="spittleMessage"><c:out value="${reader.message}" /></div>
		<div>
			<span class="spittleTime"><c:out value="${reader.time}" /></span>
		</div>
	</div>
</body>
</html>