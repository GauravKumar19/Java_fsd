package servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestConfig")
public class TestConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out=response.getWriter();
	        ServletConfig sfg=getServletConfig();

	        Enumeration <String> en=sfg.getInitParameterNames();

	        String data =" ";
	        while(en.hasMoreElements())
	        {
	            data=en.nextElement();
	            out.println("<br>Parameter Names are :" + data);
	            out.println(sfg.getInitParameter(data));
	        }
	    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
