<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <title>form summit</title>
</head>
<body>
  <h1>this is alipay com</h1>
  <!- 页面写错将导致后台获取不到数据，name要和后台model一样，input中无逗号分隔-->
 <form method="POST">
     my First name : <input type="text" name="fistName" /> <br>
     my  Last name :  <input type="text" name="lastName" /> <br>
     my  Password:    <input type="password" name="passWord" /> <br>
     <input type="submit" value="register">
 </form>
</body>
</html>
