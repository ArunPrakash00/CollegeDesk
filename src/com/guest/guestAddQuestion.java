package com.guest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class guestAddQuestion
 */
@WebServlet("/guestAddQuestion")
public class guestAddQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public guestAddQuestion() {
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
		//String email=request.getParameter("email");
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("email");
		String que=request.getParameter("que");
		PrintWriter op=response.getWriter();
		// op.println("<a href='guestProfile.jsp?email="+email+"'>  Profile</a>");
		// op.println("<a href='guestRegistrationForm.jsp'>Logout</a><br>");
		//op.println("you can add questions here<br>");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
			PreparedStatement st=con.prepareStatement("insert into questions(Q_user,Q_email,Q_question,Q_answer,Q_status)values('guest','"+email+"','"+que+"','null','unanswered')");
			int i=st.executeUpdate();
			if(i>0){
				op.println("<html>");
				op.println("<head>");
				op.println("<link rel='stylesheet' type='text/css' href='css/style2.css' />");
				op.println("</head>");
				op.println("<body>");
				 /*op.println("<script type='text/javascript'>");
				    op.println("alert('Question Added Successfully');");
				    op.println("</script>");*/
				op.println("</body>");
				op.println("</html>");
				response.sendRedirect("guestProfile.jsp");
				 // RequestDispatcher r=request.getRequestDispatcher("/guestProfile.jsp");
					//r.include(request, response);
			//op.println("Question Added Successfully<br>");
			//op.println("<a href='guestProfile.jsp?email="+email+"'>Go back</a>");
			}
			
		}
		catch(Exception e){
			op.println("<html>");
			op.println("<head>");
			op.println("<link rel='stylesheet' type='text/css' href='css/style2.css' />");
			op.println("</head>");
			op.println("<body>");
			 op.println("<script type='text/javascript'>");
			    op.println("alert('Exception in question database(guestAddQuestion)');");
			    op.println("</script>");
			op.println("</body>");
			op.println("</html>");
			RequestDispatcher r=request.getRequestDispatcher("/guestProfile.jsp");
			r.include(request, response);
			//response.sendRedirect("guestProfile.jsp?email="+email);
			//op.println("Exception in question database(guestAddQuestion)");
			e.printStackTrace();
		}
		
	}

}
