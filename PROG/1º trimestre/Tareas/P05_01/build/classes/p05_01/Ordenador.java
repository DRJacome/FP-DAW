/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05_01;

/**
 *
 * @author alumno
 */
public class Ordenador {

    // Campos a rellenar del ordenador.
    String marcaCPU;
    String modeloCPU;
    int generacion;
    double frecuencia;
    boolean overclock;

    void cambiarMarcaCPU(String nuevaMarca) {
        marcaCPU = nuevaMarca;
    }

    public Ordenador(String marcaCPU, String modeloCPU, int generación, double frecuencia, boolean overclock) {
        this.marcaCPU = marcaCPU + ": ";
        this.modeloCPU = modeloCPU + ": ";
        this.generacion = generación;
        this.frecuencia = frecuencia;
        this.overclock = overclock;
    }

    public Ordenador() {
    }

    String memoria;
    int capacidad;

    String marcaPlacaBase;

    String marcaSSD;

    @Override
    public String toString() {
        return "Ordenador{" + "marcaCPU=" + marcaCPU + ", modeloCPU=" + modeloCPU + ", generacion=" + generacion + ", frecuencia=" + frecuencia + ", overclock=" + overclock + '}';
    }

}
