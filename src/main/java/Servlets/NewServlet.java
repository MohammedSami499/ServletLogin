package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import org.apache.tomcat.util.bcel.classfile.ClassFormatException;


public class NewServlet extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	
	int count = 0;
    public NewServlet() {
    }

	protected void doGet(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response)
					throws ClassFormatException, IOException 
	{
	
		count ++;
	    Date d = new Date();
	    
		
		PrintWriter out =  response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>");
		out.println("<title>Sami</title>");
		out.println("</head> <body>");
		out.println("<h1> Sami Servlet </h1>");
		out.println("<b> User visit number"+ count+" <b>");
		out.println("<p> welcome to our main servlet and the first as well </p>");
		out.println("<p> time now equals <b></b> </p>");
		out.println("</body> </html>");

		
	}


	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ClassFormatException, IOException {

	}

}
