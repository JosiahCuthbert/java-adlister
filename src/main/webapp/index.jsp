<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title><%= "JSPs and JSTLs" %></title>
    </head>
    <body>
        <%@ include file="/navbar.jsp" %>
        <h3>Hello</h3>

        <button onclick="window.location.href = '/login.jsp';">Login</button>
    </body>
</html>
