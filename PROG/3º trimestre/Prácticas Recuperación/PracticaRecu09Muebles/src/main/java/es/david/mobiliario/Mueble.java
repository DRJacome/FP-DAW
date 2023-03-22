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
public class Mueble implements Serializable {

    protected String material;
    protected double ancho;
    protected double alto;
    protected double profundidad;
    protected double precio;

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * @return the profundidad
     */
    public double getProfundidad() {
        return profundidad;
    }

    /**
     * @param profundidad the profundidad to set
     */
    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Mueble() {
    }

    public Mueble(String material, double ancho, double alto, double profundidad, double precio) {
        this.material = material;
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Mueble{"
                + "material=" + material
                + ", ancho=" + ancho
                + ", alto=" + alto
                + ", profundidad=" + profundidad
                + ", precio=" + precio;
    }
}
