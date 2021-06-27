<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- Comentario de una linea en JSP --%>
<%
	// Comentarios de una linea en Java
	
	/*
	Comentarios de varias lineas en Java
	*/
%>

<%! 
	
	private int contadorIngresos=0;

	public String breakHTML(){
		return "<br>";
	}
	
%>
<% 	
	for (int i = 0; i < 10; i++){
		out.print(i + breakHTML());
	}
%>
<%-- Podemos intercalar codigo Java y HTML --%>
<% 	
	for (int i = 0; i < 10; i++){
%>
	<h1><%=i%></h1>

<%

	}
%>

<%-- Podemos utilizar explicitas o implicitas --%>
<%=request.getParameter("nombre") %>

	
</body>
</html>