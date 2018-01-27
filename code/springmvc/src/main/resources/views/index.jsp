<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>i am a title</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
$(function(){
	$('#hehe').text('not hello');
});
</script>
</head>
<body>
	<div>
		<p>hello</p>
		<p id='hehe'></p>
	</div>
</body>
</html>