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
	
	<script type="text/javascript" src="datagrid/combobox01.js"></script>
												 
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"></link>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"></link>
  
  
  	<script type="text/javascript">
		function abc(){
			//$("#box").combobox("unselect", 0); //取消选中
			//$("#box").combobox("setValue", 1);
			//$('#cc').combobox('setValue', 1);  ？？？
			//$('#box').combobox('setValues', [1,2]);  ？？？
		
			//console.log($('#box').combobox('getData'));
			//console.log($('#box').combobox('options'));

		}
	</script>
  
  </head>
  
  <body>
  	 
   
  	<!-- class的加载方式： -->
  	<!--  
  	<select class="easyui-combobox" style="width:200px;">  
	    <option value="aa">aa</option>  
	    <option value="bb">bb</option>  
	    <option value="cc">cc</option>  
	    <option value="dd">dd</option>  
	</select>  
	-->
	
	<!-- js的加载方式： -->
	<input id="box" name="box"/>
	
	<input type="button" value="按钮" onclick="abc()"></input>
	
	
  </body>
</html>
