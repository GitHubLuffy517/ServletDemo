<%--
  Created by IntelliJ IDEA.
  User: 目光
  Date: 2019/3/20
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String username= (String) session.getAttribute("username");
String password=(String) session.getAttribute("password");
%>
姓名：<%=username%>
密码：<%=password%>
</body>
</html>
