<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title><%= "JSPs and JSTLs" %></title>
    </head>
    <body>
    <%@ include file="/navbar.jsp" %>
    <h3>Login</h3>
        <form action="/login.jsp" method="POST">
            <label for="username">Username</label>
            <input name="username" id="username">
            <br>
            <label for="password">Password</label>
            <input name="password" id="password">
            <button type="submit">Submit</button>
        </form>

        <% if(request.getMethod().equalsIgnoreCase("POST")){
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")){
                response.sendRedirect("/profile.jsp");
            }   else{
                response.sendRedirect("/login.jsp");
            }
        }%>
    </body>
</html>