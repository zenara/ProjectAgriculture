<%-- 
    Document   : paddyMajor
    Created on : Aug 29, 2016, 8:52:10 AM
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
        <link href="CSS/materializeExtracted.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/extracted.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="../../PAGES/top.jsp"></jsp:include><br/><br/><br/><br/><br/>

            <div class="col-md-3">
                Major Scheme<br/><br/>
                <form:form action="addrainfed" method="POST" modelAttribute="rainfed">
                <%--year--%>
                <form:select class="form-control text-f" style="border-radius: 0px" path="yearId" placeholder="Year">
                    <c:forEach items="${years}" var="result">
                        <form:option value="${result.yearId}">${result.yearRef}</form:option>
                    </c:forEach>
                </form:select>
                <%--month--%>
                <form:select class="form-control text-f" style="border-radius: 0px" path="monthId" placeholder="Month">
                    <c:forEach items="${months}" var="result">
                        <form:option value="${result.monthId}">${result.monthName}</form:option>
                    </c:forEach>
                </form:select>
                <%--variety--%>
                <form:select class="form-control text-f" style="border-radius: 0px" path="varietyId" placeholder="Variety">
                    <c:forEach items="${varieties}" var="result">
                        <form:option value="${result.varietyId}">${result.varietyName}</form:option>
                    </c:forEach>
                </form:select>

                <form:input class="form-control text-f" style="border-radius: 0px" path="id" type="hidden"/>
                <form:input class="form-control text-f" style="border-radius: 0px" path="monthlyProgress" placeholder="Progress for the month"/>
                <input class="btn"  style="margin-top: 5px;width: 100%;margin: 10px; background-color: #00cc99;color: white" type="submit" value="ADD">
            </form:form>
        </div>
        <div class="col-md-3">
            Minor Scheme<br/><br/>
            <form:form action="addrainfed" method="POST" modelAttribute="rainfed">
                <%--year--%>
                <form:select class="form-control text-f" style="border-radius: 0px" path="yearId" placeholder="Year">
                    <c:forEach items="${years}" var="result">
                        <form:option value="${result.yearId}">${result.yearRef}</form:option>
                    </c:forEach>
                </form:select>
                <%--month--%>
                <form:select class="form-control text-f" style="border-radius: 0px" path="monthId" placeholder="Month">
                    <c:forEach items="${months}" var="result">
                        <form:option value="${result.monthId}">${result.monthName}</form:option>
                    </c:forEach>
                </form:select>
                <%--variety--%>
                <form:select class="form-control text-f" style="border-radius: 0px" path="varietyId" placeholder="Variety">
                    <c:forEach items="${varieties}" var="result">
                        <form:option value="${result.varietyId}">${result.varietyName}</form:option>
                    </c:forEach>
                </form:select>

                <form:input class="form-control text-f" style="border-radius: 0px" path="id" type="hidden"/>
                <form:input class="form-control text-f" style="border-radius: 0px" path="monthlyProgress" placeholder="Progress for the month"/>
                <input class="btn"  style="margin-top: 5px;width: 100%;margin: 10px; background-color: #00cc99;color: white" type="submit" value="ADD">
            </form:form>
        </div>
        <div class="col-md-3">
            Rainfed Scheme<br/><br/>
            <form:form action="addrainfed" method="POST" modelAttribute="rainfed">
                <%--year--%>
                <form:select class="form-control text-f" style="border-radius: 0px" path="yearId" placeholder="Year">
                    <c:forEach items="${years}" var="result">
                        <form:option value="${result.yearId}">${result.yearRef}</form:option>
                    </c:forEach>
                </form:select>
                <%--month--%>
                <form:select class="form-control text-f" style="border-radius: 0px" path="monthId" placeholder="Month">
                    <c:forEach items="${months}" var="result">
                        <form:option value="${result.monthId}">${result.monthName}</form:option>
                    </c:forEach>
                </form:select>
                <%--variety--%>
                <form:select class="form-control text-f" style="border-radius: 0px" path="varietyId" placeholder="Variety">
                    <c:forEach items="${varieties}" var="result">
                        <form:option value="${result.varietyId}">${result.varietyName}</form:option>
                    </c:forEach>
                </form:select>

                <form:input class="form-control text-f" style="border-radius: 0px" path="id" type="hidden"/>
                <form:input class="form-control text-f" style="border-radius: 0px" path="monthlyProgress" placeholder="Progress for the month"/>
                <input class="btn"  style="margin-top: 5px;width: 100%;margin: 10px; background-color: #00cc99;color: white" type="submit" value="ADD">
            </form:form>
        </div>
        <div class="col-md-3">
            <b>Target: <label>1000</label></b><br/>
            <b>Average Yield: <label>800</label></b>
        </div>
    </body>
</html>
