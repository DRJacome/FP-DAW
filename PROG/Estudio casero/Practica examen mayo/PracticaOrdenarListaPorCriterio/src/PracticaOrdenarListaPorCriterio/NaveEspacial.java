/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaOrdenarListaPorCriterio;

/**
 *
 * @author alumno
 */
public class NaveEspacial implements Comparable<NaveEspacial> {

    private double peso;
    private String nacionalidad;
    private boolean itv;
    private String tipoReactor;
    private int numeroCanhones;

    public NaveEspacial(double peso,
            String nacionalidad,
            boolean itv,
            String tipoReactor,
            int numeroCanhones) {
        this.peso = peso;
        this.nacionalidad = nacionalidad;
        this.itv = itv;
        this.tipoReactor = tipoReactor;
        this.numeroCanhones = numeroCanhones;
    }

    @Override
    public String toString() {
        return "NaveEspacial{" + "peso=" + getPeso()
                + ", nacionalidad=" + getNacionalidad()
                + ", itv=" + isItv() + ", tipoReactor=" + getTipoReactor()
                + ", numeroCanhones=" + getNumeroCanhones() + '}';
    }

    @Override
    public int compareTo(NaveEspacial o) {
        return numeroCanhones - o.getNumeroCanhones();
        //return Double.compare(getPeso(), o.getPeso());
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the itv
     */
    public boolean isItv() {
        return itv;
    }

    /**
     * @param itv the itv to set
     */
    public void setItv(boolean itv) {
        this.itv = itv;
    }

    /**
     * @return the tipoReactor
     */
    public String getTipoReactor() {
        return tipoReactor;
    }

    /**
     * @param tipoReactor the tipoReactor to set
     */
    public void setTipoReactor(String tipoReactor) {
        this.tipoReactor = tipoReactor;
    }

    /**
     * @return the numeroCanhones
     */
    public int getNumeroCanhones() {
        return numeroCanhones;
    }

    /**
     * @param numeroCanhones the numeroCanhones to set
     */
    public void setNumeroCanhones(int numeroCanhones) {
        this.numeroCanhones = numeroCanhones;
    }

}
