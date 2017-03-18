package com.guest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class tecaherLogin
 */
@WebServlet("/tecaherLogin")
public class tecaherLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tecaherLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uid=request.getParameter("user");
		String pwd=request.getParameter("pass");
		
		System.out.print("connoihgtrihrtlgd\n");
		try
		{
			String URL="jdbc:mysql://localhost:3306/helpdesk";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL,"root","liontiger123");
			System.out.print("connection establlished\n");
			java.sql.PreparedStatement st=con.prepareStatement("select * from teacher where T_id=?and T_password=?");
			ResultSet rs;
			st.setString(1, uid);
			st.setString(2, pwd);
			rs=st.executeQuery();
			if(rs.next())
			{
				HttpSession session=request.getSession();
				session.setAttribute("uname", uid);
				RequestDispatcher rd=request.getRequestDispatcher("viewpage.jsp");
				rd.include(request, response);
			}
			else
			{
				out.println("sorry, wrong username or password");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.include(request, response);
				}
			}
		catch(Exception e)
		{
			out.print(e);
		}
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
		
		System.out.print("connoihgtrihrtlgd\n");
		try
		{
			String URL="jdbc:mysql://localhost:3306/helpdesk";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL,"root","liontiger123");
			System.out.print("connection establlished\n");
			java.sql.PreparedStatement st=con.prepareStatement("select * from teacher where T_id=?and T_password=?");
			ResultSet rs;
			st.setString(1, uid);
			st.setString(2, pwd);
			rs=st.executeQuery();
			if(rs.next())
			{
				HttpSession session=request.getSession();
				session.setAttribute("uname", uid);
				RequestDispatcher rd=request.getRequestDispatcher("viewpage.jsp");
				rd.include(request, response);
			}
			else
			{
				out.println("sorry, wrong username or password");
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
