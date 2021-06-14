<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1" cellspacing="0px" cellpadding="20px">
    <thead>
    <th>Isbn</th>
    <th>Title</th>
    <th>Author</th>
    <th>Action</th>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.isbn}"/></td>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.author}"/></td>
            <td>
                <a href="<c:url value="/edit/${book.id}"/>">Edytuj</a> |
                <a href="<c:url value="/confirm/${book.id}"/>">Usuń</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="4">
            <a href="<c:url value="/add"/>"><button>+</button></a> <em>Dodaj nową książkę</em>
        </td>
    </tr>
    </tbody>
</table>
</body>
</html>
