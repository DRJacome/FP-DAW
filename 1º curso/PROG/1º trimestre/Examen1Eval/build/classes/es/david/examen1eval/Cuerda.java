/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.david.examen1eval;

/**
 *
 * @author alumno
 */
public class Cuerda {

    private double diametro;
    private String material;

    /**
     * @return the diametro
     */
    public double getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

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

    public Cuerda(double diametro, String material) {
        this.diametro = diametro;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cuerda{" + "diametro=" + diametro + ", material=" + material + '}';
    }

}
