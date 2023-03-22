/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaSerializarSencillo;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Procesador implements Serializable {

    int nucleos;
    double frecuencia;

    public Procesador(int nucleos, double frecuencia) {
        this.nucleos = nucleos;
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return "Procesador{" + "nucleos=" + nucleos + ", frecuencia=" + frecuencia + '}';
    }

}
