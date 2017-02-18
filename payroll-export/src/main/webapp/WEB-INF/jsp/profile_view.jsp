<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Detail Page</title>
</head>
<body>

<h4>Candidate Profile ID : ${candidateId}</h4>
   <table> 
       <c:forEach items="${candidateList}" var="candidate">     
        <tr>
             <td>First Name :</td>
             <td>${candidate.firstName}</td>
        </tr>
         <tr>
        	<td>Father Name: </td>
            <td>${candidate.fatherName}</td>             
        </tr>     
        <tr>
        	<td>Last Name: </td>
            <td>${candidate.lastName}</td>             
        </tr>        
        <tr>
             <td>Date Of Birth :</td>
             <td>${candidate.dateOfBirth}</td>
        </tr>    
        <tr>
             <td>City :</td>
             <td>${candidate.city}</td>
        </tr>       
       </c:forEach>
   </table>

</body>
</html>