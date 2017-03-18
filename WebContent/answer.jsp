<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String qid=request.getParameter("q_id");
String qans=request.getParameter("ans");
    Class.forName("com.mysql.jdbc.Driver");
	java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
	java.sql.Statement st=con.createStatement();
	st.executeUpdate("update questions set Q_answer='"+qans+"',Q_status='answered' where Q_no='"+qid+"'");
	out.println("You have successfully posted the question");
%>
<%
RequestDispatcher req=request.getRequestDispatcher("viewpage.jsp");
req.include(request, response);
%>
</body>
</html>