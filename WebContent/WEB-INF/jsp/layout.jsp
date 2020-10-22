<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><tiles:insertAttribute name="title" /></title>
<style>
#header {
	background-color: #edf2fc;
	color: #0544aa;
	text-align: center;
	width: 100%;
	padding-top: 1px;
	padding-bottom: 1px;
	border-bottom-color: black;
	border-bottom-style: solid; 
}
#menu {
	background-color: #edf2fc;
	color: #0544aa;
	position: fixed;
	width: 15%;
	left: 1; 
	height: 90%;
}


#footer {
	background-color: silver;
	color: black;
	font-size: x-small;
	bottom: 0;
	position: fixed;
	text-align: right;
	width: 100%;
	border: 0px;
	padding-top: 5px;
	padding-bottom: 5px;
}

#body {
	color: #0544aa;
	right: 0;
	width: 80%;
	height: 90%;
}

</style>
</head>
<body>
	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="menu">
		<tiles:insertAttribute name="menu" />
	</div>
	<div id="body">
		<tiles:insertAttribute name="body" />
	</div>
	<div id="footer">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>