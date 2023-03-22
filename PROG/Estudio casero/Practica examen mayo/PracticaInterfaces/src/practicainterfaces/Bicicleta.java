/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicainterfaces;

/**
 *
 * @author alumno
 */
public class Bicicleta extends VehiculoSinMotor {

    private Rueda[] rueda = new Rueda[2];
    private int marchas;
    private boolean cuadroCarbono;
    private String marca;
    private double peso;

    void setPresion(int rueda, int presion) {
        if (rueda == 0 || rueda == 1) {
            this.rueda[rueda].presion = presion;
        }
    }

    @Override
    public void acelerando() {
        acelerar = true;
    }

    @Override
    public void frenando() {
        acelerar = false;
    }
}
