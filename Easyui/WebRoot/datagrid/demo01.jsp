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
	
	<script type="text/javascript" src="datagrid/script01.js"></script>

	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"></link>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"></link>
	
	
  </head>
  
  <body>
   
   <!-- class的加载方式 -->
   <!--  	
   <table class="easyui-datagrid">
   		<thead>
	   		<tr>
		   		<th data-options="field:'id'">ID</th>
				<th data-options="field:'name'">姓名</th>
				<th data-options="field:'age'">年龄</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>蜡笔小新</td>
				<td>xiaoxin@163.com</td>
				<td>2017-4-1</td>
			</tr>
			<tr>
				<td>千与千寻</td>
				<td>qianxun@163.com</td>
				<td>2017-4-2</td>
			</tr>
			<tr>
				<td>海贼</td>
				<td>haizei@163.com</td>
				<td>2017-4-3</td>
			</tr>
		</tbody>
   </table>
   -->
   
   
   <table id="box"></table>  
   
  </body>
</html>
