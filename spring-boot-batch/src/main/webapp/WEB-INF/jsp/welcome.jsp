<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
					<li><a href="#register">Register</a></li>
					<li><a href="#about">About</a></li>
					<li><a href="#login">Login</a></li>
					<li><a href="#contactUs">Contact Us</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="starter-template">
			<h1>Registration Application.</h1>
			<h2>${message}</h2>
	</div>
<form action="/getCandidate">
  Candidate Id:  <input type="text" name="id" >
  <input type="submit" value="View">  
   <br>
</form>

<form action="/deleteCandidate">
  Delete Candidate Id:  <input type="text" name="id" >
  <input type="submit" value="Delete">  
   <br>
</form>
		
<form action="/getCandidateList">
  Search Candidate By City : <input type="text" name="city" >
  <input type="submit" value="Search"> 
   <br> 
</form>

<form action="/getCandidateList">
  Search Candidate By Age : <input type="text" name="city" >
  <input type="submit" value="Search">
   <br>  
</form>

<form action="/addCandidate">
  <br>
  Register Candidate: 
   <br>
  Enter Your First Name: <input type="text" name="firstname" > <br>
  Enter Your Last Name: <input type="text" name="lastname" > <br>
  <input type="submit" value="Register">  
</form>
		
<img src="/images/candidate.jpg" width="800px" height="120px"/>
<!-- 
<img src="<c:url value='/images/shaadi.jpg'/>" /> 
<img src="${pageContext.request.contextPath}/images/shaadi.jpg"/> 
<img src="${pageContext.servletContext.contextPath}/images/shaadi.jpg" alt=""/>
<img src="../images/shaadi.jpg" alt=""/>
 -->
 


	</div>
	<!-- /.container -->
	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
