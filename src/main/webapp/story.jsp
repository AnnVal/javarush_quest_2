<%@ page import="dev.annVald.javarush.quest.Node" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10.09.2022
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">

</head>
<body>
<div class="text-center">
<img src="${pageContext.request.contextPath}/pictures/${storyNode.getPicture()}"  width="600px"  max-height="500px" />
<p class="flex-md-shrink-1" class="lh-lg" class="text-center">${storyNode.getText()}</p>
</div>

<form action="${pageContext.request.contextPath}/story" method="post">
<div class="form-check" class="text-center">
    <input class="form-check-input" type="radio" name="nextNode" id="flexRadioDefault1" value="${storyNode.getNextNodeIdForOption1()}">
    <label class="form-check-label" for="flexRadioDefault1">
        ${storyNode.getOption1Text()}
    </label>
</div>
<div class="form-check" class="text-center">
    <input class="form-check-input" type="radio" name="nextNode" id="flexRadioDefault2" value="${storyNode.getNextNodeIdForOption2()}">
    <label class="form-check-label" for="flexRadioDefault2">
        ${storyNode.getOption2Text()}
    </label>
</div>
    <div class="button" class="text-center">
        <button type="submit" class="btn btn-info">Вперед</button>
    </div>
</form>
</body>
</html>