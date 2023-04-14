/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaSerializarTiposDatos;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Memoria implements Serializable {

    int velocidad;
    String tipo;

    public Memoria(int velocidad, String tipo) {
        this.velocidad = velocidad;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Memoria{" + "velocidad=" + velocidad + ", tipo=" + tipo + '}';
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
         * 34.215.6true44.423200DDR43200DDR4
         */
}

