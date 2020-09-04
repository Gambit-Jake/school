<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
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
        <div class="container">
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
                                    <a class="nav-link" href="Index.jsp">Home</a>
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

                                <li class="nav-item  active">
                                    <a class="nav-link " href="Login.jsp">Sign In </a>
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
    <section class="signin-page account">
        <div class="container">
            <div class="row">
                <div class="col-md-6 mx-auto">
                    <div class="block">
                        <h2 class="text-center">Sign In to OneSchool</h2>
                        <!-- 由loginController接受登录信息数据，根据登录信息跳转到不同页面 -->
                        <form class="text-left clearfix mt-50" action="Index2.jsp">
                            <div class="form-group">
                                <input type="email" class="form-control" placeholder="Student ID">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" placeholder="Password">
                            </div>
                            <button type="submit" class="btn btn-main">Sign In</button>

                        </form>
                        <p class="mt-20">Don't have a student account yet?<a href="#"> Contact your guide</a>
                        </p>
                        <p><a href="FindPassword.jsp"> Forgot your password?</a></p>
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

</body>

</html>