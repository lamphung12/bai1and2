<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Email Validation</title>
</head>
<body>
<h1>
    Email Validate
</h1>
<h1>Email : ${message}</h1>
<form action="/validate" method="post">
    <input type="text" name = "email">
    <input type="submit" value="Validate">
</form>
</body>
</html>