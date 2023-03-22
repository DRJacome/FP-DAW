/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen10herencias;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class ClaseB extends ClaseA implements Serializable {

    public static int contadorB;
    protected final int atrB;

    public ClaseB(int atrB, int atrA) {
        super(atrA);
        // super.getAtrA();
        this.atrB = atrB;
        contadorB++;
    }

    /**
     *
     * @return
     */
    public int getAtrB() {
        return atrB;
    }
}
