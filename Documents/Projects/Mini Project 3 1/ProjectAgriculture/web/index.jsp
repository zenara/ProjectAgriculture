<%-- 
    Document   : index
    Created on : Jul 2, 2016, 11:09:02 PM
    Author     : Chathurika Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="CSS/materialize.min.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/MainStyle.css" rel="stylesheet" type="text/css"/>
        <script src="JS/jquery.js" type="text/javascript"></script>
        
        <script type="text/javascript">
            $(document).ready(function(){
            $('.slider').slider();
            });        
        </script>
        <script src="JS/materialize.min.js" type="text/javascript"></script>
            
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="PAGES/top.jsp"></jsp:include>
        <div class="slider col-md-8">
    <ul class="slides">
      <li>
        <img src="IMG/Dew-On-a-Leaf-Nature-Wallpaper-HD.jpg" alt=""/>
        <div class="caption center-align">
          <h3>This is our big Tagline!</h3>
          <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
        </div>
      </li>
      <li>
          <img src="IMG/autumn-leaves-background-6-facebook-cover-timeline-banner-for-fb.jpg" alt=""/>
        <div class="caption left-align">
          <h3>Left Aligned Caption</h3>
          <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
        </div>
      </li>
      <li>
          <img src="IMG/colorful_leaves-wide.jpg" alt=""/>
        <div class="caption right-align">
          <h3>Right Aligned Caption</h3>
          <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
        </div>
      </li>
      <li>
          <img src="IMG/wallpaper-facebook-cover-water-drop-on-green-leaves.jpg" alt=""/>
        <div class="caption center-align">
          <h3>This is our big Tagline!</h3>
          <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
        </div>
      </li>
    </ul>
  </div>
      
    </body>
</html>

