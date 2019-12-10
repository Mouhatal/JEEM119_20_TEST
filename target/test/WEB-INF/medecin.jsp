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
        <input hidden="hidden" name="action" value="add">
        <input type="text" name="nom" placeholder="Nom" required="required"><br>
        <input type="text" name="prenom" placeholder="Prenom" required="required"><br>
        <input type="text" name="matricule" placeholder="matricule" required="required"><br>
        <input type="email" name="mail" placeholder="Email" required="required"><br>
        <input type="tel" name="tel" placeholder="Telephone" required="required"><br>
        <input type="date" name="datenaiss" required="required"><br>
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
        <button type="submit" value="enregistrer">Enregistrer</button>
    </form>
</body>
</html>
