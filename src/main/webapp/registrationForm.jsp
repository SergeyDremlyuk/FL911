<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 14.10.2017
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri=
                   "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>


    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.standalone.min.css"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js"></script>


    <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js"></script>

    <style type="text/css">
        .form form {
            width: 600px;
            margin: 0 auto;
            padding-top: 25px;
            padding-bottom: 10px;
        }

        .input-group[class*=col-] {
            padding-right: 15px;
            padding-left: 15px;
        }
    </style>

    <%--<script type="text/javascript">--%>
        <%--$(document).ready(function() {--%>
            <%--$(form).keypress(function(event){--%>
                <%--if(event.keyCode == 13) {--%>
                    <%--event.preventDefault();--%>
                    <%--return false;--%>
                <%--}--%>
            <%--});--%>
        <%--});</script>--%>
<script type="text/javascript">

    $(document).ready(function(){
        $("#create").click(function() {
            if ($('#registrationForm').validator('validate').has('.has-error').length) {
//              alert('SOMETHING WRONG');
            } else {
                this.form.submit();
//               alert('EVERYTHING IS GOOD');
            }
        });
    });

</script>



    <title>Registration</title>
</head>

<body>


<div class="form">

    <form class="form-horizontal" data-toggle="validator" role="form" method="post" id="registrationForm" action="/web/registration">


        <div class="form-group">


                <h2>Create an account</h2>

                <div class="form-group has-feedback">
                    <label for="firstName" class="col-md-3 control-label">First name</label>
                    <div class="col-md-9">
                        <input type="text" pattern="[A-z]{1,20}" class="form-control" placeholder="First name" name="firstName"
                               id="firstName" required>
                    </div>
                </div>
                <div class="form-group has-feedback">
                    <label for="lastName" class="col-md-3 control-label">Last name</label>
                    <div class="col-md-9">
                        <input type="text" pattern="[A-z]{1,20}" class="form-control" placeholder="Last name" name="lastName" id="lastName" required>
                    </div>
                </div>

                <div class="form-group has-feedback">
                    <label for="bday" class="col-md-3 control-label">Birthday</label>
                    <div class="input-group date col-md-9" data-provide="datepicker"  data-date-format="yyyy-mm-dd">
                        <input type="text" pattern="{1,}" class="form-control" placeholder="birthday" name="bday" id="bday" required>
                        <div class="input-group-addon">
                            <span class="fa fa-th"></span>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-md-3">Sex</label>
                    <div class="col-md-2">
                        <label class="radio-inline">
                            <input type="radio" name="sex" value="male" required> Male
                        </label>
                    </div>
                    <div class="col-md-2">
                        <label class="radio-inline">
                            <input type="radio" name="sex" value="female" required> Female
                        </label>
                    </div>
                </div>

                <div class="form-group">
                    <label for="nativeLanguage" class="control-label col-md-3">Native language</label>
                    <div class="col-md-9">
                        <select class="form-control" name="nativeLanguage" id="nativeLanguage">
                            <c:forEach items="${languageList}" var="item">
                                <option value="${item.id}">${item.name} </option>
                            </c:forEach>
                        </select>
                    </div>
                </div>

                <div class="form-group">
                    <label for="login" class="col-md-3 control-label">Login</label>
                    <div class="col-md-9">
                        <input type="text" pattern="^[a-zA-Z][a-zA-Z0-9-_.]{3,20}$" class="form-control" placeholder="Login" name="login" id="login" required>
                    </div>
                </div>

                <div class="form-group">
                    <label for="password" class="col-md-3 control-label">Password</label>
                    <div class="col-md-9">
                        <input type="password" data-minlength="5" class="form-control" placeholder="Password" name="password" id="password" required>
                        <div class="help-block">Minimum of 5 characters</div>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-md-offset-9 col-md-3">
                        <button type="button" onclick=" "  class="btn btn-primary" id="create">Create an account</button>
                        <%--<button type="submit"  class="btn btn-primary">Create an account</button>--%>
                    </div>
                </div>

            </div>
        <input type="hidden" name="registerForm">
    </form>

    </div><!-- form  -->

<%--<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>--%>
<%--<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
<%--<script src="dist/validator.min.js"></script>--%>
<%--<script src="http://platform.twitter.com/widgets.js"></script>--%>
<%--<script src="assets/js/application.js"></script>--%>


</body>


</html>
