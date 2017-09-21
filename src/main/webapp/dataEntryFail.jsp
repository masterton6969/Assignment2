<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Data Entry Failed</title>
</head>
<body>
<h2>Data entry failed!</h2>
<%
if (( session.getAttribute("car_rego") == null || session.getAttribute("park_address") == null || session.getAttribute("day") == null || session.getAttribute("start_time") == null || session.getAttribute("end_time") == null || session.getAttribute("is_handicapped") == null || session.getAttribute("handicapped_spot") == null || session.getAttribute("fees_paid") == null ))
	{ %>
		Data entry failed, one or more fields are incomplete!<br/><br/>
	<%}
%>
<a href="enterData.jsp">Back to try again</a>
</body>
</html>b
