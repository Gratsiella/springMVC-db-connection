<%-- 
    Document   : all_trainers
    Created on : Feb 23, 2020, 11:40:18 PM
    Author     : gkalf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Trainers</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <script src="/js/main.js" type="text/javascript"></script>
        <link href="/css/main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="jumbotron text-center">
            <h1>All the trainers!</h1>
        </div>

        <div class="container">
            
            <input type="button" value="Add a new Trainer" class="btn btn-outline-danger" 
                   onclick="window.location.href='/trainer/new'; return false;"/>

            <table class="table table-hover table-striped">

                <tr>
                    <th>No.</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Subject</th>
                    <th colspan="2">Action</th>
                </tr>
                <c:forEach items="${trainers}" var="tr">

                    <tr>
                        <td>
                        </td>
                        <td>
                            ${tr.trnFirstname}
                        </td>
                        <td>
                            ${tr.trnLastname}
                        </td>
                        <td>
                            ${tr.trnSubject}
                        </td>
                        <td><a href="preUpdate/${tr.trnId}">Update</a></td>
                        <td><a href="preDelete/${tr.trnId}" onclick="return confirm('Are you sure you want to delete?')">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </body>
</html>
