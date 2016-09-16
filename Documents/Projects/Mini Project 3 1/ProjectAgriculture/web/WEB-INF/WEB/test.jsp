<%-- 
    Document   : test
    Created on : Sep 14, 2016, 10:43:20 PM
    Author     : Chathurika Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form action="addDistrict" method="POST" modelAttribute="district">
                    <form:select class="form-control" style="border-radius: 0px" placeholder="ADA Zone" path="adaid">
                        <c:forEach items="${adas}" var="result">
                            <form:option value="${result.adaid}">${result.adaname}</form:option>
                        </c:forEach>
                    </form:select>
                    <form:input path="districtid" type="hidden"></form:input>
                    <form:input path="districtname" placeholder="District Name:"></form:input>
                        <button type="submit" class="btn btn-app"><i class="material-icons md-18" style="font-size:1.0em;">mode_edit</i></button>
                </form:form>
    </body>
</html>
