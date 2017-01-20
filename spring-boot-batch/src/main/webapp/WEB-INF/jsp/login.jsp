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
					<li><a href="#contactUs">Contact Us</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="starter-template">
			<h1>Welcome to Shaadi Matrimonial.</h1>
	</div>

<form action="/loginCandidate">
  UserName:  <input type="text" name="username" > <br>
  Password: <input type="password" name="password" > <br>
  <input type="submit" value="Login">  
  <br>
</form>

<img src="/images/shaadi.jpg" width="800px" height="360px"/>
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
