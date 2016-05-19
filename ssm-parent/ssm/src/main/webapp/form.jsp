<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   	<form action="user/addUser.do" method="post" enctype="application/x-www-form-urlencoded">
   		<label>ID：</label><input type="text" name="id"><br>
   		<label>姓名：</label><input type="text" name="userName"><br>
   		<label>性别：</label><input type="text" name="passWord"><br>
   		<label>邮箱：</label><input type="text" name="Email"><br>
   		<input type="submit" value="提交">
   	</form>
  </body>
</html>
