<%-- 
    Document   : ailist
    Created on : Sep 1, 2016, 6:54:58 PM
    Author     : Chathurika Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/MainStyle.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/extracted.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet">
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
                            <th>ADA</th>
                            <th>DISTRICT</th>
                            <th>DS</th>
                            <th>ASC</th>
                            <th>RANGE</th>
                            <th>NAME</th>
                            <th>NIC</th>
                            <th>TELEPHONE NO</th>
                            <th>EMAIL</th>
                        </tr>
                    <c:forEach items="${ais}" var="result">
                        <tr>
                            <td>${result.adaid}</td>
                            <td>${result.districtid}</td>
                            <td>${result.dsid}</td>
                            <td>${result.ascid}</td>
                            <td>${result.airange}</td>
                            <td>${result.ainame}</td>
                            <td>${result.nic}</td>
                            <td>${result.telephoneno}</td>
                            <td>${result.email}</td>
                            <td><button class="btn btn-app"><i class="material-icons md-18" style="font-size:1.0em;">mode_edit</i></button></td>
                        </tr>
                    </c:forEach>
                </table>
            </div></div>
    </body>
</html>
