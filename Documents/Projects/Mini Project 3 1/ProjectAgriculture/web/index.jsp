<%-- 
    Document   : index
    Created on : Jul 2, 2016, 11:09:02 PM
    Author     : Chathurika Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <link href="CSS/materialize.min.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/extracted.css" rel="stylesheet" type="text/css"/>

        <script src="JS/jquery.js" type="text/javascript"></script>
        <script src="JS/bootstrap.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('.slider').slider();
            });
        </script>
        <script src="JS/materialize.min.js" type="text/javascript"></script>

        <title>JSP Page</title>
    </head>
    <body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">
        <jsp:include page="PAGES/top.jsp"></jsp:include><br/><br/>
        <div class="slider col-md-8">
            <ul class="slides">
                <li>
                    <img src="IMG/Dew-On-a-Leaf-Nature-Wallpaper-HD.jpg" alt=""/>
                    <div class="caption center-align">
                        <h3>Department Of Agriculture</h3>
                        <h5 class="light grey-text text-lighten-3">North Central Province</h5>
                    </div>
                </li>
                <li>
                    <img src="IMG/colorful_leaves-wide.jpg" alt=""/>
                    <div class="caption right-align">
                        <h3>The Nature it creates</h3>
                        <h5 class="light grey-text text-lighten-3">If you truly love nature,you will find beauty everywhere</h5>
                    </div>
                </li>
                <li>
                    <img src="IMG/wallpaper-facebook-cover-water-drop-on-green-leaves.jpg" alt=""/>
                    <div class="caption center-align">
                        <h3>Green for a healthy life</h3>
                        <h5 class="light grey-text text-lighten-3">It's the way of living</h5>
                    </div>
                </li>
                <li>
                    <img src="IMG/autumn-leaves-background-6-facebook-cover-timeline-banner-for-fb.jpg" alt=""/>
                    <div class="caption left-align">
                        <h3>Seasons for a change!</h3>
                        <h5 class="light grey-text text-lighten-3">Harvest the best on right time</h5>
                    </div>
                </li>
            </ul>
        </div><br/><br/>
        <div id="about" class="container-fluid">
            <div class="row">
                <div class="col-md-8">
                    <h5>About Department of Agriculture</h5><br/>
                    <p>The Department of Agriculture (DOA) functions under the Ministry of Agriculture and the DOA is one of the largest government departments with a high profile community of agricultural scientists and a network of institutions covering different agro ecological regions island wide.

                        The objectives of the DOA are focused on maintaining and increasing productivity and production of the food crop sector for the purpose of enhancing the income and living condition of the farmer and making food available at affordable prices to the consumer. The major functions of the DOA include research, extension, production of seed and planting material, regulatory services related to plant quarantine, soil conservation and pesticides.

                        The management structure of DOA consists of three research institutes; Rice Research and Development Institute. Field Crops Research and Development Institute, Horticultural Crops Research and Development Institute and six technical service centers; Seed Certification and Plant Protection Centre, Seed and Planting Material Development Center, Extension and Training Centre, Socio Economics and Planning Center, Natural Resource Management Center, Progress Monitoring and Evaluation Unit together with three support services; Engineering Division, Finance Division and Administration Division.
                    </p>
                </div>
                <div class="col-sm-4"><br/>
                    <span class="glyphicon glyphicon-signal logo"></span>
                </div>
            </div>
        </div>
        <div class="container-fluid bg-grey">
            <div class="row">
                <div class="col-sm-4">
                    <span class="glyphicon glyphicon-globe logo"></span>
                </div>
                <div class="col-sm-8">
                    <h2>Our Values</h2>
                    <p><strong><b>VISION:</b></strong> Achieve excellence in agriculture for national prosperity.</p>
                    <p><strong><b>MISSION:</b></strong> Achieve an equitable and sustainable agriculture development through development
                        and dissemination of improved agriculture technology.</p>
                    <p><strong><b>Main Functions:</b></strong><br/>Research <br/>
                        Extension <br/>
                        Seed and planting material production <br/>
                        Regulatory Services <br/>
                        Plant Protection Act<br/>
                        Soil Conservation Act<br/>
                        Control of Pesticide Act<br/>
                        Seed Act</p>
                </div>
            </div>
        </div>
        <div id="crops" class="container-fluid">
            <div class="row">
                <div class="col-md-8">
                    <h5>Crops we manage</h5><br/>
                    <p>There has been significant contribution for increased production of important crops and commodities in Sri Lanka during last five decades.  The crop improvement programme in the country played a leading role for this achievement. The Department of Agriculture (DOA) has always been the main stake holder in development of crop varieties for the country.
                        In order to release good, appropriate new varieties DOA has standard and uniform testing and releasing procedure. Further, it provided the regulations needed for varietal release with the support from ‘DUS’ test conducted by Seed Certification Services (SCS) of DOA.

                        Varietal   Release Committee (VRC) on release of crop varieties for the country is chaired by the Director General of Agriculture (DGA) of the DOA. He appointed a secretary for the VRC. The members of the releasing committee consist with the technical committee of VRC appointed by DGA, Directors Deputy Directors and senior officials from Research, Extension and Training, Seed Certification Services, Seed and Planting Materials, Plant Protection Services and Socio economic division of DOA.

                        The researchers, mostly breeders who developed or identified the germplasm or new line will present all the required data and chairperson allows discussing the data with the audience. At last the chairperson will recommend/release or reject the variety considering all the comments. 
                    </p><br/>
                    <form action="AddProgress">
                    <button type="submit" class="btn btn-default btn-lg">Get in Touch</button>
                    </form>
                </div>
                <div class="col-sm-4"><br/>
                    <span class="glyphicon glyphicon-leaf logo"></span>
                </div>
            </div>
        </div>
        <div id="contact" class="container-fluid bg-grey">
            <h2 class="text-center">CONTACT</h2>
            <div class="row">
                <div class="col-sm-4">
                    <span class="glyphicon glyphicon-earphone logo"></span>
                </div>
                <div class="col-sm-5">
                    <p>Contact us and we'll get back to you within 24 hours.</p>
                    <p><span class="glyphicon glyphicon-map-marker"></span> North Central Province, Sri Lanka</p>
                    <p><span class="glyphicon glyphicon-phone"></span> +94 252222189</p>
                    <p><span class="glyphicon glyphicon-envelope"></span> ncpagri@gmail.com</p>
                </div>

            </div>
        </div>
        <footer class="container-fluid text-center">
            <a href="#myPage" title="To Top">
                <span class="glyphicon glyphicon-chevron-up"></span>
            </a>
            <p>Chathurika Jayathilake | All right reserved</p>
        </footer>

    </body>
</html>

