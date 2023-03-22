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
public interface VehiculoMotor {

    void encenderMotor();

    void apagarMotor();

    void aumentarPotencia(double porcentaje);

    double consultarPotencia();
}
