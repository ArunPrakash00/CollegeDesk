package com.guest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class askServlet
 */
@WebServlet("/askServlet")
public class askServlet extends HttpServlet {

       
    /**
	 * 
	 */
	private static final long serialVersionUID = 167436687497438L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public askServlet() {
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
		
		String q=request.getParameter("question");
		System.out.print(q);
		//String mail=request.getParameter("email");
		Object uid= request.getSession().getAttribute("uname");
		String user="student";
		String status="unanserwed";
        String sql="INSERT INTO questions(Q_user,Q_email,Q_question,Q_status)  VALUES ('"+user+"','"+uid+"','"+q+"','"+status+"')";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
			Statement st=(Statement) con.createStatement();
			System.out.print("made connection");
			int i=st.executeUpdate(sql);
			System.out.print("return"+i+"Success");
			response.sendRedirect("s_question.jsp");
			/*RequestDispatcher rd=request.getRequestDispatcher("viewallaskedquestions.jsp");
			rd.include(request, response);*/
			
		}catch(SQLException s){
		System.out.print(s.getMessage());
		
		} catch (ClassNotFoundException e) {
			System.out.print("Class not found");
		}
		
	}

}
