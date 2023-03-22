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
public class Smartphone {

    String color;
    //Aquí se pueden poner las dimensiones como un array [alto x ancho x largo].
    double[] dimensiones;
    double precio;

    Camara camara;
    Telefono telefono;
    Terminal terminal;
    GPS gps;

    public Smartphone() {
        dimensiones = new double[3];
    }

}
