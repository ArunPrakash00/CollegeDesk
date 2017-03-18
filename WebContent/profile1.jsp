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

<table id="t1" border="1">
<%
Object uid= request.getSession().getAttribute("uname");
System.out.println(uid);
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
java.sql.Statement st=con.createStatement();
java.sql.ResultSet rs1;
rs1=st.executeQuery("select T_id,T_name,T_email,T_department,T_designation,T_course from teacher where T_id='"+uid+"'");
%>
<% while(rs1.next()){%>

<tr>
<td>Id:</td>
 <td><%out.print(rs1.getString(1));  %></td>
 </tr>
<tr>
<td>Name:</td>
<td><%out.print(rs1.getString(2));  %></td>
<tr>
<td>Email:</td>
<td><%out.print(rs1.getString(3));  %></td>
</tr>

<tr>
<td>Department:</td>
<td><%out.print(rs1.getString(4));  %></td>
</tr>
<tr>
<td>Designation:</td>
<td><%out.print(rs1.getString(5));  %></td>
</tr>
<tr>
<td>Course:</td>
<td><%out.print(rs1.getString(6));  %></td>
</tr>

<%} %>
</table>


<%
RequestDispatcher rd=request.getRequestDispatcher("viewpage.jsp");
rd.include(request, response);
%>

</body>
</html>