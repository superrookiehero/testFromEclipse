<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" type="text/css" href="js/themes/icon.css"/>
		<link rel="stylesheet" type="text/css" href="js/themes/default/easyui.css"/>
		<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/jquery.easyui.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/locale/easyui-lang-zh_CN.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body style="">
		<div style="width: 400px; height: 50px; color:aqua; font-size: 38px;position: absolute;left: 38%; top: 25%;">
			旅游管理系统登录页面
		</div>
		<div style="position: absolute;top: 38%;left: 37%; border-radius:10px; overflow: hidden;">
			<div class="easyui-panel" data-options="left:400" style="width:400px;padding:40px 70px 30px 70px; background-image: url(js/themes/icons/1459515792868.jpg);">
				
				<form id="ff" name="ff" method="post" action="${pageContext.request.contextPath }/user/login.action">   
				<div style="margin-bottom:10px">
					<input class="easyui-textbox" id="username" name="username" value="用户名" style="width:100%;height:40px;padding:12px;" data-options="required:true,iconCls:'icon-man',iconWidth:38">
				</div>
				<div style="margin-bottom:20px">
					<input class="easyui-textbox" id="password" name="password" type="text"  value="密码" style="width:100%;height:40px;padding:12px" data-options="required:true,iconCls:'icon-lock',iconWidth:38,validType:'minLength[5]'">
				</div>
				<div>
					<div class="easyui-linkbutton" data-options="iconCls:'icon-ok'" style="padding:5px 0px;width:100%;">
						<input type="submit" style="font-size:14px;"value="登录">
					</div>
				</div>
				</form>  
			</div>
		</div>
	</body>
</html>
