<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>WELCOME  </h1>
<h1>Click to Add or View</h1>



<a href="<c:url value='/employee' />">Add Employees</a>
<a href="<c:url value='/viewemp' />">View All Employees</a>
</body>
</html>
