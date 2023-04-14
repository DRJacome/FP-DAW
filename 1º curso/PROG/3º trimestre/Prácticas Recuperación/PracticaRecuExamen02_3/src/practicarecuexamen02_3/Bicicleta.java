/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarecuexamen02_3;

import java.util.Arrays;

/**
 *
 * @author jacod
 */
public class Bicicleta {

    private int[] presion = new int[2];
    private int color;
    private String marca;
    private int kmsCadena;

    public Bicicleta() {
    }

    public Bicicleta(int color, String marca, int kmsCadena) {
        this.color = color;
        this.marca = marca;
        this.kmsCadena = kmsCadena;
    }

    @Override
    public String toString() {
        return "Bicicleta: "
                + "\n Presión (delantera, trasera) = " + Arrays.toString(presion) + " bares"
                + ",\n Color = " + color
                + ",\n Marca = " + marca
                + ",\n Rodada de cadena = " + kmsCadena + " kms: " + comprobarEstadoCadena(kmsCadena);
    }

    public String comprobarEstadoCadena(int kmsCadena) {
        if (kmsCadena <= 1060) {
            return ("La cadena está en buen estado.");
        } else if (kmsCadena > 1060 && kmsCadena <= 1200) {
            return ("La cadena está demasiado gastada.");
        } else if (kmsCadena > 1200) {
            return ("Sustituir inmediatamente la cadena.");
        }
        return null;
    }

    /**
     * @return the presion
     */
    public int[] getPresion() {
        return presion;
    }

    /**
     * @param presion the presion to set
     */
    public void setPresion(int[] presion) {
        this.presion = presion;
    }

    public int getPresion(int rueda) {
        return presion[rueda];
    }

    public void setPresion(int rueda, int presion) {
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
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
}
