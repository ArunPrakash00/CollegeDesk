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
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String enroll=request.getParameter("s_enroll");
		String name=request.getParameter("s_name");
		String email=request.getParameter("s_email");
		String pwd=request.getParameter("s_password");
		String dept=request.getParameter("s_department");
		
		try
		{
			String URL="jdbc:mysql://localhost:3306/helpdesk";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL,"root","liontiger123");
			System.out.println("connection establlished");
			Statement st=con.createStatement();
			st.executeUpdate("update student set S_enroll='"+enroll+"',S_email='"+email+"',S_password='"+pwd+"',S_department='"+dept+"' where S_enroll='"+enroll+"'");
			
			out.println("<html>");
			out.println("<head>");
			out.println("<link rel='stylesheet' type='text/css' href='css/style2.css' />");
			out.println("</head>");
			out.println("<body>");
			out.println("<script type='text/javascript'>");
			out.println("alert('Profile updated Successfully');");
			out.println("</script>");
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher rd=request.getRequestDispatcher("s_viewpage.jsp");
			rd.include(request, response);
			//out.print("Your profile has been updated successfully");
			//out.println("onload='alert('Your profile has been updated successfully')'");
			
		}catch(Exception e)
		{
			out.print(e);
		}
	}

}
