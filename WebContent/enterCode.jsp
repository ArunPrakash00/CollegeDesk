<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="css/ce.css" />
<!-- <h4>Enter the verification code that you received in your Email </h4><br> -->
</head>
<body>

<%response.setContentType("text/html"); 
HttpSession session1 =request.getSession();
String email=(String)session1.getAttribute("email");
//out.println("email where code was sent is "+email+"<br>");
%>
<div id="a">

    <form action="codeVerification" method="post">
    	An email has been sent to email id <%=email %><br>
        Enter Code Here <input type="text" name="code" required="required">
        <input type="submit" value="Verify Code" >
    </form>


    <footer>
        <img src="images/logo.png" >
        <div id="footer_text">NIEC UNIVERSITY</div>





    </footer>
</div>
<%-- <form action="codeVerification?email=<%=email%>" method="post" >
Enter Code Here <input type="text" name="code">
 <br><input type="submit" value="Verify Code" >


</form> --%>


</body>
</html>