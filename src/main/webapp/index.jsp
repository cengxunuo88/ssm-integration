<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false" %>
<body>
<h2>Hello World!</h2>
<form action="/employee" method="post">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <label>性别:</label>
    男<input class="sex" type="radio" name="sex" value="0">
    女<input class="sex" type="radio" name="sex" value="1"><br>
    地址：<input type="text" name="address"><br>
    手机：<input type="text" name="phone"><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
