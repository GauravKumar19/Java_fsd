<%@page import="com.test.dao.UserDAO,com.test.bean.USerBean,java.util.*"%>
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
            String id = request.getParameter("id");
            USerBean u = UserDAO.getRecordById(Integer.parseInt(id));
        %>

        <h1>Edit Form</h1>
        <form action="UpdateUser.jsp" method="post">
            <input type="hidden" name="id" value="<%=u.getId()%>"/>
            <table>
                <tr><td>Name:</td><td><input type="text" name="name" value="<%= u.getName()%>"/></td></tr>
                <tr><td>Password:</td><td><input type="password" name="password" value="<%= u.getPassword()%>"/></td></tr>
 <tr><td>Email:</td><td><input type="email" name="email" value="<%= u.getEmail()%>"/></td></tr>
                <tr><td>Gender</td><td><input type="radio" name="sex" value="male"/>Male <input type="radio" name="sex" value="female"/>Female </td></tr>
                <tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>
            </table>
        </form>

</body>
</html>