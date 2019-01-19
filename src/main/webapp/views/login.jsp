<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Document</title>
    <style>
        .container{
            width: 20%;
        }
    </style>
</head>
<body class="text-center">
<div class="container">
    <h1>Please Log <In></In></h1>
    <form action="/login" method="post">
        <div class="form-group">
            <input class="form-control" type="text" name="username" id="username" placeholder="Username"/>
        </div>
        <div class="form-group">
            <%--<label for="password"> Password:--%>
                <input class="form-control" type="password" name="password" id="password" placeholder="Password"/>
            <%--</label>--%>
        </div>
        <button type="submit" class="btn btn-primary">Log In</button>
    </form>
</div>
</body>
</html>