<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page isELIgnored="false"%>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Form</title>
  </head>

<body class="" style ="background: #e2e2e2;">

<div class="container mt-4">
    <div class="row">
        <div class="col-md-8 offset-md-2">
            <div class="card">
                <div class="card-body">
                <h3 class="text-center"> Complex Form </h3>
                <div class="alert alert-danger" role="alert">
                    <form:errors path="student.*" />
                </div>

                    <form action ="formHandler" method="post">
                         <div class="form-group">
                            <label for="exampleFormControlInput1">Your Name</label>
                            <input name ="name" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter your name">
                            <small id="nameHelp" class="form-text text-muted"> We will never share your name with anyone else.</small>
                          </div>
                          <div class="form-group">
                             <label for="exampleFormControlInput1">Your ID</label>
                             <input name ="id" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter your ID">

                          </div>
                          <div class="form-group">
                              <label for="exampleFormControlInput1">Your DOB</label>
                              <input name ="dob" type="text" class="form-control" id="exampleFormControlInput1" placeholder="dd/mm/yyyy">
                          </div>

                          <div class="form-group">
                            <label for="exampleFormControlSelect1">Example Course</label>
                            <select multiple name ="course" class="form-control" id="exampleFormControlSelect1">
                              <option>Java</option>
                              <option>Python</option>
                              <option>PHP</option>
                              <option>C/C++</option>
                              <option>Ruby</option>
                            </select>
                          </div>

                          <div class="form-group">
                            <label for="exampleFormControlTextarea1">Example text area</label>
                            <textarea name="textArea" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                          </div>
                           <div class="card">
                                <div class="card-body">
                                    <p> Your Address</p>
                                    <div class="form-group">
                                        <input name="address.street" type="text" class="form-control" placeholder="Enter Street"/>
                                    </div>
                                    <div class="form-group">
                                        <input name ="address.city" type="text" class="form-control" placeholder="Enter City"/>
                                    </div>
                                </div>

                           </div>
                          <div class="container text-center">
                          <button type="submit" class="btn btn-primary">Submit </button>
                          </div>
                        </form>


  </body>
  </html>