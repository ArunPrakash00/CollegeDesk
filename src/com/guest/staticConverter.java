package com.guest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class staticConverter
 */
@WebServlet("/staticConverter")
public class staticConverter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public staticConverter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter op=response.getWriter();
		String que=request.getParameter("que");
		String q[]=que.split(" ");
		
		
		//*****************STATIC PAGES*********************//
		
		
		if(foo(q,"placement","recruit","companies")||f(q,"tpo")){     
			// PLACEMENT 
			response.sendRedirect("placement.html");
			
		}
		
     else if(foo(q,"transport","transportation","located")||foo(q,"reach","reachable","location")||foo(q,"bus","car","route")
		||foo(q,"near","nearby","where")||fo(q,"address","place"))
		{   
			//TRANSPORTATION
    	 response.sendRedirect("transportation.html");
		}
		
     else if(fo(q,"director","principal")){
	    	//DIRECTOR
    	 response.sendRedirect("");
	    }
		
     else if(foo(q,"labs","lab","laboratory")){
	    	//LABORATORY
    	 response.sendRedirect("");
	    }
 
 
     else if(fo(q,"society","societies")){
 	          //SOCIETY    	 
    	 response.sendRedirect("");
        }
 
 
     else if(foo(q,"admission","enrollment","admitted")){
    	 response.sendRedirect("admission.html");
    	 //ADMISSION PROCEDURE
        }
 
     else if(foo(q,"hostel","hostels","pg")){
 	        //HOSTELS
    	 response.sendRedirect("hostels.html");
        }
		
     else if(f(q,"sports")){
	        //SPORTS
 	 response.sendRedirect("sportsAchievemnts.html");
     }
		
     else if(f(q,"mission")){
	        //MISSION
	 response.sendRedirect("mission.html");
  }
     else if(f(q,"alka")){
	        //ALKA
	 response.sendRedirect("alka.html");
}
		
     else if(f(q,"banarsi")){
	        //BANARSI
	 response.sendRedirect("banarsi.html");
}
		
     else if(f(q,"bbdgei")){
	        //BBDGEI
	 response.sendRedirect("BBDGEI.html");
}
		
     else if(fa(q,"akhilesh","das")||fa(q,"akhilesh","gupta")||f(q,"akhilesh")){
	        //AKHILESH DAs GUPTA
	 response.sendRedirect("akhileshDasGupta.html");
}
     else if(f(q,"message")){
	        //MESSGAGE
	 response.sendRedirect("message.html");
}
		
    
     else if(f(q,"achievments")||fa(q,"success","story")||fa(q,"success","stories")||f(q,"achievments")){
 	         //ACHIEVMENTS AND SUCCESS STORIES , SPORTS ACHIEVMENTS
    	 response.sendRedirect("Achievements.html");
        }
		
     else if(foo(q,"fee","fees","money")||foo(q,"payments","payment","cash")){
    	 	//FEE STRUCTURE
    	 response.sendRedirect("fee.html");
     }
    
     else if(fo(q,"library","libraries")||fa(q,"library","books")){
    	 	//LIBRARY
    	 response.sendRedirect("library.html");
     }
		
     else if(foo(q,"calender","holidays","holiday")||f(q,"festivals")){
    	 	//CALENDER AND HOLDAYS
    	 response.sendRedirect("calender.html");
    	
    	 
     }	
		
     else if(foo(q,"register","login","home")){
 	 	//LOGIN OR REGISTER
    	 response.sendRedirect("index.html");
  }	
     else {
    	RequestDispatcher rd=request.getRequestDispatcher("dynamicConverter");
    	rd.forward(request,response);
    	
      
     
     
 }//ELSE END
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public boolean f(String que[],String val){

		for(int i=0;i<que.length;i++){
			if(val.equalsIgnoreCase(que[i])){
				return true;	
			}
		}
		return false;
	}
	public boolean fo(String que[],String val1,String val2){

		for(int i=0;i<que.length;i++){
			if(val1.equalsIgnoreCase(que[i])||(val2.equalsIgnoreCase(que[i]))){
				return true;
			}
		}
	
		return false;
		
}
	public boolean foo(String que[],String val1,String val2,String val3){
		for(int i=0;i<que.length;i++){
		if(val1.equalsIgnoreCase(que[i])||val2.equalsIgnoreCase(que[i])||val3.equalsIgnoreCase(que[i])){	
			return true;
		}
		}
	return false;
		}
	public boolean fa(String que[],String val1,String val2){
		for(int i=0;i<que.length;i++){
			if(val1.equalsIgnoreCase(que[i])&&val2.equalsIgnoreCase(que[i])){
				return true;
			}
		}
		return false;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter op=response.getWriter();
		String que=request.getParameter("que");
		String q[]=que.split(" ");
		
		
		//*****************STATIC PAGES*********************//
		
		
		if(foo(q,"placement","recruit","companies")||f(q,"tpo")){     
			// PLACEMENT 
			response.sendRedirect("placement.html");
			
		}
		
     else if(foo(q,"transport","transportation","located")||foo(q,"reach","reachable","location")||foo(q,"bus","car","route")
		||foo(q,"near","nearby","where")||fo(q,"address","place"))
		{   
			//TRANSPORTATION
    	 response.sendRedirect("transportation.html");
		}
		
     else if(fo(q,"director","principal")){
	    	//DIRECTOR
    	 response.sendRedirect("");
	    }
		
     else if(foo(q,"labs","lab","laboratory")){
	    	//LABORATORY
    	 response.sendRedirect("labs.html");
	    }
 
 
     else if(fo(q,"society","societies")){
 	          //SOCIETY    	 
    	 response.sendRedirect("");
        }
 
 
     else if(foo(q,"admission","enrollment","admitted")){
    	 response.sendRedirect("admission.html");
    	 //ADMISSION PROCEDURE
        }
 
     else if(foo(q,"hostel","hostels","pg")){
 	        //HOSTELS
    	 response.sendRedirect("hostels.html");
        }
		
     else if(f(q,"sports")){
	        //SPORTS
 	 response.sendRedirect("sportsAchievemnts.html");
     }
		
     else if(f(q,"mission")){
	        //MISSION
	 response.sendRedirect("mission.html");
  }
     else if(f(q,"alka")){
	        //ALKA
	 response.sendRedirect("alka.html");
}
		
     else if(f(q,"banarsi")){
	        //BANARSI
	 response.sendRedirect("banarsi.html");
}
		
     else if(f(q,"bbdgei")){
	        //BBDGEI
	 response.sendRedirect("BBDGEI.html");
}
		
     else if(fa(q,"akhilesh","das")||fa(q,"akhilesh","gupta")||f(q,"akhilesh")){
	        //AKHILESH DAs GUPTA
	 response.sendRedirect("akhileshDasGupta.html");
}
     else if(f(q,"message")){
	        //MESSGAGE
	 response.sendRedirect("message.html");
}
		
    
     else if(f(q,"achievments")||fa(q,"success","story")||fa(q,"success","stories")||f(q,"achievments")){
 	         //ACHIEVMENTS AND SUCCESS STORIES , SPORTS ACHIEVMENTS
    	 response.sendRedirect("Achievements.html");
        }
		
     else if(foo(q,"fee","fees","money")||foo(q,"payments","payment","cash")){
    	 	//FEE STRUCTURE
    	 response.sendRedirect("fee.html");
     }
    
     else if(fo(q,"library","libraries")||fa(q,"library","books")){
    	 	//LIBRARY
    	 response.sendRedirect("library.html");
     }
		
     else if(foo(q,"calender","holidays","holiday")||f(q,"festivals")){
    	 	//CALENDER AND HOLDAYS
    	 response.sendRedirect("calender.html");
    	
    	 
     }	
		
     else if(foo(q,"register","login","home")){
 	 	//LOGIN OR REGISTER
    	 response.sendRedirect("index.html");
  }	
     else {
    	RequestDispatcher rd=request.getRequestDispatcher("dynamicConverter");
    	rd.forward(request,response);
    	
      
     
     
 }//ELSE END
     
     
}//POST FUNCTION END

} //CLASS END
