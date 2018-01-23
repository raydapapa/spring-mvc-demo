<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>
<body>
    <p>${message}</p>
    <p>这是一个Spring-MVC的测试页面</p>
    <p>嘿嘿</p>
    <p>咻咻</p>
    <p>哔哔</p>

    <script type="text/javascript" src="<%=path%>/js/jquery/jquery-3.2.1.min.js"></script>
</body>
</html>