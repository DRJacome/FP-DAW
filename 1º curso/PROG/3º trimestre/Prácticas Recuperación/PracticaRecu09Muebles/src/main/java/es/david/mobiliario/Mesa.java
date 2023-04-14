/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.david.mobiliario;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Mesa extends Mueble implements Serializable {

    protected String tipo;
    protected boolean pasadorCables;
    protected boolean inclinable;

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the pasadorCables
     */
    public boolean isPasadorCables() {
        return pasadorCables;
    }

    /**
     * @param pasadorCables the pasadorCables to set
     */
    public void setPasadorCables(boolean pasadorCables) {
        this.pasadorCables = pasadorCables;
    }

    /**
     * @return the inclinable
     */
    public boolean isInclinable() {
        return inclinable;
    }

    /**
     * @param inclinable the inclinable to set
     */
    public void setInclinable(boolean inclinable) {
        this.inclinable = inclinable;
    }

    public Mesa() {
    }

    public Mesa(String tipo, boolean pasadorCables, boolean inclinable, String material, double ancho, double alto, double profundidad, double precio) {
        super(material, ancho, alto, profundidad, precio);
        this.tipo = tipo;
        this.pasadorCables = pasadorCables;
        this.inclinable = inclinable;
    }

    @Override
    public String toString() {
        return super.toString() + "Mesa{"
                + "tipo=" + tipo
                + ", pasadorCables=" + pasadorCables
                + ", inclinable=" + inclinable;
    }
}
