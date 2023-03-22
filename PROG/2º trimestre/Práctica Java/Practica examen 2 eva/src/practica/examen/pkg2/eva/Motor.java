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
public class Motor implements Serializable {

    private double cilindrada;
    private boolean ecologico;

    public Motor() {
    }

    public Motor(double cilindrada, boolean ecologico) {
        this.cilindrada = cilindrada;
        this.ecologico = ecologico;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isEcologico() {
        return ecologico;
    }

    public void setEcologico(boolean ecologico) {
        this.ecologico = ecologico;
    }

    @Override
    public String toString() {
        return "Motor{" + "cilindrada=" + cilindrada
                + ", ecologico=" + ecologico + '}';
    }

}
