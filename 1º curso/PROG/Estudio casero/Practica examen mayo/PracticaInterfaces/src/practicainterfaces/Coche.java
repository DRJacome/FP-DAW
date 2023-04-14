/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicainterfaces;

/**
 *
 * @author alumno
 */
public class Coche extends VehiculoMotor {

    private int codigoSeguridad;
    private final Rueda[] ruedas = new Rueda[4];
    private final int puertas;
    private int potenciaMotor;
    private double capacidadCombustible;

    public Coche(int codigoSeguridad, int puertas, int potenciaMotor, double capacidadCombustible) {
        this.codigoSeguridad = codigoSeguridad;
        this.puertas = puertas;
        this.potenciaMotor = potenciaMotor;
        this.capacidadCombustible = capacidadCombustible;
    }

    boolean checkearCodigo() {
        return true;
    }

    @Override
    public void arrancarMotor() {
        if (this.checkearCodigo()) {
            encendido = true;
        }
    }

    @Override
    public void pararMotor() {
        encendido = false;
    }

    /**
     * @return the codigoSeguridad
     */
    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    /**
     * @param codigoSeguridad the codigoSeguridad to set
     */
    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    /**
     * @return the ruedas
     */
    public Rueda[] getRuedas() {
        return ruedas;
    }

    /**
     * @return the puertas
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * @param puertas the puertas to set
     */
//    public void setPuertas(int puertas) {
//        this.puertas = puertas;
//    }
    /**
     * @return the potenciaMotor
     */
    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    /**
     * @param potenciaMotor the potenciaMotor to set
     */
    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    /**
     * @return the capacidadCombustible
     */
    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    /**
     * @param capacidadCombustible the capacidadCombustible to set
     */
    public void setCapacidadCombustible(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }
}
