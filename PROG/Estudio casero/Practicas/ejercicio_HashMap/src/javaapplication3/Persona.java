/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author user
 */
public class Persona {

    String nombre, apellido1, apellido2, dni, calle;
    int numero, cd;
    String poblacion, provincia;

    public Persona(String nombre, String apellido1, String apellido2, String dni, String calle, int numero, int cd, String poblacion, String provincia) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.calle = calle;
        this.numero = numero;
        this.cd = cd;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni + ", calle=" + calle + ", numero=" + numero + ", cd=" + cd + ", poblacion=" + poblacion + ", provincia=" + provincia + '}';
    }

    public String istCorto() {
        return "Persona{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni + ", calle=" + calle + ", numero=" + '}';
    }
}
