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
public final class Silla extends Mueble implements Serializable {

    private boolean reclinable;
    private int numeroPatas;
    private boolean ruedas;
    private boolean gaming;

    /**
     * @return the reclinable
     */
    public boolean isReclinable() {
        return reclinable;
    }

    /**
     * @param reclinable the reclinable to set
     */
    public void setReclinable(boolean reclinable) {
        this.reclinable = reclinable;
    }

    /**
     * @return the numeroPatas
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }

    /**
     * @param numeroPatas the numeroPatas to set
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    /**
     * @return the ruedas
     */
    public boolean isRuedas() {
        return ruedas;
    }

    /**
     * @param ruedas the ruedas to set
     */
    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    /**
     * @return the gaming
     */
    public boolean isGaming() {
        return gaming;
    }

    /**
     * @param gaming the gaming to set
     */
    public void setGaming(boolean gaming) {
        this.gaming = gaming;
    }

    public Silla() {
    }

    public Silla(boolean reclinable, int numeroPatas, boolean ruedas, boolean gaming, String material, double ancho, double alto, double profundidad, double precio) {
        super(material, ancho, alto, profundidad, precio);
        this.reclinable = reclinable;
        this.numeroPatas = numeroPatas;
        this.ruedas = ruedas;
        this.gaming = gaming;
    }

    @Override
    public String toString() {
        return super.toString() + "Silla{"
                + "reclinable=" + reclinable
                + ", numeroPatas=" + numeroPatas
                + ", ruedas=" + ruedas
                + ", gaming=" + gaming;
    }
}
