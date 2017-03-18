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
	Class.forName("com.mysql.jdbc.Driver");
	java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
	java.sql.Statement st=con.createStatement();
	java.sql.ResultSet rs1;
	rs1=st.executeQuery("select Q_no,Q_question from questions where Q_status='unanswered'");
	if(rs1!=null){
		RequestDispatcher rd=request.getRequestDispatcher("questiontable.jsp");
		rd.forward(request, response);
	}
	else{
		out.println("No questions available");
		
		RequestDispatcher rd=request.getRequestDispatcher("s_viewpage.jsp");
		rd.include(request, response);
	}
%>

</body>
</html>