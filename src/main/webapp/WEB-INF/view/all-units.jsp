<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>

<h2>All Units</h2>
<br>

<table>
    <tr>
        <th>Группа оборудования</th>
        <th>Единица оборудования</th>
        <th>Операции</th>
    </tr>

    <c:forEach var="unit" items="${allUni}">
        <c:url var="updateButton" value="//updateInfo">
            <c:param name="unitId" value="${unit.id}"/>
        </c:url>

        <c:url var="deleteButton" value="//deleteUnit">
            <c:param name="unitId" value="${unit.id}"/>
        </c:url>

    <tr>
        <td>${unit.id_system}</td>
        <td>${unit.name}</td>
        <td>
            <input type="button" value="Update"
            onclick="window.location.href='${updateButton}'"/>

            <input type="button" value="Delete"
                   onclick="window.location.href='${deleteButton}'"/>
        </td>
    </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Add"
        onclick="window.location.href='addNewUnit'">


<br>
</body>

</html>