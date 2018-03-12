<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <h1>hello world</h1><br/>


    <h2>form1 use ActionContext</h2><br/>
    <form action="useActionContext.action" id="form1">
        username: <input type="text" name="username"><br/>
        password: <input type="password" name="password"><br/>
        interest: 1<input type="checkbox" name="interest" value="1">
                  2<input type="checkbox" name="interest" value="2"><br/>
        <input type="submit" value="submit">
    </form>

    <h2>form use ServletActionContext</h2><br/>
    <form action="useServletActionContext.action" id="form2">
        username: <input type="text" name="username"><br/>
        password: <input type="password" name="password"><br/>
        interest: 1<input type="checkbox" name="interest" value="1">
        2<input type="checkbox" name="interest" value="2"><br/>
        <input type="submit" value="submit">
    </form>

    <h2>form implements ServletRequestWare</h2><br/>
    <form action="useServletRequestWare.action" id="form3">
        username: <input type="text" name="username"><br/>
        password: <input type="password" name="password"><br/>
        interest: 1<input type="checkbox" name="interest" value="1">
        2<input type="checkbox" name="interest" value="2"><br/>
        <input type="submit" value="submit">
    </form>

    <h2>form use attribute encapsulation</h2><br/>
    <form action="useAttributeEncapsulation.action" id="form4">
        username: <input type="text" name="username"><br/>
        password: <input type="password" name="password"><br/>
        interest: 1<input type="checkbox" name="interest" value="1">
        2<input type="checkbox" name="interest" value="2"><br/>
        <input type="submit" value="submit">
    </form>

    <h2>form use ModelDriver</h2><br/>
    <form action="useModelDriver.action" id="form5">
        username: <input type="text" name="username"><br/>
        password: <input type="password" name="password"><br/>
        interest: 1<input type="checkbox" name="interest" value="1">
        2<input type="checkbox" name="interest" value="2"><br/>
        <input type="submit" value="submit">
    </form>

    <h2>form use expression encapsulation</h2><br/>
    <form action="useExpressionEncapsulation.action" id="form6">
        <!-- 使用 对象名.属性名，对象名必须与actino中声明的一致，对象的属性名，必须和实体类中声明的一致 -->
        username: <input type="text" name="user.username"><br/>
        password: <input type="password" name="user.password"><br/>
        interest: 1<input type="checkbox" name="user.interest" value="1">
        2<input type="checkbox" name="user.interest" value="2"><br/>
        <input type="submit" value="submit">
    </form>

    <h2>form set to list</h2><br/>
    <form action="getList.action" id="form7">
        <h3>user1</h3>
        <!-- list[x].yyy  x表示第几个，yyy表示属性名 -->
        username: <input type="text" name="list[0].username"><br/>
        password: <input type="password" name="list[0].password"><br/>
        interest: 1<input type="checkbox" name="list[0].interest" value="1">
        2<input type="checkbox" name="list[0].interest" value="2"><br/>

        <h3>user2</h3>
        username: <input type="text" name="list[1].username"><br/>
        password: <input type="password" name="list[1].password"><br/>
        interest: 1<input type="checkbox" name="list[1].interest" value="1">
        2<input type="checkbox" name="list[1].interest" value="2"><br/>

        <h3>user3</h3>
        username: <input type="text" name="list[2].username"><br/>
        password: <input type="password" name="list[2].password"><br/>
        interest: 1<input type="checkbox" name="list[2].interest" value="1">
        2<input type="checkbox" name="list[2].interest" value="2"><br/>

        <input type="submit" value="submit">
    </form>


    <h2>form set to map</h2><br/>
    <form action="getMap.action" id="form8">
        <h3>user1</h3>
        <!-- map['xxx'].yyy, xxx表示key,yyy表示属性名 -->
        username: <input type="text" name="map['one'].username"><br/>
        password: <input type="password" name="map['one'].password"><br/>
        interest: 1<input type="checkbox" name="map['one'].interest" value="1">
        2<input type="checkbox" name="map['one'].interest" value="2"><br/>

        <h3>user2</h3>
        username: <input type="text" name="map['two'].username"><br/>
        password: <input type="password" name="map['two'].password"><br/>
        interest: 1<input type="checkbox" name="map['two'].interest" value="1">
        2<input type="checkbox" name="map['two'].interest" value="2"><br/>

        <h3>user3</h3>
        username: <input type="text" name="map['three'].username"><br/>
        password: <input type="password" name="map['three'].password"><br/>
        interest: 1<input type="checkbox" name="map['three'].interest" value="1">
        2<input type="checkbox" name="map['three'].interest" value="2"><br/>

        <input type="submit" value="submit">
    </form>
</body>
</html>