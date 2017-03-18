<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.RequestDispatcher" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
<table cellpadding="3pt" id="t2">
<tr>
<td>Enrollment No.:</td>
 <td><input type="text" name="s_enroll" placeholder="(cannot be changed)"></td>
 </tr>
<tr>
<td>name:</td>
<td><input type="text" name="s_name"></td>
<tr>
<td>email:</td>
<td><input type="text" name="s_email"></td>
</tr>
<tr>
<td>password:</td>
<td><input type="password" name="s_password"></td>
</tr>
<tr>
<td>Department:</td>
<td><input type="text" name="s_department"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="update"></td>
</tr>
</table>

</form>
<%RequestDispatcher rd=request.getRequestDispatcher("s_viewpage.jsp");
rd.include(request, response);  %>
</body>
</html>