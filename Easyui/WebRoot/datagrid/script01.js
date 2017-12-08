$(function(){
	
	$("#box").datagrid({
		width : 400,
		title : "用户列表",
		iconCls : 'icon-search',
		url : 'DataGridServlet01',
		columns : [[
		    {
		    	field : "id",
		    	title : "ID",
		    	width : 50,
		    },
		    {
		    	field : "name",
		    	title : "姓名",
		    	width : 50,
		    },
		    {
		    	field : "age",
		    	title : "年龄",
		    	width : 50,
		    }
		]],
		pagination : true, 
		pageNumber : 2,  //是page参数的值
		pageSize : 5,    //是pageSize参数的默认值
		pageList : [2,5,3]
		
	});
	
});