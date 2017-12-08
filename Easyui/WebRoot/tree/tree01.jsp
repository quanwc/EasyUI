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
	
	<script type="text/javascript" src="tree/tree01.js"></script>
												 
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"></link>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"></link>
  
  
  	<script type="text/javascript">
		function abc(){
			
		}
	</script>
  
  </head>
  
  <body>
  	 
   
 <!-- class的加载方式： -->
 <ul id="tt" class="easyui-tree" data-options="
 	animate:true,checkbox:true,cascadeCheck:false,onlyLeafCheck:true,lines:true,
 	dnd:true,
 ">
 	<li>
 		<span>系统管理</span>
 		<ul>
 			<li>
 				<span>主机信息</span>
 				<ul>
					<li>版本信息</li>
					<li>数据库信息</li>
				</ul>
 			</li>
 			<li>更新信息</li>
 			<li>程序信息</li>
 		</ul>  
 	</li>
 	<li>
 		<span>会员管理</span>
 		<ul>
 			<li>新增会员</li>
 			<li>审核会员</li>
 		</ul>
 	</li>  
 </ul>

	
	
	

	
	
	
  </body>
</html>
