<%@page import="com.educacionIT.javase.enumerados.Alertas"%>
<%@page import="com.educacionIT.javase.entidades.Familiar"%>
<%@page
	import="com.educacionIT.javase.implementaciones.mariaDB.FamiliarImpl"%>
<%@page import="com.educacionIT.javase.entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<link rel="stylesheet" href="css/alert.css" />
<title>Inicio</title>
</head>

<%
Usuario usuario = (Usuario) session.getAttribute("usuario");

if (usuario == null) {
	response.sendRedirect("login.jsp");
}
%>

<body>
	<%
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
		<header>
		<h1>Java SE - Octavio Robleto</h1>
		<img src="images/logo-it.svg" width="200" height="50" /> </header>
	</div>

	<div>
		<nav> <a href="familiar.jsp">Agregar Auto Familiar</a> <a
			style="text-align: right;" href="validarUsuario?cerrarSesion=true"
			class="btn btn-link" role="button">Cerrar Sesion</a> </nav>
	</div>

	<div>
		<section>
		<h2>Lista de Autos Familiares</h2>
		<div>
			<table>
				<tr>
					<th>Patente</th>
					<th>Activo</th>
					<th>Marca</th>
					<th>Color</th>
					<th>Categoria</th>
					<th>Puestos</th>
					<th>Accion</th>
				</tr>
				<%
				FamiliarImpl impl = new FamiliarImpl();
				impl.getConexion();

				for (Familiar familiar : impl.listar()) {
				%>

				<tr>
					<td><%=familiar.getPatente().getNumero()%></td>
					<td><%=familiar.getPatente().isActiva() ? "Si" : "No"%></td>
					<td><%=familiar.getMarca()%></td>
					<td><%=familiar.getColor()%></td>
					<td><%=familiar.getCategoria()%></td>
					<td><%=familiar.getPuestos()%></td>
					<td>
						<button onclick="window.location.href='familiar.jsp?editar=true&patente=<%=familiar.getPatente().getNumero()%>'"
							class="button warning">Editar</button>
						<button
							onclick="confirmar('Desea Eliminar el Auto <%=familiar.getPatente().getNumero()%>?')?window.location.href='familiarServicio?patente=<%=familiar.getPatente().getNumero()%>':window.location.href='#'"
							class="button danger">Eliminar</button>
					</td>
					</td>
				</tr>
				<%
				}
				%>
			</table>
		</div>
		</section>
	</div>

	<div>
		<footer>
		<p>Creado por Educacion IT</p>
		</footer>
	</div>
	<script src="scripts/confirm.js"></script>
</body>

</html>
