/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p08_03;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Raton implements Serializable {

    private int botones;
    private boolean cable;
    private String conexion;

    public Raton() {
        botones = 2;
        cable = true;
        conexion = "USB";
    }

    public Raton(int botons, boolean cable, String conexion) {
        this.botones = botons;
        this.cable = cable;
        this.conexion = conexion;
    }

    /**
     * @return the botones
     */
    public int getBotones() {
        return botones;
    }

    /**
     * @return the cable
     */
    public boolean isCable() {
        return cable;
    }

    /**
     * @return the conexion
     */
    public String getConexion() {
        return conexion;
    }

    /**
     * @param botones the botones to set
     */
    public void setBotones(int botones) {
        this.botones = botones;
    }

    /**
     * @param cable the cable to set
     */
    public void setCable(boolean cable) {
        this.cable = cable;
    }

    /**
     * @param conexion the conexion to set
     */
    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Raton other = (Raton) obj;
        if (this.botones != other.botones) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ratón {"
                + "botones: " + botones
                + ",\n cable: " + cable
                + ",\n conexion: " + conexion + '}';
    }

}
