<%--
  Created by IntelliJ IDEA.
  User: hope
  Date: 2020/8/25
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--jQuary文件-------------------------->
    <script type="text/javascript" charset="utf8" src="static/DataTables-1.10.21/media/js/jquery.js"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="static/bootstrap-4.5.0-dist/css/bootstrap.min.css">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="static/bootstrap-4.5.0-dist/js/bootstrap.min.js"></script>


    <link rel="stylesheet" type="text/css" href="static/DataTables-1.10.21/media/css/dataTables.bootstrap4.css">

    <!-- DataTables -->
    <script type="text/javascript" charset="utf8"
            src="static/DataTables-1.10.21/media/js/jquery.dataTables.js"></script>
    <script type="text/javascript" charset="utf8"
            src="static/DataTables-1.10.21/media/js/dataTables.bootstrap4.js"></script>
    <%@ page isELIgnored="false" %>
    <title>Document</title>
    <style>
        * {
            padding: 0;
            margin: 0;
        }


    </style>
<body>
<h1>
    School ::Announcement ::Test
</h1>
<div class="card" style="margin: 20px; ">
    <div class="card-header bg-info">
        Table
    </div>
    <div class="table-responsive card-body">
        <table class="table table-striped table-bordered display announcements" id="dataTable" width="100%"
               cellspacing="0">
            <thead>
            <tr>
                <th>序号</th>
                <th>学院号</th>
                <th>发布时间</th>
                <th>公告类型</th>
                <th>标题</th>
                <th>内容</th>
            </tr>
            </thead>
            <tfoot>
            <tr>
                <th>序号</th>
                <th>学院号</th>
                <th>发布时间</th>
                <th>公告类型</th>
                <th>标题</th>
                <th>内容</th>
            </tr>
            </tfoot>
            <tbody>
            </tbody>
        </table>
    </div>
</div>
<div class="card" style="margin: 20px; ">
    <div class="card-header bg-info">
        Table
    </div>
    <div class="table-responsive card-body">
        <div class="form-group">
            <label for="title">公告标题</label>
            <input type="text" id="title" class="form-control" placeholder="在此处填写">
        </div>
        <div class="form-group">
            <label for="content">公告内容</label>
            <input type="text" class="form-control" id="content" placeholder="在此处填写">
        </div>
        <div class="checkbox" id="type">
            <label>
                <input type="checkbox"> 是否必读
            </label>
        </div>
        <button class="btn btn-info" id="addAnnouncement">添加</button>
    </div>
</div>
<script type="text/javascript">

    $(function () {
        var $table = $('#dataTable').DataTable({

            language: {

                "sProcessing": "处理中...",
                "sLengthMenu": "显示 _MENU_ 项结果",
                "sZeroRecords": "没有匹配结果",
                "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
                "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
                "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
                "sInfoPostFix": "",
                "sSearch": "搜索:",
                "sUrl": "",
                "sEmptyTable": "表中数据为空",
                "sLoadingRecords": "载入中...",
                "sInfoThousands": ",",
                "oPaginate": {
                    "sFirst": "首页",
                    "sPrevious": "上页",
                    "sNext": "下页",
                    "sLast": "末页"
                },
                "oAria": {
                    "sSortAscending": ": 以升序排列此列",
                    "sSortDescending": ": 以降序排列此列"
                }
            },
            "columnDefs": [{
                "targets": 2,
                "createdCell": function (td, cellData, rowData, row, col) {
                    if (cellData < 100)
                        $(td).css('color', 'red');
                }
            }],


        });

        $.ajax({
            type: 'GET',
            url: '${pageContext.request.contextPath}/announcementTable',
            success: function (data) {
                console.log(data)
                var date;
                var dateTime;
                var type_id;
                var type;
                $.each(data, function (data, announcement) {
                    date = new Date(announcement.ann_time + 1598416885016);
                    // 格式化日期
                    dateTime = date.toLocaleString();

                    type_id = announcement.ann_type
                    if (type_id == 1) {
                        type = '必读';
                    } else if (type_id == 2) {
                        type = '选读'
                    }
                    console.log(announcement);
                    $table.row.add([
                        announcement.ann_id,
                        announcement.department_id,
                        dateTime,
                        type,
                        announcement.ann_title,
                        announcement.ann_content
                    ]).draw()

                })
            }
        })
    });


    $('#addAnnouncement').on('click', function () {
        var type = $('input:checkbox:checked').val();
        var type_id;
        if (type == 'on') {
            type_id = 1;
        } else {
            type_id = 2;
        }
        var announcement = {
            ann_title: $('#title').val(),
            ann_content: $('#content').val(),
            ann_time: Date.now() - 1598416885016,
            ann_type: type_id,
            department_id: 13,
            ann_id: Date.now() - 1598416885016
        }
        console.log(announcement);
        $.ajax({
            type: 'POST',
            Content: 'application/json',
            url: '${pageContext.request.contextPath}/addAnnouncement',
            data: JSON.stringify(announcement),
            contentType: "application/json;charset=UTF-8",// 定义发送请求的数据格式为JSON字符串
            // dataType: "json",//定义回调响应的数据格式为JSON字符串,该属性可以省略
            success: function (data) {
                var announcement = data;
                date = new Date(announcement.ann_time + 1598416885016);
                // 格式化日期
                var dateTime = date.toLocaleString();

                type_id = announcement.ann_type;
                if (type_id == 1) {
                    type = '必读';
                } else if (type_id == 2) {
                    type = '选读'
                }
                console.log(announcement);
                var $table = $('#dataTable').DataTable()
                $table.row.add([
                    announcement.ann_id,
                    announcement.department_id,
                    dateTime,
                    type,
                    announcement.ann_title,
                    announcement.ann_content
                ]).draw();

                $('#title').val('');
                $('#content').val('')
            }
        })
    })

</script>
<script type="text/javascript" src="static/my_js/title.js">
</script>
</body>

</html>