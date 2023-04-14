/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicainterfaces;

/**
 *
 * @author alumno
 */
public class Monociclo extends VehiculoSinMotor {

    Rueda rueda = new Rueda();
    private int alturaAsiento;
    private String tipoMaterial;

    @Override
    public void acelerando() {
        acelerar = true;
    }

    @Override
    public void frenando() {
        acelerar = false;
    }
}
