/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p08_01;

/**
 *
 * @author alumno
 */
public class Monitor {

    final private double TAMANHO; // diagonal principal
    private double tasaRefresco;
    final private double anguloVision;
    private String conexion;

    public Monitor() {
        TAMANHO = 24;
        anguloVision = 160.0;
    }

    public Monitor(double tamanho, double tasaRefresco, double anguloVision,
            String conexion) {
        this.TAMANHO = tamanho;
        this.tasaRefresco = tasaRefresco;
        this.anguloVision = anguloVision;
        this.conexion = conexion;
    }

    /**
     * @return the TAMANHO
     */
    public double getTamanho() {
        return TAMANHO;
    }

    /**
     * @return the tasaRefresco
     */
    public double getTasaRefresco() {
        return tasaRefresco;
    }

    /**
     * @param tasaRefresco the tasaRefresco to set
     */
    public void setTasaRefresco(double tasaRefresco) {
        this.tasaRefresco = tasaRefresco;
    }

    /**
     * @return the anguloVision
     */
    public double getAnguloVision() {
        return anguloVision;
    }

    /**
     * @return the conexion
     */
    public String getConexion() {
        return conexion;
    }

    /**
     * @param conexion the conexion to set
     */
    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    @Override
    public String toString() {
        return "Monitor{"
                + "TAMANHO: " + TAMANHO
                + ",\n tasaRefresco: " + tasaRefresco
                + ",\n ANGULO_VISION: " + anguloVision
                + ",\n conexion: " + conexion + '}';
    }
}
