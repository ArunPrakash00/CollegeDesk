<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="t4">
<table id="t5" >
<tr>
<th><u>Question_id</u></th>
<th><u>Question</u></th>
</tr>
<%
	Class.forName("com.mysql.jdbc.Driver");
	java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
	java.sql.Statement st=con.createStatement();
	java.sql.ResultSet rs1;
	rs1=st.executeQuery("select Q_no,Q_question from questions where Q_status='unanswered'");
	%>
	<% while(rs1.next()){%>
<tr>
	<td><%out.print(rs1.getString(1)); %></td>
	<td><%out.print(rs1.getString(2)); %></td>
</tr>
<%} %>
</table>
</div>
<form action="answer.jsp" method="post">
<table cellpadding="3pt" id="t6">
<tr>
<td>Question_id:</td>
<td><input type="text" name="q_id"></td>
</tr>
<tr>
<td>Answer:</td>
<td><input type="text" name="ans"></td>
</tr>
<td></td>
<td><input type="submit" value="post"></td>
</table>


</form>
<%
RequestDispatcher rd=request.getRequestDispatcher("viewpage.jsp");
rd.include(request, response);
%>
</body>
</html>