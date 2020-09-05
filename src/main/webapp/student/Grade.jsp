<%@ page import="com.school.entity.StugradeDTO" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <style>
        .paginate_button.previous a {
            color: RGB(51, 186, 157);
        }

        .paginate_button.next a {
            color: RGB(51, 186, 157);
        }

        .paginate_button.page-item {
            color: RGB(51, 186, 157);
            background-color: RGB(51, 186, 157);
        }

        .page-item.active .page-link {
            z-index: 1;
            color: #fff;
            background-color: RGB(51, 186, 157);
            border-color: RGB(51, 186, 157);
        }

        .page-link {
            position: relative;
            display: block;
            padding: .5rem .75rem;
            margin-left: -1px;
            line-height: 1.25;
            color: RGB(51, 186, 157);
            background-color: #fff;
            border: 1px solid #dee2e6;
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
                            <li class="nav-item">
                                <a class="nav-link " href="Announcement.jsp">Announcement
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Index.jsp">Sign Out</a>
                            </li>

                            <li class="nav-item dropdown active">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Functions
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="StudentInfo.jsp">Personal Information</a>
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

<section>
    <div class="container">
        <div class="row">
            <div class="col" style="padding-top: 10px;">
                <div class="title text-center">
                    <h4>check</h4>
                    <h2>You Grade.</h2>
                    <span class="border"></span>
                    <p>Here you can check all your grades in this semester, if you have any questions, please contact us
                        in time</p>
                </div>
            </div>
        </div>
        <div class="row" style="margin-bottom: 20px;">
            <div class="card" style="margin: auto; margin-bottom: 50px;">
                <!-- <div class="card-header text-center" style="background-color: RGB(51, 186, 157);">
                </div> -->
                <div class="table-responsive card-body shadow" style="border:3px solid RGB(51, 186, 157)">
                    <table class="table table-striped table-bordered display" id="dataTable" width="100%"
                           cellspacing="0">
                        <thead>
                        <tr>
                            <th>Student_id</th>
                            <th>Course_id</th>
                            <th>Course_name</th>
                            <th>Credit</th>
                            <th>Term</th>
                            <th>Course_type</th>
                            <th>Score</th>
                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>Student_id</th>
                            <th>Course_id</th>
                            <th>Course_name</th>
                            <th>Credit</th>
                            <th>Term</th>
                            <th>Course_type</th>
                            <th>Score</th>
                        </tr>
                        </tfoot>

                        <c:forEach items="${list}" var="list"  varStatus="status">
                                <tr>
                                <td>${list.stu_id}</td>
                                <td>${list.course_id}</td>
                                <td>${list.course_name}</td>
                                <td>${list.credit}</td>
                                <td>${list.term}</td>
                                <td>${list.course_type}</td>
                                <td>${list.score}</td>

                            </tr>
                        </c:forEach>


                    </table>
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

<link rel="stylesheet" type="text/css" href="../static/DataTables-1.10.21/media/css/dataTables.bootstrap4.css">

<!-- DataTables -->
<script type="text/javascript" charset="utf8"
        src="../static/DataTables-1.10.21/media/js/jquery.dataTables.js"></script>
<script type="text/javascript" charset="utf8"
        src="../static/DataTables-1.10.21/media/js/dataTables.bootstrap4.js"></script>

<script type="text/javascript">
    $('#dataTable').DataTable({

        aLengthMenu: [[8, 10, 25, -1], [8, 10, 25, "所有"]],

        //     language: {
        //     "sProcessing": "处理中...",
        //     "sLengthMenu": "显示 _MENU_ 项结果",
        //     "sZeroRecords": "没有匹配结果",
        //     "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
        //     "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
        //     "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
        //     "sInfoPostFix": "",
        //     "sSearch": "搜索:",
        //     "sUrl": "",
        //     "sEmptyTable": "表中数据为空",
        //     "sLoadingRecords": "载入中...",
        //     "sInfoThousands": ",",
        //     "oPaginate": {
        //         "sFirst": "首页",
        //         "sPrevious": "上页",
        //         "sNext": "下页",
        //         "sLast": "末页"
        //     },
        //     "oAria": {
        //         "sSortAscending": ": 以升序排列此列",
        //         "sSortDescending": ": 以降序排列此列"
        //     }
        // },
        "columnDefs": [{
            "targets": 2,
            "createdCell": function (td, cellData, rowData, row, col) {
                if (cellData < 100)
                    $(td).css('color', 'red');
            }
        }],
        "paging": false,

    });

</script>

</body>

</html>