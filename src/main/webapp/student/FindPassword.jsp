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
        <div class="container" style="padding: 0px 30px 0px 0px;">
            <div class="row">
                <div class="col-md-12">
                    <nav class="navbar navbar-expand-lg">
                        <a class="navbar-brand" href="Index.jsp">
                            <!-- <img src="images/logo.png" alt="logo"> -->
                            <h4 style="color: RGB(51,186,157);">OneSchool</h4>
                        </a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                            <span class="tf-ion-android-menu"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav ml-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="Index.jsp">Home </a>
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
                                <li class="nav-item active">
                                    <a class="nav-link " href="FindPassword.jsp">Find Password <span
                                        class="sr-only">(current)</span></a>
                                </li>
                            </ul>
                        </div>
                    </nav>

                </div>
            </div>
        </div>
    </section>

    <!-- Srart Contact Us
		=========================================== -->
    <section class="contact-us section bg-gray" id="contact">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="title text-center">
                        <h4>Enter your email </h4>
                        <h2>Find Password.</h2>
                        <span class="border"></span>
                        <!-- <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Illum reiciendis quasi itaque,
                            obcaecati atque sit!</p> -->
                        <p>Enter your email address below and we will send you a verification code. Enter the
                            verification code to change the password</p>
                    </div>
                </div>
            </div>
            <div class="row">
                <!-- Contact Form -->
                <div class="contact-form col-12 col-md-6  mx-auto">
                    <form id="contact-form" method="post" role="form" action="FindPassword2.jsp">

                        <div class="form-group">
                            <input type="text" placeholder="Your Student ID" class="form-control" name="stu_id" id="name">
                        </div>

                        <div class="form-group">
                            <input type="email" placeholder="Your Email" class="form-control" name="email" id="email">
                        </div>


                        <div id="cf-submit">
                            <input type="submit" id="contact-submit" class="btn btn-transparent" value="submit">
                        </div>

                    </form>
                </div>
                <!-- ./End Contact Form -->
            </div> <!-- end row -->

        </div> <!-- end container -->
    </section> <!-- end section -->

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

</body>

</html>