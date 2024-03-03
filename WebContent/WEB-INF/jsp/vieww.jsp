<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3" bgcolor="yellow">
<tr><td>State Name </td><td>DistName </td><td> Name </td><td>Email</td><td>Phone </td><td>Address</td><td>VID </td></tr>

<logic:present name="lst">
<logic:iterate id="lst" name="lst">

<tr>
<td><b:write name="lst" property="stCode"/></td>
<td><b:write name="lst" property="distCode"/></td>
<td><b:write name="lst" property="vName"/></td>
<td><b:write name="lst" property="vEmail"/></td>

<td><b:write name="lst" property="vPhone"/></td>
<td><b:write name="lst" property="vAdd"/></td>
<%-- <td><b:write name="lst" property="rid"/></td> --%>
</tr>


</logic:iterate>
</logic:present>


</table>

</body>
</html>