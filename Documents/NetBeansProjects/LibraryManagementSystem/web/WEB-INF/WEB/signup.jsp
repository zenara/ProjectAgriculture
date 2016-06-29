<%-- 
    Document   : signup
    Created on : Apr 16, 2016, 9:45:20 AM
    Author     : Chathurika Senani
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
        <jsp:include page="../../PAGES/OTHER/loginTop.jsp"></jsp:include>
            <br/>
            <br/>
            <br/>
            <br/>
            <div class="container">

            <form:form action="addmember" method="POST" modelAttribute="membersignup">

                <div class="row">
                    <div class="col-md-8">
                        <div class="head-line">
                            <center>Library Management System</center>
                            <br/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <form:input path="memberId" type="hidden" value="0001" placeholder="Your Name"></form:input>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="memberName" placeholder="Your Name"></form:input>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="address" placeholder="Address"></form:input>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="contact" placeholder="Contact"></form:input>
                        </div>
                        <div class="col-md-4">


                        <form:input class="form-control text-f" style="border-radius: 0px" path="nic" placeholder="NIC"></form:input>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="email" placeholder="E-mail"></form:input>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="password" placeholder="Password"></form:input>
                            <input class="btn btn-primary" style="margin: 10px" type="submit" value="SIGN UP"/>

                        <c:if test="${msg eq 'PASSWORD'}">
                            <div class="error-msg" style="margin: 10px">PASSWORD LENGTH IS NOT ENOUGH</div>
                        </c:if>
                    </div>



                </div>





            </form:form>
            <jsp:include page="../../PAGES/OTHER/homeBottom.jsp"></jsp:include>

        </div>
    </body>
</html>
