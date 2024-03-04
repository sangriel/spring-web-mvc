<%--
  Created by IntelliJ IDEA.
  User: sangminhan
  Date: 2024/03/04
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--상대 경로 사용할때는 현재 url에 그냥 /append되는 식으로 붙여짐--%>
<form action="save" method="post">
    username: <input type="text" name="username"/>
    age: <input type="text" name="age"/>
    <button type="submit">전송</button>
</form>
</body>
</html>