/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05_02_001;

/**
 *
 * @author alumno
 */
public class Camara {

    String sensor;
    int cantidadLentes;
    int formatoImagen;

    @Override
    public String toString() {
        return "Camara{" + "sensor=" + sensor + ", cantidadLentes=" + cantidadLentes
                + ", formatoImagen=" + formatoImagen + ", resolucion=" + resolucion + "mpx \ngranAngular=" + (granAngular ? "SI" : "NO") + '}';
    }
    double resolucion;
    boolean granAngular;

    // Se debe adecuar la salida de boolean para que no imprima TRUE o FALSE,
    //si no SI o NO.
    /* void m() {
        if (!granAngular)
    }*/
}
