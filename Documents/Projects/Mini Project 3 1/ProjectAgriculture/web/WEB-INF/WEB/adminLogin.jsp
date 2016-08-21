<%-- 
    Document   : adminLogin
    Created on : Jul 24, 2016, 7:38:13 PM
    Author     : Chathurika Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/MainStyle.css" rel="stylesheet" type="text/css"/>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">


        <title>Admin Login</title>
    </head>
    <body>
        <jsp:include page="../../PAGES/top.jsp"></jsp:include>
        <div class="col-md-4"></div>
        <div id="adminLogin" class="col-md-3">
            
           <c:if test="${msg eq 'error'}">
               <span class="btn btn-block error-msg" style="color: #c7254e"><b>Authentication Failed!</b></span>
        </c:if><br/> 
        <form:form action="checkadmin" method="POST" modelAttribute="adminlogin">
            <label>Username</label>
            <form:input class="form-control" path="username" placeholder="Username"></form:input>
            <label>Password</label>
            <form:input class="form-control" path="password" placeholder="Password"></form:input><br/>
            <button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;LOGIN</button>
        </form:form>
        <br/>
            
            
        </div>
        <div class="col-md-4"></div>
    </body>
</html>
