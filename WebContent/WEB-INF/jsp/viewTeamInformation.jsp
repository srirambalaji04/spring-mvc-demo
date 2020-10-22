<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<jstl:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>View Team Information</title>
</head>
<body>
	<form:form modelAttribute="teamInformation">
		<h3 align="center">${message}</h3>
		<table border="0" align="right" width="80%" cellspacing="10px">
			<tr>
				<td align="left" width="30%">Resource Name &nbsp;&nbsp;</td>
				<td align="left" width="70%">${teamInformation.resourceName}</td>
			</tr>
			<tr>
				<td align="left" width="30%">Age &nbsp;&nbsp;</td>
				<td align="left" width="70%">${teamInformation.age}</td>
			</tr>

			<tr>
				<td align="left" width="30%">Gender &nbsp;&nbsp;</td>
				<td align="left" width="70%">Male<form:radiobutton
						disabled="true" path="gender" value="M" /> Female<form:radiobutton
						path="gender" value="F" />
				</td>
			</tr>
			<tr>
				<td align="left" width="30%">Application Role &nbsp;&nbsp;</td>
				<td align="left" width="70%"><form:select disabled="true"
						path="applicationRole" items="${applicationRoleMap}" /></td>
			</tr>
			<tr>
				<td align="left" width="30%">Experience &nbsp;&nbsp;</td>
				<td align="left" width="70%"><form:select path="experience"
						disabled="true" items="${experienceMap}" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
