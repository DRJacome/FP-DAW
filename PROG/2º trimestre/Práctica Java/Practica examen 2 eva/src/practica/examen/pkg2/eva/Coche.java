/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.examen.pkg2.eva;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jacod
 */
public class Coche implements Comparable<Coche>, Serializable {

    private ArrayList<Rueda> ruedas = new ArrayList<>();
    private Chasis chasis;
    private Motor motor;
    private DepositoCombustible depositoCombustible;

    public Coche() {
    }

    public Coche(Chasis chasis, Motor motor, DepositoCombustible depositoCombustible) {
        this.chasis = chasis;
        this.motor = motor;
        this.depositoCombustible = depositoCombustible;
    }

    public ArrayList<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(ArrayList<Rueda> ruedas) {
        this.ruedas = ruedas;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public DepositoCombustible getDepositoCombustible() {
        return depositoCombustible;
    }

    public void setDepositoCombustible(DepositoCombustible depositoCombustible) {
        this.depositoCombustible = depositoCombustible;
    }

    @Override
    public String toString() {
        return "Coche{" + "ruedas=" + ruedas
                + ", chasis=" + chasis
                + ", motor=" + motor
                + ", depositoCombustible=" + depositoCombustible + '}';
    }

    @Override
    public int compareTo(Coche o) {
        return this.chasis.getPeso() - o.getChasis().getPeso();
    }
}
