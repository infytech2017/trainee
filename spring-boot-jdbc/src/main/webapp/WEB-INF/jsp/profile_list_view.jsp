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

<h4>Your Search Result as below: </h4>
   <table>     
        <tr>
             <td>Profile Id</td>
             <td>First Name</td>
             <td>Last Name</td>  
             <td>Date Of Birth</td>
             <td>Permanent Address</td>
        </tr>
   </table>
   
   <table> 
       <c:forEach items="${candidateList}" var="candidate">     
        <tr>
             <td>${candidate.id }</td> 
             <td>${candidate.firstName}</td>
             <td>${candidate.lastName}</td> 
             <td>${candidate.permanentAddress}</td> 
             
        </tr>
        </c:forEach>
   </table>

</body>
</html>