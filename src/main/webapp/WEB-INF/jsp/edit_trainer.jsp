<%-- 
    Document   : edit_trainer
    Created on : Feb 24, 2020, 12:58:34 PM
    Author     : gkalf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Trainer</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <script src="/js/main.js" type="text/javascript"></script>
        <link href="/css/main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="jumbotron text-center">
            <h2>Update a trainer</h2>
        </div>

        <div class="container">

            <form:form action="/trainer/new" method="post" modelAttribute="trainer">
                <form:hidden path="trnId"/>
                <div class="row">
                    <div class="col"></div>
                    <div class="col">
                        <div class="form-group">
                            <label for="firstName">First Name:</label>
                            <form:input path="trnFirstname" id="firstName" cssClass="form-control"/>
                            <form:errors path="trnFirstname" cssClass="error"/>
                        </div>
                    </div>
                    <div class="col"></div>
                </div>

                <div class="row">
                    <div class="col"></div>
                    <div class="col">
                        <div class="form-group">
                            <label for="lastName">Last Name:</label>
                            <form:input path="trnLastname" id="lastName" cssClass="form-control"/>
                            <form:errors path="trnLastname" cssClass="error"/>
                            </div>
                    </div>
                    <div class="col"></div>
                </div>

                <div class="row">
                    <div class="col"></div>
                    <div class="col">
                        <div class="form-group">
                            <label for="subject">Subject:</label>
                            <form:input path="trnSubject" id="subject" cssClass="form-control"/>
                        </div>
                    </div>
                    <div class="col"></div>
                </div>
            </div>

            <div class="container">

                <div class="row">
                    <div class="col"></div>
                    <div class="col text-center">
                        <div class="row">
                            <div class="col">
                                <button type="submit" class="btn btn-dark">Submit</button>
                            </div>
                            <div class="col">
                                <button type="reset" class="btn btn-dark">Reset</button>
                            </div>
                            <div class="col">
                                <button type="button" class="btn btn-dark" onclick="goBack()">Back</button>
                            </div>
                        </div>
                    </div>
                    <div class="col"></div>
                </div> 
            </div>
        </form:form>

        <div class="container">
            <a href="${pageContext.request.contextPath}/trainer/list">Back to list</a>
        </div>
    </body>
</html>
