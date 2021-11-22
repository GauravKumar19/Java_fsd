package servletdemo;
import javax.servlet.http.*;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public servlet1() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String Name = request.getParameter("Name");
		out.print("<body><h1 class='red-text' color=red;<b>"+"Welcome &nbsp;"+Name+"&nbsp; you are registered....."+"</b></h1></body>");
		
		String Address = request.getParameter("Address");
		out.print("<body><h1 class='red-text' color=red;<b>"+"Your Current Address= &nbsp;"+Address+"</b></h1></body>");

		String Email = request.getParameter("EMail");
		out.print("<body><h1 class='red-text' color=red;<b>"+"Your Email address =&nbsp;"+Email+"</b></h1></body>");

		String mobile = request.getParameter("MobileNo");
		out.print("<body><h1 class='red-text' color=red;<b>"+"Your mobile number =&nbsp;"+mobile+"</b></h1></body>");

		String course = request.getParameter("Course");
		out.print("<body><h1 class='red-text' color=red;<b>"+"Your Course =&nbsp;"+course+"</b></h1></body>");

		String courses [] = request.getParameterValues("Course");
		for(int i=0; i<courses.length;i++) {
			out.print("<body><h1 class='red-text' color=red;<b>"+"Your Course =&nbsp;"+courses[i]+"</b></h1></body>");
		}
		
		

	}

}
