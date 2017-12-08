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
	
	<script type="text/javascript" src="datagrid/propertyGrid.js"></script>
												 
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"></link>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"></link>
  
  
  	<script type="text/javascript">
		function abc(){
			
			//$("#box").propertygrid("collapseGroup");//折叠
			$("#box").propertygrid("collapseGroup", 0);
		}
	</script>
  
  </head>
  
  <body>
  	 
   
  	<!-- class的加载方式： -->
  	<!--    
  	<table class="easyui-propertygrid" style="width:300px"  
        data-options="url:'PropertyGridServlet',showGroup:true,scrollbarSize:0"></table>  
	-->
	
	
	<!-- js的加载方式： -->
	<table id="box" style="width:300px"></table>  
	
	<input type="button" value="按钮" onclick="abc()"></input>
	
  </body>
</html>
