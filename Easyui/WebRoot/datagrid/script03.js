$(function(){
	
	$("#box").datagrid({
		width : 200,
		//height : 150,
		title : "用户列表",
		iconCls : 'icon-search',
		url : 'DataGridServlet03',
		columns : [[
		    {
		    	field : "id",
		    	title : "ID",
		    	width : 100,
		    	//fixed : true, //列属性，阻止出现自适应，出现滚动条
		    	//align : "center",
		    	halign : "center", //只有标题居中
		    	resizable : false,
		    	//hidden : true,
		    	formatter : function(value, row, index){ //格式化单元格
		    		return "[" + value + "]";
		    	},
		    	styler: function(value,row,index){ //单元格的样式设定，与rowStyler相反。分别是对单元格、行进行样式的设置
					if (value < 20){
						return 'background-color:#ffee00;color:red;';
					}
				}

		    },
		    {
		    	field : "name",
		    	title : "姓名",
		    	width : 100,
		    	sortable : true  //是列属性，默认是与后台服务器交互查询数据
		    },
		    {
		    	field : "age",
		    	title : "年龄",
		    	width : 100,
		    	sortable : true
		    }
		]],
		
//		data : [  //手工的方式获取数据，与从后台服务器获取数据相反。 
//		    {
//		    	id : "100",
//	    		name : "100",
//	    		age : 100
//		    },
//		], 
		
		striped : true,  //交替显示行背景色
		//fitColumns : true, //使列适应表格宽度，不会出现水平滚动条。 为false时才会出现水平滚动条
		rownumbers : true,  //显示行号
		singleSelect : true,  //只允许选择一行
		showHeader : true, //是否显示"标题的头"
		loadMsg : "努力加载ing",
		scrollbarSize : 50, //滚动条所占的宽度和高度
		rowStyler: function(index,row){  //修改"行"的样式
			console.log(index + ": " + row);
			if (row.id==135){
				return 'background-color:#6293BB;color:#fff;'; //这里返回的是CSS的class名称
			}
		}

	});
	
});