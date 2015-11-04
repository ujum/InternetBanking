<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><spring:message code="error.label.error"/></title>
</head>
<body>

<spring:message code="label.error.url"/><br/>${url}
<br/>
<spring:message code="label.error.type"/><br/>${trace}
<!--
<c:forEach items="${trace.stackTrace}" var="tracemsg"> ${tracemsg}
</c:forEach>
-->
</body>
</html>
