package com.educacionIT.javase.principal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionIT.javase.entidades.Familiar;
import com.educacionIT.javase.entidades.Patente;
import com.educacionIT.javase.enumerados.Colores;

/**
 * Servlet implementation class Principal
 */


// mapeo de url
@WebServlet("/validar")
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Colores color = Colores.valueOf(request.getParameter("color"));
		String marca = request.getParameter("marca");
		String numero = request.getParameter("patenteNumero");
		boolean activa = Boolean.valueOf(request.getParameter("patenteActiva"));	
		int puestos = Integer.valueOf(request.getParameter("puestos"));
		String categoria =request.getParameter("categoria");

		Familiar autoFamiliar = new Familiar(color, marca, new Patente(numero, activa), puestos, categoria);
		
		// mandamos el objeto como atributo
		request.setAttribute("auto", autoFamiliar);
		
		// utilizamos el objeto que envia la informacion a otros documentos
		RequestDispatcher dispatcher = request.getRequestDispatcher("principal.jsp");
		dispatcher.forward(request, response);
		

	}

}
