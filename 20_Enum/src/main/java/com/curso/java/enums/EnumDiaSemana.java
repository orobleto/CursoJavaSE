/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.enums;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 20_Enum
 * @class EnumDiaSemana
 * @description 
 * @date 19 jun. 2020
 */
public enum EnumDiaSemana {
    //Constantes con constructor
    Lunes("Lunes", 1),
    Martes("Martes", 2),
    Miércoles("Miércoles", 3),
    Jueves("Jueves", 4),
    Viernes("Viernes", 5),
    Sábado("Sábado", 6),
    Domingo("Domingo", 7);
    private final int diaNumero;
    private final String diaLetras;

    /*
    Constructor de la clase EnumDiaSemana
    este constructor debe ser privado ya que no se debe ni puede instanciar el objeto EnumDiaSemana
    */
    private EnumDiaSemana(String diaLetras, int diaNumero) {
        this.diaLetras = diaLetras;
        this.diaNumero = diaNumero;
    }

    //retorno del dia en numeros
    public int getDiaNumero() {
        return diaNumero;
    }
    
    //retorno del dia en letras
    public String getDiaLetras() {
        return diaLetras;
    }
}
