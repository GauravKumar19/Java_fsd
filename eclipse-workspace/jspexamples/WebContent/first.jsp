<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First JSP</title>
</head>

<% int count = 0;
%>


<body>
<%@include  file= "header.html"%>

page count is//;
<%
	for(int i=1;i<=10;i++){
		out.println(count++);
	}
%>
<%
	int x = 10;
	out.println(x);
%>
<%-- <jsp:include page= "a/b/header.html"/>--%>
<jsp:forward page="error.jsp"/>
<jsp:param value="Gaurav" name="myname"/>
</body>
</html>