package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;


public class TestServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public TestServ() {
    }





	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(getServletConfig().getInitParameter("name").toString() != null) {
			PrintWriter out =  response.getWriter();
			out.println("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"windows-1256\">\r\n"
					+ "<title>  </title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "	\r\n"
					+ "	<h3> Email is : " +getServletConfig().getInitParameter("name").toString() +"</h3>\r\n"
					+ "	<h3> Phone is : " +getServletContext().getInitParameter("phone")+"</h3>\r\n"
					+ "	\r\n"
					+ "</body>\r\n"
					+ "</html>");
		}else {
			PrintWriter out =  response.getWriter();
			out.println("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"windows-1256\">\r\n"
					+ "<title>Error page </title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "	\r\n"
					+ "	<h3> Error here </h3>\r\n"
					+ "	\r\n"
					+ "</body>\r\n"
					+ "</html>");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
