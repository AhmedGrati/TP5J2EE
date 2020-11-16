<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256"/>
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
<table class="table" border="1" width="80%">
    <thead>
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Prix</th>
        <th>Quantity</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${modele.produits}" var="p">
        <tr>
            <td>${p.idProduit}</td>
            <td>${p.nomProduit}</td>
            <td>${p.prix}</td>
            <td>${p.quantity}</td>
          <td>
            <a href="./delete?id=${p.idProduit}">
              <button class="btn"><i class="fa fa-trash"></i></button>
            </a>
            <a href="./add">
              <button class="btn"><i class="fa fa-plus"></i></button>
            </a>
            <a href="./update?id=${p.idProduit}">
              <button class="btn"><i class="fa fa-edit"></i></button>
            </a>
          </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
