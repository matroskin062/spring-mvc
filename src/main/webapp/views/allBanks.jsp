<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UACompatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
    <div class="container">
        <c:forEach var="bank" items="${banks}">
            <table border="1">
                <thead>
                    <th>Id</th>
                    <th>Name</th>
                </thead>
                <tbody>
                    <tr>
                        <td>${bank.id}</td>
                        <td>${bank.name}</td>
                        <td>
                            <a class="btn btn-danger" href="bank/delete/${bank.id}">DELETE</a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </c:forEach>
    </div>
</body>
</html>