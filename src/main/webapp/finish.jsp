<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11.09.2022
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<html>
<head>
    <<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
</head>
<body>
<div class="text-center">
<img src="${pageContext.request.contextPath}/pictures/${storyNode.getPicture()}" width="600px"  max-height="500px" />
<p class="flex-md-shrink-1" class="lh-lg" class="text-center">${storyNode.getText()}</p>
<p class="flex-lg-wrap-reverse" class="lh-lg" class="text-center">${username}, пока!</p>
</div>
<form action="${pageContext.request.contextPath}/start" method="get">

    <div class="button" class="text-center">
        <button type="submit" class="btn btn-warning">Заново?</button>
    </div>
</form>
</body>
</html>
