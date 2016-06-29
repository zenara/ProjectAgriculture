<%-- 
    Document   : managebooks
    Created on : Apr 16, 2016, 3:03:21 PM
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

        <script>
            
        </script>

    </head>
    <body>
        <br/>
        <br/>
        <br/>
        <br/>
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <form:form action="addbook" method="POST" modelAttribute="loadbook">
                        <form:select class="form-control text-f" style="border-radius: 0px" path="catId" placeholder="Category">

                            <c:forEach items="${categories}" var="result">
                                <form:option value="${result.catId}">${result.catName}</form:option>
                            </c:forEach>


                        </form:select>

                        <form:input class="form-control text-f" style="border-radius: 0px" path="bookId" type="hidden" value="0001"/>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="bookName" placeholder="Book Name"/>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="author" placeholder="Author"></form:input>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="page" placeholder="Page"></form:input>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="price" placeholder="Price"></form:input>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="location" placeholder="Location"></form:input>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="description" placeholder="Description"></form:input>
                            <input class="btn btn-primary"  style="margin-top: 5px;width: 100%;margin: 10px" type="submit" value="ADD">
                    </form:form>
                </div>
                <div class="col-md-9">
                    <div class='book'>
                        <br/>
                        <table class='table table-bordered book-table'>
                            <tr>
                                <th>ID</th>
                                <th>NAME</th>
                                <th>CATEGORY</th>
                                <th>AUTHOR</th>
                                <th>LOCATION</th>
                                <th>SHORT DESCRIPTION</th>
                            </tr>

                            <c:forEach items="${books}" var="result">
                                <tr>
                                    <td>${result.bookId}</td><td>${result.bookName}</td><td>${result.catId.catName}</td>
                                    <td>${result.author}</td><td>${result.location}</td>
                                    <td>${result.description}</td>
                                </tr>
                            </c:forEach>

                        </table>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>
