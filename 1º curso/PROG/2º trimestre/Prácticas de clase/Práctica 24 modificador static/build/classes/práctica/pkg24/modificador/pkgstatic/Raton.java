/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg24.modificador.pkgstatic;

/**
 *
 * @author alumno
 */
public class Raton {

    int numeroBotones;
    boolean cable;
    static int contador;

    public Raton(int numeroBotones, boolean cable) {
        this.numeroBotones = numeroBotones;
        this.cable = cable;
        contador++;
    }
}
