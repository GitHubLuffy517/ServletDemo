<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <%--注解时带了斜杠提交时不需要带斜杠--%>
  <%--使用post会乱码，要使用过滤器--%>
<form action="HttpServletTest" method="post">
  姓名：<input name="username" type="text" >
  爱好：<input type="checkbox" name="hobby" value="篮球">篮球
  <input type="checkbox" name="hobby" value="足球">足球
  <input type="submit" value="提交">
</form>
  </body>
</html>