/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionuniversitaria;

/**
 * Clase Profesor.<\br>
 * Alberga información sobre el profesor.<\br>
 *
 * @author David Rodríguez Jácome.
 */
public class Profesor {

    private String nombre;
    private String cod;

    private Grado grado;

    /**
     * Constructor por defecto de la clase Profesor.
     */
    public Profesor() {
    }

    /**
     * Constructor alternativo de la clase Profesor.
     *
     * @param nombre Nombre del profesor.
     * @param cod Código del profesor.
     */
    public Profesor(String nombre, String cod) {
        this.nombre = nombre;
        this.cod = cod;
    }

    /**
     * Devuelve el nombre del profesor.
     *
     * @return nombre Nombre del profesor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del profesor.
     *
     * @param nombre Nombre del profesor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el código de identificación del profesor.
     *
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * Establece el código de identificación del profesor.
     *
     * @param cod Código del profesor.
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * Devuelve el grado donde se encuentra el profesor.
     *
     * @return grado Nombre del grado.
     */
    public Grado getGrado() {
        return grado;
    }

    /**
     * Establece el grado donde se encuentre el profesor.
     *
     * @param grado Nombre del grado.
     */
    public void setGrado(Grado grado) {
        this.grado = grado;
    }
}
