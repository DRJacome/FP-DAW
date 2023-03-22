/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.david.examen1eval;

import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Guitarra extends InstrumentoCuerda {

    protected String afinacion;
    protected Cuerda[] cuerdas;

    /**
     * @return the afinación
     */
    public String getAfinación() {
        return afinacion;
    }

    /**
     * @param afinación the afinación to set
     */
    public void setAfinación(String afinación) {
        this.afinacion = afinación;
    }

    /**
     * @return the cuerdas
     */
    public Cuerda[] getCuerdas() {
        return cuerdas;
    }

    /**
     * @param cuerdas the cuerdas to set
     */
    public void setCuerdas(Cuerda[] cuerdas) {
        this.cuerdas = cuerdas;
    }

    public Guitarra(String afinación, Cuerda[] cuerdas) {
        this.afinacion = afinación;
        this.cuerdas = cuerdas;
    }

    @Override
    public String toString() {
        /*for (int i = 0; i < 10; i++) {
            Para imprimir como queramos las cuerdas
        }*/
        return "Guitarra{" + "afinacion=" + afinacion + ", cuerdas=" + Arrays.toString(cuerdas) + '}';
    }

    @Override
    public void encordar(Cuerda[] cuerdas) {
        this.cuerdas = cuerdas;
    }

    @Override
    public void desencordar() {
        cuerdas = null;
    }

    @Override
    public void afinar(String afinacion) {
        this.afinacion = afinacion;
    }
}
