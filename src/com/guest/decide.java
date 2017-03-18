package com.guest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class decide
 */
@WebServlet("/decide")
public class decide extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public decide() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		String decide=request.getParameter("category");
		if(decide.equals("Teacher")){
			request.setAttribute("user",user);
			request.setAttribute("pass",pass);
			RequestDispatcher rd=request.getRequestDispatcher("tecaherLogin");
			rd.forward(request,response);
			
		}
		
		else if(decide.equals("Student")){
			request.setAttribute("user",user);
			request.setAttribute("pass",pass);
			RequestDispatcher rd=request.getRequestDispatcher("login");
			rd.forward(request,response);
			
		}
		
		else{
			request.setAttribute("user",user);
			request.setAttribute("pass",pass);
			RequestDispatcher rd=request.getRequestDispatcher("guestLogin");
			rd.forward(request,response);
			//response.sendRedirect("guestLogin?email="+user+"");
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user1");
		String pass=request.getParameter("pass1");
		String decide=request.getParameter("category");
		if(decide.equals("Teacher")){
			request.setAttribute("user",user);
			request.setAttribute("user",pass);
			RequestDispatcher rd=request.getRequestDispatcher("tecaherLogin");
			rd.forward(request,response);
			
		}
		
		else if(decide.equals("Student")){
			request.setAttribute("user",user);
			request.setAttribute("user",pass);
			RequestDispatcher rd=request.getRequestDispatcher("login");
			rd.forward(request,response);
			
		}
		
		else{
			request.setAttribute("user",user);
			request.setAttribute("pass",pass);
			RequestDispatcher rd=request.getRequestDispatcher("guestLogin");
			rd.forward(request,response);
			//response.sendRedirect("guestLogin?email="+user+"");
		}
		
		
		
		
		
		
		
	}

}
