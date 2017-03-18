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
 **/
public class a_login extends HttpServlet {
	private static final long serialVersionUID = 16769876987L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public a_login() {
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
		String uid=request.getParameter("id");
		String pwd=request.getParameter("password");
		
		
			if((uid.equals("admin"))&&(pwd.equals("admin")))
			{
				HttpSession session=request.getSession();
				session.setAttribute("uname", uid);
				System.out.print("success");
				//out.print("<html><head></head><body>SUCCESSFULLY LOGGED IN AS ADMIN</body></html>");
				response.sendRedirect("admin.jsp");
					
			}
			else
			{
				System.out.print("error");
				response.sendRedirect("adminLogin.jsp");
				}
			}
	}


