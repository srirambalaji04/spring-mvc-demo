<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<jstl:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>Team Information</title>
<style>
#error {
	color: red;
}
</style>
</head>
<body>
	<form:form action="${contextPath}/addTeamInformation.do"
		modelAttribute="teamInformation">
		<h3 align="center">${message}</h3>
		<table border="0" align="right" width="80%" cellspacing="10px">
			<tr>
				<td align="left" width="30%">Resource Name &nbsp;&nbsp;</td>
				<td align="left" width="70%">
				<form:input path="resourceName" /> &nbsp;
				<form:errors
						path="resourceName" id="error"/>
				</td>
			</tr>
			<tr>
				<td align="left" width="30%">Age &nbsp;&nbsp;</td>
				<td align="left" width="70%"><form:input path="age" /> &nbsp;
				<form:errors path="age" cssStyle="error"/>
				</td>
			</tr>
			
			<tr>
				<td align="left" width="30%">Gender &nbsp;&nbsp;</td>
				<td align="left" width="70%">Male<form:radiobutton
						path="gender" value="M" /> Female<form:radiobutton path="gender"
						value="F" />&nbsp;
				<form:errors path="gender"	id="error" />
				</td>
			</tr>
			<tr>
				<td align="left" width="30%">Application Role &nbsp;&nbsp;</td>
				<td align="left" width="70%">
				<form:select path="applicationRole" items="${applicationRoleMap}" /> &nbsp;
				<form:errors path="applicationRole" id="error" />
				</td>
			</tr>
			<tr>
				<td align="left" width="30%">Experience &nbsp;&nbsp;</td>
				<td align="left" width="70%">
				<form:select path="experience">
						<form:option value="0" label="--- Select ---" />
						<form:options items="${experienceMap}" />
				</form:select>
				&nbsp;
				<form:errors path="experience" id="error" /></td>
			</tr>
			<tr>
				<td colspan="2">&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2" align="left"><input type="submit" value="submit"></td>
			</tr>
			 
		</table>
	</form:form>
</body>
</html>
