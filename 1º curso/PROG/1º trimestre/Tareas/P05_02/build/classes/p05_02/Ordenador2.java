/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05_02;

/**
 *
 * @author alumno
 */
public class Ordenador2 {

    // Campos a rellenar del ordenador.
    private String marcaCPU;
    private String modeloCPU;
    private int generacion;
    private double frecuencia;
    private boolean overclock;

    void cambiarMarcaCPU(String nuevaMarca) {
        setMarcaCPU(nuevaMarca);
    }

    public Ordenador2(String marcaCPU, String modeloCPU, int generación, double frecuencia, boolean overclock) {
        this.marcaCPU = marcaCPU;
        this.modeloCPU = modeloCPU;
        this.generacion = generación;
        this.frecuencia = frecuencia;
        this.overclock = overclock;
    }

    public Ordenador2() {
    }

    private String memoriaRam;
    private int capacidad;
    private String marcaPlacaBase;
    private String marcaSSD;

    @Override
    public String toString() {
        return "\n Ordenador { "
                + "\n marcaCPU = " + marcaCPU
                + ",\n modeloCPU = " + modeloCPU
                + ",\n generacion = " + generacion
                + ",\n frecuencia = " + frecuencia
                + ",\n overclock = " + overclock
                + " } ";
    }

    /**
     * @param marcaCPU the marcaCPU to set
     */
    public void setMarcaCPU(String marcaCPU) {
        this.marcaCPU = marcaCPU;
    }
}
