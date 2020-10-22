<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<jstl:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
</head>
<body>
	<br/>
	<br/>
	<h1 align="center" style="color: blue;">Welcome to Spring-MVC-Demo
		Application</h1>
	<form:form action="${contextPath}/login.do"
		modelAttribute="loginDetails" method="post">
		<table border="0" align="center">
			<tr>
				<td style="color: red;">${message}&nbsp;</td>
			</tr>
			<tr>
				<td style="color: red;"><form:errors path="username"
						cssClass="error" />&nbsp;</td>
			</tr>
			<tr>
				<td style="color: red;"><form:errors path="password"
						cssClass="error" />&nbsp;</td>
			</tr>
		</table>
		


		<table border="0" align="center">
			<tr>
				<td>User Name</td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
