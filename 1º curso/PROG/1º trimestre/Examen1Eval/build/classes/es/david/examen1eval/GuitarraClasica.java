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
public class GuitarraClasica extends Guitarra {

    private double fondoCajaResonancia;
    private String materialAro;

    /**
     * @return the fondoCajaResonancia
     */
    public double getFondoCajaResonancia() {
        return fondoCajaResonancia;
    }

    /**
     * @param fondoCajaResonancia the fondoCajaResonancia to set
     */
    public void setFondoCajaResonancia(double fondoCajaResonancia) {
        this.fondoCajaResonancia = fondoCajaResonancia;
    }

    /**
     * @return the materialAro
     */
    public String getMaterialAro() {
        return materialAro;
    }

    /**
     * @param materialAro the materialAro to set
     */
    public void setMaterialAro(String materialAro) {
        this.materialAro = materialAro;
    }

    public GuitarraClasica(double fondoCajaResonancia, String materialAro, String afinación, Cuerda[] cuerdas) {
        super(afinación, cuerdas);
        this.fondoCajaResonancia = fondoCajaResonancia;
        this.materialAro = materialAro;
    }

    @Override
    public String toString() {
        return super.toString()
                + "GuitarraClasica{" + "fondoCajaResonancia=" + fondoCajaResonancia + ", materialAro=" + materialAro + '}';
    }

}
