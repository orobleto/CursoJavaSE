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
 * @class Generica
 * @description 
 * @date 24 jun. 2020
 */
public class Generica<T> {

    private T elemetoGenerico;
    /** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020  
	 */
	public Generica() {
		// TODO Auto-generated constructor stub
	}
    /**
     * 
     * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
     * @date 24 jun. 2020 
     * @param elemetoGenerico
     */
    public Generica(T elemetoGenerico) {
        this.elemetoGenerico = elemetoGenerico;

    }

    //metodo para verificar los datos
    public void tipoClase() {
        String clase, libreria;
        clase = this.elemetoGenerico.getClass().getSimpleName();
		libreria = this.elemetoGenerico.getClass().getPackage().toString();
        System.out.println("El elemento T es de la Clase " + clase + " que se encuentra en la libreria " + libreria);
    }

	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020 
	 * @return the elemetoGenerico 
	 */
	public T getElemetoGenerico() {
		return elemetoGenerico;
	}

	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 24 jun. 2020 
	 * @param elemetoGenerico the elemetoGenerico to set 
	 */
	public void setElemetoGenerico(T elemetoGenerico) {
		this.elemetoGenerico = elemetoGenerico;
	}


}
