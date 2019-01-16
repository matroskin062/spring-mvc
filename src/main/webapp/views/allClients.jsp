<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UACompatible" content="ie=edge">
    <title>Bank List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <form method="get" action="/bank">
        <table class="table table-hover" width="50%" style="margin-top: 10px">
            <thead>
                <th scope="col">Id</th>
                <th scope="col">Phone Number</th>
                <th scope="col">E-mail</th>
                <th scope="col">Address</th>
                <th scope="col" width="55%"></th>
            </thead>
            <tbody>
            <c:forEach var="client" items="${clients}">
            <tr>
                <td scope="row">${client.id}</td>
                <td>${client.name}</td>
                <td>${client.phoneNumber}</td>
                <td>${client.email}</td>
                <td>${client.address}</td>
                <td>
                    <a class="btn btn-danger" href="bank/delete/${bank.id}">DELETE</a>
                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>

    </form>
    <form action="/client/create" method="post" >
        <div class="form-group">
            <label for="name">Enter Bank Name</label>
            <input name="name" type="text" class="form-control" id="name" placeholder="Enter Name">
        </div>
        <button type="submit" class="btn btn-primary">Add</button>
    </form>


    <a class="btn" href="main.html">To main menu</a>

</div>

</body>
</html>