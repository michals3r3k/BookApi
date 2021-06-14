<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>EditBook</title>
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>" type="text/css">
</head>
<body>
<h1>Edit book</h1>
<form:form method="post" modelAttribute="book" action="/edit">
    <form:hidden path="id"/>
    <table>
        <tbody>
        <tr>
            <td>Podaj Isbn:</td>
            <td><form:input path="isbn"/> <form:errors path="isbn" cssClass="red"/></td>
        </tr>
        <tr>
            <td>Podaj tytuł:</td>
            <td><form:input path="title"/></td>
        </tr>
        <tr>
            <td>Podaj Autora:</td>
            <td><form:input path="author"/></td>
        </tr>
        <tr>
            <td>Podaj Wydawcę:</td>
            <td><form:input path="publisher"/></td>
        </tr>
        <tr>
            <td>Podaj Typ:</td>
            <td><form:input path="type"/></td>
        </tr>
        </tbody>
    </table>
    <input type="submit">
</form:form>
</body>
</html>
