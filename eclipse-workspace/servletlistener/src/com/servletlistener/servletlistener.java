package com.servletlistener;

import java.sql.*;
import javax.servlet.*;

public class servletlistener implements ServletContextListener
{
    ServletContext stcx;
    Connection con;
    Statement s;
    PreparedStatement ps;
    ResultSet rs;
    int counter;
    
    public void contextInitialized(ServletContextEvent sct) {
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
     	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root123");

            s = con.createStatement();
      
            // fetching pageviews value from table counter
            rs = s.executeQuery("select pageview from counter");
            
            while(rs.next()) {
                counter = rs.getInt(1);
            }
       
            stcx = sct.getServletContext();
            stcx.setAttribute("pcount", counter);
        }
        catch(Exception e) { 
            e.printStackTrace(); 
        }  
    }

    public void contextDestroyed(ServletContextEvent sce) {
   
        try
        {
            stcx = sce.getServletContext();
            counter = (Integer)stcx.getAttribute("counter");
            ps = con.prepareStatement("update counter set pcount='"+counter+"'");
            ps.executeUpdate(); 
        } 
        catch(Exception e) { 
            e.printStackTrace(); 
        }
    }   
}
