/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05_04;

/**
 *
 * @author alumno
 */
public class Bicicleta {

    private int[] presion;
    /* 0-> delantera, 1 -> trasera */
    private int color;
    private String Tipo;
    private int kmsCadena;

    /**
     * @return the presion
     */
    public int[] getPresion() {
        return presion;
    }

    /**
     * Devuelve la presión de una rueda.
     *
     * @param rueda 0-> delantera, 1 -> trasera
     * @return La presión de la rueda seleccionada.
     */
    public int getPresion(int rueda) {
        return presion[rueda];
    }

    /**
     * @param presion the presion to set
     */
    public void setPresion(int[] presion) {
        this.presion = presion;
    }

    /**
     * Da presión a una rueda.
     *
     * @param presion presión a aplicar.
     * @parametro rueda 0 -> delantera, 1 -> trasera.
     */
    public void setPresion(int presion, int rueda) {
        this.presion[rueda] = presion;
    }

    /**
     * @return the color
     */
    public int getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the kmsCadena
     */
    public int getKmsCadena() {
        return kmsCadena;
    }

    /**
     * @param kmsCadena the kmsCadena to set
     */
    public void setKmsCadena(int kmsCadena) {
        this.kmsCadena = kmsCadena;
    }

    public void comprobarEstadoCadena() {
        if (kmsCadena <= 1000) {
            System.out.println("La cadena está en buen estado.");
        } else if (kmsCadena <= 2000) {
            System.out.println("La cadena está demasiado gastada.");
        } else {
            System.out.println("Sustituir inmediatamente la cadena.");
        }
    }
}
