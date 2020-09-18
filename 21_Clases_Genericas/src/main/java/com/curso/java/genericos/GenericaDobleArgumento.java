/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.genericos;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 21_Clases_Genericas
 * @class GenericaDobleArgumento
 * @description
 * @date 24 jun. 2020
 */
public class GenericaDobleArgumento<K, V> {

	private K claveGenerica;
	private V valorGenerico;
	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020  
	 */
	public GenericaDobleArgumento() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020 
	 * @param claveGenerica
	 * @param valorGenerico
	 */
	public GenericaDobleArgumento(K claveGenerica, V valorGenerico) {
		this.claveGenerica = claveGenerica;
		this.valorGenerico = valorGenerico;
	}

	// metodo para verificar los datos
	public void tipoClase() {
		String clase, libreria;
		clase = this.claveGenerica.getClass().getSimpleName();
		libreria = this.claveGenerica.getClass().getPackage().toString();
		System.out.println("El elemento K es de la Clase " + clase + " que se encuentra en la libreria " + libreria);

		clase = this.valorGenerico.getClass().getSimpleName();
		libreria = this.valorGenerico.getClass().getPackage().toString();
		System.out.println("El elemento V es de la Clase " + clase + " que se encuentra en la libreria " + libreria);
	}

	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020 
	 * @return the claveGenerica 
	 */
	public K getClaveGenerica() {
		return claveGenerica;
	}

	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020 
	 * @param claveGenerica the claveGenerica to set 
	 */
	public void setClaveGenerica(K claveGenerica) {
		this.claveGenerica = claveGenerica;
	}

	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020 
	 * @return the valorGenerico 
	 */
	public V getValorGenerico() {
		return valorGenerico;
	}

	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020 
	 * @param valorGenerico the valorGenerico to set 
	 */
	public void setValorGenerico(V valorGenerico) {
		this.valorGenerico = valorGenerico;
	}


}
