package com.guest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class sendMail
 */
@WebServlet("/sendMail")
public class sendMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sendMail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		HttpSession session1=request.getSession();
		session1.setAttribute("email",email);
		String[] c=email.split("@");
		String[] c1=email.split("a");
		String[] c2=email.split("s");
		//String[] c3=email.split("x");
		String code=c[0]+c1[0]+c2[0];
		
		
		
		PrintWriter op =response.getWriter();
		op.print(code+"<br>");
		response.setContentType("text/html");
		
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
		msg.setSubject("Welcome to Registration page "+name);
		msg.setText("Your Unique Verification code is:  "+code);
		Transport.send(msg);  //SEND MAIL
		op.println("A verification code has been sent to "+email);
		op.println("<br>Enter Code "+"<a href='enterCode.jsp'><u>here</u></a>"); 
		
	}
	catch(Exception e){
		throw new RuntimeException(e);
		//op.println("Exception"); 
	} 
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/helpdesk","root","root");
		PreparedStatement ps=con.prepareStatement("insert into guest values('"+name+"','"+pass+"','"+email+"')");
		int i=ps.executeUpdate();
		if(i>0){
			op.println("Guest Account data stored in database ");
		}
	}
	catch(Exception e){
		op.println("Exception in guest database(sendMail)");
	}
	
	}
	
		
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		HttpSession session1=request.getSession();
		session1.setAttribute("email",email);
		String[] c=email.split("@");
		String[] c1=email.split("a");
		String[] c2=email.split("s");
		//String[] c3=email.split("x");
		String code=c[0]+c1[0]+c2[0];
		
		
		
		PrintWriter op =response.getWriter();
		op.print(code+"<br>");
		response.setContentType("text/html");
		
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
		msg.setSubject("Welcome to Registration page "+name);
		msg.setText("Your Unique Verification code is:  "+code);
		Transport.send(msg);  //SEND MAIL
		op.println("A verification code has been sent to "+email);
		op.println("<br>Enter Code "+"<a href='enterCode.jsp'><u>here</u></a>"); 
		
	}
	catch(Exception e){
		throw new RuntimeException(e);
		//op.println("Exception"); 
	} 
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/helpdesk","root","liontiger123");
		PreparedStatement ps=con.prepareStatement("insert into guest values('"+name+"','"+pass+"','"+email+"')");
		int i=ps.executeUpdate();
		if(i>0){
			op.println("Guest Account data stored in database ");
		}
	}
	catch(Exception e){
		e.printStackTrace();
		op.println("Exception in guest database(sendMail)");
	}
	
		
		
	}
}

	
