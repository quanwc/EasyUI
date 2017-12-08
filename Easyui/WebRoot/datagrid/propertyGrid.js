$(function(){
	$("#box").propertygrid({
		url: 'PropertyGridServlet',   
	    showGroup: true, 
	    groupField : "group",
	    groupFormatter : function(group,rows){
	    	return "{" + group + "}:";
	    }
	});
});