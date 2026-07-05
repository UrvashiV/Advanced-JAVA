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
    <%@ include file="menu.jsp"%>
        <h1>
            Services offered by Substring Technologies.
        </h1>
       <p>
        This page provide you a information about services by Substring Technologies.
       </p>
    </div>
        <script src="<%= application.getContextPath()%>/js/script.js"> </script>
</body>
</html>

