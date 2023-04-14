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
public class GuitarraElectrica extends Guitarra {

    private boolean ajusteAlma;
    private int numeroPastillas;

    /**
     * @return the ajusteAlma
     */
    public boolean isAjusteAlma() {
        return ajusteAlma;
    }

    /**
     * @param ajusteAlma the ajusteAlma to set
     */
    public void setAjusteAlma(boolean ajusteAlma) {
        this.ajusteAlma = ajusteAlma;
    }

    /**
     * @return the numeroPastillas
     */
    public int getNumeroPastillas() {
        return numeroPastillas;
    }

    /**
     * @param numeroPastillas the numeroPastillas to set
     */
    public void setNumeroPastillas(int numeroPastillas) {
        this.numeroPastillas = numeroPastillas;
    }

    public GuitarraElectrica(boolean ajusteAlma, int numeroPastillas, String afinación, Cuerda[] cuerdas) {
        super(afinación, cuerdas);
        this.ajusteAlma = ajusteAlma;
        this.numeroPastillas = numeroPastillas;
    }

    @Override
    public String toString() {
        return super.toString()
                + "GuitarraElectrica{" + "ajusteAlma=" + ajusteAlma + ", numeroPastillas=" + numeroPastillas + '}';
    }

}
