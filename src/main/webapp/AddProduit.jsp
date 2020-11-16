<%--
  Created by IntelliJ IDEA.
  User: Ahmed
  Date: 11/16/2020
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <form method="post" action="./add">
            <div class="row">
                <div class="col">
                    <input type="text" name="name" class="form-control" placeholder="Name">
                </div>
                <div class="col">
                    <input type="number" name="price" class="form-control" placeholder="Price">
                </div>
                <div class="col">
                    <input type="number" name="quantity" class="form-control" placeholder="Quantity">
                </div>
            </div>
            <button type="submit" class="btn btn-success">Add Product</button>
        </form>
    </div>

</body>
</html>
