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
public class DepositoCombustible implements Serializable {

    private String tipo;
    private int capacidad;

    public DepositoCombustible() {
    }

    public DepositoCombustible(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "DepositoCombustible{" + "tipo=" + tipo
                + ", capacidad=" + capacidad + '}';
    }

}
