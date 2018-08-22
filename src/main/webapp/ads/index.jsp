<%--
  Created by IntelliJ IDEA.
  User: vincentlewis
  Date: 8/22/18
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Ads</title>
</head>
<body>
    <h2>Currently Available:</h2>

    <c:forEach var = "ad" items="${allAds}">

        <div style="margin-left:20px">
            <h3>${ad.title}</h3>
            <article>${ad.description}</article>
        </div>

    </c:forEach>
</body>
</html>
