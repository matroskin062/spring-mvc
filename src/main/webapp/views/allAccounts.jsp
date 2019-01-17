<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UACompatible" content="ie=edge">
    <title>Account List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <form method="get" action="/account">
        <table class="table table-hover" width="50%" style="margin-top: 10px">
            <thead>
            <th scope="col">Id</th>
            <th scope="col">Amount</th>
            <th scope="col">Client</th>
            <th scope="col" width="55%"></th>
            </thead>
            <tbody>
            <c:forEach var="account" items="${accounts}">
                <tr>
                    <td scope="row">${account.id}</td>
                    <td>${account.amount}</td>
                    <td>
                        <a class="btn btn-danger" href="bank/delete/${account.id}">DELETE</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </form>
    <form action="/account/create" method="post" >
        <div class="form-group">
            <label for="amount">Enter Amount</label>
            <input name="amount" type="text" class="form-control" id="amount" placeholder="Enter Amount">
        </div>
        <button type="submit" class="btn btn-primary">Add</button>
    </form>


    <a class="btn btn-outline-secondary my-2" href="main">To main menu</a>

</div>

</body>
</html>