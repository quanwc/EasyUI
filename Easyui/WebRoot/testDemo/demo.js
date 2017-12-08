$(function(){
	$("#login").dialog({
		title : "登录后台",
		width : 300,
		height : 180,
		modal : true, //幕布
		iconCls : "icon-login",
		buttons : "#btn"
	});
	
	//管理员账号验证：
	$("#manager").validatebox({
		required : true,
		missingMessage : '请输入管理员账号',
		invalidMessage : '管理员账号不得为空'
	});
	
	//管理员密码验证：
	$("#pwd").validatebox({
		required : true,
		validType : 'length[6,30]',
		missingMessage : '请输入管理员密码',
		invalidMessage : '管理员密码长度: 6-30'
	});	
	
	//加载页面时判断，让光标定位到相关位置
	if(!$("#manager").validatebox('isValid')){
		$("#manager").focus();
	}else if(!$("#pwd").validatebox('isValid')){
		$("#pwd").focus();
	}
	
	//登录按钮校验
	$("#btn a").click(function(){
		if(!$("#manager").validatebox('isValid')){
			$("#manager").focus();
		}else if(!$("#pwd").validatebox('isValid')){
			$("#pwd").focus();
		}else{
			$.ajax({
				url : 'LoginServlet',
				type : 'post',
				data : {
					manager : $("#manager").val(),
					pwd : $("#pwd").val()
				},
				beforeSend : function(){
					$.messager.progress({
						text : "正在登录中"
					});
				},
				success : function(data){
					$.messager.progress('close');
					if(data=="true"){
						location.href = 'testDemo/admin.jsp';
					}else{
						$.messager.alert("登录失败", '用户名或密码错误', 'warning', function(){
							$("#pwd").select();
						})
					}
				}
			});
		}
	});
});