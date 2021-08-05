package com.educacionIT.javase.principal;

import java.io.File;

import com.educacionIT.javase.entidades.Usuario;
import com.educacionIT.javase.excepciones.ExcepcionPatrones;
import com.educacionIT.javase.implementaciones.mariaDB.UsuarioImpl;

public class App {

	public static void main(String[] args) throws ExcepcionPatrones {
		System.out.println(new File("resources/database.properties").getAbsolutePath());
		Usuario usuario1 = new Usuario("user1@gmail.com", "User1.12345", true);
		Usuario usuario2 = new Usuario("user2@gmail.com", "User2.12345", true);
		Usuario usuario3 = new Usuario("user3@gmail.com", "User3.12345", false);
		UsuarioImpl imp = new UsuarioImpl();
		imp.getConexion();
		System.out.println(usuario1);
		System.out.println(usuario2);
		System.out.println(usuario3);
		/*
		 * imp.insertar(usuario1); imp.insertar(usuario2); imp.insertar(usuario3);
		 */
		imp.listar().forEach(System.out::println);

	}

}
