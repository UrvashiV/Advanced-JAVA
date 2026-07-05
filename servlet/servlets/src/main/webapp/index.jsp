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
            Welcome to Servlet crash course.
        </h1>
       <p>
        This is very informational video about Servlet.
       </p>
       <form action ="<%= application.getContextPath() %>/third" method ="post">
       <input name ="message" type="text" placeholder ="Enter text here"/>
       <button type ="Submit">Submit</button>
       </form>

    </div>
    <script src="<%= application.getContextPath()%>/js/script.js"> </script>
</body>
</html>

