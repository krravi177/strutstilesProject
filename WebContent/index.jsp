<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://struts.apache.org/tags-html" prefix="h" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h:form action="login.do">
<table border="3" bgcolor="yellow">
<tr><td>UID</td><td><h:text property="uid"></h:text></td></tr>
<tr><td>PASS</td><td><h:password property="pass"/></td></tr>
<tr><td><h:submit property="method" value="login" /></td></tr>
</table>
</h:form>


</body>
</html>