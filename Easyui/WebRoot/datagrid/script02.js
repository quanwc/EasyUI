$(function(){
	
	$("#box").datagrid({
		width : 400,
		title : "用户列表",
		iconCls : 'icon-search',
		url : 'DataGridServlet02',
		columns : [[
		    {
		    	field : "id",
		    	title : "ID",
		    	width : 50,
		    	sortable : true,
		    	sorter:function(a,b){ //自定义排序：必须是在当前页面排序，不能访问服务端，需要将remoteSort设置为false
					console.log(a + ", " + b);
				}  

		    },
		    {
		    	field : "name",
		    	title : "姓名",
		    	width : 50,
		    	sortable : true  //是列属性，默认是与后台服务器交互查询数据
		    },
		    {
		    	field : "age",
		    	title : "年龄",
		    	width : 50,
		    	sortable : true
		    }
		]],
		
		//第一种：指定排序字段，传到后台，在服务器端接收，拼接为sql
		//第二种：在列属性中，点击标题排序
		//第一种：
		sortName : 'age',
		sortOrder : 'desc',
		
		//第二种：在列属性上设置排序，在列属性上加sortable:true
		remoteSort : false, //默认是通过服务器端排序的
		multiSort : true, //是否多行排序，
		
		//向服务端发送的额外参数
		queryParams: {
			id : 1
		},
		method : 'post'
	});
	
});