<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- javascript：引入外部的js文件 -->
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	
	<script type="text/javascript" src="datagrid/script04.js"></script>

	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"></link>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"></link>
	
	<style>
		.textbox{
			height : 20px;
			margin : 0;
			padding : 0 2px;
			box-sizing : context-box;
		}
	</style>
	
  </head>
  
  <body>
  	 
  	 <table id="box"></table>  
  	 
  	 <div id="tb" style="padding:5px;">
  	 	<div style="margin-bottom:5px;">
	  	    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onClick="obj.add()">添加</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">修改</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onClick="obj.remove()">删除</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" id="save" style="display:none;" onClick="obj.save()">保存</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-redo',plain:true" id="redo" style="display:none;" onClick="obj.redo()">取消编辑</a>
		</div>
		<div style="padding: 0 0 0 7px; color:#333">
			查询账号: <input type="text" name="account" style="width:110px" >
			创建时间从: <input type="text" name="date_from" class="easyui-datebox" editable="false" style="width:110px">
			到: <input type="text" name="date_to" class="easyui-datebox" editable="false" style="width:110px">
			<a class="easyui-linkbutton" iconCls="icon-search" onClick="obj.search();">查询</a>
		</div>
	</div>		
  </body>
</html>
