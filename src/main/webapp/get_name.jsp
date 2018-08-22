<%--
  Created by IntelliJ IDEA.
  User: vincentlewis
  Date: 8/21/18
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Name Form</title>
</head>
<body>
    <form action="/name" method="post">
        <label for="name">Enter your name:</label>
        <input type="text" id="name" name="name">
        <button>
            Submit
        </button>
    </form>
</body>
</html>
