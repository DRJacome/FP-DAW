/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg18.clases;

/**
 *
 * @author alumno
 */
public class Persona {

    //Campos -> estado.
    String nombre;
    String apellidos;
    double estatura;
    boolean trabaja;
    int edad;
    String puestoTrabajo;

    // Métodos -> comportamiento.
    /* Tipo de valor a devolver -> nombre (información necesaria).
    Void significa que nosotros metemos los datos y no los devuelve;
    Double u otro tipo significa que le metemos datos y sí los devuelve. */
    void cambiarNombre(String nombreNuevo) {
        nombre = nombreNuevo;
    }

    void colocar(String nuevoPuestoTrabajo) {
        puestoTrabajo = nuevoPuestoTrabajo;
        trabaja = true;
    }

    void despedir() {
        puestoTrabajo = "";
        trabaja = true;
    }

    double estaturaEnPulgadas() {
        return estatura * 0.39370;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", estatura=" + estatura + ", trabaja=" + trabaja + ", edad=" + edad + ", puestoTrabajo=" + puestoTrabajo + '}';
    }

}
