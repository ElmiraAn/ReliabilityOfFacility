<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
<br>
<h2>Unit Info</h2>
<br>


<form:form action="saveUnit" modelAttribute="unit">

    <form:hidden path="id"/>

    Группа оборудования <form:input path="id_system"/>
    <br><br>
    Единица оборудования <form:input path="name"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>


<table>
    <tr>
        <th>Причина отказа </th>
        <th>Время простоя </th>
        <th>Снижение мощности</th>
    </tr>

    <c:forEach var="fail" items="${allFail}">
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
</body>

</html>