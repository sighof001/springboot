<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>i am a title</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/js/jquery-3.3.1.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
<div class="upload">
	<form action="<%=request.getContextPath() %>/upload" enctype="multipart/form-data" method="post">
		<input type="file" name="file" />
		<input type="submit" value="上传" />
	</form>
</div>
</body>
</html>