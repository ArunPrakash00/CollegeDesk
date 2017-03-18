package com.guest;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.decide.String;

/**
 * Servlet implementation class guestViewQuestions
 */
@WebServlet("/guestViewQuestions")
public class guestViewQuestions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public guestViewQuestions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String email=request.getParameter("email");
		HttpSession session1 =request.getSession();
		String email=(String)session1.getAttribute("email");
		PrintWriter op=response.getWriter();
		// op.println("<a href='guestProfile.jsp?email="+email+"'>  Profile</a>");
	//	op.println("<a href='guestRegistrationForm.jsp'>Logout</a><br>");
		//op.print("<br><u>Your Previous Questions</u><br><br>");
		
				
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
			PreparedStatement st=con.prepareStatement("select Q_no,Q_question from questions where Q_user='guest' and Q_email=?");
			st.setString(1,email);
			//op.println("<u>Q_Number</u>"+" &nbsp&nbsp&nbsp <u> Question</u><br>");
			ResultSet rs=st.executeQuery();
			while(rs.next()){
				String Q_que=rs.getString("Q_question");
				String Q_no=rs.getString("Q_no");
				//String Q_email=rs.getString("Q_email");
				response.setContentType("text/html");
				
				request.setAttribute("Q_que",Q_que);
				request.setAttribute("Q_no",Q_no);
				request.setAttribute("Q_email",email);
				RequestDispatcher rd=request.getRequestDispatcher("/guestViewQues.jsp");
				rd.forward(request,response);
				//op.println("<br>&nbsp&nbsp&nbsp"+Q_no+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"+Q_que);
				//op.println("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href='guestAnswers?email="+email+"'>Check for Answer</a>");
				//op.println("<br>"+Q_no +" "+Q_que);
				//op.println("<a href='guestAnswers?email="+email+"'>Check for Answer</a>");
			}
			//op.println("<br><a href='guestProfile.jsp?email="+email+"'>Go Back</a>");
		}
		catch(Exception e){
			op.println("Exception");
			e.printStackTrace();
		}
	//	op.print("<br><br><br>");
	//	op.print("Click <a href='guestFeedback.jsp?email="+email+"'><u>here</u></a> to submit a Feedback.");
			
		}
		
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
