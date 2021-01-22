<%--
  Created by IntelliJ IDEA.
  User: joecuthbert
  Date: 1/21/21
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <jsp:include page="partials/head.jsp">
            <jsp:param name="title" value="Customize your Pizza" />
        </jsp:include>
    </head>
    <body>
    <jsp:include page="partials/navbar.jsp" />
    <div class="container">
            <h1>Customize your pizza</h1>
            <form action="/pizza" method="POST">
                <div>
                    <label class="heading" for="crust">Crust</label>
                    <select name="crust" id="crust">
                        <option value="thick">Thick</option>
                        <option value="thin">Thin</option>
                        <option value="cheesy">Cheesy</option>
                    </select>
                </div>
                <div>
                    <label class="heading" for="sauce">Sauce</label>
                    <select name="sauce" id="sauce">
                        <option value="white">White</option>
                        <option value="red">Red</option>
                        <option value="none">None</option>
                    </select>
                </div>
                <div>
                    <label class="heading" for="size">Size</label>
                    <select name="size" id="size">
                        <option value="small">Small</option>
                        <option value="medium">Medium</option>
                        <option value="large">Large</option>
                        <option value="xLarge">Extra Large</option>
                    </select>
                </div>
                <div>
                    <label class="heading">Toppings</label><br>
                        <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
                        <label for="pepperoni">Pepperoni</label><br>
                        <input type="checkbox" id="jalapeno" name="toppings" value="jalapeno">
                        <label for="jalapeno">Jalapeno</label><br>
                        <input type="checkbox" id="onion" name="toppings" value="onion">
                        <label for="onion">Onion</label><br>
                        <input type="checkbox" id="mushroom" name="toppings" value="mushroom">
                        <label for="mushroom">Mushroom</label><br>
                        <input type="checkbox" id="pineapple" name="toppings" value="Pineapple">
                        <label for="pineapple">Pineapple</label><br>
                </div>
                <input type="submit" class="btn btn-primary btn-block" value="Submit">
            </form>
        </div>



    </body>
</html>
