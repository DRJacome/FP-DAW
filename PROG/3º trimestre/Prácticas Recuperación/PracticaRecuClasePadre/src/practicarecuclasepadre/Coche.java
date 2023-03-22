/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarecuclasepadre;

/**
 *
 * @author alumno
 */
public class Coche implements VehiculoMotor {

    private final Motor motor;
    private String color;

    public Coche(Motor motor, String color) {
        this.motor = motor;
        this.color = color;
    }

    public Coche(double potencia, double cilindrada, String tipo, boolean encendido, String color) {
        motor = new Motor(potencia, cilindrada, tipo, encendido);
        this.color = color;
    }

    @Override
    public void encenderMotor() {
        motor.setEncendido(true);
    }

    @Override
    public void apagarMotor() {
        motor.setEncendido(false);
    }

    @Override
    public void aumentarPotencia(double porcentaje) {
        motor.setPotencia(motor.getPotencia() * porcentaje);
    }

    @Override
    public double consultarPotencia() {
        return motor.getPotencia();
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

}
