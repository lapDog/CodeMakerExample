<%--
  Created by IntelliJ IDEA.
  User: HJK
  Date: 2017/1/20
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="acp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>设备查询页面</title>
    <script>
        $(document).ready(function () {
            bindLayDate("lrsj_start","lrsj_end");
            loadGridData();
        });

        //jqgrid数据填充绑定
        function loadGridData() {
            // Configuration for jqGrid Example 1
            $("#table_list_1").jqGrid({
                url:"${acp}/deviceinfo/loadList",
                mtype : "POST",
                postData: getPostData(),
                datatype: "json",
                jsonReader : {
                    rows: "rows",
                    total: "totalPage",
                    records: "total"
                },
                height: 400,
                autowidth: true,
                shrinkToFit: true,
                rowNum : 10,
                rowList: [10, 20, 30],
                colNames: ['序号', '设备编号', '设备名称', '厂商类型', '更新时间','操作'],
                colModel: [
                    {
                        name: 'id',
                        index: 'id',
                        width: 60,
                        key:true,
                        sorttype: "int"
                    },
                    {
                        name: 'devid',
                        index: 'devid',
                        width: 90
                    },
                    {
                        name: 'devnickname',
                        index: 'devnickname',
                        width: 100
                    },
                    {
                        name: 'devcompany',
                        index: 'devcompany',
                        width: 80
                    },
                    {
                        name: 'updatedate',
                        index: 'updatedate',
                        width: 80
                    },
                    {
                        align: "center",
                        width : 250,
                        formatter : function( value, options, rows) {
                            var htmlStr = '<input type="button" class="btn btn-xs btn-primary" onclick="showDetail();"  value="详情">&nbsp;';
                            htmlStr += '<input type="button" class="btn btn-xs btn-info" onclick="showEdit();"  value="修改">&nbsp;';
                            return htmlStr+'<input type="button" class="btn btn-xs btn-danger" onclick="deleteAlert();"  value="删除">';
                        }
                    }
                ],
                pager: "#pager_list_1",
                viewrecords: true,
                hidegrid: false
            });

            // Add responsive to jqGrid
            $(window).bind('resize', function () {
                var width = $('.jqGrid_wrapper').width();
                $('#table_list_1').setGridWidth(width);
            });
        }

        //弹出新增页
        function showAdd() {
            layer.open({
                type : 2,
                title : '详情',
                area : [ '800px', '500px' ],
                fix : false, //不固定
                maxmin : true,
                shadeClose : true,
                content : "add.html",
                end : function() {

                }
            });
        }

        //弹出详情页
        function showDetail(id) {
            layer.open({
                type : 2,
                title : '详情',
                area : [ '800px', '500px' ],
                fix : false, //不固定
                maxmin : true,
                shadeClose : true,
                content : "view.html",
                end : function() {

                }
            });
        }

        //弹出修改页
        function showEdit(id) {
            layer.open({
                type : 2,
                title : '修改',
                area : [ '800px', '500px' ],
                fix : false, //不固定
                maxmin : true,
                shadeClose : true,
                content : "edit.html",
                end : function() {

                }
            });
        }

        //弹出删除提示
        function deleteAlert(id) {
            layer.confirm('您确认删除此条数据？', {
                title:'警告',
                btn: ['是的','我再想想'] //按钮
            }, function(){
                //TODO 执行删除
                layer.msg('删除成功', {
                    icon: 1,
                    time:1000,
                    skin: 'layer-ext-moon', //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
                    end:function () {
                        //TODO 刷新表格数据
                    }
                });
            }, function(){
                //取消操作
            });
        }

    </script>
</head>
<body>
    <div class="row">
        <div class="col-lg-12">
            <div class="ibox ">
                <div class="ibox-title">
                    <h5>小标题</h5>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                        <a id="btn_add" onclick="showAdd();">
                            <i class="fa fa-plus-square"></i>
                        </a>
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-th-list"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="javascript:$('#form_query').toggle('hidden');">显示/隐藏所有查询条件</a>
                            </li>
                            <li><a href="javascript:$('#cont_more_condition').toggle('hidden');">显示/隐藏更多查询条件</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="ibox-content">
                    <form id="form_query" class="margin-bottom">
                        <div class="row">
                            <div class="col-lg-4 col-md-6 col-sm-6">
                                <div class="ibox float-e-margins">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">检索字段</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-6 col-sm-6">
                                <div class="ibox float-e-margins">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">检索字段</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-6 col-sm-6">
                                <div class="ibox float-e-margins">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">检索字段</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-6 col-sm-6">
                                <div class="ibox float-e-margins">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">检索字段</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-6 col-sm-6">
                                <div class="ibox float-e-margins">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">检索字段</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-6 col-sm-6">
                                <div class="ibox float-e-margins">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">检索字段</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-6 col-sm-6">
                                <div class="ibox float-e-margins">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">时间检索</label>
                                            <div class="col-sm-8">
                                                <input class="form-control layer-date" id="lrsj_start"
                                                       style="width:49.5%;float:left;" placeholder="请选择起始时间">
                                                <input class="form-control layer-date" id="lrsj_end"
                                                       style="width: 49.5%;float:right;" placeholder="请选择结束时间">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-6 col-sm-6">
                                <div class="ibox float-e-margins">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">检索字段</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-6 col-sm-6">
                                <div class="ibox float-e-margins">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">检索字段</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--更多查询条件-->
                        <div id="cont_more_condition" class="row">
                            <div class="col-lg-4 col-md-6 col-sm-6">
                                <div class="ibox float-e-margins">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">检索字段</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-6 col-sm-6">
                                <div class="ibox float-e-margins">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">检索字段</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row border-bottom">
                            <div class="col-lg-12">
                                <div class="float-e-margins">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <div class="col-sm-12 text-center">
                                                <input type="button" id="table_list_1_submit" class="btn btn-sm btn-primary" value="查询" />&nbsp;&nbsp;&nbsp;&nbsp;
                                                <input type="reset" class="btn btn-sm btn-white ppd" value="重置" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                    <!--jqgrid表格容器-->
                    <div class="jqGrid_wrapper">
                        <table id="table_list_1"></table>
                        <div id="pager_list_1"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
