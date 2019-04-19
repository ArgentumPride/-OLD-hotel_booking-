<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Home Page</title>
</head>
<body>
<h1>Home</h1>
<a href="${pageContext.request.contextPath}/getRooms">Rooms</a> <br/><br/>
<a href="${pageContext.request.contextPath}/addUser">Add User</a><br/><br/>
<a href="${pageContext.request.contextPath}/addBook">New booking</a> <br/><br/>
<a href="${pageContext.request.contextPath}/getBooking">All bookings</a> <br/><br/>
</body>
</html>