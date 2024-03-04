<%--
  Created by IntelliJ IDEA.
  User: sangminhan
  Date: 2024/03/04
  Time: 10:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
<%--    <li>id=<%= ((Member) request.getAttribute("member")).getId()%></li>--%>
    <li>id=${member.id}</li>
    <li>username=${member.username}</li>
    <li>age=${member.age}</li>
</ul>
<a href="/index.html">main</a>
</body>
</html>

