<%-- 
    Document   : ailist
    Created on : Sep 1, 2016, 6:54:58 PM
    Author     : Chathurika Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="../../PAGES/top.jsp"></jsp:include>
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
