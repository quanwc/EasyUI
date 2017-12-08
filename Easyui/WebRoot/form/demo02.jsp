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

	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"></link>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"></link>
	
  	<script type="text/javascript">
	  	//$(function(){
	  		function execute(){
	  			$('#box').form('submit', {
		  			url : 'FormServlet2',
		  			onSubmit : function(param){  
		  				param.code = "610326";  //传递额外的参数
		  				return $(this).form("validate");
		  			}
		  			//success : function(data){
		  		    //   alert(data);   
		  			//}
		  		});
	  		}
	  		
	  		
	  	//});
  	</script>
  
  </head>
  <body style="margin:100px;">
     
	 <form id="box">  
		<div>  
			<label for="name">姓名:</label>  
			<input class="easyui-validatebox" name="name" data-options="required:true" />  
		</div>  
		<div>  
			<label for="age">年龄:</label>  
			<input class="easyui-validatebox" name="age" data-options="required:true" />  
		</div>  
	</form>  
	
	<button onclick="execute();">ok</button>
	
  </body>
</html>

