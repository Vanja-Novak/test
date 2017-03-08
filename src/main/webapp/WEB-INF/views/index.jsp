<%--
  Created by IntelliJ IDEA.
  User: Vanches
  Date: 31.03.2016
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>CatPage</title>

    <%--Css dependency--%>
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet">
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet">

    <%--Js dependency--%>
    <link href="<c:url value='/static/js/jquery-1.12.2.min.js' />" rel="script">
    <link href="<c:url value='/static/js/app.js' />" rel="script">


</head>
<body>

<div class="row">

    <c:forEach items="${catList}" var="cats">
        <div class="col-sm-6 col-md-2">
            <div class="thumbnail" style="border-color: ${cats.borderColor}">
                <img src="data:image/png;base64,${cats.image.getByteArrayString()}"/>
                <div class="caption">
                    <h3>${cats.name}</h3>
                    <p>${cats.createDate}</p>
                    <p>
                        <a href="<c:url value='/delete/${cats.id}' />" class="btn btn-danger" role="button">Delete</a>
                        <a href="<c:url value='/edit/${cats.id}' />" class="btn btn-warning" role="button">Edit</a>
                    </p>
                </div>
            </div>
        </div>
    </c:forEach>

    <div class="col-sm-6 col-md-2">
        <a href="<c:url value='/add' />" class="btn btn-primary" role="button" style="margin-top: 180px;">Add</a>
    </div>
</div>

</div>
</body>
</html>
