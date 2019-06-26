<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/5/30
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>submit sucess</title>
</head>
<body>
   <h1>this is you submit result</h1>

   <c:out value ="${spitterKey.fistName}" ></c:out> <br>
   <c:out value ="${spitterKey.lastName}" ></c:out> <br>
   <c:out value ="${spitterKey.passWord}" ></c:out> <br>

</body>
</html>
