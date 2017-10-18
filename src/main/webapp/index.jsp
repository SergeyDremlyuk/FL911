<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 14.10.2017
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

    <style type="text/css">
        .form form {
            width: 300px;
            margin: 0 auto;
            padding-top: 200px;
        }
    </style>

    <title>FL911 - log in or sign up</title>

</head>

<body>

<div class="form">
    <form class="form-horizontal" role="form" method="POST">
        <div class="form-group">
            <div class="form-group">
                <label for="inputLogin" class="col-md-3 control-label">Login</label>
                <div class="col-md-9">
                    <input type="text" class="form-control" placeholder="Login" name="login" id="inputLogin">
                </div>
            </div>
            <div class="form-group">
                <label for="inputPassword" class="col-md-3 control-label">Password</label>
                <div class="col-md-9">
                    <input type="password" class="form-control" placeholder="Password" name="password"
                           id="inputPassword">
                </div>
            </div>

            <div class="form-group">
                <div class=" col-md-offset-3 col-md-9 ">
                    <button type="submit" class="btn btn-primary btn-md btn-block " formaction="/web/auth"> Sign in</button>
                    <button type="submit" class="btn btn-outline-secondary btn-block" formaction="/web/registration">Sign up</button>
                </div>
            </div>
        </div>
        <input type="hidden" name="mainForm">
    </form>
</div><!-- form  -->


</body>
</html>
