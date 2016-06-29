<%-- 
    Document   : booklist
    Created on : Apr 20, 2016, 10:05:18 PM
    Author     : Chathurika Senani
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/MainStyle.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/AdminLTE.min.css" rel="stylesheet" type="text/css"/>
        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:700|Raleway|Open+Sans' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="../../PAGES/OTHER/homeTop.jsp"></jsp:include>
        <div><br/><br/><br/><br/><br/><br/><div class="container">
            <table class='table table-bordered'>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>CATEGORY</th>
                    <th>AUTHOR</th>
                    <th>LOCATION</th>
                </tr>
            <c:forEach items="${books}" var="result">
                <tr><form:form action="transaction" method="POST">
                    <td>${result.bookId}</td>
                    <td>${result.bookName}</td>
                    <td>${result.catId.catName}</td>
                    <td>${result.author}</td>
                    <td>${result.location}</td>
                    <td><input type="submit" class="btn btn-primary btn-sm" value="BURROW"></td></form:form>
                </tr>
            </c:forEach>
            </table>
            </div></div>
    </body>
</html>
