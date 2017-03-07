<%--
  Created by IntelliJ IDEA.
  User: Vanches
  Date: 31.03.2016
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>

    <%--Css dependency--%>
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet">
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet">

</head>
<body>

<div class="panel panel-primary edit-panel">

    <div class="panel-body">
        <form:form method="post" modelAttribute="cat" action="/update">

            <form:input type="hidden" path="id" id="id"/>

            <div class="input-group">
                <img src="data:image/png;base64,${cat.image.getByteArrayString()}"/>
            </div>

            <div class="input-group">
                <form:input type="text" path="name" id="name" class="form-control"/>
                <div class="has-error">
                    <form:errors path="name" class="help-inline"/>
                </div>
            </div>

            <div class="input-group">
                <form:input type="text" path="createDate" id="createDate" class="form-control" readonly="true"/>
            </div>

            <div class="input-group">
                <form:input type="text" path="borderColor" id="borderColor" class="form-control"/>
                <div class="has-error">
                    <form:errors path="borderColor" class="help-inline"/>
                </div>
            </div>

            <div class="btn-group" role="group">
                <button type="submit" class="btn btn-success">Save</button>
                <a href="<c:url value='/' />" class="btn btn-warning">Close</a>
            </div>

        </form:form>
    </div>
</div>

</body>
</html>