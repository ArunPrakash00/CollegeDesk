<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" type="text/css" href="css/admin.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="box">
<form action="a_login" method="post">
    Admin login:<br>
    Name:<input type="text" name="id" required="required"><br>
    Password: <input type="password" name="password" required="required"><br>
    <input type="submit" value="LOGIN">
    <input type="button" onclick="location.href='index.jsp'" value="HOME">   
    
</form>
</div>
</body>
</html>