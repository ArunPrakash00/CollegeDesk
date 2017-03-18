package com.guest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 1737837893479L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uid=request.getParameter("user");
		String pwd=request.getParameter("pass");
		try
		{
			String URL="jdbc:mysql://localhost:3306/helpdesk";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL,"root","liontiger123");
			System.out.print("connection establlished\n");
			Statement st=con.createStatement();
			ResultSet rs;
			rs=st.executeQuery("select * from student where S_enroll='"+uid+"'and S_password='"+pwd+"'");
			if(rs.next())
			{
				HttpSession session=request.getSession();
				session.setAttribute("uname", uid);
				//out.print("successfully logged in");
				RequestDispatcher rd=request.getRequestDispatcher("s_viewpage.jsp");
			rd.include(request, response);
			}
			else
			{
				//out.println("sorry, wrong username or password");
				System.out.print("success");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
				}
			}
		catch(Exception e)
		{
			out.print(e);
		}

		
	}

}
