<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <p1>hello world</p1><br/>
    <a href="hello.action">hello world</a><br/>
    <a href="demo1.action">demo1Action:实现action接口</a><br/>
    <a href="demo2.action">demo2Action:继承了ActionSupport类</a><br/>

    <a href="otherMethod.action">指定了action标签中的method方法，使用了不同的方法</a><br/>

    <a href="user_add.action">user_add</a><br/>
    <a href="user_search.action">user_search</a><br/>
    <a href="Book_add.action">Book_add</a><br/>
    <a href="Book_update.action">Book_update</a><br/>
    <a href="redirectType.action">set result type redirect</a><br/>
    <a href="dispatcherType.action">set result type dispatcher</a><br/>
    <%-- 根据感叹号后面的字符，动态寻找对应的方法 --%>
    <a href="dynamic!test.action">use dynamic to attach action</a><br/>

    <a href="result1.action">result1</a><br/>
    <a href="result2.action">result2</a><br/>

</body>
</html>