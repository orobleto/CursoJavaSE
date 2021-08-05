package com.educacionIT.javase.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionIT.javase.entidades.Usuario;
import com.educacionIT.javase.enumerados.Alertas;
import com.educacionIT.javase.excepciones.ExcepcionPatrones;
import com.educacionIT.javase.implementaciones.mariaDB.UsuarioImpl;

/**
 * Servlet implementation class ValidarUsuario
 */
@WebServlet("/validarUsuario")
public class ValidarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ValidarUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Boolean cerrarSesion = Boolean.valueOf(request.getParameter("cerrarSesion"));

		// si entra por el metodo get a la URL invalidamos la sesion si existe
		if (cerrarSesion && request.getSession().getId() != null) {
			request.getSession().invalidate();

			// seteamos el atributo mensaje
			request.setAttribute("alerta", Alertas.CLOSE_SESSION);

			// reenviamos la peticion con los objetos request y response
			RequestDispatcher despachador = request.getRequestDispatcher("login.jsp");
			despachador.forward(request, response);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String correo = request.getParameter("correo");
		String clave = request.getParameter("clave");

		String pagina = "login.jsp";
		HttpSession sesion = null;

		try {

			UsuarioImpl impl = new UsuarioImpl();
			impl.getConexion();
			Usuario usuario = impl.buscarPorID(new Usuario(correo, clave, null));
			if (null != usuario) {
				if (usuario.getActivo()) {
					sesion = request.getSession();
					sesion.setAttribute("usuario", usuario);
					pagina = "index.jsp";
				} else {

					request.setAttribute("alerta", Alertas.WARNING);
				}

			} else {

				request.setAttribute("alerta", Alertas.DANGER);
			}

			RequestDispatcher despachador = request.getRequestDispatcher(pagina);
			despachador.forward(request, response);
		} catch (ExcepcionPatrones e) {
			e.printStackTrace();
		}

	}
	
	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("param1"));
		System.out.println(request.getParameter("param2"));
	}

}
