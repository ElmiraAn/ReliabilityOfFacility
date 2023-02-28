<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>

<h2>All Failures</h2>
<br>

<table>
    <tr>
        <th>Причина отказа </th>
        <th>Время простоя </th>
        <th>Снижение мощности</th>
    </tr>

    <c:forEach var="fail" items="${allFailures}">
        <%--<c:url var="updateButton" value="//updateInfo">
            <c:param name="unitId" value="${unit.id}"/>
        </c:url>--%>

        <%--<c:url var="deleteButton" value="//deleteUnit">
            <c:param name="unitId" value="${unit.id}"/>
        </c:url>--%>

        <tr>
            <td>${fail.name}</td>
            <td>${fail.hours}</td>
            <td>${fail.loss_of_power}</td>
                <%--<td>
                    <input type="button" value="Update"
                           onclick="window.location.href='${updateButton}'"/>

                    <input type="button" value="Delete"
                           onclick="window.location.href='${deleteButton}'"/>
                </td>--%>
        </tr>
    </c:forEach>
</table>
<br>
<%--<input type="button" value="Add"
    onclick="window.location.href='addNewUnit'">--%>


<br>
</body>

</html>