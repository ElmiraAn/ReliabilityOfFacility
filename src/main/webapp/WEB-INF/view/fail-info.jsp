<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
<br>
<h2>Failures Info</h2>
<br>


<%--<form:form action="saveUnit" modelAttribute="unit">

    <form:hidden path="id"/>

    Группа оборудования <form:input path="id_system"/>
    <br><br>
    Единица оборудования <form:input path="name"/>
    <br><br>
    <input type="submit" value="OK">

</form:form> --%>


<table>
    <tr>
        <th>Причина отказа </th>
        <th>Время простоя </th>
        <th>Снижение мощности</th>
        <th>Операции</th>
    </tr>

    <c:forEach var="fail" items="${allFail}">

        <%--<form:form action="saveFail" modelAttribute="fail">--%>
        <c:url var="saveButtonFail" value="//saveFail">
            <%--<c:param name="unitId" value="${unit.id}"/>--%>
              <c:param name="failId" value="${fail.id_failure}"/>
        </c:url>
        <%--<c:url var="updateButtonFail" value="//updateInfoFail">
            <c:param name="failId" value="${fail.id_failure}"/>
        </c:url> --%>

        <%-- <c:url var="deleteButtonFail" value="//deleteFail">
            <c:param name="failId" value="${fail.id_failure}"/>
        </c:url> --%>

        <tr>
            <td>${fail.name}</td>
            <td>${fail.hours}</td>
            <td>${fail.loss_of_power}</td>

            <td>
                <input type="button" value="OK fail"
                       onclick="window.location.href='${saveButtonFail}'"/>
                    <%-- <input type="submit" value="OK">--%>
            </td>

        </tr>
        <%--</form:form>--%>
</c:forEach>
</table>

</body>

</html>