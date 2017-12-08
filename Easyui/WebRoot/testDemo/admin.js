$(function(){
	
	$("#nav").tree({
		url : 'NavTreeServlet',
		line : true,
		onloadSuccess : function(node, data){
			if(data){
				$(data).each(function(index, value){
					if(this.status=='closed'){
						$("#nav").tree('expandAll');
					}
				});
			}
		},
		onClick : function(node){
			if(node.url){ //跟节点没有url，孩子节点
				if($("#tabs").tabs("exists",node.text)){
					//如果选项卡已经存在，直接选中即可
					$("#tabs").tabs("select",node.text);
				}else{
					$("#tabs").tabs("add", {
						title : node.text,
						iconCls : node.iconCls,
						closable : true,
						href : node.url + ".php"
					});
				}
			}
		}
	});
	
	//起始页选项卡
	$("#tabs").tabs({
		fit : true,
		border : false
	});
});