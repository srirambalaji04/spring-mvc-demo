<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<jstl:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>View Team Information List</title>
</head>
<body>
	<br />
	<form:form>
		<table border="0" align="right" width="80%" cellspacing="10px">
			<tr>
				<td align="left" width="20%"><b>Resource Name</b> &nbsp;&nbsp;</td>
				<td align="left" width="20%"><b>Age</b> &nbsp;&nbsp;</td>
				<td align="left" width="20%"><b>Gender</b> &nbsp;&nbsp;</td>
				<td align="left" width="20%"><b>Application Role</b>
					&nbsp;&nbsp;</td>
				<td align="left" width="20%"><b>Experience</b> &nbsp;&nbsp;</td>
			</tr>
			<jstl:forEach var="teamInformation" items="${teamInformationList}">
				<tr>
					<td align="left" width="20%">${teamInformation.resourceName}</td>
					<td align="left" width="20%">${teamInformation.age}</td>
					<td align="left" width="20%">${teamInformation.gender}</td>
					<td align="left" width="20%">
					<jstl:choose>
							<jstl:when test="${teamInformation.applicationRole eq 1}">
								Developer
							</jstl:when>
							<jstl:otherwise>
								Tester
							</jstl:otherwise>
						</jstl:choose>
					<td align="left" width="20%"><jstl:choose>
							<jstl:when test="${teamInformation.experience eq 1}">
								1 to 5 Years
							</jstl:when>
							<jstl:otherwise>
								5 to 10 Years
							</jstl:otherwise>
						</jstl:choose>
				</tr>
			</jstl:forEach>
		</table>
	</form:form>
</body>
</html>
