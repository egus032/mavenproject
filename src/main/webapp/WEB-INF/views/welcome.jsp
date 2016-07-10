<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- Bootstrap core CSS -->
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <!-- Custom styles for this template -->
        <link href="static/css/style.css" rel="stylesheet" type="text/css">
    <title>HelloWorld page</title>
    </head>
    <body>
        <header><jsp:include page="/WEB-INF/views/header.jsp"/></header>
        
        <div class="main-content"><h3>Greeting : ${greeting}</h3></div>
        
        <footer><jsp:include page="/WEB-INF/views/footer.jsp"/></footer>
        <!-- Bootstrap core JavaScript -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        
    </body>
</html>