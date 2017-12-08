$.extend($.fn.datagrid.defaults.editors, {   
    text: {   
        init: function(container, options){   
            var input = $('<input type="text" class="datagrid-editable-input">').appendTo(container);   
            return input;   
        },   
        getValue: function(target){   
            return $(target).val();   
        },   
        setValue: function(target, value){   
            $(target).val(value);   
        },   
        resize: function(target, width){   
            var input = $(target);   
            if ($.boxModel == true){   
                input.width(width - (input.outerWidth() - input.width()));   
            } else {   
                input.width(width);   
            }   
        }   
    }   
});  

$(function(){
	
	//定义全局的变量：
	obj = {
			
		editRow : undefined, //只能增加一行
			
		search : function(){
			$("#box").datagrid("load", {
				//使用load方法向服务端提交数据：？？？？
				account : $.trim($("input[name='account']").val()),
				date_from : $.trim($("input[name='date_from']").val()),
				date_to : $.trim($("input[name='date_to']").val()),
			});
		},
		add : function(){
			
			$("#save,#redo").show();//点击添加，进行显示操作
			
			//在末尾追加节点：
			/*
			$("#box").datagrid("appendRow", {
				id : 1001,
				name : "蜡笔小新",
				age : 50
			});
			*/
			if(this.editRow==undefined){ //false情况下，可以insert一行
				$("#box").datagrid("insertRow", {
					index : 0,
					row : {
							
					}
				});
			
				//将第一行设置为可编辑状态
				$("#box").datagrid("beginEdit", 0);

				this.editRow = 0;
			}
			
		},
		
		save : function(){
			$("#box").datagrid("endEdit", this.editRow); //保存时：设置第一行为结束编辑状态
		},
		
		redo : function(){
			$("#box").datagrid('rejectChanges');  //返回到上一个编辑状态
			$("#save,#redo").hide();
			this.editRow = undefined;
		},
		
		remove : function(){
			var rows = $("#box").datagrid("getSelections");
			if(rows.length>0){
				$.messager.confirm("确定操作", "确定删除吗?", function(flag){
					if(flag){
						var ids = [];
						for(var i=0; i<rows.length; i++){
							ids.push(rows[i].id);
						}
						console.log(ids.join(","));
					}
				});
			}else{
				$.messager.alert("提示", "请选择要删除的记录", "info");
			}
		}
	};
	
	$("#box").datagrid({
		width : 600,
		//height : 150,
		title : "用户列表",
		iconCls : 'icon-search',
		url : 'DataGridServlet04',
		fitColumns : true,
		columns : [[
		    {
		    	field : "code",
		    	title : "编号",
		    	width : 100,
		    	checkbox : true,
		    },
		    {
		    	field : "id",
		    	title : "ID",
		    	width : 100,
		    	editor : {  //要与beginEdit方法配合使用才能生效
		    		type : "validatebox",
		    		options : {
		    			required : true
		    		}
		    	}
		    },
		    {
		    	field : "name",
		    	title : "姓名",
		    	width : 100,
		    	editor : {  //要与beginEdit方法配合使用才能生效
		    		type : "validatebox",
		    		options : {
		    			required : true,
		    			validType : "email", 
		    		}
		    	}
		    },
		    {
		    	field : "age",
		    	title : "年龄",
		    	width : 100,
		    	editor : { 
		    		type : "datetimebox",  //没有提供该datetimebox，需要重写数据表格的editors属性，这样可以对datebox进行扩展
		    		options : {
		    			required : true
		    		}
		    	}
		    }
		]],
		
		striped : true,  //交替显示行背景色
		rownumbers : true,  //显示行号
		//singleSelect : true,  //只允许选择一行
		showHeader : true, //是否显示"标题的头"
		loadMsg : "努力加载ing",
		
		
		//工具栏
		toolbar : "#tb",
		
		
		//双击一行，触发该事件
		onDblClickRow : function(rowIndex, rowData){
			if(obj.editRow!=undefined){  //
				$("#box").datagrid("endEdit", obj.editRow);
			}
			if(obj.editRow==undefined){ //被编辑的这一行
				$("#box").datagrid("beginEdit", rowIndex);
				obj.editRow = rowIndex;
			}
			
		},
		
		//编辑完成后，点击
		onAfterEdit : function(rowIndex, rowData, changes){  //编辑操作完成时出发
			$("#save,#redo").hide();
			this.editRow = undefined;
			console.log(rowData);
		},
		
		
		
	});
	
});