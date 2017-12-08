$(function(){
	$("#box").combogrid({
		 panelWidth:450, 
		 idField:'id',   
         textField:'name',   
         url:'ComboGridServlet',  
         multiple : true,
         columns:[[   
                   {field:'id',title:'ID',width:60,checkbox:true},   
                   {field:'name',title:'姓名',width:100},   
                   {field:'age',title:'年龄',width:120},   
               ]] 
	});
});