<!DOCTYPE html>
<!--[if gt IE 8]><!-->
<html lang="zxx">
<!--<![endif]-->

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="description" content="Bingo One page parallax responsive HTML Template ">

    <meta name="author" content="Themefisher.com">
    <%@ page isELIgnored="false" %>
    <%@ page language="java" pageEncoding="UTF-8" %>
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
        .account {
            background: #31BB9E;
            height: 100%;
            padding: 5%;
            display: flex;
            justify-content: center;
            align-items: center;
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
                                    <a class="dropdown-item"
                                       href="${pageContext.request.contextPath}/student/toStudentInfo">Personal
                                        Information</a>
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

<section class=" account mx-auto">
    <div class="container">
        <div class="row">
            <div class="col-md-6 mx-auto">
                <div class="block text-center">
                    <h2 class="text-center" style="padding-bottom: 15px;">Check you message</h2>
                    <form class="text-left " action="Index2.jsp">
                        <div class="row">
                            <p class="col-sm-3" style="color:RGB(51,186,157);">Name:</p>
                        </div>
                        <div class="form-group">
                            <input type="text" id="Name" disabled="disabled" class="form-control" placeholder="Name">
                        </div>
                        <div class="row">
                            <p class="col-sm-3" style="color:RGB(51,186,157);">Gander:</p>
                        </div>
                        <div class="form-group">
                            <input type="text" id="Gander" disabled="disabled" class="form-control"
                                   placeholder="Gander">
                        </div>
                        <div class="row">
                            <p class="col-sm-3" style="color:RGB(51,186,157);">Birthday:</p>
                        </div>
                        <div class="form-group">
                            <input type="date" required="required" id="Birthday" disabled="disabled"
                                   class="form-control"
                                   placeholder="" value="">
                        </div>
                        <div class="row">
                            <p class="col-sm-3" style="color:RGB(51,186,157);">Ethic:</p>
                        </div>
                        <div class="form-group">
                            <input type="text" id="Ethic" disabled="disabled" class="form-control" placeholder="Ethic">
                        </div>
                        <div class="row">
                            <p class="col-sm-3" style="color:RGB(51,186,157);">Native_place:</p>
                        </div>
                        <div class="form-group">
                            <input type="text" id="Native_place" disabled="disabled" class="form-control"
                                   placeholder="Native_place">
                        </div>
                        <div class="row">
                            <p class="col-sm-3" style="color:RGB(51,186,157);">Id_card_number:</p>
                        </div>
                        <div class="form-group">
                            <input type="text" id="Id_card_number" disabled="disabled" class="form-control"
                                   placeholder="Id_card_number">
                        </div>
                        <div class="row">
                            <p class="col-sm-3" style="color:RGB(51,186,157);">Department:</p>
                        </div>
                        <div class="form-group">
                            <input type="text" id="Department" disabled="disabled" class="form-control"
                                   placeholder="Department">
                        </div>
                        <button type="button" class="btn btn-main text-center" id="change">Change it</button>
                        <button type="button" class="btn btn-main " id="submit-button" style="visibility:hidden; "
                                data-toggle="modal" data-target="#myModal">Submit
                        </button>
                    </form>
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

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Please confirm the information</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body" id="confirm">
                <h5>Name</h5>
                <p>NNNNName</p>
                <hr>
                <h5>Gander</h5>
                <p>Gander</p>
                <hr>
                <h5>Birthday</h5>
                <p>Birthday</p>
                <hr>
                <h5>Ethic</h5>
                <p>Ethic</p>
                <hr>
                <h5>Native_place</h5>
                <p>Native_place</p>
                <hr>
                <h5>Id_card_number</h5>
                <p>Id_card_number</p>
                <hr>
                <h5>Department</h5>
                <p>Department</p>
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" id="confirm-btn" class="btn" style="background-color: #31BB9E; color: aliceblue;"
                        data-dismiss="modal">
                    Save changes
                </button>
            </div>
        </div>
    </div>
</div>


<!-- SuccessModal -->
<div class="modal fade" id="success" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel">Modified successfully</h4>
            </div>
            <div class="modal-body">
                Your personal information has been modified successfully
            </div>
            <div class="modal-footer">
                <button type="button" class="btn" data-dismiss="modal" id="flash"
                        style="background-color: RGB(51,186,157); color: aliceblue;">Close
                </button>
            </div>
        </div>
    </div>
</div>


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

<script>
    $(function () {
            function dateVal(time) {//用于将int类型的日期转化成字符串
                var now = new Date(time);
                //格式化日，如果小于9，前面补0
                var day = ("0" + now.getDate()).slice(-2);
                //格式化月，如果小于9，前面补0
                var month = ("0" + (now.getMonth() + 1)).slice(-2);
                //拼装完整日期格式
                var today = now.getFullYear() + "-" + (month) + "-" + (day);
                //完成赋值
                return today
            }

            //获取参数
            var studentInfo = ${studentInfo};
            console.log(studentInfo);
            birthday = dateVal(studentInfo.birthday + 1598416885016)
            // 格式化日期
            $('#Name').attr('placeholder', studentInfo.name);
            $('#Gander').attr('placeholder', studentInfo.gender);
            var $Birthday = $('#Birthday');
            $Birthday.attr('value', birthday);
            $Birthday.attr('placeholder', birthday);
            $Birthday.css({
                "color": 'RGB(134,142,150)'
            })
            $('#Ethic').attr('placeholder', studentInfo.ethic);
            $('#Native_place').attr('placeholder', studentInfo.native_place);
            $('#Id_card_number').attr('placeholder', studentInfo.id_card_number);
            $('#Department').attr('placeholder', studentInfo.department);


            $('#change').on('click', function () {
                var $input = $('input')
                $.each($input, function (indexInArray, valueOfElement) {
                    valueOfElement.value = valueOfElement.placeholder
                });
                $('input').attr("disabled", false)
                $('#change').toggle(500);
                $('#submit-button').css({
                    'visibility': 'visible'
                })
                $('#Birthday').css({
                    "color": 'RGB(0,0,0)'
                })
            })


            $('#submit-button').on('click', function () {
                var $contents = $('#confirm p')
                var $vals = $('.form-group input')
                $.each($vals, function (indexInArray, valueOfElement) {
                    $contents[indexInArray].innerHTML = valueOfElement.value;
                });

            })
            $('#flash').on('click', function () {//结束活动，返回初始页面
                $(location).attr('href', './Index2.jsp');
            })


            $('#confirm-btn').on('click', function () {//给提交按钮赋值
                var $contents = $('#confirm p')
                var StudentInfo = {
                    'stu_id': null,
                    'name': null,
                    'gender': null,
                    'birthday': null,
                    'ethnic': null,
                    'native_place': null,
                    'id_card_number': null,
                    'department': null
                }
                var Time = new Date($contents[2].innerHTML).getTime() - 1598416885016;
                StudentInfo.name = $contents[0].innerHTML;
                StudentInfo.gender = $contents[1].innerHTML;
                StudentInfo.birthday = Time;
                StudentInfo.ethnic = $contents[3].innerHTML;
                StudentInfo.native_place = $contents[4].innerHTML;
                StudentInfo.id_card_number = $contents[5].innerHTML;
                StudentInfo.department = $contents[6].innerHTML;
                console.log(JSON.stringify(StudentInfo));
                $.ajax({
                    type: 'POST',
                    Content: 'application/json',
                    url: '${pageContext.request.contextPath}/student/changeStudentInfo',
                    data: JSON.stringify(StudentInfo),
                    contentType: "application/json;charset=UTF-8",// 定义发送请求的数据格式为JSON字符串
                    // dataType: "json",//定义回调响应的数据格式为JSON字符串,该属性可以省略
                    success: function () {
                        $('#success').modal({})
                    }
                })

                // 此处建议使用ajax异步传输数据,数据传输成功后跳转到初始页面
            })


        }
    )
</script>

</body>

</html>