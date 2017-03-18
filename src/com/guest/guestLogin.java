package com.guest;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class guestLogin
 */
@WebServlet("/guestLogin")
public class guestLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public guestLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("user");
		String pass=request.getParameter("pass");
		HttpSession session1=request.getSession();
		session1.setAttribute("email", email);
		//Object email=request.getAttribute("user_id");
		//Object pass=request.getAttribute("user_pwd");
		PrintWriter op=response.getWriter();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
			PreparedStatement smt=con.prepareStatement("select G_name from guest where G_email=? and G_password=?");
			smt.setString(1,email);
			smt.setString(2,pass);
			ResultSet rs=smt.executeQuery();
			System.out.println(email);
			System.out.println(pass);
			//String name=rs.getString("G_name");
			if(rs.next()){
				RequestDispatcher rd=request.getRequestDispatcher("guestProfile.jsp");
				rd.include(request,response);
				//op.println("Welcome "+name);
			}
			else{
				//op.print("Invalid Email or password.<br> Login again");
				op.println("<html>");
				op.println("<head>");
				
				op.println("</head>");
				op.println("<body>");
				op.println("<script type='text/javascript'>");
			    op.println("alert('Invalid Email or password');");
			    op.println("</script>");
			    op.println("</body>");
				op.println("</html>");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.forward(request,response);
			}
		}
			catch(Exception e){
			op.println("Exception occured ");
			e.printStackTrace();
			}
		
		
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("user");
		String pass=request.getParameter("pass");
		HttpSession session1=request.getSession();
		session1.setAttribute("email", email);
		//Object email=request.getAttribute("user_id");
		//Object pass=request.getAttribute("user_pwd");
		PrintWriter op=response.getWriter();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
			PreparedStatement smt=con.prepareStatement("select G_name from guest where G_email=? and G_password=?");
			smt.setString(1,(String) email);
			smt.setString(2,(String) pass);
			ResultSet rs=smt.executeQuery();
			//String name=rs.getString("G_name");
			if(rs.next()){
				response.sendRedirect("guestProfile.jsp");
				//op.println("Welcome "+name);
			}
			else{
				op.print("Invalid Email or password.<br> Login again");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.include(request,response);
			}
		}
			catch(Exception e){
			op.println("Exception occured ");
			e.printStackTrace();
			}
		
			
		}
		
		
		
	}


