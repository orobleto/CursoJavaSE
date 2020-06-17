/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.interfaces;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 15_Interfaces
 * @class MetodosLavado
 * @description 
 * @date 17 jun. 2020
 */
public interface MetodosLavado {

    // CONSTANTES
    int CANTIDAD_LAVADOS_CAMION_MES = 2;
    int CANTIDAD_LAVADOS_COMPACTO_MES = 1;

    //METODOS ABSTRACTOS
    void lavarCarroceria();

    int lavarChasis();

    void lavarMotor(boolean conEspuma);

}
