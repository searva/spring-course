<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spittles</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/style.css" />">
</head>
<body>
	<c:forEach items="${spittleList}" var="spittle">
		<li id="spittle_<c:out value="spittle.id"/>">
			<div class="spittleMessage">
				<c:out value="${spittle.message}" />
			</div>
			<div>
				<span class="spittleTime"> 
					<c:out value="${spittle.time}" />
				</span> 
				<span class="spittleTime"> 
					<c:out value="${spittle.latitude}" />
				</span> 
				<span class="spittleTime"> 
					<c:out value="${spittle.longitude}" />
				</span>
			</div>
		</li>
	</c:forEach>


</body>
</html>