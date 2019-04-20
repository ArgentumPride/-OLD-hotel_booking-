<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Booking</title>
</head>
<body>

<h1>${headerMessage}</h1>
<form:form method="POST" action="addBook" modelAttribute="booking">
    <table>
        <tr>
            <td><form:label path="room_id">ROOM ID</form:label></td>
            <td><form:input path="room_id"/></td><br/><br/>
        </tr>
        <tr>
            <td><form:label path="username">Username</form:label></td>
            <td><form:input path="username"/></td><br/><br/>
        </tr>
        <tr>
            <td><form:label path="extra">Extra</form:label></td>
            <td><select id="extra" name="extra">
                <option value="cleaning">Cleaning</option>
                <option value="breakfast">Breakfast</option>
            </select></td><br/><br/>
        </tr>
        <tr>
            <td><form:label path="checkOutDate">Check-out Date(yyyy-MM-dd)</form:label></td>
            <td><form:input path="checkOutDate" cssClass="form-control" /></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>