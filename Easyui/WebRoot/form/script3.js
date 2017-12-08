$(function(){
	
	$("#box").form({
  		url : 'FormServlet3',
  		onSubmit : function(param){
  			param.code = "code123";
  			//return false;  //返回false将不再发送请求
  		},
		success : function(data){
			alert(data);
		}
	});
	$('#box').submit();  
	
	//form的load方法：
	/*
	$("#box").form('load', {
		name : "千寻",
		email : "qianxun@163.com"
	});
	*/
	/*
	$("#box").form('load', 'FormServlet3');  //从远程的servlet加载数据到页面
	
	$("#box").form({
		onBeforeLoad : function(param){
			alert(param);
			alert("before load");
		},
		onLoadSuccess : function(){
			alert("load success");
		},
		onLoadError : function(){
			alert("load error");
		}
	});
	
	*/
	
});