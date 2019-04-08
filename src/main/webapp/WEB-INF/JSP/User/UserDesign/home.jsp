<%-- 
    Document   : Home
    Created on : 19 Mar, 2019, 5:45:16 PM
    Author     : Hiral
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<!--<![endif]-->

<!-- Head BEGIN -->
<head>
  <meta charset="utf-8">
  <title>Eleganza Home</title>

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
  <link href="${pageContext.servletContext.contextPath}/webresource/user/usercss/font-awesome.min.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/webresource/user/usercss/bootstrap.min.css" rel="stylesheet">
  <!-- Global styles END --> 
   
  <!-- Page level plugin styles START -->
  <link href="${pageContext.servletContext.contextPath}/webresource/user/usercss/jquery.fancybox.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/webresource/user/usercss/owl.carousel.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/webresource/user/usercss/settings.css" rel="stylesheet">
  <!-- Page level plugin styles END -->

  <!-- Theme styles START -->
  <link href="${pageContext.servletContext.contextPath}/webresource/user/usercss/components.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/webresource/user/usercss/style.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/webresource/user/usercss/style-revolution-slider.css" rel="stylesheet"><!-- metronic revo slider styles -->
  <link href="${pageContext.servletContext.contextPath}/webresource/user/usercss/style-responsive.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/webresource/user/usercss/red.css" rel="stylesheet" id="style-color">
  <link href="${pageContext.servletContext.contextPath}/webresource/user/usercss/custom.css" rel="stylesheet">
  <!-- Theme styles END -->
</head>
<!-- Head END -->

<!-- Body BEGIN -->
<body class="corporate">
    <!-- BEGIN STYLE CUSTOMIZER -->
    <!-- END BEGIN STYLE CUSTOMIZER -->
    <!-- BEGIN TOP BAR -->
    <%@include file="header.jsp" %>
    <!-- Header END -->

    <!-- BEGIN SLIDER -->
    <div class="page-slider margin-bottom-40">
      <div class="fullwidthbanner-container revolution-slider">
        <div class="fullwidthabnner">
          <ul id="revolutionul">
            <!-- THE NEW SLIDE -->
            <li data-transition="fade" data-slotamount="8" data-masterspeed="700" data-delay="9400" data-thumb="${pageContext.servletContext.contextPath}/webresource/user/userimages/thumb2.jpg">
              <!-- THE MAIN IMAGE IN THE FIRST SLIDE -->
              <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/enrich-malad1.jpg" alt="">
              
              

            <!-- THE FIRST SLIDE -->
            <li data-transition="fade" data-slotamount="8" data-masterspeed="700" data-delay="9400" data-thumb="${pageContext.servletContext.contextPath}/webresource/user/userimages/thumb2.jpg">
              <!-- THE MAIN IMAGE IN THE FIRST SLIDE -->
              <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/enrich-salon-university-road2.jpg" alt="">
                            
              

            <!-- THE SECOND SLIDE -->
            <li data-transition="fade" data-slotamount="7" data-masterspeed="300" data-delay="9400" data-thumb="${pageContext.servletContext.contextPath}/webresource/user/userimages/thumb2.jpg">                        
              <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/pexels-photo-853427.jpeg" alt="">
             
                
                        
            <!-- THE THIRD SLIDE -->
            <li data-transition="fade" data-slotamount="8" data-masterspeed="700" data-delay="9400" data-thumb="${pageContext.servletContext.contextPath}/webresource/user/userimages/thumb2.jpg">
              <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/500_F_80453557_F2om1BpcZMhsgXe9aK0SVvu9U5QqaVwg.jpg" alt="">
              
                 
                        
                        <!-- THE FORTH SLIDE -->
                        <li data-transition="fade" data-slotamount="8" data-masterspeed="700" data-delay="9400" data-thumb="${pageContext.servletContext.contextPath}/webresource/user/userimages/thumb2.jpg">
                            <!-- THE MAIN IMAGE IN THE FIRST SLIDE -->
                            <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/1.jpg" alt="">                      
                </ul>
                <div class="tp-bannertimer tp-bottom"></div>
            </div>
        </div>
    </div>
    <!-- END SLIDER -->

    <div class="main">
      <div class="container">
        <!-- BEGIN SERVICE BOX -->   
        <div class="row service-box margin-bottom-40">
          <div class="col-md-4 col-sm-4">
            <div class="service-box-heading">
              
              <h3 style="color: blue">Eleganza's local salon search</h3>
            </div>
            <p>Eleganza is a website which is used to find & booking salon appointment online. You can find the right salon quickly & easily. </p>
          </div>
          <div class="col-md-4 col-sm-4">
            <div class="service-box-heading">
              
              <h3 style="color: blue">Salon's reviews</h3>
            </div>
            <p>Eleganza can find your ideal salon by checking salon's ratings & reviews.Eleganza makes it easy for you to find information about your salon.</p>
          </div>
          <div class="col-md-4 col-sm-4">
            <div class="service-box-heading">
              
              <h3 style="color: blue">Find cheap Salons on Eleganza</h3>
            </div>
            <p>With Eleganza you can easily find your ideal Salon and compare prices with different salons.</p>
          </div>
        </div>
        <!-- END SERVICE BOX -->

        

        <!-- BEGIN RECENT WORKS -->
        <div class="row recent-work margin-bottom-40">
          <div class="col-md-3">
            <h2 style="color: blue">Recent Trending salons</h2>
            <p>Here are the few trending salons which has given higher ratings & reviews.</p>
          </div>
          <div class="col-md-9">
            <div class="owl-carousel owl-carousel3">
              <div class="recent-work-item">
                <em>
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/pic6.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="${pageContext.servletContext.contextPath}/webresource/user/userimages/img1.jpg" class="fancybox-button" title="Project Name #1" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="#">
                  
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/cart-img.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="${pageContext.servletContext.contextPath}/webresource/user/userimages/img2.jpg" class="fancybox-button" title="Project Name #2" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="#">
                  
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/inside1.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="${pageContext.servletContext.contextPath}/webresource/user/userimages/img3.jpg" class="fancybox-button" title="Project Name #3" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="#">
                  
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/pic3.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="${pageContext.servletContext.contextPath}/webresource/user/userimages/img4.jpg" class="fancybox-button" title="Project Name #4" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="#">
                  
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/salon7.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="${pageContext.servletContext.contextPath}/webresource/user/userimages/img5.jpg" class="fancybox-button" title="Project Name #5" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="#">
                  
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/img6.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="${pageContext.servletContext.contextPath}/webresource/user/userimages/img6.jpg" class="fancybox-button" title="Project Name #6" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="#">
                  <strong>Amazing Project</strong>
                  <b>Agenda corp.</b>
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/img3.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="${pageContext.servletContext.contextPath}/webresource/user/userimages/img3.jpg" class="fancybox-button" title="Project Name #3" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="#">
                  <strong>Amazing Project</strong>
                  <b>Agenda corp.</b>
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/img4.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="${pageContext.servletContext.contextPath}/webresource/user/userimages/img4.jpg" class="fancybox-button" title="Project Name #4" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="#">
                  <strong>Amazing Project</strong>
                  <b>Agenda corp.</b>
                </a>
              </div>
            </div>       
          </div>
        </div>   
        <!-- END RECENT WORKS -->

        <!-- BEGIN TABS AND TESTIMONIALS -->
        <div class="row mix-block margin-bottom-40">
          <!-- TABS -->
          <div class="col-md-7 tab-style-1">
            <ul class="nav nav-tabs">
              <li class="active"><a href="#tab-1" data-toggle="tab">Online Booking System</a></li>
              <li><a href="#tab-2" data-toggle="tab">Expert advice from Beauticians</a></li>
              <li><a href="#tab-3" data-toggle="tab">Different schemes on portal</a></li>
              <li><a href="#tab-4" data-toggle="tab">Feedback from users</a></li>
            </ul>
            <div class="tab-content">
              <div class="tab-pane row fade in active" id="tab-1">
                
                <div class="col-md-9 col-sm-9">
                  <p class="margin-bottom-10">Eleganza has a feature of online booking system of salon.Customer can book the appointment of any salon.  </p>
                 
                </div>
              </div>
              <div class="tab-pane row fade" id="tab-2">
                <div class="col-md-9 col-sm-9">
                  <p>You can also ask the tips from well-known beauticians regarding any treatment or asking for any better salon.    </p>
                </div>
               
              </div>
              <div class="tab-pane fade" id="tab-3">
                <p>Our website also give the information about different schemes in salon which helps customer on choosing salon. </p>
              </div>
              <div class="tab-pane fade" id="tab-4">
                <p>Customer also give feedback about salons which is very helpful to other customers. </p>
              </div>
            </div>
          </div>
          <!-- END TABS -->
        
          <!-- TESTIMONIALS -->
          <div class="col-md-5 testimonials-v1">
            <div id="myCarousel" class="carousel slide">
              <!-- Carousel items -->
              <div class="carousel-inner">
                <div class="active item">
                  <blockquote><p>Zion salon vastrapur is best salon among all other salons. They had provided better service and various facility to customer. This website is very useful for online booking at any time.  </p></blockquote>
                  <div class="carousel-info">
                    <img class="pull-left" src="${pageContext.servletContext.contextPath}/webresource/user/userimages/img1-small.jpg" alt="">
                    <div class="pull-left">
                      <span class="testimonials-name">Siya Patel </span>
                      
                    </div>
                  </div>
                </div>
                <div class="item">
                  <blockquote><p>Zion salon vastrapur is best salon among all other salons. They provided better service and facility to customer. This website is very useful to us because of its featires like expert advice from well known beauticians.</p></blockquote>
                  <div class="carousel-info">
                    <img class="pull-left" src="${pageContext.servletContext.contextPath}/webresource/user/userimages/img5-small.jpg" alt="">
                    <div class="pull-left">
                      <span class="testimonials-name">jenny shah</span>
                      
                    </div>
                  </div>
                </div>
                <div class="item">
                  <blockquote><p>Zion salon vastrapur is best salon among all other salons. They provided better service and facility to customer. This website is very useful to us </p></blockquote>
                  <div class="carousel-info">
                    <img class="pull-left" src="${pageContext.servletContext.contextPath}/webresource/user/userimages/img2-small.jpg" alt="">
                    <div class="pull-left">
                      <span class="testimonials-name">Alisha Sharma</span>
                      
                    </div>
                  </div>
                </div>
              </div>

              <!-- Carousel nav -->
              <a class="left-btn" href="#myCarousel" data-slide="prev"></a>
              <a class="right-btn" href="#myCarousel" data-slide="next"></a>
            </div>
          </div>
          <!-- END TESTIMONIALS -->
        </div>                
        <!-- END TABS AND TESTIMONIALS -->

        <!-- BEGIN STEPS -->
        <div class="row margin-bottom-40 front-steps-wrapper front-steps-count-3">
          <div class="col-md-4 col-sm-4 front-step-col">
            <div class="front-step front-step1">
              <h2>Best services at cheaper rates</h2>
              <p></p>
            </div>
          </div>
          <div class="col-md-4 col-sm-4 front-step-col">
            <div class="front-step front-step2">
              <h2>Great deals</h2>
              <p></p>
            </div>
          </div>
          <div class="col-md-4 col-sm-4 front-step-col">
            <div class="front-step front-step3">
              <h2>Ratings & Reviews</h2>
              <p></p>
            </div>
          </div>
        </div>
        <!-- END STEPS -->

        <!-- BEGIN CLIENTS -->
        <div class="row margin-bottom-40 our-clients">
          <div class="col-md-3">
            <h2 style="color: blue">Our Clients</h2>
            <p>Eleganza is a centralized portal for all salons.So it is connected to many salons.</p>
          </div>
          <div class="col-md-9">
            <div class="owl-carousel owl-carousel6-brands">
              <div class="client-item">
                <a href="#">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/download.png" class="img-responsive" alt="">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/download.png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="#">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/499-profile-lakme-salon.png" class="img-responsive" alt="">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/499-profile-lakme-salon.png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="#">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/images.png" class="img-responsive" alt="">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/images.png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="#">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/images (1).png" class="img-responsive" alt="">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/images (1).png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="#">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/images.jpg" class="img-responsive" alt="">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/images.jpg" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="#">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/images (2).png" class="img-responsive" alt="">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/images (2).png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="#">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/client_7_gray.png" class="img-responsive" alt="">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/client_7.png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="#">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/client_8_gray.png" class="img-responsive" alt="">
                  <img src="${pageContext.servletContext.contextPath}/webresource/user/userimages/client_8.png" class="color-img img-responsive" alt="">
                </a>
              </div>                  
            </div>
          </div>          
        </div>
        <!-- END CLIENTS -->
      </div>
    </div>

    <!-- BEGIN PRE-FOOTER -->
  
    <!-- END PRE-FOOTER -->

    <!-- BEGIN FOOTER -->
    <%@include file="footer.jsp" %>
    <!-- END FOOTER -->

    <!-- Load javascripts at bottom, this will reduce page load time -->
    <!-- BEGIN CORE PLUGINS (REQUIRED FOR ALL PAGES) -->
    <!--[if lt IE 9]>
    <script src="${pageContext.servletContext.contextPath}/WebResource/admin/plugins/respond.min.js"></script>
    <![endif]--> 
    <script src="${pageContext.servletContext.contextPath}/webresource/user/userjs/jquery-1.11.0.min.js" type="text/javascript"></script>
    <script src="${pageContext.servletContext.contextPath}/webresource/user/userjs/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
    <script src="${pageContext.servletContext.contextPath}/webresource/user/userjs/bootstrap.min.js" type="text/javascript"></script>      
    <script src="${pageContext.servletContext.contextPath}/webresource/user/userjs/back-to-top.js" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->

    <!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
    <script src="${pageContext.servletContext.contextPath}/webresource/user/userjs/jquery.fancybox.pack.js" type="text/javascript"></script><!-- pop up -->
    <script src="${pageContext.servletContext.contextPath}/webresource/user/userjs/owl.carousel.min.js" type="text/javascript"></script><!-- slider for products -->

    <!-- BEGIN RevolutionSlider -->
  
    <script src="${pageContext.servletContext.contextPath}/webresource/user/userjs/jquery.themepunch.plugins.min.js" type="text/javascript"></script>
    <script src="${pageContext.servletContext.contextPath}/webresource/user/userjs/jquery.themepunch.revolution.min.js" type="text/javascript"></script> 
    <script src="${pageContext.servletContext.contextPath}/webresource/user/userjs/jquery.themepunch.tools.min.js" type="text/javascript"></script> 
    <script src="${pageContext.servletContext.contextPath}/webresource/user/userjs/revo-slider-init.js" type="text/javascript"></script>
    <!-- END RevolutionSlider -->

    <script src="${pageContext.servletContext.contextPath}/webresource/user/userjs/layout.js" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();    
            Layout.initOWL();
            RevosliderInit.initRevoSlider();
            Layout.initTwitter();
            //Layout.initFixHeaderWithPreHeader(); /* Switch On Header Fixing (only if you have pre-header) */
            //Layout.initNavScrolling(); 
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