<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <html>
   <body>
        <h1>Edit Employee</h1>  
       <form name='employee' action="<c:url value='/edit' />" method='POST'>    
		<table >    
		        <tr>  
		        <td>ID</td>    
		        <td><input type='text' name='id' value='${emp.id}'></td> 
		         </tr>   
		         <tr>    
		          <td>NAME </td>   
		          <td><input type = 'text' name = 'name' value = '${emp.name}'></td>
		         </tr>    
		         <tr>    
		          <td>SALARY :</td>    
		         <td><input type = 'text' name = 'salary' value = '${emp.salary}'></td>  
		         </tr>   
		         <tr>    
		          <td>DESIGNATION :</td>    
		          <td><input type = 'text' name = 'designation' value = '${emp.designation}'></td>
		         </tr>   
           
		         <tr>    
		          <td><input type="submit" value="UPDATE" /></td>    
		         </tr>    
		        </table>
	    </form> 
	    </body>  
	   <html>