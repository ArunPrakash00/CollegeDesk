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
 * Servlet implementation class questionServlet
 */
//@WebServlet("/questionServlet")
public class questionServlet extends HttpServlet {
	
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 17837837388L;

	/**
	 * 
	 */
	

	/**
     * @see HttpServlet#HttpServlet()
     */
    public questionServlet() {
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
		
		String q=request.getParameter("qno");
		String sql="DELETE FROM questions WHERE Q_no=(" + "\"" + q + "\"" + ");";
		PrintWriter out=response.getWriter();
		//String sql="INSERT INTO teacher VALUES (" + "\"" + name + "\"" + ");";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","liontiger123");
			Statement st=(Statement) con.createStatement();
			System.out.print("made connection");
			
			int i=st.executeUpdate(sql);
			if(i==0){
				System.out.print("Error");
				out.print("<html><head></head><body>AN INTERNAL ERROR OCCURED WHILE EXECUTING YOUR ACTIONS. PLEASE CONTACT THE ADMIN FOR MORE INFORMATION</body></html>");
			}else{
				System.out.print("Success");
				out.print("<html><head></head><body>SUCCESSFULLY REMOVED QUESTION !!</body></html>");
				
			}
			
		}catch(SQLException s){
		System.out.print(s.getMessage());
		
		} catch (ClassNotFoundException e) {
			System.out.print("Class not found");
		}
	}

}
