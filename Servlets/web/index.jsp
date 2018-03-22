<%--
  Created by IntelliJ IDEA.
  User: sematicbits
  Date: 22/3/18
  Time: 12:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login Servlet</title>
</head>
<body>
  <form action="LoginServlet" method="get">

    Username: <input type="text" name="user">
    <br>
    Password: <input type="password" name="password">
    <br>
    <input type="submit" value="Login" class="-fill -blue">
  </form>
</body>
</html>
