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
    <link rel="shortcut icon" type="image/x-icon" href="../static/template/images/logo.png"/>

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
<%--    此部分需要动态生成--%>
<section class="top-header">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <ul class="currency-status">
                    <li>
                        <a href="#">
                            <span>&nbsp; &nbsp; &nbsp;</span>
                            <span>Score Search</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span>&nbsp; &nbsp; &nbsp;</span>
                            <span>Class Schedule</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span>&nbsp; &nbsp; &nbsp;</span>
                            <span>Personal Information</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span>&nbsp; &nbsp; &nbsp;</span>
                            <span>Exam Arrangement</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span>&nbsp; &nbsp; &nbsp;</span>
                            <span>Evaluation System</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span>&nbsp; &nbsp; &nbsp;</span>
                            <span>Pay Cost Management</span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</section>
<section class="header  navigation">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <nav class="navbar navbar-expand-lg">
                    <a class="navbar-brand" href="Index2.jsp">
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
                            <li class="nav-item ">
                                <a class="nav-link" href="Index2.jsp">Home</a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link " href="Announcement.jsp">Announcement <span
                                        class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Index.jsp">Sign Out</a>
                            </li>

                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Functions
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="/student/toStudentInfo">Personal Information</a>
                                    <a class="dropdown-item" href="Grade.jsp">Score Search</a>
                                    <a class="dropdown-item" href="../error/404.jsp">Class Schedule</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>

            </div>
        </div>
    </div>
</section>

<section class="single-page-header">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h2>You Search</h2>
                <nav aria-label="breadcrumb mx-auto" role="navigation">
                    <ol class="breadcrumb">
                        <li>Search:</li>
                        <li class="breadcrumb-item active" aria-current="page" id="searchContent">${search}</li>
                        <!-- 这个input里面要放用户搜索的内容啊！！！！！！！！！！！！！！！ -->
                    </ol>
                </nav>
            </div>
        </div>
    </div>
</section>

<!-- Start Testimonial
=========================================== -->

<section class="testimonial section" id="testimonial">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <!-- testimonial wrapper -->
                <div class="testimonial-slider" id="AnnouncementList" style="min-height: 400px;">
                    <!-- testimonial single -->
                </div>
            </div> <!-- end col lg 12 -->
        </div> <!-- End row -->
    </div> <!-- End container -->
</section> <!-- End Section -->

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

<script type="text/javascript">
    var announcements = ${announcement};

    var announcementContent;

    function add(title, content, type, department) {
        var icon
        if (type == 1) {
            icon = '<svg width="2em" height="2em" viewBox="0 0 16 16" class="bi bi-brightness-low"\n' +
                '                                         fill="currentColor" xmlns="http://www.w3.org/2000/svg">\n' +
                '                                        <path fill-rule="evenodd"\n' +
                '                                              d="M8 11a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm0 1a4 4 0 1 0 0-8 4 4 0 0 0 0 8z"/>\n' +
                '                                        <path d="M8.5 2.5a.5.5 0 1 1-1 0 .5.5 0 0 1 1 0zm0 11a.5.5 0 1 1-1 0 .5.5 0 0 1 1 0zm5-5a.5.5 0 1 1 0-1 .5.5 0 0 1 0 1zm-11 0a.5.5 0 1 1 0-1 .5.5 0 0 1 0 1zm9.743-4.036a.5.5 0 1 1-.707-.707.5.5 0 0 1 .707.707zm-7.779 7.779a.5.5 0 1 1-.707-.707.5.5 0 0 1 .707.707zm7.072 0a.5.5 0 1 1 .707-.707.5.5 0 0 1-.707.707zM3.757 4.464a.5.5 0 1 1 .707-.707.5.5 0 0 1-.707.707z"/>\n' +
                '                                    </svg>'
        }
        else{
            icon = '<svg width="2em" height="2em" viewBox="0 0 16 16" class="bi bi-book"\n' +
                '                                         fill="currentColor" xmlns="http://www.w3.org/2000/svg">\n' +
                '                                        <path fill-rule="evenodd"\n' +
                '                                              d="M1 2.828v9.923c.918-.35 2.107-.692 3.287-.81 1.094-.111 2.278-.039 3.213.492V2.687c-.654-.689-1.782-.886-3.112-.752-1.234.124-2.503.523-3.388.893zm7.5-.141v9.746c.935-.53 2.12-.603 3.213-.493 1.18.12 2.37.461 3.287.811V2.828c-.885-.37-2.154-.769-3.388-.893-1.33-.134-2.458.063-3.112.752zM8 1.783C7.015.936 5.587.81 4.287.94c-1.514.153-3.042.672-3.994 1.105A.5.5 0 0 0 0 2.5v11a.5.5 0 0 0 .707.455c.882-.4 2.303-.881 3.68-1.02 1.409-.142 2.59.087 3.223.877a.5.5 0 0 0 .78 0c.633-.79 1.814-1.019 3.222-.877 1.378.139 2.8.62 3.681 1.02A.5.5 0 0 0 16 13.5v-11a.5.5 0 0 0-.293-.455c-.952-.433-2.48-.952-3.994-1.105C10.413.809 8.985.936 8 1.783z"/>\n' +
                '                                    </svg>'
        }

        var htmlcontent = '<div class="item">\n' +
            '                            <div class="block">\n' +
            '                                <!-- client info -->\n' +
            '                                <div class="client-details">\n' +
            '                                    <p>\n' +
            content +
            '                                       \n' + +
                '                                    </p>\n' +
            '                                </div>\n' +
            '                                <!-- /client info -->\n' +
            '                                <!-- client photo -->\n' +
            '                                <div class="media client-meta">\n' +
            '                                    <div class="mr-3 client-thumb">\n' +
            icon +
            '                                    </div>\n' +
            '                                    <div class="media-body" style="margin: 2px;">\n' +
            '                                        <h4 class="mt-0">' + title + '</h4>\n' +
            '                                        <p>Department id:' + department + '</p>\n' +
            '                                    </div>\n' +
            '                                </div>\n' +
            '\n' +
            '                                <!-- /client photo -->\n' +
            '                            </div>\n' +
            '                        </div>'

        return htmlcontent;
    }
    $(function () {
        $.each(announcements, function (index, announcement) {

            announcementContent = add(announcement.ann_title, announcement.ann_content,announcement.ann_type,announcement.department_id)
            console.log(announcementContent)
            $('#AnnouncementList').append(announcementContent);
        })
    })

</script>

</body>

</html>