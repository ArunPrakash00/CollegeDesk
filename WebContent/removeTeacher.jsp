<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="removeTeacherServlet" method="post" id="a1">
<u>Details of teacher to be removed</u> :<br><br>

Tid :<input type="text" name="Tid" required="required"><br>
<input type="submit" value="Remove">
</form>
<%
RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
rd.include(request, response);
%>
</body>
</html>