<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>struts2</title>
</head>

<body>
  <h1>Hello World</h1>

  <!-- 查看值栈 -->
  <s:debug/>

  <h2>获取使用setter设置的值</h2>
  <s:property value="useStackSetter"/>
  <s:property value="useStackSetter2"/>

  <h2>获取是用push设置的值</h2>
  <s:property value="[0].top"/>
  <s:property value="[1].top"/>

  <h2>获取在SetStackValueFieldAction中设置的字符串</h2>
  <s:property value="inputString"/>

  <h2>获取值栈中对象的值</h2>
  <s:property value="user.username"/>
  <s:property value="user.password"/>
  <s:property value="user.interest[0]"/>
  <s:property value="user.interest[1]"/>

  <h2>获取值栈中list的值</h2>
  <h3>方法一</h3>
  <s:property value="users[0].username"/>
  <s:property value="users[0].password"/>
  <s:property value="users[0].interest[0]"/>
  <s:property value="users[0].interest[1]"/>


  <s:property value="users[1].username"/>
  <s:property value="users[1].password"/>
  <s:property value="users[1].interest[0]"/>
  <s:property value="users[1].interest[1]"/>

  <h3>方法二</h3>
  <s:iterator value="users">
      <s:property value="username"/>
      <s:property value="password"/>
      <s:property value="interest[0]"/>
      <s:property value="interest[1]"/>
  </s:iterator>

  <h3>方法三</h3>
  <s:iterator value="users" var="user">
      <s:property value="#user.username"/>
      <s:property value="#user.password"/>
      <s:property value="#user.interest[0]"/>
      <s:property value="#user.interest[1]"/>
  </s:iterator>


  <h2>获取值栈中map的值</h2>
  <s:property value="userMap['user1'].username"/>
  <s:property value="userMap['user1'].password"/>
  <s:property value="userMap['user1'].interest[0]"/>
  <s:property value="userMap['user1'].interest[1]"/>

  <s:property value="userMap['user2'].username"/>
  <s:property value="userMap['user2'].password"/>
  <s:property value="userMap['user2'].interest[0]"/>
  <s:property value="userMap['user2'].interest[1]"/>

</body>
</html>