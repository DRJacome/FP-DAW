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
public abstract class VehiculoMotor extends Vehiculo implements OperacionesMotor, Serializable {

    protected boolean encendido;
    protected String matricula;

    @Override
    public abstract void arrancarMotor();

    @Override
    public abstract void pararMotor();

    public String estadoMotor() {
        return encendido ? "Encendido" : "Apagado";
    }
}
