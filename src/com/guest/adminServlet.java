package com.guest;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class adminServlet
 */
//@WebServlet("/adminServlet")
public class adminServlet extends HttpServlet {
	
	String query;
	private static final long serialVersionUID = 18679987898L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminServlet() {
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
		
		ResultSet rs;
		query=request.getParameter("queryByAdmin");
		System.out.print(query);
		response.setContentType("text/html");
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","liontiger123");
			Statement st=(Statement) con.createStatement();
			System.out.print("made connection");
			rs=st.executeQuery("select * from query");
			
		}catch(SQLException s){
		System.out.print("SQL Error");
		} catch (ClassNotFoundException e) {
			System.out.print("Class not found");
		}
		
		
		
		
	}//end of dopost

}//end of class
