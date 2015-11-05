<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<spring:message code="createaccount.label.amountofmoney" var="money"/>
<spring:message code="createaccount.label.accountnumber" var="number"/>
<spring:message code="action.button.delete" var="deleteButton"/>
<spring:url value="${pageContext.servletContext.contextPath}" var="path"/>

<html>
<head>
    <title><spring:message code="showaccounts.label.show"/></title>
    <link href="<c:url value="../../../resources/css/style.css" />" rel="stylesheet">
</head>
<body>
<div class="container full-height">
    <jsp:include page="common/navUser.jsp"/>
    <h1 class="head-inf"><spring:message code="showaccounts.label.accounts"/></h1>
    <c:if test="${!empty accountList}">
        <div class="row">
            <div class="col-sm-3 col-sm-offset-2 head-column">${number}</div>
            <div class="col-sm-3 col-sm-offset-2 head-column">${money}</div>
            <c:forEach items="${accountList}" var="account">
                <div class="col-sm-3 col-sm-offset-2 account-inf">${account.accountNumber}</div>
                <div class="col-sm-3 col-sm-offset-2 account-inf">${account.amountOfMoney}</div>
            </c:forEach>
        </div>
    </c:if>
</div>
</body>
</html>