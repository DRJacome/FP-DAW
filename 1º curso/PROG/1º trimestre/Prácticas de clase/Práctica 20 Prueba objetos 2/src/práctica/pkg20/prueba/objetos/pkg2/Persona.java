/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg20.prueba.objetos.pkg2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author alumno
 */
public class Persona {

    String dni;
    String nombre;
    String fechaNacimiento;
    int estatura;
    DireccionPostal direccion;

    public Persona() {
    }

    public Persona(String dni, String nombre, String fechaNacimiento, int estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estatura = estatura;
    }

    public Persona(String dni, String nombre, String fechaNacimiento, int estatura, DireccionPostal direccion,
            String cp, String calle, int numero, String poblacion, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estatura = estatura;
        this.direccion = new DireccionPostal(cp, calle, numero, poblacion, provincia);
    }

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre
                + "\n DNI: " + dni
                + "\n fecha de nacimiento: " + fechaNacimiento
                + "\n edad: " + calcularEdad()
                + "\n estatura: " + estatura
                + "\n" + direccion;
    }

    int calcularEdad() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formato);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        return periodo.getYears();
    }

}
