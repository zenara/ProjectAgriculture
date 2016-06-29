<%-- 
    Document   : index
    Created on : Apr 13, 2016, 8:58:51 PM
    Author     : Chathurika Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/MainStyle.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:700|Raleway|Open+Sans' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>

        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="PAGES/OTHER/homeTop.jsp"></jsp:include>

            <div class="container"> 
                <div class="row">
                    <div class="col-md-12">
                    <jsp:include page="PAGES/OTHER/homeMid.jsp"></jsp:include>
                    </div>
                </div>
            </div>

        <jsp:include page="PAGES/OTHER/homeBottom.jsp"></jsp:include>
    </body>
</html>
