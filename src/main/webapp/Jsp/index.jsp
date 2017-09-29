<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/test/register.do" method="POST">
    姓名：<input type="text" name="name"/><br>
    年龄：<input type="text" name="age"/><br>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
