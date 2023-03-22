/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaordenador;

/**
 *
 * @author alumno
 */
public class Bateria {

    private int duracion;
    private double capacidad;

    public Bateria() {
    }

    public Bateria(int duracion, double capacidad) {
        this.duracion = duracion;
        this.capacidad = capacidad;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the capacidad
     */
    public double getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Bateria {" + "duración: " + duracion
                + ", capacidad: " + capacidad + '}';
    }

}
