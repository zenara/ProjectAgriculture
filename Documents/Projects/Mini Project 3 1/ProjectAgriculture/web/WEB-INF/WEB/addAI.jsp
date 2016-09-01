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
                    <form:select class="form-control" style="border-radius: 0px" placeholder="ADA Zone" path="adaid">
                        <c:forEach items="${adas}" var="result">
                            <form:option value="${result.adaid}">${result.adaname}</form:option>
                        </c:forEach>
                    </form:select>


                    <br/><label>District</label>
                    <form:select class="form-control" style="border-radius: 0px" placeholder="District" path="districtid">
                        <c:forEach items="${districts}" var="result">
                            <form:option value="${result.districtid}">${result.districtname}</form:option>
                        </c:forEach>
                    </form:select>


                    <br/><label>Divisional Secretarian</label>
                    <form:select class="form-control" style="border-radius: 0px" placeholder="Divisional Secretarian" path="dsid">
                        <c:forEach items="${dses}" var="result">
                            <form:option value="${result.dsid}">${result.dsname}</form:option>
                        </c:forEach>
                    </form:select>


                    <br/><label>Center</label>
                    <form:select class="form-control" style="border-radius: 0px" placeholder="Center" path="ascid">
                        <c:forEach items="${centers}" var="result">
                            <form:option value="${result.ascid}">${result.ascname}</form:option>
                        </c:forEach>
                    </form:select>


                </div>
                <jsp:include page="../../PAGES/top.jsp"></jsp:include>
                    <div class="col-md-4">  <br/> <br/><br/> 
                    <form:input class="form-control" style="border-radius: 0px" placeholder="AI range" path="airange"></form:input>

                    <form:input class="form-control" style="border-radius: 0px" placeholder="AI name" path="ainame"></form:input>

                    <form:input class="form-control" style="border-radius: 0px" placeholder="NIC" path="nic"></form:input>
                    <c:if test="${nicEr eq 'error'}">
                    <span class="btn btn-block alert-warning" style="color: #c7254e"><b>Incorrect NIC number!</b></span>
                </c:if>

                    <form:input class="form-control" style="border-radius: 0px" placeholder="Telephone no" path="telephoneno"></form:input>

                    <form:input class="form-control" type="email" style="border-radius: 0px" placeholder="Email" path="email"></form:input>
                        <br/>
                        <button type="submit" class="btn btn-round">+</button>
                </form:form>
                <c:if test="${msg eq 'error'}">
                    <span class="btn btn-block alert-warning" style="color: #c7254e"><b>NIC number already exists!</b></span>
                </c:if>


            </div>
            <div class="col-md-3">

                <form:form action="addAda" method="POST" modelAttribute="ada">
                    <form:input path="adaid" type="hidden"></form:input>
                    <form:input path="adaname" placeholder="ADA Name:"></form:input>
                        <button type="submit" class="btn btn-app"><i class="material-icons md-18" style="font-size:1.0em;">mode_edit</i></button>
                </form:form>
                <br/>
                <form:form action="addDistrict" method="POST" modelAttribute="district">
                    <form:select class="form-control" style="border-radius: 0px" placeholder="ADA Zone" path="adaid">
                        <c:forEach items="${adas}" var="result">
                            <form:option value="${result.adaid}">${result.adaname}</form:option>
                        </c:forEach>
                    </form:select>
                    <form:input path="districtid" type="hidden"></form:input>
                    <form:input path="districtname" placeholder="District Name:"></form:input>
                        <button type="submit" class="btn btn-app"><i class="material-icons md-18" style="font-size:1.0em;">mode_edit</i></button>
                </form:form>
                <br/>
                <form:form action="addDS" method="POST" modelAttribute="ds">
                    <form:select class="form-control" style="border-radius: 0px" placeholder="District" path="districtid">
                        <c:forEach items="${districts}" var="result">
                            <form:option value="${result.districtid}">${result.districtname}</form:option>
                        </c:forEach>
                    </form:select>
                    <form:input path="dsid" type="hidden"></form:input>
                    <form:input path="dsname" placeholder="Divisional Secretarian:"></form:input>
                        <button type="submit" class="btn btn-app"><i class="material-icons md-18" style="font-size:1.0em;">mode_edit</i></button>
                </form:form>
                <br/>
                <form:form action="addAscenter" method="POST" modelAttribute="ascenter">
                    <form:select class="form-control" style="border-radius: 0px" placeholder="ASCenter" path="dsid">
                        <c:forEach items="${dses}" var="result">
                            <form:option value="${result.dsid}">${result.dsname}</form:option>
                        </c:forEach>
                    </form:select>
                    <form:input path="ascid" type="hidden"></form:input>
                    <form:input path="ascname" placeholder="Agricultural Service Center:"></form:input>
                        <button type="submit" class="btn btn-app"><i class="material-icons md-18" style="font-size:1.0em;">mode_edit</i></button>
                </form:form>
            </div>
        </div>
    </body>
</html>
