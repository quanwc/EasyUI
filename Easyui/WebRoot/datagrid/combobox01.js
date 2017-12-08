$(function(){
	$("#box").combobox({
		url : 'ComboboxServlet01',  //从后台加载json格式数据  
	    valueField : 'id',    //value属性值
	    textField : 'name',    //text的文本值
	    groupField : 'age',  //使用年龄分组
	    groupFormatter : function(group){
	    	return "=" + group + "=";
	    },
	    //mode : "remote", //文本改变时定义如何加载显示列表数据，会向后台发送参数为"q"的请求
	 
	    
	    filter: function(q, row){  //过滤文本框的数据
			var opts = $(this).combobox('options');
			return row[opts.textField].indexOf(q) >= 0;
		},
	    
	    formatter: function(row){
			var opts = $(this).combobox('options');
			return "{" + row[opts.textField] + "}";
		},
		/*
		onSelect : function(recor){
			alert("选择一个数据触发")
			console.log(recor);
		},
		
		onUnselect : function(recor){
			alert("取消一个数据触发") //需要配合unselect方法使用
			console.log(recor);
		},
		*/
		
	    
	   //从客户端本地获取数据
	   /*
	   data :  [
	       {
			id: 'java',
			name: 'Java'
		   },
		   {
			id: 'perl',
			name: 'Perl'
		   },
		   {
			id: 'ruby',
			name: 'Ruby'
		   }
	    ],
	    */
	    
	    
	});
});