<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page isELIgnored="false"%>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Home Page</title>
  </head>
  <body


    <div class="container">
        <div class = "card mx-auto mt-5 bg-secondary" style="width: 400px;">

            <div class= "card-body py-5">

                <h3 class="text-center text-white text-uppercase"> My Search </h3>
                <form action="search" class="mt-5">
                    <div class = "form-group">
                        <input type="text" name="querybox" placeholder="Enter your keyword..." class ="form-control">
                    </div>

                    <div class="container text-center">
                        <button class="btn btn-outline-light">Search</Search>
                    </div>
                </form>
            </div>

        </div>
    </div>


  </body>
  </html>
