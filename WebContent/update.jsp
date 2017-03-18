<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.RequestDispatcher" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<form action="teacherUpdate" method="post">
<table cellpadding="3pt" id="t2">
<tr>
<td>Id:</td>
 <td><input type="text" name="t_id" placeholder="Cannot be changed" required="required"></td>
 </tr>
<tr>
<td>Name:</td>
<td><input type="text" name="t_name" required="required"></td>
<tr>
<td>Email:</td>
<td><input type="text" name="t_email" required="required"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="t_password" required="required"></td>
</tr>
<tr>
<td>Department:</td>
<td><input type="text" name="t_dept" required="required"></td>
</tr>
<tr>
<td>Designation:</td>
<td><input type="text" name="t_desg" required="required"></td>
</tr>
<tr>
<td>Course:</td>
<td><input type="text" name="t_course" required="required"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="update" required="required"></td>

</tr>
</table>

</form>
<%
RequestDispatcher rd=request.getRequestDispatcher("viewpage.jsp");
rd.include(request, response);
%>

</body>
</html>