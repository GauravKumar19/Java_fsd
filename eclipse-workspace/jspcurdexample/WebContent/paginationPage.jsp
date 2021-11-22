<%@ page import="java.util.*, com.test.bean.USerBean, com.test.dao.UserDAO" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%@ include file="header.html" %>  <br>
<%
    String spageid = request.getParameter("page");
    int pageid = Integer.parseInt(spageid);
    int total = 2;
    if (pageid == 1) {
    } else {
        pageid = pageid - 1;
        pageid = pageid * total + 1;
    }
    List<USerBean> list = UserDAO.getRecords(pageid, total);

    out.print("<h1>Page No: " + spageid + "</h1>");
    out.print("<table border='1' cellpadding='4' width='60%'>");
    for (USerBean e : list) {
        out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName() +"</td></tr> ");
        
}  
out.print("</table>");
%>  
<a href="paginationPage.jsp?page=1">1</a>  
<a href="paginationPage.jsp?page=2">2</a>  
<a href="paginationPage.jsp?page=3">3</a>

</body>
</html>