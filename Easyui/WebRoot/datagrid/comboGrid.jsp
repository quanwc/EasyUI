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
	
	<script type="text/javascript" src="datagrid/comboGrid.js"></script>
												 
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"></link>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"></link>
  
  
  	<script type="text/javascript">
		function abc(){
			//$('#box').combogrid('clear');
			//$('#box').combogrid('setValue', 1);
			$('#box').combogrid('setValues', [1,2]);
		}
	</script>
  
  </head>
  
  <body>
  	 
   
  	
   <!--  
  	<select id="cc" class="easyui-combogrid" style="width:250px;"  
        data-options="   
            panelWidth:450,   
            value:'006',   
            idField:'id',   
            textField:'name',   
            url:'ComboGridServlet',   
            columns:[[   
                {field:'id',title:'ID',width:60},   
                {field:'name',title:'姓名',width:100},   
                {field:'age',title:'年龄',width:120},   
            ]]   
        "></select> 
		-->
	
	<!-- js的加载方式： -->
	<input id="box" name="box"/>
	
	<input type="button" value="按钮" onclick="abc()"></input>
	
	
  </body>
</html>
