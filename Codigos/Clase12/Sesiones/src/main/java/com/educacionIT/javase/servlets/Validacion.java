package com.educacionIT.javase.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionIT.javase.entidades.Usuario;



/**
 * Servlet implementation class Validacion
 */

@WebServlet(name="validacion",urlPatterns="/sesiones")
public class Validacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	List<Usuario> usuarios = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Validacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {

		super.init();
		usuarios = llenarUsuarios();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// si entra por el metodo get a la URL invalidamos la sesion si existe
		if (request.getSession().getId() != null) {
			request.getSession().invalidate();

			// seteamos el atributo mensaje
			request.setAttribute("alerta", "SESION");

			// reenviamos la peticion con los objetos request y response
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

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
		Usuario usuarioSesion = buscar(correo, clave);
		HttpSession sesion = null;

		String redireccion = "index.jsp";

		if (null == usuarioSesion) {
			request.setAttribute("alerta", "CREDENCIALES");
		} else {
			sesion = request.getSession();
			sesion.setAttribute("usuario", usuarioSesion);
			redireccion = "bienvenido.jsp";
			System.out.println(sesion.getId());
		}
		request.getRequestDispatcher(redireccion).forward(request, response);
	}

	private List<Usuario> llenarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();

		usuarios.add(new Usuario("user1@gmail.com", "user1.1234"));
		usuarios.add(new Usuario("user2@gmail.com", "user2.1234"));
		usuarios.add(new Usuario("user3@gmail.com", "user3.1234"));
		usuarios.add(new Usuario("user4@gmail.com", "user4.1234"));

		return usuarios;
	}

	private Usuario buscar(String correo, String clave) {
		for (Usuario usuario : usuarios) {
			if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario.getClave().equals(clave)) {
				return usuario;
			}
		}
		return null;
	}

}
