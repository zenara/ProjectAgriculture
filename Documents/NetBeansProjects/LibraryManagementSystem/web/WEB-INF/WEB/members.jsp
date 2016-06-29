<%-- 
    Document   : members
    Created on : Apr 19, 2016, 9:59:32 AM
    Author     : Chathurika Senani
--%>

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
        
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="../../PAGES/OTHER/homeTop.jsp"></jsp:include>
        <div class="col-md-9">
        <table class="table table-bordered">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>ADDRESS</th>
                <th>CONTACT</th>
                <th>NIC</th>
                <th>Email</th>
            </tr>
            
                <c:forEach items="${memberlist}" var="result">
                    <tr>
                    <td>${result.memberId}</td>
                    <td>${result.memberName}</td>
                    <td>${result.address}</td>
                    <td>${result.contact}</td>
                    <td>${result.nic}</td>
                    <td>${result.email}</td>
                    </tr>
                </c:forEach>
            
        </table>
        </div>
    </body>
</html>
