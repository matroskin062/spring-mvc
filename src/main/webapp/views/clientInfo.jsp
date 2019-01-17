<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>${client.name}</title>
</head>
<body>
<div class="container text-center">
    <div>
        <p>Id : ${client.id}</p>
        <p>Name : ${client.name}</p>
        <p>Phone : ${client.phoneNumber}</p>
        <p>E-mail : ${client.email}</p>
        <p>Address : ${client.address}</p>
        <p>Bank : ${client.bank}</p>
    </div>
    <a class="btn btn-primary" href="/client">Clients</a>
</div>
</body>
</html>