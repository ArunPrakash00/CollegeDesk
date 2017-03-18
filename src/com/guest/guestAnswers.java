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
 * Servlet implementation class guestAnswers
 */
@WebServlet("/guestAnswers")
public class guestAnswers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public guestAnswers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		 //String email=request.getParameter("email");
		String Q_no=request.getParameter("Q_no");
		//String Q_question=request.getParameter("Q_question");
		 HttpSession session1 =request.getSession();
		 String email=(String)session1.getAttribute("email");
		 PrintWriter op=response.getWriter();
		// op.println("<a href='guestProfile.jsp?email="+email+"'> Profile</a><br>");
		// op.println("<a href='guestRegistrationForm.jsp'>Logout</a><br>");
		// op.print("See answers here<br>");
		 op.println("<html>");
			op.println("<head>");
			op.println("<link rel='stylesheet' type='text/css' href='css/style2.css' />");
			op.println("</head>");
			op.println("<body>");
			op.println("<div id='cd3'");
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
				PreparedStatement st=con.prepareStatement("select Q_answer from questions where Q_no=? and Q_user='guest' and Q_email=?");
				
				
				st.setString(1, Q_no);
				st.setString(2,email);
				//st.setString(3, Q_question);
				ResultSet rs=st.executeQuery();
			if(rs.next()){
					String G_ans=rs.getString("Q_answer");
					op.println("<br>"+"<b>Answer: </b><br> "+G_ans);
				}
			else{
				op.println("<br>Question Unanswered<br>");
			}
			op.println("<br><a href='guestViewQues.jsp'>Go Back</a>");
			}
			
		
			catch(Exception e){
				System.out.println("Exception in question database(guestAnswers)");
				System.out.println(e);
			}
			op.println("</div>");
			op.println("</body>");
			op.println("</html");
			
			//op.print("<br><br><br>");
		//op.print("Click <a href='guestFeedback.jsp?email="+email+"'><u>here</u></a> to submit a Feedback.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
