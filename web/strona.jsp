<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>strona.jsp</title>
    </head>
    <body>

        <h1>Dzień dobry!</h1>
        <h2>Liczba wizyt: <c:out value="${sessionScope.liczbaOdwiedzin}"/></h2>
        <h2><a href="../lab5/"> Powrot</a> </h2>



        <br>


    </body>
</html>
