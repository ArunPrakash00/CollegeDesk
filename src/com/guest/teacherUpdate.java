package com.guest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class teacherUpdate
 */
@WebServlet("/teacherUpdate")
public class teacherUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public teacherUpdate() {
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
		String id=request.getParameter("t_id");
		String name=request.getParameter("t_name");
		String email=request.getParameter("t_email");
		String pwd=request.getParameter("t_password");
		String dept=request.getParameter("t_dept");
		String desg=request.getParameter("t_desg");
		String course=request.getParameter("t_course");
		try
		{
			String URL="jdbc:mysql://localhost:3306/helpdesk";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL,"root","liontiger123");
			System.out.println("connection establlished");
			Statement st=con.createStatement();
			st.executeUpdate("update teacher set T_name='"+name+"',T_email='"+email+"',T_password='"+pwd+"',T_department='"+dept+"',T_designation='"+desg+"',T_course='"+course+"' where T_id='"+id+"'");
			RequestDispatcher rd=request.getRequestDispatcher("viewpage.jsp");
			rd.include(request, response);
			out.print("<html><head><style>s{margin-left:300px}</style></head><body>");
			out.print("<div id='s'>");
			out.print("Your profile has been updated successfully");
			out.print("</div>");
			out.print("</body></html>");
			
		}catch(Exception e)
		{
			out.print(e);
		}

	}

}
