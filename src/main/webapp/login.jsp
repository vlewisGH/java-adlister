<%--
  Created by IntelliJ IDEA.
  User: vincentlewis
  Date: 8/20/18
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log-in</title>
</head>
<body>
    <form action="/login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" placeholder="username"><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" placeholder="password"><br><br>
        <button>Submit</button>
    </form>
</body>
</html>
