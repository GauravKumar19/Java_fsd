package Cook1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookdemo")
public class cookdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");

		String username=request.getParameter("uname");
		String paswd=request.getParameter("pwd");
		String age=request.getParameter("age");
		
		if(paswd.equals("##143"))
		{
			
			Cookie cke[]=new Cookie[3];
			cke[0]=new Cookie("usname",username);
			cke[1]=new Cookie("pass",paswd);
			cke[2]=new Cookie("age",age);
			for(int i=0;i<3;i++)
			{
			response.addCookie(cke[i]);
			}
			response.sendRedirect("displayServlet");
		}
		}

}
