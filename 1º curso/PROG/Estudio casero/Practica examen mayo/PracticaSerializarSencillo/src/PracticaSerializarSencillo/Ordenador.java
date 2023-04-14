/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaSerializarSencillo;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Ordenador implements Serializable {

    boolean gaming;
    String marca;
    Procesador procesador;
    Memoria[] memoria;

    public Ordenador(boolean gaming,
            String marca,
            Procesador procesador,
            Memoria[] memoria) {
        this.gaming = gaming;
        this.marca = marca;
        this.procesador = procesador;
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "\n \t Ordenador{"
                + "\n \t \t gaming=" + gaming
                + ",\n \t \t marca=" + marca
                + ",\n \t \t procesador=" + procesador
                + ",\n \t \t memoria=" + Arrays.toString(memoria) + '}';
    }

}
