<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" import="java.io.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style2.css" />
</head>
<body>
 <br>
<%//String email=request.getParameter("email"); 
HttpSession session1 =request.getSession();
String email=(String)session1.getAttribute("email");
try{
	PrintWriter op=response.getWriter();
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
PreparedStatement st=con.prepareStatement("select G_name from guest where G_email=?");
st.setString(1,email);
ResultSet rs=st.executeQuery();
if(rs.next()){
	 //op.println("<a href='guestProfile.jsp?email="+email+"'> Profile</a>");
	 //out.println("<a href='guestViewQuestions?email="+email+"'>Previous Questions</a><br>");
	// out.println("<a href='guestRegistrationForm.jsp'>Logout</a><br>");
	

String name=rs.getString("G_name");
%>
<div id="ab">
    <div id="ab1">
        <img src="images/profile_default.png">

    </div>
    <div id="ab2">
        <h3>Welcome,<%=name %>


Guest
</div>
<div id="ab3">
    <a href="guestProfile.jsp" >Post a question</a><br>
    <a href="guestViewQues.jsp">Previously Asked Question</a><br>
    <a href="index.jsp" >Logout</a><br>
</div>
<%
} 
}
catch(Exception e){
out.println("Exception in question database(guestAddQuestion)");
}
%>
</div>
<div id="cd">
    
    <a name="Cda"></a>
    <div id="cd1">

        <h3>Post your question</h3>
        <div id="search">
            <form action="guestAddQuestion" method="post">
                <div id="text"> <input type="search" name="que" placeholder="Type your query here..."  class="black" required="required"></div>
                <div id="button"><input type="submit"  value="Post" onclick="alert('Question added Successfully!!')"></div>

            </form>
    </div>
    </div>

    </div>


<%-- <form action="guestAddQuestion?email=<%=email%>" method="post" >
<h4>Hello !!! You can post your Question below .</h4><br>
Post Question here <input type="text" name="que"><br><input type="submit" value="Post Question" >
<br>

</form><br><br><br> --%>
<%-- Click <a href="guestFeedback.jsp?email<%=email %>"><u>here</u></a> to submit a Feedback.  --%>

</body>
</html>