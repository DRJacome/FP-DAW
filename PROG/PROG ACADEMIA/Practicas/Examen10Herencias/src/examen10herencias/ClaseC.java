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
public final class ClaseC extends ClaseB implements Serializable {

    public static int contadorC;
    private final int atrC;

    public ClaseC(int atrC, int atrB, int atrA) {
        super(atrB, atrA);
        this.atrC = atrC;
        contadorC++;
    }

    /**
     * @return the atrC
     */
    public int getAtrC() {
        return atrC;
    }
}
