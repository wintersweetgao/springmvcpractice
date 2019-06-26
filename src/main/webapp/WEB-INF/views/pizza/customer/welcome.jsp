<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pizza</title>
</head>
<body>
    <h2>Welcome to Spizza!!</h2>
    <!--这个是spring 的form tag-->
    <form:form>
        <input type="hidden" name ="_flowExecutionKey" value="${flowExecutionKey}">
        <input type="text" name="phoneNumber"> <br/>
        <input type="submit" name="_eventId_phoneEntered" value="Look up Customer">
    </form:form>
</body>
</html>
