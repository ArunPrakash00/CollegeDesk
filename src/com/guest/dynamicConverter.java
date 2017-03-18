package com.guest;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dynamicConverter
 */
@WebServlet("/dynamicConverter")
public class dynamicConverter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dynamicConverter() {
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
	
	public boolean f(String q[],String val){
		for(int i=0;i<q.length;i++){
			if(val.equalsIgnoreCase(q[i])){
				return true;
			}
			
		}
		return false;
	}
	
	public boolean fo(String q[],String val1,String val2){

		for(int i=0;i<q.length;i++){
			if((val1.equalsIgnoreCase(q[i])||val2.equalsIgnoreCase(q[i]))){
				return true;
			}
		}
		return false;
	}
	
	public boolean foo(String q[],String val1,String val2,String val3){

		for(int i=0;i<q.length;i++){
			if((val1.equalsIgnoreCase(q[i])||val2.equalsIgnoreCase(q[i]))||(val3.equalsIgnoreCase(q[i]))){
				return true;
			}
		}
		return false;
	}

	public boolean fa(String q[],String val1,String val2){

		for(int i=0;i<q.length;i++){
			if(val1.equalsIgnoreCase((q[i]))){
				for(i=0;i<q.length;i++){
					if(val2.equalsIgnoreCase(q[i])){
						return true;
					}
					}
				
			}
		}
		return false;
	}
	
	public boolean foa(String q[],String val1,String val2,String val3){
		for(int i=0;i<q.length;i++){
			if(val1.equalsIgnoreCase(q[i])){
				if(val2.equalsIgnoreCase(q[i])||val3.equalsIgnoreCase(q[i])){
					return true;
				}
			}
		}return false;
	}
	
	
	
	
	/*public boolean faa(String q[],String val1,String val2,String val3){
		for(int i=0;i<q.length;i++){
			if((val1.equalsIgnoreCase(q[i]))&&(val2.equalsIgnoreCase(q[i]))&&(val3.equalsIgnoreCase(q[i]))){
				return true;
			}
		}
		return false;
	}
	*/
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String que=request.getParameter("que");
		String q[]=que.split(" ");
		PrintWriter op=response.getWriter();
		response.setContentType("text/html");
		String sq="select distinct";
		
		
		//****************************DYNAMIC PAGES**************************//
		
		
		//****************************HOD's*********************************//
		
		
		
		
		if(fa(q,"hod","cse")||fa(q,"head","cse")){
			if(foo(q,"email","mail","e-mail")){
				sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_department='CSE'";
			}
			else	sq+=" T_name,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_department='CSE'";
		
		}
		
		else if(fa(q,"hod","ece")||fa(q,"head","ece")){
			if(foo(q,"email","mail","e-mail")){
				sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_department='ECE'";
			}
			else	sq+=" T_name,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_department='ECE'";
		}
		
		else if(fa(q,"hod","mech")||fa(q,"mech","hod")||fa(q,"head","mech")){
			if(foo(q,"email","mail","e-mail")){
				sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_department='MECH'";
			}  
    	 else sq+=" T_name,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_department='MECH'";
			
		}
		
	
		else if(fa(q,"hod","eee")||fa(q,"head","eee")){
			if(foo(q,"email","mail","e-mail")){
				sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_department='EEE'";
			}
			else	sq+=" T_name,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_department='EEE'";
		}
		
		
		else if(fa(q,"hod","civil")||fa(q,"head","civil")){
			if(foo(q,"email","mail","e-mail")){
				sq+=" T_name,T_email,T_department,T_course from teacher where T_designation='HOD' and T_department='CIVIL'";
			}
			else sq+=" T_name,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_department='CIVIL'";
		}
		
		else if(fa(q,"hod","it")||fa(q,"head","it")){
			if(foo(q,"email","mail","e-mail")){
				sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_department='IT'";
			}
			else sq+=" T_name,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_department='IT'";
		}
		
		
		//*********************GENRAL HOD'S*************************//
		else if((fa(q,"hod's","b.tech")||(fa(q,"hod's","b-tech"))||(fa(q,"hod's","btech")))){
			if(foo(q,"email","mail","e-mail")){
				sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_course='B.TECH'";
			}
			else	sq+=" T_name,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_course='B.TECH'";
		}
		

		
		else if(fa(q,"hod","mca")||fa(q,"head","mca")){
			if(foo(q,"email","mail","e-mail")){
				sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_course='MCA'";
			}
			else sq+=" T_name,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_course='MCA'";
		}
		
		
		else if(fa(q,"hod","bca")||fa(q,"head","bca")){
			if(foo(q,"email","mail","e-mail")){
				sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_course='BCA'";
			}
			else sq+=" T_name,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_course='BCA'";
		}
		
		
		else if(fa(q,"hod","bba")||fa(q,"head","bba")){
			if(foo(q,"email","mail","e-mail")){
				sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_course='BBA'";
			}
			else sq+=" T_name,T_department,T_course,T_designation from teacher where T_designation='HOD' and T_course='BBA'";
		}
		
		
		else if((f(q,"hod")||(f(q,"hod's")))){
			if(foo(q,"email","mail","e-mail")){
				sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_designation='HOD'";
			}
			else	sq+=" T_name,T_department,T_course,T_designation from teacher where T_designation='HOD'";
		}
		
		//***************************DEPARTMENTS*********************//
		
		else if((fa(q,"b.tech","departments")||(fa(q,"b-tech","departments")||(fa(q,"b.tech","department")||(fa(q,"b-tech","department")))))){
			
			sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_course='B.TECH'";
		      }
		  
          else if((fa(q,"mba","departments")||(fa(q,"mba","department")))){
			
			sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_course='MBA'";
 		      }
		
          else if((fa(q,"mca","departments")||(fa(q,"mca","department")))){
	
	     sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_course='MCA'";
           }
		
           else if((fa(q,"bba","departments")||(fa(q,"bba","department")))){
	
	    sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_course='BBA'";
	  //  op.println(sq);
           }
		
		 
		//**************************COURSES*********************//
		
           else if(f(q,"courses")){
        	   sq+=" T_name,T_email,T_department,T_course,T_designation from teacher";
           }
		
		
		//**********************************TEACHER**********************************//
		
		
		
           else if(fa(q,"teachers","cse")||fa(q,"teaches","cse")||fa(q,"teach","cse")||fa(q,"faculty","cse")||fa(q,"teacher","cse")||fa(q,"lecturer","cse")){
        	   if(foo(q,"mail","email","e-mail")||foo(q,"mails","emails","e-mails")){
        		   sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_department='CSE'";
        		 }
        	   else{ sq+=" T_name,T_department,T_course,T_designation from teacher where T_department='CSE'"; }
           }
		
          
           else if(fa(q,"teachers","ece")||fa(q,"teaches","ece")||fa(q,"teach","ece")||fa(q,"faculty","ece")||fa(q,"teacher","ece")||fa(q,"lecturer","ece")){
        	   if(foo(q,"mail","email","e-mail")||foo(q,"mails","emails","e-mails")){
        		   sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_department='ECE'";
        		 }
        	   else{ sq+=" T_name,T_department,T_course,T_designation from teacher where T_department='ECE'"; }
           }
		
           else if(fa(q,"teachers","eee")||fa(q,"teaches","eee")||fa(q,"teach","eee")||fa(q,"faculty","eee")||fa(q,"teacher","eee")||fa(q,"lecturer","eee")){
        	   if(foo(q,"mail","email","e-mail")||foo(q,"mails","emails","e-mails")){
        		   sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_department='EEE'";
        		 }
        	   else{ sq+=" T_name,T_department,T_course,T_designation from teacher where T_department='EEE'"; }
           }
		
		
           else if(fa(q,"teachers","mech")||fa(q,"teaches","mech")||fa(q,"teach","mech")||fa(q,"faculty","mech")||fa(q,"teacher","mech")||fa(q,"lecturer","mech")){
        	   if(foo(q,"mail","email","e-mail")||foo(q,"mails","emails","e-mails")){
        		   sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_department='MECH'";
        		 }
        	   else{ sq+=" T_name,T_department,T_course,T_designation from teacher where T_department='MECH'"; }
           }
		
		
           else if(fa(q,"teachers","civil")||fa(q,"teaches","civil")||fa(q,"teach","civil")||fa(q,"faculty","civil")||fa(q,"teacher","civil")||fa(q,"lecturer","civil")){
        	   if(foo(q,"mail","email","e-mail")||foo(q,"mails","emails","e-mails")){
        		   sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_department='CIVIL'";
        		 }
        	   else{ sq+=" T_name,T_department,T_course,T_designation from teacher where T_department='CIVIL'"; }
           }
		
           else if(fa(q,"teachers","it")||fa(q,"teaches","it")||fa(q,"teach","it")||fa(q,"faculty","it")||fa(q,"teacher","it")||fa(q,"lecturer","it")){
        	   if(foo(q,"mail","email","e-mail")||foo(q,"mails","emails","e-mails")){
        		   sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_department='IT'";
        		 }
        	   else{ sq+=" T_name,T_department,T_course,T_designation from teacher where T_department='IT'"; }
           }
		
           else if(fa(q,"teachers","bba")||fa(q,"teaches","cse")||fa(q,"teach","bba")||fa(q,"faculty","bba")||fa(q,"teacher","bba")||fa(q,"lecturer","bba")){
        	   if(foo(q,"mail","email","e-mail")||foo(q,"mails","emails","e-mails")){
        		   sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_department='BBA'";
        		 }
        	   else{ sq+=" T_name,T_department,T_course,T_designation from teacher where T_department='BBA'"; }
           }
		
		
           else if(fa(q,"teachers","mba")||fa(q,"teaches","mba")||fa(q,"teach","mba")||fa(q,"faculty","mba")||fa(q,"teacher","mba")||fa(q,"lecturer","mba")){
        	   if(foo(q,"mail","email","e-mail")||foo(q,"mails","emails","e-mails")){
        		   sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_department='MBA'";
        		 }
        	   else{ sq+=" T_name,T_department,T_course,T_designation from teacher where T_department='MBA'"; }
           }
		
		
           else if(fa(q,"teachers","bca")||fa(q,"teaches","bca")||fa(q,"teach","bca")||fa(q,"faculty","bca")||fa(q,"teacher","bca")||fa(q,"lecturer","bca")){
        	   if(foo(q,"mail","email","e-mail")||foo(q,"mails","emails","e-mails")){
        		   sq+=" T_name,T_email,T_department,T_course,T_designation from teacher where T_department='BCA'";
        		 }
        	   else{ sq+=" T_name,T_department,T_course,T_designation from teacher where T_department='BCA'";
        	   }
           }
		
           else if(f(q,"teachers")||f(q,"teaches")||f(q,"teach")||f(q,"faculty")||f(q,"teacher")||f(q,"lecturer")){
        	   if(foo(q,"mail","email","e-mail")||foo(q,"mails","emails","e-mails")){
        		   sq+=" T_name,T_email,T_department,T_course,T_designation from teacher";
        		 }
        	   else{ sq+=" T_name,T_department,T_course,T_designation from teacher";
        	   }
           }
		
	//*********************************FINAL RESULT*****************************//
 
		
           if(!sq.equalsIgnoreCase("select distinct"))   {
        	   try{ 
              	 Class.forName("com.mysql.jdbc.Driver");
              	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
              	Statement stmt=con.createStatement();
              	String sq1[]=sq.split(",");
              	op.print("SQL QUERY IS  "+sq+"<br>");
              	if(f(sq1,"T_email")){
              		
              		 ResultSet rs=stmt.executeQuery(sq); 
              	//	 op.print("SQL QUERY IS  "+sq+"<br>");
                     op.print("<br>Name   Email  Course   Desgination Department<br>");
                    while(rs.next()) {
                  	  String T_name=rs.getString("T_name");
                  	String T_email=rs.getString("T_email");                //********OUTPUT DATA*******//
                  	  String T_course=rs.getString("T_course");             
                  	 String T_designation=rs.getString("T_designation");
                  	  String T_department=rs.getString("T_department");
                  	  op.println("<body bgcolor='green'>");
                    	    op.println(T_name+T_email+T_course+T_department+T_designation+"<br>");                                                     
                    	op.println("</body>");
              	}
              	}
                    else{
                    	ResultSet rs1=stmt.executeQuery(sq); 
                   op.print("<br>Name   Email  Course   Desgination Department<br>");
                  while(rs1.next()) {
                	  String T_name=rs1.getString("T_name");
                	//  String T_email=rs.getString("T_email");                //********OUTPUT DATA*******//
                	  String T_course=rs1.getString("T_course");             
                	String T_designation=rs1.getString("T_designation");
                	  String T_department=rs1.getString("T_department");
                  	    op.println(T_name+" "+T_course+" &nbsp&nbsp&nbsp"+T_department+" &nbsp&nbsp&nbsp"+T_designation+"<br>");                                                     
                  }
                  }
        	   }
                  catch(Exception e){
                	  op.print("Exception Occured in Teacher Database");
                	  e.printStackTrace();
                	  op.println("<br><h4>Sorry, No results were found for your Query !!!</h4>Please Register/Login to submit your Query .");
                  }
        	   
           }
        	
		
           if(sq.equalsIgnoreCase("select distinct")){    
        	   try{
        	 
        	 Class.forName("com.mysql.jdbc.Driver");
        	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/helpdesk","root","liontiger123");
        	 PreparedStatement smt=con.prepareStatement("select Q_answer from questions where Q_question=? and Q_status='answered'");
        	 smt.setString(1,que);
        	 ResultSet rs=smt.executeQuery(); 
        	 if(rs.next()){
        		 String ans=rs.getString("Q_answer");
        		 op.println("<br>"+ans);   //PRINT ************************
        	 }
        	 
         }
         catch(Exception e){
        	op.print("Exception Occured in Question's Database");
        	e.printStackTrace();
        	op.println("<br><h4>Sorry, No results were found for your Query !!!</h4>Please Register/Login to submit your Query .");
         }
           }
        	  
           
        	   
         	
	}//POST END

}//CLASS END
