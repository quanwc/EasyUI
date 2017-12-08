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
	
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"></link>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"></link>
	<link rel="stylesheet" type="text/css" href="css/admin.css"></link>

  </head>
  <body class="easyui-layout">  
    <div data-options="region:'north',title:' ',split:true,noheader:true" style="height:60px;background:#666">
    	<div class="logo">后台管理</div>
    	<div class="logout">您好，<%=session.getAttribute("manager")%>| <a href="javascript:void(0);">退出</a></div>
    </div>  
    <div data-options="region:'south',title:'South Title',split:true,noheader:true" style="height:35px;line-height:30px;text-align:center">
    	@copyright 2009-2017  Easy UI: www.easyui.com
    </div>  
    <div data-options="region:'west',title:'导航',split:true,iconCls:'icon-world'" style="width:180px;padding:10px;">
    	<ul id="nav"></ul>
    </div>  
    <div data-options="region:'center'" style="">
    	<div id="tabs">
    		<div title="起始页" iconCls="icon-house" style="padding:0 10px;display:block">
    			欢迎来到后台管理系统
    		</div>
    	</div>
    </div>  
     

	<!-- javascript：引入外部的js文件 -->
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="testDemo/admin.js"></script>
	
  </body>
</html>

