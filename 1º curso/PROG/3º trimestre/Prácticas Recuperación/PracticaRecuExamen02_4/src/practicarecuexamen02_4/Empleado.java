/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarecuexamen02_4;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author jacod
 */
public class Empleado {

    private String nombre;
    private String apellidos;
    private LocalDate fechaNcimiento;
    private LocalDate actual = LocalDate.now();
    private int antiguedad;
    private double salario;
    private Period periodo;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, LocalDate fechaNcimiento, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNcimiento = fechaNcimiento;
        this.salario = salario;
        periodo = Period.between(fechaNcimiento, actual);
        this.antiguedad = periodo.getYears();
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre
                + ", apellidos=" + apellidos
                + ", fechaNcimiento=" + fechaNcimiento
                + ", antiguedad=" + antiguedad
                + ", salario=" + salario + '}';
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the fechaNcimiento
     */
    public LocalDate getFechaNcimiento() {
        return fechaNcimiento;
    }

    /**
     * @param fechaNcimiento the fechaNcimiento to set
     */
    public void setFechaNcimiento(LocalDate fechaNcimiento) {
        this.fechaNcimiento = fechaNcimiento;
    }

    /**
     * @return the antiguedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * @param antiguedad the antiguedad to set
     */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
