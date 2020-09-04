<!DOCTYPE html>

<!--[if gt IE 8]><!-->
<html lang="zxx">
<!--<![endif]-->

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="description" content="Bingo One page parallax responsive HTML Template ">

  <meta name="author" content="Themefisher.com">
  <%@ page isELIgnored="false" %>
  <title>OneSchool</title>

  <!-- Mobile Specific Meta
  ================================================== -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Favicon -->
<link rel="shortcut icon" type="image/x-icon" href="../static/template/images/logo.png" />

  <!-- CSS
  ================================================== -->
  <!-- Themefisher Icon font -->
  <link rel="stylesheet" href="../static/template/plugins/themefisher-font.v-2/style.css">
  <!-- bootstrap.min css -->
  <link rel="stylesheet" href="../static/template/plugins/bootstrap/dist/css/bootstrap.min.css">
  <!-- Slick Carousel -->
  <link rel="stylesheet" href="../static/template/plugins/slick-carousel/slick/slick.css">
  <link rel="stylesheet" href="../static/template/plugins/slick-carousel/slick/slick-theme.css">
  <!-- Main Stylesheet -->
  <link rel="stylesheet" href="../static/template/css/style.css">



  <style>
    .hero-area {
      padding: 170px 0;
      position: relative;
      display: flex;
      justify-content: center;
      align-items: center;
      background-image: url(../static/template/images/img4.jpg);
      background-size: cover;
      background-attachment: fixed;
      position: relative;
    }
  </style>
</head>

<body id="body">

  <!--
  Start Preloader
  ==================================== -->
  <div id="preloader">
    <div class="preloader">
      <div class="sk-circle1 sk-child"></div>
      <div class="sk-circle2 sk-child"></div>
      <div class="sk-circle3 sk-child"></div>
      <div class="sk-circle4 sk-child"></div>
      <div class="sk-circle5 sk-child"></div>
      <div class="sk-circle6 sk-child"></div>
      <div class="sk-circle7 sk-child"></div>
      <div class="sk-circle8 sk-child"></div>
      <div class="sk-circle9 sk-child"></div>
      <div class="sk-circle10 sk-child"></div>
      <div class="sk-circle11 sk-child"></div>
      <div class="sk-circle12 sk-child"></div>
    </div>
  </div>
  <!--
  End Preloader
  ==================================== -->




  <!--
Fixed Navigation
==================================== -->
  <section class="header  navigation">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <nav class="navbar navbar-expand-lg">
            <a class="navbar-brand" href="Index.jsp">
              <!-- <img src="images/logo.png" alt="logo"> -->
              <h4 style="color: RGB(51,186,157);">OneSchool</h4>
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
              aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="tf-ion-android-menu"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                  <a class="nav-link" href="Index.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <!-- <li class="nav-item">
                                <a class="nav-link" href="pricing.html">Buy/Sell</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="faq.html">F.A.Q</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="contact.html">Contact</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="login.html">Sign In</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="signup.html">Sign Up</a>
                            </li> -->

                <li class="nav-item">
                  <a class="nav-link" href="Login.jsp">Sign In</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="FindPassword.jsp">Find Password</a>
                </li>
              </ul>
            </div>
          </nav>

        </div>
      </div>
    </div>
  </section>

  <!--
Welcome Slider
==================================== -->

  <section class="hero-area">
    <div class="container">
      <div class="row">
        <div class="col-lg-6 align-self-center mb-4 mb-lg-0">
          <div class="video-player">
            <video id="video1" width="560" style="margin-top:0px;" controls>

              <source src="../files/reader%20function.mp4" type="video/mp4" />

            </video>
            <!-- <a class="play-icon">
						<i class="tf-ion-ios-play" data-video="./files/reader function.mp4"></i>
					</a> -->
          </div>
        </div>
        <div class="col-lg-6">
          <div class="block">
            <h2>Welcome new students to Xidian <br>University</h2>
            <!-- 从model中读取数据，数据来自IndexController -->
            <p>XDU has over 35,000 students including over 12,000 graduates. The university consists of 18 schools.
            </p>
            <ul class="list-inline">
              <li class="list-inline-item">
                <a data-scroll href="Login.jsp" class="btn btn-main">sign in</a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </section>

  <footer id="footer" class="bg-one">

    <div class="footer-bottom">
      <h5>Copyright 2017. All rights reserved.</h5>
      <h6>Design and Developed by <a href="">others</a></h6>
    </div>
  </footer> <!-- end footer -->



  <!-- end Footer Area
    ========================================== -->



  <!-- 
    Essential Scripts
    =====================================-->

  <!-- Main jQuery -->
  <script src="../static/template/plugins/jquery/dist/jquery.min.js"></script>
  <!-- Bootstrap -->
  <script src="../static/template/plugins/bootstrap/dist/js/popper.min.js"></script>
  <script src="../static/template/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
  <!-- Owl Carousel -->
  <script src="../static/template/plugins/slick-carousel/slick/slick.min.js"></script>
  <!-- <script src="https://cdn.plot.ly/plotly-latest.min.js"></script> -->
  <!-- Smooth Scroll js -->
  <script src="../static/template/plugins/smooth-scroll/dist/js/smooth-scroll.min.js"></script>

  <!-- Custom js -->
  <script src="../static/template/js/script.js"></script>
  <script type="text/javascript" src="../static/my_js/title.js">
  </script>
</body>

</html>