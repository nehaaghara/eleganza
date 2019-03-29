<%-- 
    Document   : ublOasisRegister
    Created on : Nov 15, 2018, 5:10:37 PM
    Author     : ITMCS
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Eleganza</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.6 -->
        <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webresource/admin/bootstrap/css/bootstrap.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webresource/admin/dist/css/AdminLTE.min.css">
        <!-- iCheck -->
        <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webresource/admin/plugins/iCheck/square/blue.css">
        <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webresource/admin/pageCss/CommonCss.css">

        <!-- For passwords check-css -->
        <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webresource/admin/pageCss/passwordCheck.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="hold-transition register-page">
        <div class="register-box">
            <div class="register-logo">
                <b>Ele</b>ganza
            </div>
            <div class="register-box-body">
                <p id="responseReg" class="login-box-msg" style="display:none"></p>

                <form action="${pageContext.servletContext.contextPath}/registration" method="get">
                    <div id="otpSentModel">
                        <p class="login-box-msg">Register for Eleganza</p>
                        <div class="form-group has-feedback">
                            <input type="text"   class="form-control" name="firstname" title="Full name" placeholder="First Name"/>
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                              <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>
                        </div>
                        <div class="form-group has-feedback">
                            <input type="text"  path="fullname" class="form-control" name="lastname" title="Full name" placeholder="Last Name"/>
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                              <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>

                        </div>
                        <div class="form-group has-feedback">
                            <input type="email"  path="fullname" class="form-control" name="email" title="Full name" placeholder="Email"/>
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                             <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>

                        </div> 
                       
                        <div class="form-group has-feedback">    
                        <input type="radio" name="gender" value="male" checked> Male
                        <input type="radio" name="gender" value="female"> Female    
                          <span class="glyphicon glyphicon-user form-control-feedback"></span>
                            <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>
                        </div>
                         <div class="form-group has-feedback">
                             <textarea  class="form-control" cols="25" rows="20" name="address" title="Full name" placeholder="Address"></textarea>
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                             <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>

                        </div>
                         <div class="form-group has-feedback">
                            <input type="text"   class="form-control" name="city" title="Full name" placeholder="Enter City"/>
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                             <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>

                        </div>   
                         
                         <div class="form-group has-feedback">
                            <input type="text"   class="form-control" name="pincode" title="Full name" placeholder="PinCode NO.."/>
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                            <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>

                        </div>
                            
                        <div class="form-group has-feedback">
                             <select name="state" path="state" name="state"  id="shippingstateid" style="width: 199px">
                                                        <option value="">Select State</option>
                                                        <option value="AS">Assam</option>
                                                        <option value="BR">Bihar</option>
                                                        <option value="CT">Chhattisgarh</option>
                                                        <option value="GA">Goa</option>
                                                        <option value="GJ">Gujarat</option>
                                                        <option value="HR">Haryana</option>
                                                        <option value="JH">Jharkhand</option>
                                                        <option value="KA">Karnataka</option>
                                                        <option value="KL">Kerala</option>
                                                        <option value="MP">Madhya Pradesh</option>
                                                        <option value="MH">Maharashtra</option>
                                                        <option value="MN">Manipur</option>
                                                        <option value="ML">Meghalaya</option>
                                                        <option value="MZ">Mizoram</option>
                                                        <option value="NL">Nagaland</option>
                                                        <option value="OR">Orissa</option>
                                                        <option value="PB">Punjab</option>
                                                        <option value="RJ">Rajasthan</option>
                                                        <option value="SK">Sikkim</option>
                                                        <option value="TN">Tamil Nadu</option>
                                                        <option value="TS">Telangana</option> 
                                                        <option value="TR">Tripura</option>
                                                        <option value="UK">Uttarakhand</option>
                                                        <option value="UP">Uttar Pradesh</option>
                                                        <option value="WB">West Bengal</option>
                                                        <option value="AN">Andaman and Nicobar Islands</option>
                                                        <option value="CH">Chandigarh</option>
                                                        <option value="DN">Dadar and Nagar Haveli</option>
                                                        <option value="DD">Daman and Diu</option>
                                                        <option value="DL">Delhi</option>
                                                        <option value="LD">Lakshadeep</option>
                                                        <option value="PY">Pondicherry (Puducherry)</option>
                                                    </select>
                              <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>

                        </div> 
                         <div class="form-group has-feedback">
                            <input type="text"   class="form-control" name="phonenumber" title="Full name" placeholder="ContrctNo.."/>
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                             <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>

                        </div>   
                        <div class="form-group has-feedback">
                            <input type="text"   class="form-control" name="username" title="Full name" placeholder="User Name"/>
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                              <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>

                        </div>
                        <div class="form-group has-feedback">
                            <input type="password"   class="form-control" name="password" title="Full name" placeholder="Password"/>
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                              <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>

                        </div> 
                        <div class="form-group has-feedback">
                            <input type="password"   class="form-control" name="conformpassword" title="Full name" placeholder="Retry Password"/>
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                              <span for="emailAddress" class="help-block"><form:errors path="emailAddress"/></span>

                        </div>     
                            
                           
                        
                        
                       
                    </div>

                    <div class="row">
                        <div class="col-xs-8"><a href="${pageContext.servletContext.contextPath}/loginindex" class="text-center">I_already_have_a_membership</a>
                        </div>
                        <!-- /.col -->
                        <div class="col-xs-4">
                            <button type="submit" id="btnRegOtpsent" class="btn btn-primary btn-block btn-flat">Register</button>
                        </div>
                        <!-- /.col -->
                    </div>
                </form>
            </div>
            <!-- /.form-box -->
        </div>
        <!-- /.register-box -->

        <script>
            var path = '${pageContext.servletContext.contextPath}';
        </script>       

        <!-- jQuery 2.2.3 -->
        <script src="${pageContext.servletContext.contextPath}/webresource/admin/plugins/jQuery/jquery-2.2.3.min.js"></script>
        <!-- Bootstrap 3.3.6 -->
        <script src="${pageContext.servletContext.contextPath}/webresource/admin/bootstrap/js/bootstrap.min.js"></script>
        <!-- iCheck -->
        <script src="${pageContext.servletContext.contextPath}/webresource/admin/plugins/iCheck/icheck.min.js"></script>
       </body>
</html>
