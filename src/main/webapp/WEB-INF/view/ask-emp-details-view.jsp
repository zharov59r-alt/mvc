<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<body>

<h2>Уважаемый сотрудник, пожалуйста, заполните свои данные</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee" method="GET">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
        <form:options items="${departments}"/>
    </form:select>
    <br><br>

    Gender <br> <form:radiobuttons path="gender" items="${genders}"/>
    <br><br>

    Language <br> <form:checkboxes path="languages" items="${languages}"/>
    <br><br>

    <input type="submit" value="OK">

</form:form>

</body>

</html>