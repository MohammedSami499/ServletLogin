package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import data.Person;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class ShowData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ShowData() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Person person =  (Person) getServletContext().getAttribute("personData");
		
		PrintWriter out =  response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"windows-1256\">\r\n"
				+ "<title> Successful </title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	\r\n"
				+ "	<h3> Your name : "+ person.getName() +" </h3>\r\n"
				+ ""
				+ "<h3> Your age is : " + person.getAge()+"</h3> \r\n"
				+""
				+ "<h3> Your mail is : " + person.getEmail()+"</h3> \r\n"
				+ ""
				+ "<h3> Your phone is : " + person.getPhone()+"</h3>"
				+ "	\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
