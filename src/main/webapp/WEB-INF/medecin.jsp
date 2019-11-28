<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 27/11/2019
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="">
        <select name="service">
            <c:forEach items="${requestScope.services}" var="srv">
                <option value="${srv.id}">${srv.libelle}</option>
            </c:forEach>
        </select><br>
        <select name="specialite" multiple>
            <c:forEach items="${requestScope.specialites}" var="sp">
                <option value="${sp.id}">${sp.libelle}</option>
            </c:forEach>
        </select><br>
    </form>
</body>
</html>
