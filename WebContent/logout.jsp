<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 

    pageEncoding="ISO-8859-1"%>
    <%@ page  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
HttpSession session1 = request.getSession(false);
		if(session!=null)
		session.invalidate();
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' type='text/css' href='css/ce.css' />");
		out.println("</head>");
		out.println("<body>");
		 out.println("<script type='text/javascript'>");
		    out.println("alert('You have been successfully logged out !!');");
		    out.println("</script>");
		    out.println("</body>");
			out.println("</html>");
		//out.print("alert('you have been successfully logged out !!')");
		response.sendRedirect("adminLogin.jsp");
	/* RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response); */
		 %>

</body>
</html>