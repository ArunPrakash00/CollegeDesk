<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<h3><u>Feedback Form</u></h3><br><br>
</head>
<body>
<% String email=request.getParameter("email"); %>
<form action="guestFeed?email=<%=email %>" method="post">
Enter Feedback form here<br><input type="text" name="feed">
<input type="submit" value="Submit Feedback" >

</form>

</body>
</html>