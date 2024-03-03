<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://struts.apache.org/tags-html" prefix="h" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h:form action="viewVisitor.do">
<table border="3" bgcolor="yellow"></table>
<tr><td>RID</td><td><input type="text" name="rid"/></td></tr>
<tr><td><h:submit property="method" value="search"></h:submit></td></tr>

</h:form>
</body>
</html>