<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table id="a6">
<tr>
<th class="a6 a6a">Name</th>
<th class="a6 ">Password</th>
<th class="a6 ">Email</th>
<th class="a6 ">Course</th>
<th class="a6 ">Department</th>
<th class="a6 a6b">Designation</th>
</tr>
<%
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
java.sql.Statement st=con.createStatement();
java.sql.ResultSet rs;


String sql="SELECT * from teacher";

	rs=st.executeQuery(sql);%>
<%	while(rs.next()){ %>
<tr>
<td><%out.print(rs.getString(1)); %></td>

<td><%out.print(rs.getString(2)); %></td>
<td><%out.print(rs.getString(3)); %></td>
<td><%out.print(rs.getString(4)); %></td>
<td><%out.print(rs.getString(5)); %></td>
<td><%out.print(rs.getString(6)); %></td>
</tr>
<%	}

%>
</table>
<%
RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
rd.include(request, response);
%>
</body>
</html>