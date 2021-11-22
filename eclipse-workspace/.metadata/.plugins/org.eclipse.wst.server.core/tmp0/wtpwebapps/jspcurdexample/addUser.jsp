<%@page import="com.test.dao.UserDAO" %>
<jsp:useBean id="u" class= "com.test.bean.USerBean" ></jsp:useBean>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First JSP</title>
</head>

<jsp:setProperty property="*" name="u"/>

<%
int i=UserDAO.save(u);
if(i>0){
response.sendRedirect("AddUserSuccess.jsp");
}else{
response.sendRedirect("errorPage.jsp");
}
%>

</body>
</html>