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
    <title>${bank.name}</title>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-1">
                <p class="h3">Id</p>
            </div>
            <div >
                <p class="h3">Name</p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-1">
                <p class="h3">${bank.id}</p>
            </div>
            <div>
                <p class="h3">${bank.name}</p>
            </div>
        </div>
    </div>
</body>
</html>