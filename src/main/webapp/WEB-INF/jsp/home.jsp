<%-- 
    Document   : home
    Created on : Feb 23, 2020, 7:48:42 PM
    Author     : gkalf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <script src="/js/main.js" type="text/javascript"></script>
        <link href="/css/main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="jumbotron text-center">
            <h2>Home Page</h2>
        </div>
        <div class="container">
            <div class="row">
                <div class="col">

                    <buttton class="btn btn-danger">
                        <a href="trainer/new" style="color: black; font-weight: bold;">Insert a new trainer</a>
                    </buttton>

                </div>
                <div class="col">

                    <button class="btn btn-danger">
                        <a href="trainer/list" style="color: black; font-weight: bold;">Show the trainers' table</a>
                    </button>

                </div>
            </div>
        </div>
    </body>
</html>
