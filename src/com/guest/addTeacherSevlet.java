package com.guest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class addTeacherSevlet
 */
//@WebServlet("/addTeacherSevlet")
public class addTeacherSevlet extends HttpServlet {
	private static final long serialVersionUID = 18893833450L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addTeacherSevlet() {
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
	 * @see HttpServlet#doutost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String course=request.getParameter("course");
		String department=request.getParameter("department");
		String designation=request.getParameter("designation");
		String password ="123";
		//String sql="INSERT INTO teacher VALUES (" + "\"" + name + "\"" + ");";
		//String sql="INSERT INTO teacher(T_name,T_password,T_email,T_course,T_department,T_designation) VALUES ('"+name+"','"+password+"','"+email+"','"+course+"','"+department+"','"+designation+"')";
	 String sql="INSERT INTO teacher(T_name,T_password,T_email,T_course,T_department,T_designation)  VALUES ('"+name+"','"+password+"','"+email+"','"+course+"','"+department+"','"+designation+"')";
		PrintWriter out=response.getWriter();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
			Statement st=(Statement) con.createStatement();
			System.out.print("made connection");
			int i=st.executeUpdate(sql);
			if(i==0){
				out.println("<html>");
				out.println("<head>");
				out.println("<link rel='stylesheet' type='text/css' href='css/style2.css' />");
				out.println("</head>");
				out.println("<body>");
				out.println("<div id='cd3'");
				System.out.print("Error");
				out.print("AN INTERNAL ERROR OCCURED WHILE EXECUTING YOUR ACTIONS. PLEASE CONTACT THE ADMIN FOR MORE INFORMATION");
				out.println("</div>");
				out.println("</body>");
				out.println("</html");
				
			
			}else{
				out.println("<html>");
				out.println("<head>");
				out.println("<link rel='stylesheet' type='text/css' href='css/style2.css' />");
				out.println("</head>");
				out.println("<body>");
				out.println("<div id='cd3'");
				System.out.print("Success");
				out.print("SUCCESSFULLY ADDED TEACHER !!");
				out.println("</div>");
				out.println("</body>");
				out.println("</html");
				
			}
			
		}catch(SQLException s){
		System.out.print(s.getMessage());
		
		} catch (ClassNotFoundException e) {
			System.out.print("Class not found");
		}
	}

}
