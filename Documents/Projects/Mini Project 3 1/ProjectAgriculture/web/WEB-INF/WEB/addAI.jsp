<%-- 
    Document   : addAI
    Created on : Aug 6, 2016, 6:50:34 PM
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
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet">
        
        
        <title>Add AI</title>
    </head>
    <body>
        <div id="addai" class="container row">
        <div class="col-md-4">
        <jsp:include page="../../PAGES/top.jsp"></jsp:include>
        <h6><b>Add Agricultural Instructors</b></h6>
        
        <form:form action="addAI" method="POST" modelAttribute="AI">
            <br/><label>ADA Zone</label>
            <form:select class="form-control" style="border-radius: 0px" placeholder="ADA Zone" path="adaId">
                <c:forEach items="${adas}" var="result">
                    <form:option value="${result.adaId}">${result.adaName}</form:option>
                </c:forEach>
            </form:select>
            
            
            <br/><label>District</label>
            <form:select class="form-control" style="border-radius: 0px" placeholder="District" path="districtId">
                <c:forEach items="${districts}" var="result">
                    <form:option value="${result.districtId}">${result.districtName}</form:option>
                </c:forEach>
            </form:select>
            
            
            <br/><label>Divisional Secretarian</label>
            <form:select class="form-control" style="border-radius: 0px" placeholder="Divisional Secretarian" path="ds">
                <c:forEach items="${dses}" var="result">
                    <form:option value="${result.dsId}">${result.dsName}</form:option>
                </c:forEach>
            </form:select>
            
            
            <br/><label>Center</label>
            <form:select class="form-control" style="border-radius: 0px" placeholder="Center" path="center">
                <c:forEach items="${centers}" var="result">
                    <form:option value="${result.ascId}">${result.ascName}</form:option>
                </c:forEach>
            </form:select>
            
            
        </div>
        <jsp:include page="../../PAGES/top.jsp"></jsp:include>
        <div class="col-md-4">  <br/> <br/><br/> 
            <form:input class="form-control" style="border-radius: 0px" placeholder="AI range" path="aIrange"></form:input>
        
            <form:input class="form-control" style="border-radius: 0px" placeholder="AI name" path="aIname"></form:input>
            
            <form:input class="form-control" style="border-radius: 0px" placeholder="NIC" path="nic"></form:input>
            
            <form:input class="form-control" style="border-radius: 0px" placeholder="Telephone no" path="telephoneno"></form:input>
            
            <form:input class="form-control" style="border-radius: 0px" placeholder="Email" path="email"></form:input>
            <br/>
            <button type="submit" class="btn btn-round">+</button>
        </form:form>
            
            
        </div>
        <div class="col-md-3">
            
            <form:form action="addAda" method="POST" modelAttribute="ada">
                <form:input path="adaId" type="hidden" value="0001"></form:input>
                <form:input path="adaName" placeholder="ADA Name:"></form:input>
                <button type="submit" class="btn btn-app"><i class="material-icons md-18">mode_edit</i></button>
            </form:form>
                <br/>
        <form:form action="addDistrict" method="POST" modelAttribute="district">
            <form:select class="form-control" style="border-radius: 0px" placeholder="ADA Zone" path="adaId">
                <c:forEach items="${adas}" var="result">
                    <form:option value="${result.adaId}">${result.adaName}</form:option>
                </c:forEach>
            </form:select>
                <form:input path="districtId" type="hidden" value="0001"></form:input>
                <form:input path="districtName" placeholder="District Name:"></form:input>
                <button type="submit" class="btn btn-app"><i class="material-icons md-18">mode_edit</i></button>
        </form:form>
                <br/>
                <form:form action="addDS" method="POST" modelAttribute="ds">
            <form:select class="form-control" style="border-radius: 0px" placeholder="District" path="districtId">
                <c:forEach items="${districts}" var="result">
                    <form:option value="${result.districtId}">${result.districtName}</form:option>
                </c:forEach>
            </form:select>
                <form:input path="dsId" type="hidden" value="0001"></form:input>
                <form:input path="dsName" placeholder="Divisional Secretarian:"></form:input>
                <button type="submit" class="btn btn-app"><i class="material-icons md-18">mode_edit</i></button>
        </form:form>
                <br/>
                <form:form action="addAscenter" method="POST" modelAttribute="ascenter">
            <form:select class="form-control" style="border-radius: 0px" placeholder="ASCenter" path="dsId">
                <c:forEach items="${dses}" var="result">
                    <form:option value="${result.dsId}">${result.dsName}</form:option>
                </c:forEach>
            </form:select>
                <form:input path="ascId" type="hidden" value="0001"></form:input>
                <form:input path="ascName" placeholder="Divisional Secretarian:"></form:input>
                <button type="submit" class="btn btn-app"><i class="material-icons md-18">mode_edit</i></button>
        </form:form>
        </div>
        </div>
    </body>
</html>
