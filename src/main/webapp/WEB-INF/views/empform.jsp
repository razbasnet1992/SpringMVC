<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
	
 <h1>Add New Employee</h1>  
      <form name='employee' action="<c:url value='/employee' />" method='POST'>  
        <table >    
        <tr>  
        <td>ID</td>    
        <td><input type='text' name='id' value=''></td> 
         </tr>   
         <tr>    
          <td>NAME </td>   
          <td><input type = 'text' name = 'name' value = ''></td>
         </tr>    
         <tr>    
          <td>SALARY :</td>    
         <td><input type = 'text' name = 'salary' value = ''></td>  
         </tr>   
         <tr>    
          <td>DESIGNATION :</td>    
          <td><input type = 'text' name = 'designation' value = ''></td>
         </tr>   
           
          <tr>    
            
		   <td><input type="submit" value="SAVE" /></td> 
		    </tr>    
		    </table>
	    </form> 
	    </body>  
	   <html>