<%@page import="com.educacionIT.javase.entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- /**
 * @author Octavio Robleto
 * @see https://orobleto.github.io/octaviorobleto.github.io/
 * 
 */ -->
<!DOCTYPE html>
<html lang="es">

<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<!--     <link rel='stylesheet' type='text/css' media='screen' href='css/formularios.css'> -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src='main.js'></script>
<title>Clase 01 - Sesiones JSP</title>

</head>

<body>

	<div class="jumbotron text-center">
		<h1>Java EE</h1>
		<p>Mi primera pagina con sesiones</p>
	</div>

	<%
		Usuario usuario = (Usuario) session.getAttribute("usuario");


	if (usuario != null) {
	%>
	<!-- Left-aligned media object -->
	<div class="container">
		<div class="media">
			<div class="media-left">
				<img src="images/editor.png" class="media-object"
					style="width: 150px">
			</div>
			<div class="media-body">
				<h4 class="media-heading"><%="ID[" + usuario.getId() + "] - " + usuario.getCorreo()%></h4>
				<p>Cada vez que un usuario crea una sesión accediendo a una
					página (siempre y cuando se genere desde el código) se crea un
					objeto a nivel de Servidor con un HashMap vacío que nos permite
					almacenar la información que necesitamos relativa a este usuario</p>
				<p>
					En este caso se generó el ID
					<kbd><%=session.getId()%></kbd>
					único para cada sesión
				</p>
				</div>
		</div>
	</div>

	<div class="container">
		<a href="sesiones?iniciar=false" class="btn btn-link" role="button">Cerrar
			Sesion</a>
	</div>


	<%
		} else {
		response.sendRedirect("index.jsp");
	}
	%>



</body>

</html>