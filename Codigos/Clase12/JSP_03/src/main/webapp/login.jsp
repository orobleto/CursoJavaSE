<%@page import="com.educacionIT.javase.entidades.Usuario"%>
<%@page import="com.educacionIT.javase.enumerados.Alertas"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/form.css" />
<link rel="stylesheet" href="css/button.css">
<link rel="stylesheet" href="css/alert.css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css" />
<title>Login</title>
</head>

<body>

	<%

	Usuario usuario = (Usuario) session.getAttribute("usuario");

	if (usuario != null) {
		response.sendRedirect("index.jsp");
	}

	Alertas alerta = (Alertas) request.getAttribute("alerta");

	if (null != alerta) {
	%>

	<div id="alert">
		<a class="alert <%=alerta.getClase()%>" href="#alert"><%=alerta.getMensaje()%></a>
	</div>

	<%
	}
	%>
	<div>
		<form action="validarUsuario" method="post">

			<label for="correo">Correo Electronico:</label> <input type="email"
				id="correo" name="correo" placeholder="usuario@dominio.com" required />

			<label for="clave">Clave:</label> <input type="password" id="clave"
				name="clave" pattern="^(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$"
				title="La contraseña debe tener al entre 8 y 16 caracteres, al menos un dígito, al menos una minúscula y al menos una mayúscula"
				placeholder="su clave.." required /> <i class="bi bi-eye-slash"
				id="verClave"></i>

			<button type="submit" class="button success">Enviar</button>
			<button type="reset" class="button danger">Limpiar</button>

		</form>
	</div>

	<script src="scripts/Password.js"></script>
</body>

</html>