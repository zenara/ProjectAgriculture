<%-- 
    Document   : login
    Created on : Apr 16, 2016, 10:36:20 AM
    Author     : Chathurika Senani
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/MainStyle.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:700|Raleway|Open+Sans' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>
        <title>JSP 
            Page</title>
    </head>
    <body>
        <jsp:include page="../../PAGES/OTHER/loginTop.jsp"></jsp:include>
            <br/>
            <br/>
            <br/>
            <br/>
            <div class="container">
                <div class="head-line"><center>Library Management System</center></div>
                <br/>
                <center><p style="font-family: 'Indie Flower', cursive;font-size: 20px">I’m hoping to be an active and a hardworking asset for the organization that I represent, with<br/>new ideas, skills and performances that would</p></center>
                <br/>
                <div class="row">
                    <div class="col-md-12">
                        <div class="login-div">
                            <div class="member-login">Member Login</div>

                            <br/>
                        <form:form action="checkmember" method="POST" modelAttribute="memberlogin">
                            <form:input class="form-control text-f" style="border-radius: 0px" path="id" placeholder="Member ID"></form:input>

                            <form:input class="form-control text-f" style="border-radius: 0px"  path="password" placeholder="Password"></form:input>

                                <input style="margin-top: 5px;width: 100%;margin: 10px"  type="submit" class="btn btn-primary" value="LOGIN"/>
                        </form:form>
                        <br/>
                        <a href="signup">Create new account?</a>
                        <br/>
                        <br/>
                        <c:if test="${msg eq 'PASSWORD'}">
                            <div class="error-msg">PASSWORD OR ID IS INCORRECT</div>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>


        <jsp:include page="../../PAGES/OTHER/homeBottom.jsp"></jsp:include>
    </body>
</html>
