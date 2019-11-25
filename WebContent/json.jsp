<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	function requestJson() {
		$.ajax({
			type : "POST",
			url : "/requestJson",
			data : '{"name":"华为手机","id":1}',
			success : function(msg) {
				alert("Data Saved: " + msg);
			}
		});
	}
</script>
</head>
<body>
	<div>
		<input type="button" value="requestJson" onclick="requestJson()">
	</div>
</body>
</html>