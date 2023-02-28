<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
</body>

</html>