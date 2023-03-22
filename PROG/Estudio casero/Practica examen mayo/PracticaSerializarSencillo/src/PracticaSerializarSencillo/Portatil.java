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
public class Portatil extends Ordenador implements Serializable {

    double capacidadBateria;
    double diagonalPantalla;

    public Portatil(double capacidadBateria,
            double diagonalPantalla,
            boolean gaming,
            String marca,
            Procesador procesador,
            Memoria[] memoria) {
        super(gaming, marca, procesador, memoria);
        this.capacidadBateria = capacidadBateria;
        this.diagonalPantalla = diagonalPantalla;
    }

    @Override
    public String toString() {
        return "Portatil{" + super.toString()
                + "\n \t \t capacidadBateria=" + capacidadBateria
                + ",\n \t \t diagonalPantalla=" + diagonalPantalla + '}' + "\n";
    }

}
