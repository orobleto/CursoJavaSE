package com.educacionIT.javase.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionIT.javase.entidades.Familiar;
import com.educacionIT.javase.entidades.Patente;
import com.educacionIT.javase.enumerados.Alertas;
import com.educacionIT.javase.enumerados.Colores;
import com.educacionIT.javase.implementaciones.mariaDB.FamiliarImpl;

/**
 * Servlet implementation class FamiliarControlador
 */
@WebServlet("/familiarServicio")
public class FamiliarControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FamiliarControlador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String patente = request.getParameter("patente");
		Familiar familiar = new Familiar();
		familiar.setPatente(new Patente(patente, false));
		FamiliarImpl impl = new FamiliarImpl();
		impl.getConexion();
		if (impl.eliminar(familiar)) {
			request.setAttribute("alerta", Alertas.DELETE);
		} else {
			request.setAttribute("alerta", Alertas.ERROR);
		}

		RequestDispatcher despachador = request.getRequestDispatcher("index.jsp");
		despachador.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Colores color = Colores.valueOf(request.getParameter("color"));
		String marca = request.getParameter("marca");
		String patenteNumero = request.getParameter("patenteNumero");
		boolean activa = Boolean.valueOf(request.getParameter("patenteActiva"));
		int puestos = Integer.valueOf(request.getParameter("puestos"));
		String categoria = request.getParameter("categoria");

		Familiar familiar = new Familiar(color, marca, new Patente(patenteNumero, activa), puestos, categoria);
		FamiliarImpl impl = new FamiliarImpl();
		impl.getConexion();

		if (impl.buscarPorID(patenteNumero) != null) {
			impl.actualizar(familiar);
			request.setAttribute("alerta", Alertas.UPDATE);

		} else {
			impl.insertar(familiar);
			request.setAttribute("alerta", Alertas.INSERT);
		}

		RequestDispatcher despachador = request.getRequestDispatcher("index.jsp");
		despachador.forward(request, response);

	}

}
