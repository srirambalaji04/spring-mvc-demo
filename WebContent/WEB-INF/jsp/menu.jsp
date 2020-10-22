<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<jstl:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
	<h2>Team Information</h2>
	<b>&nbsp;<a href="${contextPath}/showTeamInformation.do">Add </a></b>
	<br />
	<br />
	<b>&nbsp;<a href="${contextPath}/editTeamInformation.do">Edit </a></b>
	<br />
	<br />
	<b>&nbsp;<a href="${contextPath}/viewTeamInformationList.do">View </a></b>
	<br />
	<br />
	<b>&nbsp;<a href="${contextPath}/logout.do">Logout </a></b>
	<br />
	<br />
</body>
</html>