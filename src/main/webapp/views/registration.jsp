<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Registration</title>
    <style>
        .container{
            width: 20%;
        }
    </style>
</head>
<body class="text-center">
    <div class="container">
        <h1>Registration</h1>
        <form action="/registration" method="post" ${error != null ? 'error' : ''}>
            <c:choose>
                <c:when test="${error != null}">
                    <div class="alert alert-danger alert-dismissible fade show" role="alert">
                        <a href="#" class="close" data-dismiss="alert" aria-label="Close">
                            <p>&times;</p>
                        </a>
                        <strong>Error!</strong><div>${error}</div>
                    </div>
                </c:when>
            </c:choose>
            <div class="form-group">
                <input class="form-control" type="text" name="username" id="username"
                       placeholder="Username" required pattern="[a-zA-Z0-9]*$"/>
            </div>
            <div class="form-group">
                <input class="form-control" type="password" name="password" id="password"
                       placeholder="Password"required pattern="^[a-zA-Z0-9]*$"/>
            </div>
            <button type="submit" class="btn btn-primary">Sign up</button>
        </form>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>