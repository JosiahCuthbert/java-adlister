<%--
  Created by IntelliJ IDEA.
  User: joecuthbert
  Date: 1/21/21
  Time: 8:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Guess</title>
    </head>
    <body>
    <div class="container">
        <h1>Guess a number between 1 and 3.</h1>
        <form action="/guess" method="POST">
            <div class="form-group">
                <label for="guess">Number: </label>
                <input id="guess" name="guess" class="form-control" type="text">
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Log In">
        </form>
    </div>
    </body>
</html>
