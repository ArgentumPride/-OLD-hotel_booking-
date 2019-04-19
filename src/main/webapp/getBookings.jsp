<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Rooms</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="form-style-2">
    <form action="getBooking">
        <table>
            <tr>
                <th>ID</th>
                <th>ROOM_ID</th>
                <th>Username</th>
                <th>Total cost</th>
                <th>Extra</th>
                <th>Check-out Date</th>
            </tr>
            <c:forEach items="${DBBooking}" var="booking">
                <tr>
                    <td>${booking.booking_id}</td>
                    <td>${booking.room_id}</td>
                    <td>${booking.username}</td>
                    <td>${booking.totalCost}</td>
                    <td>${booking.extra}</td>
                    <td>${booking.checkOutDate}</td>
                </tr>
            </c:forEach>
            </tr>
        </table>
    </form>
</div>
<div>
    <a href="${pageContext.request.contextPath}/home">Go home</a>
</div>
</body>
</html>