<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Rooms</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
    <div class="form-style-2">
    <form action="getRooms">
        <table>
            <tr>
                <th>id</th>
                <th>category</th>
                <th>price</th>
            </tr>
            <c:forEach items="${DBRooms}" var="room">
                <tr>
                    <td>${room.room_id}</td>
                    <td>${room.category}</td>
                    <td>${room.price}</td>
                </tr>
            </c:forEach>
        </table>
    </form>
</div>
    <a href="${pageContext.request.contextPath}/byCategory?category=standart">Show only standart rooms</a> <br/><br/>
    <a href="${pageContext.request.contextPath}/byCategory?category=duo">Show only duo rooms</a> <br/><br/>
    <a href="${pageContext.request.contextPath}/byCategory?category=king">Show only king rooms</a> <br/><br/>
</body>
</html>