<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>list</title>
</head>
<body>
    <h1>list:</h1>
    <s:iterator value="list" var="str">
        <s:property value="#str"/>
    </s:iterator>
</body>
</html>
