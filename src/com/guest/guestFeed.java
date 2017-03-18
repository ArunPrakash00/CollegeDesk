package com.guest;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class guestFeed
 */
@WebServlet("/guestFeed")
public class guestFeed extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public guestFeed() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter op=response.getWriter();
		response.setContentType("text/html");
		String email=request.getParameter("email");
		String feed=request.getParameter("feed");
		String name=request.getParameter("name");
		
		
			
		
		
	try{      Class.forName("com.mysql.jdbc.Driver");
	      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
		PreparedStatement st=con.prepareStatement("insert into feedback(F_feed,F_name,F_email)values('"+feed+"','"+name+"','"+email+"'); ");
		 int i=st.executeUpdate();
		 if(i>0){
			 op.println("<br>Thank You for your Feedback !!!");
		 
		} 
		
		}
		catch(Exception e){
			e.printStackTrace();
		op.println("Exception in feedback database(guestFeed)");
		}
		
		Properties prop= new Properties();
		prop.put("mail.transport.protocol","smtps");
		prop.put("mail.smtp.host","smtp.gmail.com");
		prop.put("mail.smtp.socketFactory.port","465");
		prop.put("mail.smtp.auth","true");
		prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	
	
	try{
		
		Session session=Session.getInstance(prop,new javax.mail.Authenticator(){ protected PasswordAuthentication getPasswordAuthentication(){ return new PasswordAuthentication("rajeev9810278557@gmail.com","spider248");}});
		Message msg=new MimeMessage(session);
		msg.setFrom(new InternetAddress("rajeev9810278557@gmail.com"));
		msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));
		msg.setSubject("Hello ");
		msg.setText("Thank you for your valuable Feedback .");
		Transport.send(msg);  //SEND MAIL
		op.println("<br>Please check your Email !!!");
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.include(request,response);
	}
	catch(Exception e){
		throw new RuntimeException(e);
		//op.println("Exception"); 
	} 
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
