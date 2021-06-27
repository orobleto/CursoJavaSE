package com.educacionIT.javase.principal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Principal
 */
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Principal() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Establece el tipo de contenido
		response.setContentType("text/html;charset=UTF-8");

		// Obtiene el stream de salida
		PrintWriter out = response.getWriter();

		// Envia informacion
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en\">");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		out.println("<title>Document</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<li>Parametro Nombre: " + request.getParameter("nombre") + " </li>");
		out.println("<li>Parametro Correo: " + request.getParameter("email") + " </li>");
		out.println("<li>Parametro Edad: " + request.getParameter("edad") + " </li>");
		out.println("<li>Parametro Comentarios: " + request.getParameter("comentarios") + " </li>");
		out.println("<br>");
		out.println("<a href=\"index.html\">Volver</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
