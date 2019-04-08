<%-- 
    Document   : Forgotpwd
    Created on : 19 Mar, 2019, 5:57:45 PM
    Author     : Hiral 
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<!--<![endif]-->
<!-- Head BEGIN -->
<head>
  <meta charset="utf-8">
  <title>Forgot Your Password? | Eleganza Shop UI</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta content="Metronic Shop UI description" name="description">
  <meta content="Metronic Shop UI keywords" name="keywords">
  <meta content="keenthemes" name="author">
  <meta property="og:site_name" content="-CUSTOMER VALUE-">
  <meta property="og:title" content="-CUSTOMER VALUE-">
  <meta property="og:description" content="-CUSTOMER VALUE-">
  <meta property="og:type" content="website">
  <meta property="og:image" content="-CUSTOMER VALUE-"><!-- link to image for socio -->
  <meta property="og:url" content="-CUSTOMER VALUE-">
  <link rel="shortcut icon" href="favicon.ico">
  <!-- Fonts START -->
  <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css">
  <!-- Fonts END -->
  <!-- Global styles START -->          
  <link href="${pageContext.servletContext.contextPath}/WebResource/admin/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/WebResource/admin/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Global styles END --> 
     <!-- Page level plugin styles START -->
  <link href="${pageContext.servletContext.contextPath}/WebResource/admin/plugins/fancybox/source/jquery.fancybox.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/WebResource/admin/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css">
  <!-- Page level plugin styles END -->
<!-- Theme styles START -->
  <link href="${pageContext.servletContext.contextPath}/WebResource/admin/css/components.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/WebResource/frontend/layout/css/style.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/WebResource/frontend/layout/css/style-responsive.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/WebResource/frontend/layout/css/themes/red.css" rel="stylesheet" id="style-color">
  <link href="${pageContext.servletContext.contextPath}/WebResource/frontend/layout/css/custom.css" rel="stylesheet">
  <!-- Theme styles END -->
</head>
<!-- Head END -->
<!-- Body BEGIN -->
<body class="corporate">
   <!-- BEGIN TOP BAR -->
     <!-- END TOP BAR -->    <!-- BEGIN HEADER -->
    <%@include file="header.jsp" %>
    <!-- Header END -->
 <div class="main">
      <div class="container">
        <ul class="breadcrumb">
            <li><a href="index.html">Home</a></li>
            <li><a href="">Store</a></li>
            <li class="active">Forgot Your Password?</li>
        </ul>
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <!-- BEGIN SIDEBAR -->
        <%@include file="sidebar.jsp" %>
          <!-- END SIDEBAR -->
        <!-- BEGIN CONTENT -->
          <div class="col-md-9 col-sm-9">
            <h1>Forgot Your Password?</h1>
            <div class="content-form-page">
              <div class="row">
                <div class="col-md-7 col-sm-7">
                  <form class="form-horizontal form-without-legend" role="form">                    
                    <div class="form-group">
                      <label for="email" class="col-lg-4 control-label">Email</label>
                      <div class="col-lg-8">
                        <input type="text" class="form-control" id="email">
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-lg-8 col-md-offset-4 padding-left-0 padding-top-5">
                        <button type="submit" class="btn btn-primary">Send</button>
                      </div>
                    </div>
                  </form>
                </div>
                <div class="col-md-4 col-sm-4 pull-right">
                  <div class="form-info">
                    <h2><em>Important</em> Information</h2>
                    <p>Book the appointment of Salon is easy by this website. </p>

                    <button type="button" class="btn btn-default">More details</button>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- END CONTENT -->
        </div>
        <!-- END SIDEBAR & CONTENT -->
      </div>
    </div>
    <!-- BEGIN PRE-FOOTER -->
    <!-- END PRE-FOOTER -->    <!-- BEGIN FOOTER -->
    <%@include file="footer.jsp" %>
    <!-- END FOOTER -->

    <!-- Load javascripts at bottom, this will reduce page load time -->
    <!-- BEGIN CORE PLUGINS (REQUIRED FOR ALL PAGES) -->
    <!--[if lt IE 9]>
    <script src="${pageContext.servletContext.contextPath}/WebResource/admin/plugins/respond.min.js"></script>
    <![endif]--> 
    <script src="${pageContext.servletContext.contextPath}/WebResource/admin/plugins/jquery-1.11.0.min.js" type="text/javascript"></script>
    <script src="${pageContext.servletContext.contextPath}/WebResource/admin/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
    <script src="${pageContext.servletContext.contextPath}/WebResource/admin/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>      
    <script src="${pageContext.servletContext.contextPath}/WebResource/frontend/layout/scripts/back-to-top.js" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->

    <!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
    <script src="${pageContext.servletContext.contextPath}/WebResource/admin/plugins/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script><!-- pop up -->
    <script src="${pageContext.servletContext.contextPath}/WebResource/admin/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>

    <script src="${pageContext.servletContext.contextPath}/WebResource/frontend/layout/scripts/layout.js" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();
            Layout.initUniform();
            Layout.initTwitter();
        });
    </script>
    <!-- END PAGE LEVEL JAVASCRIPTS -->
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
  ga('create', 'UA-37564768-1', 'keenthemes.com');
  ga('send', 'pageview');
</script>
</body>
<!-- END BODY -->
</html>
