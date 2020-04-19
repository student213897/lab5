<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Studentów</title>
    </head>
    <body>
        
                <table style="border: 2px solid black;">
            <tr>
                <th>Imie</th>
                <th>Nazwisko</th>
                <th>Email</th>
                <th>ID grupy</th>
            </tr>
            <c:forEach items="${ListaStudentow}" var="Student">
                <tr>
                    <td><c:out value="${Student.firstName}"/></td>
                    <td><c:out value="${Student.lastName}"/></td>  
                    <td><c:out value="${Student.email}"/></td>  
                    <td><c:out value="${Student.groupID}"/></td>  
                </tr>
            </c:forEach>                
        </table>
        
        <FORM  ACTION="ListaStudentow" METHOD="POST" >
            Imie: <INPUT TYPE="TEXT" NAME="firstName" ><BR>
            Nazwisko: <INPUT TYPE="TEXT" NAME="lastName" ><BR>
            Email: <INPUT TYPE="TEXT" NAME="email" ><BR>
            Grupa: <INPUT TYPE="TEXT" NAME="groupID" ><br>
            <INPUT TYPE="SUBMIT" value="Dodaj"> 
        </FORM>

        
        <br>
        <a href="index.html">Powrót</a>
    </body>
</html>
