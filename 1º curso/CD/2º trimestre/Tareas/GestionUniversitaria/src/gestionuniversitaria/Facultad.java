/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionuniversitaria;

import java.util.ArrayList;

/**
 * Clase Facultad. <br/>
 * Alberga información sobre la facultad. <br/>
 * Contiene una lista de grados.
 *
 * @author David Rodríguez Jácome.
 */
public class Facultad {

    private String nombre;

    private Universidad universidad;

    private ArrayList<Grado> grados = new ArrayList();

    /**
     * Constructor por defecto de facultad.
     */
    public Facultad() {
    }

    /**
     * Constructor alternativo de facultad.
     *
     * @param nombre Nombre de la facultad.
     */
    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre de la facultad.
     *
     * @return Nombre de la facultad.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la facultad.
     *
     * @param nombre Nombre de la facultad.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la universidad de la facultad.
     *
     * @return Nombre de la universidad.
     */
    public Universidad getUniversidad() {
        return universidad;
    }

    /**
     * Establece la universidad de la facultad.
     *
     * @param universidad Nombre de la universidad.
     */
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    /**
     * Devuelve la lista de grados de la facultad.
     *
     * @return Lista de grados.
     */
    public ArrayList<Grado> getGrados() {
        return grados;
    }

    /**
     * Inserta la lista de grados de la facultad.
     *
     * @param grados Grados a insertar.
     */
    public void setGrados(ArrayList<Grado> grados) {
        this.grados = grados;
    }
}
