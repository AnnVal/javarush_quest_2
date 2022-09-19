<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="true"%>

<html>
<head>
    <<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">


</head>

<body>

<h2>Привет! Как тебя зовут?</h2>
<form action="${pageContext.request.contextPath}/start" method="post">
    <div >
        <label for="name">Меня зовут</label>
        <input type="text" id="name" name="username">
    </div>
    <div class="button">
        <button type="submit" class="btn btn-info">Вперед</button>
    </div>
</form>


</body>
</html>
