<%-- 
    Document   : Contact
    Created on : 20 Mar, 2019, 4:20:27 PM
    Author     : Hiral
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->

<!-- Head BEGIN -->
<head>
  <meta charset="utf-8">
  <title>Contacts | Eleganza</title>

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
    <!-- BEGIN STYLE CUSTOMIZER -->
  
    <!-- END BEGIN STYLE CUSTOMIZER --> 
    
    <!-- BEGIN TOP BAR -->
    <%@include file="header.jsp" %>
    <!-- END TOP BAR -->
    <!-- BEGIN HEADER -->
   
    <!-- Header END -->

    <div class="main">
      <div class="container">
        <ul class="breadcrumb">
            <li><a href="index.html">Home</a></li>
            <li><a href="#">Pages</a></li>
            <li class="active">Contacts</li>
        </ul>
        <div class="row margin-bottom-40">
          <!-- BEGIN CONTENT -->
          <div class="col-md-12">
            <h1>Contacts</h1>
            <div class="content-page">
              <div class="row">
                <div class="col-md-12">
                  <div id="map" class="gmaps margin-bottom-40" style="height:400px;"></div>
                </div>
                <div class="col-md-9 col-sm-9">
                  <h2>Contact Form</h2>
                  <p>Lorem ipsum dolor sit amet, Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat consectetuer adipiscing elit, sed diam nonummy nibh euismod tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.</p>
                  
                  <!-- BEGIN FORM-->
                  <form action="#" role="form">
                    <div class="form-group">
                      <label for="contacts-name">Name</label>
                      <input type="text" class="form-control" id="contacts-name">
                    </div>
                    <div class="form-group">
                      <label for="contacts-email">Email</label>
                      <input type="email" class="form-control" id="contacts-email">
                    </div>
                    <div class="form-group">
                      <label for="contacts-message">Message</label>
                      <textarea class="form-control" rows="5" id="contacts-message"></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary"><i class="icon-ok"></i> Send</button>
                    <button type="button" class="btn btn-default">Cancel</button>
                  </form>
                  <!-- END FORM-->
                </div>

                <div class="col-md-3 col-sm-3 sidebar2">
                  <h2>Our Contacts</h2>
                  <address>
                    <strong>Loop, Inc.</strong><br>
                    795 Park Ave, Suite 120<br>
                    San Francisco, CA 94107<br>
                    <abbr title="Phone">P:</abbr> (234) 145-1810
                  </address>
                  <address>
                    <strong>Email</strong><br>
                    <a href="mailto:info@email.com">info@email.com</a><br>
                    <a href="mailto:support@example.com">support@example.com</a>
                  </address>
                  <ul class="social-icons margin-bottom-40">
                    <li><a href="#" data-original-title="facebook" class="facebook"></a></li>
                    <li><a href="#" data-original-title="github" class="github"></a></li>
                    <li><a href="#" data-original-title="Goole Plus" class="googleplus"></a></li>
                    <li><a href="#" data-original-title="linkedin" class="linkedin"></a></li>
                    <li><a href="#" data-original-title="rss" class="rss"></a></li>
                  </ul>

                  <h2 class="padding-top-30">About Us</h2>
                  <p>Sediam nonummy nibh euismod tation ullamcorper suscipit</p>
                  <ul class="list-unstyled">
                    <li><i class="fa fa-check"></i> Officia deserunt molliti</li>
                    <li><i class="fa fa-check"></i> Consectetur adipiscing </li>
                    <li><i class="fa fa-check"></i> Deserunt fpicia</li>
                  </ul>        
                </div>
              </div>
            </div>
          </div>
          <!-- END CONTENT -->
        </div>
      </div>
    </div>

    <!-- BEGIN PRE-FOOTER -->
    <%@include file="footer.jsp" %>
    <!-- END PRE-FOOTER -->

    <!-- BEGIN FOOTER -->
 
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
    <script src="http://maps.google.com/maps/api/js?sensor=true" type="text/javascript"></script>
    <script src="${pageContext.servletContext.contextPath}/WebResource/admin/plugins/gmaps/gmaps.js" type="text/javascript"></script>
    <script src="${pageContext.servletContext.contextPath}/WebResource/frontend/pages/scripts/contact-us.js" type="text/javascript"></script>

    <script src="${pageContext.servletContext.contextPath}/WebResource/frontend/layout/scripts/layout.js" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();
            Layout.initUniform();
            ContactUs.init();
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