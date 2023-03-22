/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicainterfaces;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public abstract class VehiculoSinMotor extends Vehiculo
        implements Serializable {

    protected String matricula;
    protected boolean acelerar;
    protected String color;

    public abstract void acelerando();

    public abstract void frenando();

    public String velocidad() {
        return acelerar ? "Acelerando" : "Frenando";
    }
}
