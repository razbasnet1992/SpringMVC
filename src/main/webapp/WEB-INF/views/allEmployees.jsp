<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h10><em>Employees List</em></h10>
<table>
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>SALARY</th>
		<th>DESIGNATION</th>
		<th>EDIT</th>
		<th>DELETE</th>
	</tr>
	<c:forEach var="emp" items="${list}">
		<tr>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			<td>${emp.salary}</td>
			<td>${emp.designation}</td>
			<td><a href="<c:url value='/edit/${emp.id}' />">EDIT</a></td>
			<td><a href="<c:url value='/delete/${emp.id}' />">DELETE</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="<c:url value='/employee' />">Add New Employee</a>
