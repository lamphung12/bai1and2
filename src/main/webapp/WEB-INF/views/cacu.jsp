<%--
  Created by IntelliJ IDEA.
  User: Windows 10
  Date: 6/13/2022
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<form action="/caculator"method="post">
    <input type="number" name="number1">
    <input type="number" name="number2">
    <select name="opera" id="">
        <option value="+" name="addition">Addition(+)</option>
        <option value="-" name="subtraction">Subtraction(-) </option>
        <option value="*" name="multiplication"> Multiplication(*)</option>
        <option value="/" name="division">Division(/) </option>
    </select>
    <input type="submit" value="=">
</form>
<h1>Result Division : ${result}</h1>
</body>
</html>
