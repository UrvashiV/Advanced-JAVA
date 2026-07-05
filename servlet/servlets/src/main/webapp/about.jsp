<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8"/>
  <title>
    Welcome to Servlet learning.
  </title>
  <link rel="stylesheet" href=" <%= application.getContextPath() %>/css/style.css" />

</head>
<body>
    <div class="container">
    <%@include file="menu.jsp"%>
        <h1>
            About Substring Technologies.
        </h1>
       <p>
        Substring Technologies provide training related to technologies.
       </p>
    </div>
        <script src="<%= application.getContextPath()%>/js/script.js"> </script>
</body>
</html>

