
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

<script type="text/javascript">
	function mostrarClave() {
		var cambio = document.getElementById("clave");
		var boton = document.getElementById("verClaveSpam");
		if (cambio.type == "password") {
			cambio.type = "text";
			$(boton).removeClass('glyphicon glyphicon-eye-open').addClass(
					'glyphicon glyphicon-eye-close');
		} else {
			cambio.type = "password";
			$(boton).removeClass('glyphicon glyphicon-eye-close').addClass(
					'glyphicon glyphicon-eye-open');
		}
	}
</script>

</head>

<body>

	<div class="jumbotron text-center">
		<h1>Java EE</h1>
		<p>Mi primera pagina con sesiones</p>
	</div>

	<%
		Usuario usuario = (Usuario) session.getAttribute("sesionUsuario");

		if (usuario != null) {
			response.sendRedirect("bienvenido.jsp");
		}
	%>
	<%
		String alerta = (String) request.getAttribute("alerta");
		String tipo = "";
		String mensaje = "";
		//Credenciales incorrectas, intente de nuevo... warning
		if (alerta != null) {

			switch (alerta) {
			case "CREDENCIALES":
				tipo = "alert-danger";
				mensaje = " <strong>ERROR! </strong>Credenciales incorrectas, intente de nuevo...";
				break;
			case "SESION":
				tipo = "alert-warning";
				mensaje = " <strong>ADVERTENCIA! </strong>ha cerrado sesion correctamente...";
				break;
			}
	%>

	<div class="container">

		<div class="col-sm-3"></div>
		<div class="col-sm-6">
			<%
				    out.print("<div class=\"alert " + tipo + " alert-dismissible\">");
					out.print("<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
					out.print(mensaje);
					out.print("</div>");
			%>
		</div>

		<div class="col-sm-3"></div>
	</div>
	<%
		}
	%>

	<div class="container text-center">

		<div class="col-sm-3"></div>
		<div class="col-sm-6">

			<form action="sesiones" method="POST">

				<div class="input-group">

					<span class="input-group-addon"><i
						class="glyphicon glyphicon-user"></i></span> <input type="text"
						class="form-control" name="correo" id="correo"
						placeholder="usuario" required>
				</div>
				<p></p>
				<div class="input-group">
					<span class="input-group-addon"> <i
						class="glyphicon glyphicon-lock"></i></span> <input type="password"
						class="form-control" name="clave" id="clave" placeholder="clave" required>
					<button id="verClave" name="verClave"
						class="btn btn-default btn-block" type="button"
						onclick="mostrarClave()">
						<span id="verClaveSpam" class="glyphicon glyphicon-eye-open"></span>
					</button>

				</div>
				<p></p>
				<p></p>
				<p></p>
				<p></p>
				<div>

					<button type="submit" class="btn btn-primary btn-block">Enviar</button>
				</div>
			</form>
			<div class="col-sm-3"></div>
		</div>

	</div>
</body>

</html>