<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style2.css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%		
		//Object Q_email=request.getAttribute("Q_email");
		//String q_email=(String)Q_email;
		HttpSession session1 =request.getSession();
String email=(String)session1.getAttribute("email");
%>
<div id="ab">
    <div id="ab1">
        <img src="images/profile_default.png">

    </div>
    <div id="ab2">
        <h3>Welcome, <%=email%></h3>
        Guest
    </div>
    <div id="ab3">
        <a href="guestProfile.jsp" >Post a question</a><br>
    <a href="guestViewQuestions">Previously Asked Question</a><br>
    <a href="index.jsp" >Logout</a><br>
    </div>

</div>
<div id="cd">
    
    <div id="cd2">
            <a name="Cdb"></a>
            <h3>Your Questions</h3>
            
				<table id="t1">
				<tr>
				<th>Ouestion No.</th>
				<th>Questions</th>
				<th></th>
				</tr>

<%
//String email=request.getParameter("email");
		
		PrintWriter op=response.getWriter();
		// op.println("<a href='guestProfile.jsp?email="+email+"'>  Profile</a>");
	//	op.println("<a href='guestRegistrationForm.jsp'>Logout</a><br>");
		//op.print("<br><u>Your Previous Questions</u><br><br>");
		
				
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
			PreparedStatement st=con.prepareStatement("select Q_no,Q_question from questions where Q_user='guest' and Q_email=?");
			st.setString(1,email);
			//op.println("<u>Q_Number</u>"+" &nbsp&nbsp&nbsp <u> Question</u><br>");
			ResultSet rs=st.executeQuery();
			while(rs.next()){
				String Q_que=rs.getString("Q_question");
				String Q_no=rs.getString("Q_no");
				//String Q_email=rs.getString("Q_email");
				response.setContentType("text/html");
				//request.setAttribute("Q_no",Q_no);
				//request.setAttribute("Q_question",Q_que);%>
				<tr>
					<td><%=Q_no%></td>
					<td><%=Q_que%>
					<td><a href='guestAnswers?Q_no=<%=Q_no%>'>Check for Answer</a></td>
					</tr>	
				
		<% 	}
		}
		catch(Exception e){
			op.println("Exception");
			e.printStackTrace();
		}%>

					

        </div >
    

    </div>
</body>
</html>