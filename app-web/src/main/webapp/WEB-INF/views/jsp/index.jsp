<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Spring MVC - JSP - Gradle Template</title>
    <spring:url value="/webjars/bootstrap/5.2.3/css/bootstrap.min.css" var="bootstrapCss"/>
    <spring:url value="/resources/core/css/custom.css" var="customCss"/>

    <link href="${bootstrapCss}" rel="stylesheet"/>
    <link href="${customCss}" rel="stylesheet"/>
</head>
<body>

<main>
    <div class="px-4 py-5 my-5 text-center">

        <h1 class="display-5 fw-bold">
            <c:if test="${not empty name}">
                Hello ${name}!
            </c:if>

            <c:if test="${empty name}">
                Welcome!
            </c:if>
        </h1>
        <div class="col-lg-6 mx-auto">
            <p class="lead mb-4"> Spring MVC - JSP - Gradle Template!</p>
        </div>
    </div>
</main>

<spring:url value="/webjars/bootstrap/5.2.3/js/bootstrap.min.js" var="bootstrapJs"/>
<spring:url value="/resources/core/js/custom.js" var="customJs"/>

<script src="${bootstrapJs}"></script>
<script src="${customJs}"></script>

</body>
</html>