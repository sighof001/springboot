<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>i am a title</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
$(function(){
	if(!!window.EventSource){
		var source = new EventSource('push');
		source.addEventListener('message',function(e){
			$('#messgeFromPush').html(e.data + '<br />');
		});
		
		source.addEventListener('open',function(e){
			console.log('连接打开');
		});
		
		source.addEventListener('error',function(e){
			if(e.readyState == EventSource.CLOSED){
				console.log('连接关闭');
			}else{
				console.log(e.readyState);
			}
		});
	}else{
		console.log("你的浏览器不支持");
	}
	alert('aaa');
});
</script>
</head>
<body>
	<div>
		<p id='messgeFromPush'></p>
	</div>
</body>
</html>