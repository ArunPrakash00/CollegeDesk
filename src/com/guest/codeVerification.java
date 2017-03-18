package com.guest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class codeVerification
 */
@WebServlet("/codeVerification")
public class codeVerification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public codeVerification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter op=response.getWriter();
		//op.print("<br>Inside codeVerifier<br>");
		response.setContentType("text/html");
	String code=request.getParameter("code");
	//String email=request.getParameter("email");
	HttpSession session1=request.getSession();
	String email=(String)session1.getAttribute("email");
	String[] c=email.split("@");
	String[] c1=email.split("a");
     String[] c2=email.split("s");
	//String[] c3=email.split("x");
	String codez=c[0]+c1[0]+c2[0];
	
		if(code.equals(codez)){
			op.println("<html>");
			op.println("<head>");
			op.println("<link rel='stylesheet' type='text/css' href='css/ce.css' />");
			op.println("</head>");
			op.println("<body>");
			op.println("<div id='a'>");
			op.println("<form>");
			op.print("Registeration Successful for email : "+email+"<br>");
			op.println("<br>Click here to LOGIN<br>"+"<a href='index.jsp'>LOGIN </a>");
			    
			op.println("</form>");
			op.println("<footer>");
			op.println("<img src='images/logo.png' >");
			op.println("<div id='footer_text'>NIEC UNIVERSITY</div>");
			op.println("</footer>");
			op.println("</div>");
			op.println("</body>");
			op.println("</html>");
		/*op.print("Registeration Successful for email : "+email+"<br>");
			op.println("<br>Click here to proceed<br>"+"<a href='guestProfile.jsp?email="+email+"'>My Profile</a>");*/
		}
		
		else{
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/helpdesk","root","liontiger123");
				PreparedStatement ps=con.prepareStatement("delete from guest where G_email=?");
				ps.setString(1,email);
				int i=ps.executeUpdate();
				if(i>0){
					op.println("<html>");
					op.println("<head>");
					op.println("<link rel='stylesheet' type='text/css' href='css/ce.css' />");
					op.println("</head>");
					op.println("<body>");
					op.println("<div id='a'>");
					op.println("<form>");
					op.println("Invalid Code Entered. Please Register again"+"<br>");
					op.println("<a href='index.jsp'>Register Again</a>");
				    
					op.println("</form>");
					op.println("<footer>");
					op.println("<img src='images/logo.png' >");
					op.println("<div id='footer_text'>NIEC UNIVERSITY</div>");
					op.println("</footer>");
					op.println("</div>");
					op.println("</body>");
					op.println("</html>");
				}
			}
			catch(Exception e){
				op.println("Exception");
			}
			
			
		}
		
	}

}
