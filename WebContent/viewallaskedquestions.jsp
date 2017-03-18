<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/abc.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<img src="images/profile_default.png"/>
<p id="b">Welcome, student<br>
Student</p>
<div id="a" class="aa">

<p>
<a href="s_update.jsp">Update</a><br>
<a href="s_question.jsp">Ask a questions</a><br>
<a href="viewallaskedquestions.jsp">View all asked questions</a><br>
<a href="logout">Logout</a><br></p>
</div>

<div id="c">

<div id="t8">
<table id="t9" >
<tr>
<th><u>Question_no.</u></th>
<th><u>Question</u></th>
<th><u>Question Status</u></th>
</tr>


<%


Object uid= request.getSession().getAttribute("uname");
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
java.sql.Statement st=con.createStatement();
java.sql.ResultSet rs;

//String sql="SELECT * from questions";
String sql="SELECT * from questions WHERE Q_email='"+uid+"'";

	rs=st.executeQuery(sql);
	while(rs.next()){%>
<tr>	
		<td><%out.print(rs.getString("Q_no"));%></td>
		<td><%out.print(rs.getString("Q_question"));%></td>
		<td><%out.print(rs.getString("Q_status"));%></td>
		
</tr>		
		
	<%} %>	
	
 </table>
</div>
 <%//RequestDispatcher rd=request.getRequestDispatcher("s_viewpage.jsp");
//rd.include(request, response);  %>
</div>
</body>
</html>