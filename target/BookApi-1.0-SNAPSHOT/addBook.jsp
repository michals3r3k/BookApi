<%--
  Created by IntelliJ IDEA.
  User: mcs
  Date: 05.02.2021
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add Book</h1>
    <form method="post" action="/books">
        ISBN: <input type="text" name="isbn"><br>
        TITLE: <input type="text" name="title"><br>
        AUTHOR: <input type="text" name="author"><br>
        PUBLISHER: <input type="text" name="publisher"><br>
        TYPE: <input type="text" name="type"><br>
        <input type="submit">
    </form>

</body>
</html>
