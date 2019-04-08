<%-- 
    Document   : About
    Created on : 20 Mar, 2019, 3:38:38 PM
    Author     : Hiral
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<!--<![endif]-->
<!-- Head BEGIN -->
<head>
  <meta charset="utf-8">
  <title>About Us | Metronic Frontend</title>

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
            <li class="active">About Us</li>
        </ul>
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <!-- BEGIN CONTENT -->
          <div class="col-md-12 col-sm-12">
            <h1>About Us</h1>
            <div class="content-page">
              <div class="row margin-bottom-30">
                <!-- BEGIN INFO BLOCK -->               
                <div class="col-md-7">
                  <h2 class="no-top-space">Eleganza</h2>
                  <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi.</p> 
                  <p>Idest laborum et dolorum fuga. Et harum quidem rerum et quas molestias excepturi sint occaecati facilis est et expedita distinctio lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero consectetur adipiscing elit magna. Sed et quam lacus.</p>
                  <!-- BEGIN LISTS -->
                  <div class="row front-lists-v1">
                    <div class="col-md-6">
                      <ul class="list-unstyled margin-bottom-20">
                        <li><i class="fa fa-check"></i> Officia deserunt molliti</li>
                        <li><i class="fa fa-check"></i> Consectetur adipiscing </li>
                        <li><i class="fa fa-check"></i> Deserunt fpicia</li>
                      </ul>
                    </div>
                    <div class="col-md-6">
                      <ul class="list-unstyled">
                        <li><i class="fa fa-check"></i> Officia deserunt molliti</li>
                        <li><i class="fa fa-check"></i> Consectetur adipiscing </li>
                        <li><i class="fa fa-check"></i> Deserunt fpicia</li>
                      </ul>
                    </div>
                  </div>
                  <!-- END LISTS -->
                </div>
                <!-- END INFO BLOCK -->   

                <!-- BEGIN CAROUSEL -->            
                <div class="col-md-5 front-carousel">
                  <div id="myCarousel" class="carousel slide">
                    <!-- Carousel items -->
                    <div class="carousel-inner">
                      <div class="item active">
                        <img src="${pageContext.servletContext.contextPath}/WebResource/frontend/pages/img/pics/img2-medium.jpg" alt="">
                        <div class="carousel-caption">
                          <p>Excepturi sint occaecati cupiditate non provident</p>
                        </div>
                      </div>
                      <div class="item">
                        <img src="${pageContext.servletContext.contextPath}/WebResource/frontend/pages/img/pics/img1-medium.jpg" alt="">
                        <div class="carousel-caption">
                          <p>Ducimus qui blanditiis praesentium voluptatum</p>
                        </div>
                      </div>
                      <div class="item">
                        <img src="${pageContext.servletContext.contextPath}/WebResource/frontend/pages/img/pics/img2-medium.jpg" alt="">
                        <div class="carousel-caption">
                          <p>Ut non libero consectetur adipiscing elit magna</p>
                        </div>
                      </div>
                    </div>
                    <!-- Carousel nav -->
                    <a class="carousel-control left" href="#myCarousel" data-slide="prev">
                      <i class="fa fa-angle-left"></i>
                    </a>
                    <a class="carousel-control right" href="#myCarousel" data-slide="next">
                      <i class="fa fa-angle-right"></i>
                    </a>
                  </div>                
                </div>
                <!-- END CAROUSEL -->
              </div>

              <div class="row margin-bottom-40">
                <!-- BEGIN TESTIMONIALS -->
                <div class="col-md-7 testimonials-v1">
                  <h2>Clients Testimonials</h2>                
                  <div id="myCarousel1" class="carousel slide">
                    <!-- Carousel items -->
                    <div class="carousel-inner">
                      <div class="active item">
                        <blockquote><p>Denim you probably haven't heard of. Lorem ipsum dolor met consectetur adipisicing sit amet, consectetur adipisicing elit, of them jean shorts sed magna aliqua. Lorem ipsum dolor met consectetur adipisicing sit amet do eiusmod dolore.</p></blockquote>
                        <div class="carousel-info">
                          <img class="pull-left" src="${pageContext.servletContext.contextPath}/WebResource/frontend/pages/img/people/img1-small.jpg" alt="">
                          <div class="pull-left">
                            <span class="testimonials-name">Lina Mars</span>
                            <span class="testimonials-post">Commercial Director</span>
                          </div>
                        </div>
                      </div>
                      <div class="item">
                        <blockquote><p>Raw denim you Mustache cliche tempor, williamsburg carles vegan helvetica probably haven't heard of them jean shorts austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica.</p></blockquote>
                        <div class="carousel-info">
                          <img class="pull-left" src="${pageContext.servletContext.contextPath}/WebResource/frontend/pages/img/people/img5-small.jpg" alt="">
                          <div class="pull-left">
                            <span class="testimonials-name">Kate Ford</span>
                            <span class="testimonials-post">Commercial Director</span>
                          </div>
                        </div>
                      </div>
                      <div class="item">
                        <blockquote><p>Reprehenderit butcher stache cliche tempor, williamsburg carles vegan helvetica.retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid Aliquip placeat salvia cillum iphone.</p></blockquote>
                        <div class="carousel-info">
                          <img class="pull-left" src="${pageContext.servletContext.contextPath}/WebResource/frontend/pages/img/people/img2-small.jpg" alt="">
                          <div class="pull-left">
                            <span class="testimonials-name">Jake Witson</span>
                            <span class="testimonials-post">Commercial Director</span>
                          </div>
                        </div>
                      </div>
                    </div>
                    <!-- Carousel nav -->
                    <a class="left-btn" href="#myCarousel1" data-slide="prev"></a>
                    <a class="right-btn" href="#myCarousel1" data-slide="next"></a>
                  </div>
                </div>
                <!-- END TESTIMONIALS --> 

                <!-- BEGIN PROGRESS BAR -->
                <div class="col-md-5 front-skills">
                  <h2 class="block">Our Skills</h2>
                  <span>UI Design 90%</span>
                  <div class="progress">
                    <div role="progressbar" class="progress-bar" style="width: 90%;"></div>
                  </div>
                  <span>Wordpress CMS 60%</span>
                  <div class="progress">
                    <div role="progressbar" class="progress-bar" style="width: 60%;"></div>
                  </div>
                  <span>HTML/CSS &amp; JavaScript 75%</span>
                  <div class="progress">
                    <div role="progressbar" class="progress-bar" style="width: 75%;"></div>
                  </div>
                </div>                       
                <!-- END PROGRESS BAR -->
              </div>

              <div class="row front-team">
                <ul class="list-unstyled">
                  <li class="col-md-3">
                    <div class="thumbnail">
                      <img alt="" src="${pageContext.servletContext.contextPath}/WebResource/frontend/pages/img/people/img1-large.jpg">
                      <h3>
                        <strong>Lina Doe</strong> 
                        <small>Chief Executive Officer / CEO</small>
                      </h3>
                      <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, justo sit amet risus etiam porta sem...</p>
                      <ul class="social-icons social-icons-color">
                        <li><a class="facebook" data-original-title="Facebook" href="#"></a></li>
                        <li><a class="twitter" data-original-title="Twitter" href="#"></a></li>
                        <li><a class="googleplus" data-original-title="Goole Plus" href="#"></a></li>
                        <li><a class="linkedin" data-original-title="Linkedin" href="#"></a></li>
                      </ul>
                    </div>
                  </li>
                  <li class="col-md-3">
                    <div class="thumbnail">
                      <img alt="" src="${pageContext.servletContext.contextPath}/WebResource/frontend/pages/img/people/img4-large.jpg">
                      <h3>
                        <strong>Carles Puyol</strong> 
                        <small>Chief Executive Officer / CEO</small>
                      </h3>
                      <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, justo sit amet risus etiam porta sem...</p>
                      <ul class="social-icons social-icons-color">
                        <li><a class="facebook" data-original-title="Facebook" href="#"></a></li>
                        <li><a class="twitter" data-original-title="Twitter" href="#"></a></li>
                        <li><a class="googleplus" data-original-title="Goole Plus" href="#"></a></li>
                        <li><a class="linkedin" data-original-title="Linkedin" href="#"></a></li>
                      </ul>
                    </div>
                  </li>
                  <li class="col-md-3">
                    <div class="thumbnail">
                      <img alt="" src="${pageContext.servletContext.contextPath}/WebResource/frontend/pages/img/people/img2-large.jpg">
                      <h3>
                        <strong>Andres Iniesta</strong> 
                        <small>Chief Executive Officer / CEO</small>
                      </h3>
                      <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, justo sit amet risus etiam porta sem...</p>
                      <ul class="social-icons social-icons-color">
                        <li><a class="facebook" data-original-title="Facebook" href="#"></a></li>
                        <li><a class="twitter" data-original-title="Twitter" href="#"></a></li>
                        <li><a class="googleplus" data-original-title="Goole Plus" href="#"></a></li>
                        <li><a class="linkedin" data-original-title="Linkedin" href="#"></a></li>
                      </ul>
                    </div>
                  </li>
                  <li class="col-md-3">
                    <div class="thumbnail">
                      <img alt="" src="${pageContext.servletContext.contextPath}/WebResource/frontend/pages/img/people/img5-large.jpg">
                      <h3>
                        <strong>Jessica Alba</strong> 
                        <small>Chief Executive Officer / CEO</small>
                      </h3>
                      <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, justo sit amet risus etiam porta sem...</p>
                      <ul class="social-icons social-icons-color">
                        <li><a class="facebook" data-original-title="Facebook" href="#"></a></li>
                        <li><a class="twitter" data-original-title="Twitter" href="#"></a></li>
                        <li><a class="googleplus" data-original-title="Goole Plus" href="#"></a></li>
                        <li><a class="linkedin" data-original-title="Linkedin" href="#"></a></li>
                      </ul>
                    </div>
                  </li>
                </ul>            
              </div>

            </div>
          </div>
          <!-- END CONTENT -->
        </div>
        <!-- END SIDEBAR & CONTENT -->
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

    <script src="${pageContext.servletContext.contextPath}/WebResource/frontend/layout/scripts/layout.js" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();    
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