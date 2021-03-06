<%@page import="com.educacionIT.javase.entidades.Familiar"%>
<%@page import="com.educacionIT.javase.implementaciones.mariaDB.FamiliarImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html
    PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="es">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" href="css/table.css" />
    <link rel="stylesheet" href="css/button.css" />
    <link rel="stylesheet" href="css/form.css" />
    <title>Inicio</title>
    <%
    Familiar familiar = (Familiar)request.getAttribute("auto");
    %>
    
</head>

<body>
    <div>
        <header>
            <h1>FrontEnd</h1>
            <img src="images/editor.png" width="100" height="100" />
        </header>
    </div>

    <div>
        <nav>
            <a href="index.html">Inicio</a>
        </nav>
    </div>

    <div>
        <section>
        	<h2>Datos del Auto</h2>
            <div>
				<div>&#9733 Marca: <%= familiar.getMarca() %> </div>
				<div>&#9733 Patente: <%= familiar.getPatente().getNumero()%> </div>
				<div>&#9733 Color: <%= familiar.getColor() %> </div>
				<div>&#9733 Cantidad de Puestos: <%= familiar.getPuestos() %> </div>
				<div>&#9733 Categoria: <%= familiar.getCategoria()%> </div>
			<div>
        </section>
    </div>
    
    <%
    
    // se pudo usar tambien la siguiente forma como en el Servlet
	    
	    /*
	    	out.println("<li>Parametro Nombre: " + request.getParameter("nombre") + " </li>");
	    */
    
    %>

    <div>
        <footer>
            <p>Creado por Educacion IT</p>
        </footer>
    </div>
</body>

</html>