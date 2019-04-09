
<%-- 
Document : ublOasisLogin
Created on : Nov 15, 2018, 2:06:31 PM
Author : ITMCS
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>DIAN | UBL OASIS</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1 , maximum-scale=1 , user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.6 -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webresource/admin/dist/css/AdminLTE.min.css">
        <!-- iCheck -->
        <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webresource/admin/plugins/iCheck/square/blue.css">
        <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webresource/css/custom.css">
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="hold-transition login-page">
        <div class="login-box">
            <div class="login-logo">
                <b style="color:black">ELEGANZA</b>

            </div>
            <!-- /.login-logo -->
            <div class="login-box-body">
                <c:if test="${not empty errorMessage}">
                    <div class="row" style="margin-left: 0px;" id="errorMessage">
                        <div class="col-md-12  alert alert-success">
                            ${errorMessage}.
                        </div>
                    </div>

                </c:if>
                <form action="${pageContext.servletContext.contextPath}/loginpage" method="get">
                    <div class="form-group has-feedback">
                        <input type="email" class="form-control" id="emailAddress" title="emailAddress" placeholder="Enter Mail Id" name="emailAddress">
                        <span class="glyphicon glyphicon-user form-control-feedback"></span>
                        <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" id="password" title="Password" placeholder="Password" name="password">
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                        <span for="password" class="help-block"><form:errors path="password"/></span>
                    </div>
                    <div class="row" style="float:right ; margin:0px 71px 0px 0px">
                        <div class="col-xs-4">
                            <button style="text-align: center; margin-left:84px" type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
                        </div> 
                    </div>
                    <div class="row" style="margin:0px 0px 0px -64px ">
                        <div class="col-xs-8"> 
                            <a style=" margin-left:51px" href="${pageContext.servletContext.contextPath}/registrationindex" class="text-center">CreateNewAcount</a>
                        </div>
                        <div class="col-xs-8"> 
                            <a style=" margin-left:51px" href="${pageContext.servletContext.contextPath}/forgotpage" class="text-center">Forgot_Password</a>
                        </div>
                    </div> 
                    <!-- /.col -->
                    <!-- /.col -->

                </form>


                <!-- /.social-auth-links -->
            </div>
            <!-- /.login-box-body -->
        </div>
        <!-- /.login-box -->

        <!-- jQuery 2.2.3 -->
        <script src="${pageContext.servletContext.contextPath}/webresource/js/jquery-1.12.3.min.js"></script>
        <!-- Bootstrap 3.3.6 -->
        <script src="${pageContext.servletContext.contextPath}/webresource/admin/bootstrap/js/bootstrap.min.js"></script>
        <!-- iCheck -->
        <script src="${pageContext.servletContext.contextPath}/webresource/admin/plugins/iCheck/icheck.min.js"></script>
        <script src="${pageContext.servletContext.contextPath}/webresource/js/jquery.magnific-popup.js"></script>
        <script src="${pageContext.servletContext.contextPath}/webresource/js/jquery-ui.min.js"></script>
        <script>
            $(function () {
                $('input').iCheck({
                    checkboxClass: 'icheckbox_square-blue',
                    radioClass: 'iradio_square-blue',
                    increaseArea: '20%' // optional
                });
            });
             $("#errorMessage").delay(1000).fadeOut();
        </script>
 </body>
</html>
