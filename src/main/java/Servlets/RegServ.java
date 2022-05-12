package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import data.Person;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;


public class RegServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegServ() {
    }

    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//receive date 
		String phone = request.getParameter("phone");
	    String name = request.getParameter("name");
	    String age = request.getParameter("age");
	    String email = request.getParameter("email");
	    
	    
	    // saving data in model
	    Person person = new Person();
	    person.setName(name);
	    person.setAge(age);
	    person.setPhone(phone);
	    person.setEmail(email);
	    
	    getServletContext().setAttribute("personData", person);
		
		PrintWriter out =  response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"windows-1256\">\r\n"
				+ "<title> Successful </title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	\r\n"
				+ "	<h3> Your data was saved successfully </h3>\r\n"
				+ "<a href='ShowData'>Show your data</a>"
				+ "<h3> Your name is : " + person.getEmail()+"</h3"
				+ "	\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
