<%@page import="com.test.dao.UserDAO, com.test.bean.USerBean,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="grey">
         <%@ include file="header.html" %>  <br>

        

        <h1>Users List</h1>

        <%
            List<USerBean> list = UserDAO.getAllRecords();
            request.setAttribute("list", list);
        %>

<table border="1" width="90%">
            <tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Sex</th><th>Edit</th><th>Delete</th></tr>
                    <c:forEach items="${list}" var="u">
                <tr><td>${u.getId()}</td><td>${u.getName()}</td><td>${u.getPassword()}</td><td>${u.getEmail()}</td><td>${u.getSex()}</td><td><a href="updateForm.jsp?id=${u.getId()}">Edit</a></td><td><a href="DeleteUser.jsp?id=${u.getId()}">Delete</a></td></tr>
            </c:forEach>
        </table>
        <br/><a href="adduserForm.jsp">Add New User</a>

    </body>



</html>