<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<script type="text/javascript" src="jquery-1.2.6.min.js"></script>
<title>Add Minutes Page</title>
</head>
<body>
	<br />
		<h2>Add Minutes Exercise !!</h2>
<form:form commandName="exercise" >
<table>
<tr> 
<td> <spring:message code="goal.txt"> </spring:message></td>
<td> <form:input path="minutes"/></td>
</tr>
<tr> 
<td colspan="2"> 
<input type="submit"  value = "Enter Excercise"/>
</td>
</tr>

</table>
</form:form>
</body>
</html>
