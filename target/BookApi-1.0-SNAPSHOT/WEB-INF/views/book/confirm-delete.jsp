<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Na pewno chcesz usunac ${book.title}?</h1>
<a href="/all"><button>nie</button></a>
<a href="<c:url value="/delete/${book.id}"/>"><button>tak</button></a>
</body>
</html>
