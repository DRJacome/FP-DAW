/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackaje;

import práctica.pkg23.modificadores.de.acceso.Clase2;

/**
 *
 * @author alumno
 */
public class Clase4 extends Clase2 {

    public Clase4(double PI) {
        super(PI);
    }

    void yyy() {
        d = 15;
        m1(); //ABC
        super.m1(); //ZYX
    }

    /*@Override
    public void m1() {
        System.out.println("ABC");
    }*/
}
