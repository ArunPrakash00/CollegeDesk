<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="blockServlet" method="post" id="a2">
Enter the teacher id which you want to block:<br>
<input type="text" name="tid" required="required">
<input type="submit" value="Block" >
</form>
<%
RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
rd.include(request, response);
%>
</body>
</html>