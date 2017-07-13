<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- ApplicationContext Path -->
<c:set var="acp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <title>
        <sitemesh:write property='title' />
    </title>
    <!-- common css stylesheet -->
    <link href="${acp}/static/hplus/css/bootstrap.min.css?v=3.3.0" rel="stylesheet">
    <link href="${acp}/static/hplus/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">
    <link href="${acp}/static/hplus/css/animate.css" rel="stylesheet">
    <link href="${acp}/static/hplus/css/plugins/jQueryUI/jquery-ui-1.10.4.custom.min.css" rel="stylesheet">
    <!-- jqgrid -->
    <link href="${acp}/static/hplus/css/plugins/jqgrid/ui.jqgrid.css" rel="stylesheet">
    <link href="${acp}/static/hplus/css/style.css?v=2.1.0" rel="stylesheet">
    <link rel="stylesheet" href="${acp}/static/custom/css/index.css">
    <!-- Mainly scripts -->
    <script src="${acp}/static/hplus/js/jquery-2.1.1.min.js"></script>
    <script src="${acp}/static/hplus/js/bootstrap.min.js?v=3.3.0"></script>
    <script src="${acp}/static/hplus/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="${acp}/static/hplus/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
    <!-- jqGrid -->
    <script src="${acp}/static/hplus/js/plugins/jqgrid/i18n/grid.locale-cn.js"></script>
    <script src="${acp}/static/hplus/js/plugins/jqgrid/jquery.jqGrid.min.js"></script>
    <!--layer-->
    <script src="${acp}/static/hplus/js/plugins/layer/layer.js"></script>
    <script src="${acp}/static/hplus/js/plugins/laydate/laydate.js"></script>
    <!-- Custom and plugin javascript -->
    <script src="${acp}/static/hplus/js/hplus.js?v=2.0.0"></script>
    <script src="${acp}/static/hplus/js/plugins/pace/pace.min.js"></script>
    <script src="${acp}/static/custom/js/commn.js"></script>
    <!-- Page-Level Scripts -->
    <script>
        //ready function
        $(function () {

        })
    </script>
    <!-- 将拼装页面头放在最下面(优先级)-->
    <sitemesh:write property='head' />
</head>
<body>
<div id="wrapper">
    <!-- Perison Info and Left Menu -->
    <nav class="navbar-default navbar-static-side fixed-nav-left" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="side-menu">
                <!-- 个人信息 -->
                <li class="nav-header">
                    <div class="dropdown profile-element text-center">
                            <span>
                                <img alt="image" class="img-circle" src="${acp}/static/hplus/img/a1.jpg" height="64px" width="64px"/>
                            </span>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="clear">
                                <span class="block m-t-xs">
                                    <strong class="font-bold">Admin</strong>
                                </span>
                                <span class="text-muted text-xs block">hjk_sports@126.com<b class="caret"></b></span>
                            </span>
                        </a>
                        <ul class="dropdown-menu animated fadeInRight m-t-xs">
                            <li><a href="#">修改头像</a>
                            </li>
                            <li><a href="#">个人资料</a>
                            </li>
                            <li><a href="#">联系我们</a>
                            </li>
                            <li><a href="#">信箱</a>
                            </li>
                            <li class="divider"></li>
                            <li><a href="#">安全退出</a>
                            </li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        Menu
                    </div>
                </li>
                <!-- 菜单项 -->
                <li class="active">
                    <a href="#"><i class="fa fa-home"></i> <span class="nav-label">首页</span></a>
                </li>
                <li>
                    <a href="#">
                        <i class="fa fa-th-large"></i>
                        <span class="nav-label">默认模板</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="${acp}/deviceinfo/list">查询页面</a>
                        </li>
                        <li><a href="${acp}/deviceinfo/add">新增页面</a>
                        </li>
                        <li><a href="${acp}/deviceinfo/edit/1">修改页面</a>
                        </li>
                        <li><a href="${acp}/deviceinfo/view/1">详情页面</a>
                        </li>
                    </ul>
                </li>

                <li>
                    <a href="#"><i class="fa fa-flask"></i> <span class="nav-label">其他模板(待开发)</span></a>
                </li>

            </ul>

        </div>
    </nav>

    <!-- Main Content -->
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <!--顶栏-->
        <div class="row border-bottom">
            <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
                    <form role="search" class="navbar-form-custom" method="post" action="">
                        <div class="form-group">
                            <input type="text" placeholder="请输入您需要查找的内容 …" class="form-control" name="top-search" id="top-search">
                        </div>
                    </form>
                </div>
                <ul class="nav navbar-top-links navbar-right">
                    <li class="dropdown">
                        <a class="dropdown-toggle count-info" data-toggle="dropdown" href="index.html#">
                            <i class="fa fa-bell"></i>  <span class="label label-primary">8</span>
                        </a>
                        <ul class="dropdown-menu dropdown-alerts">
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-envelope fa-fw"></i> 您有16条未读消息
                                        <span class="pull-right text-muted small">4分钟前</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-qq fa-fw"></i> 3条新回复
                                        <span class="pull-right text-muted small">12分钟钱</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <div class="text-center link-block">
                                    <a href="#">
                                        <strong>查看所有 </strong>
                                        <i class="fa fa-angle-right"></i>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">
                            <i class="fa fa-sign-out"></i> 退出
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
        <!--当前位置-->
        <div class="row wrapper border-bottom white-bg page-heading">
            <div class="col-lg-10">
                <h2>大标题</h2>
                <ol class="breadcrumb">
                    <li>
                        <a href="index.html">主页</a>
                    </li>
                    <li>
                        <a>表格</a>
                    </li>
                    <li>
                        <strong>jqGird</strong>
                    </li>
                </ol>
            </div>
        </div>
        <!--主体内容-->
        <div class="wrapper wrapper-content animated fadeInRight ">
            <sitemesh:write property='body'/>
        </div>
        <!--页脚-->
        <div class="footer">
            <div class="pull-right">
                Powered by <a href="http://www.colouredspark.com" target="_blank">Coloured Spark</a>
            </div>
        </div>

    </div>
</div>

</body>
</html>
