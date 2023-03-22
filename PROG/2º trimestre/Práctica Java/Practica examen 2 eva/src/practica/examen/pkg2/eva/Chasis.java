/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.examen.pkg2.eva;

import java.io.Serializable;

/**
 *
 * @author jacod
 */
public class Chasis implements Serializable {

    private String material;
    private int peso;

    public Chasis() {
    }

    public Chasis(String material, int peso) {
        this.material = material;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Chasis{" + "material=" + material
                + ", peso=" + peso + '}';
    }

}
