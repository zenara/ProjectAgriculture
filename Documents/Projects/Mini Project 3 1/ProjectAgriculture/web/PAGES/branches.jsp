<%-- 
    Document   : branches
    Created on : Aug 8, 2016, 1:09:50 PM
    Author     : Chathurika Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <title>JSP Page</title>
    </head>
    <body>
        <form:form action="addAda" method="POST" modelAttribute="ada">
            <form:input path="adaId"></form:input>
            <form:input class="form-control" placeholder="ADA Zone" path="adaName"></form:input>
            <button type="submit">ADD</button>
        </form:form>
    </body>
</html>
