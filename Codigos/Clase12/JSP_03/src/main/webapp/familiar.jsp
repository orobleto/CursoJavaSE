<%@page import="com.educacionIT.javase.enumerados.Colores"%>
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
<link rel="stylesheet" href="css/form.css" />
<link rel="stylesheet" href="css/button.css" />
<title>Inicio</title>
</head>

<%
Usuario usuario = (Usuario) session.getAttribute("usuario");

if (usuario == null) {
	response.sendRedirect("login.jsp");
}

String patenteNumero = request.getParameter("patente");
Boolean editar = Boolean.valueOf(request.getParameter("editar"));
Familiar familiar = null;
if (null != patenteNumero && null != editar) {
	FamiliarImpl impl = new FamiliarImpl();
	impl.getConexion();
	familiar = impl.buscarPorID(patenteNumero);
}
%>

<body>
	<div>
		<header>
		<h1>Java SE - Octavio Robleto</h1>
		<img src="images/logo-it.svg" width="200" height="50" /> </header>
	</div>


	<div>
		<nav> <a href="index.jsp">Lista de Autos Familiares</a> <a
			style="text-align: right;" href="validarUsuario?cerrarSesion=true"
			class="btn btn-link" role="button">Cerrar Sesion</a> </nav>
	</div>

	<div>
		<section>
		<div>
			<form action="familiarServicio" method="post">
<label for="patenteNumero">Numero de Patente</label> <input
					type="text" name="patenteNumero" id="patenteNumero"
					placeholder="ABC-1234" required="true"
					<%=null != editar && null != familiar ? "value=\"" + familiar.getPatente().getNumero() + "\" readonly" : ""%> />
						<label for="patenteActiva">Estado de la Patente</label> <select
					name="patenteActiva" id="patenteActiva">
					<option <%=null == editar && null == familiar ? "selected" : ""%> value="">Seleccione una opción</option>
					<option  <%=null != editar && null != familiar && familiar.getPatente().isActiva()? "selected" : ""%> value="true">Activa</option>
					<option  <%=null != editar && null != familiar && !familiar.getPatente().isActiva()? "selected" : ""%> value="false">Inactiva</option>
				</select> 
				<label for="color">Color</label> <select name="color" id="color"
					required="true">
			<option <%=null == editar && null == familiar ? "selected" : ""%> value="">Seleccione una opción</option>
<option <%=null != editar && null != familiar && familiar.getColor().equals(Colores.valueOf("NEGRO"))? "selected" : ""%> value="NEGRO">Negro</option>
<option <%=null != editar && null != familiar && familiar.getColor().equals(Colores.valueOf("AZUL"))? "selected" : ""%> value="AZUL">Azul</option>
<option <%=null != editar && null != familiar && familiar.getColor().equals(Colores.valueOf("MARRON"))? "selected" : ""%> value="MARRON">Marron</option>
<option <%=null != editar && null != familiar && familiar.getColor().equals(Colores.valueOf("GRIS"))? "selected" : ""%> value="GRIS">Gris</option>
<option <%=null != editar && null != familiar && familiar.getColor().equals(Colores.valueOf("VERDE"))? "selected" : ""%> value="VERDE">Verde</option>
<option <%=null != editar && null != familiar && familiar.getColor().equals(Colores.valueOf("NARANJA"))? "selected" : ""%> value="NARANJA">Naranja</option>
<option <%=null != editar && null != familiar && familiar.getColor().equals(Colores.valueOf("ROSA"))? "selected" : ""%> value="ROSA">Rosa</option>
<option <%=null != editar && null != familiar && familiar.getColor().equals(Colores.valueOf("PURPURA"))? "selected" : ""%> value="PURPURA">Purpura</option>
<option <%=null != editar && null != familiar && familiar.getColor().equals(Colores.valueOf("ROJO"))? "selected" : ""%> value="ROJO">Rojo</option>
<option <%=null != editar && null != familiar && familiar.getColor().equals(Colores.valueOf("BLANCO"))? "selected" : ""%> value="BLANCO">Blanco</option>
<option <%=null != editar && null != familiar && familiar.getColor().equals(Colores.valueOf("AMARILLO"))? "selected" : ""%> value="AMARILLO">Amarillo</option>
				</select> <label for="marca">Marca</label> <select name="marca" id="marca"
					required="true">
					<option <%=null == editar && null == familiar ? "selected" : ""%> value="">Seleccione una opción</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Audi")? "selected" : ""%> value="Audi">Audi</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Subaru")? "selected" : ""%> value="Subaru">Subaru</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Lexus")? "selected" : ""%> value="Lexus">Lexus</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Porsche")? "selected" : ""%> value="Porsche">Porsche</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("BMW")? "selected" : ""%> value="BMW">BMW</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Mazda")? "selected" : ""%> value="Mazda">Mazda</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Buick")? "selected" : ""%> value="Buick">Buick</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Toyota")? "selected" : ""%> value="Toyota">Toyota</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Kia")? "selected" : ""%> value="Kia">Kia</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Honda")? "selected" : ""%> value="Honda">Honda</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Hyundai")? "selected" : ""%> value="Hyundai">Hyundai</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Volvo")? "selected" : ""%> value="Volvo">Volvo</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Mini")? "selected" : ""%> value="Mini">Mini</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Mercedes")? "selected" : ""%> value="Mercedes-Benz">Mercedes-Benz</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Volkswagen")? "selected" : ""%> value="Volkswagen">Volkswagen</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Ford")? "selected" : ""%> value="Ford">Ford</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Lincoln")? "selected" : ""%> value="Lincoln">Lincoln</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Scion")? "selected" : ""%> value="Scion">Scion</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Acura")? "selected" : ""%> value="Acura">Acura</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Chevrolet")? "selected" : ""%> value="Chevrolet">Chevrolet</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Nissan")? "selected" : ""%> value="Nissan">Nissan</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Infiniti")? "selected" : ""%> value="Infiniti">Infiniti</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("GMC")? "selected" : ""%> value="GMC">GMC</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Cadillac")? "selected" : ""%> value="Cadillac">Cadillac</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Dodge")? "selected" : ""%> value="Dodge">Dodge</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Land Rover")? "selected" : ""%> value="Land Rover">Land Rover</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Mitsubishi")? "selected" : ""%> value="Mitsubishi">Mitsubishi</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Jeep")? "selected" : ""%> value="Jeep">Jeep</option>
<option <%=null != editar && null != familiar && familiar.getMarca().equals("Fiat")? "selected" : ""%> value="Fiat">Fiat</option>
				</select> 
			<label for="categoria">Categoria</label> <select name="categoria"
					id="categoria" required="true">
					<option <%=null == editar && null == familiar ? "selected" : ""%> value="">Seleccione una opción</option>
					<option <%=null != editar && null != familiar && familiar.getCategoria().equals("Cupé")? "selected" : ""%> value="Cupé">Cupé</option>
					<option <%=null != editar && null != familiar && familiar.getCategoria().equals("Sport")? "selected" : ""%>  value="Sport">Sport</option>
					<option  <%=null != editar && null != familiar && familiar.getCategoria().equals("Sedán")? "selected" : ""%> value="Sedán">Sedán</option>
					<option  <%=null != editar && null != familiar && familiar.getCategoria().equals("Deportivo")? "selected" : ""%> value="Deportivo">Deportivo</option>
					<option  <%=null != editar && null != familiar && familiar.getCategoria().equals("Compacto")? "selected" : ""%> value="Compacto">Compacto</option>
					<option  <%=null != editar && null != familiar && familiar.getCategoria().equals("Electrico")? "selected" : ""%> value="Electrico">Electrico</option>
				</select> <label for="puestos">Numero de Puestos</label> <input type="number"
					min="1" max="100" name="puestos" id="puestos" placeholder="4"
					required="true" <%=null != editar && null != familiar ? "value=\"" + familiar.getPuestos() + "\"" : ""%> />

				<div>
					<button type="reset" class="button warning">Limpiar</button>
					<button type="submit" class="button success">Enviar</button>
				</div>
			</form>

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
