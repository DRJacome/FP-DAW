/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionuniversitaria;

import java.util.ArrayList;

/**
 * Clase Universidad.<\br>
 * Alberga información sobre la universidad.<\br>
 * Contiene dos listas: <ol>
 * <li> una con estudiantes.</li>
 * <li> una con facultades.</li>
 * </ol>
 *
 * @author David Rodríguez Jácome.
 */
public class Universidad {

    //Atributo de la clase Universidad.
    private String nombre;

    /*ArrayList es un atributo que contienee objetos de tipo Estudiante llamado estudiantes.
  Los Arrays siempre vienen de las relaciones donde puede haber n objetos. Ejemplo:
  La clase Universidad contiene un ArrayList de Estudiantes y Facultades
  porque en una Universidad hay n Estudiantes y n Facultades,
  pero un Estudiante y una Facultad sólo pueden pertenecer a una Universidad.
     */
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Facultad> facultades = new ArrayList<>();

    /**
     * Constructor por defecto de universidad.
     */
    public Universidad() {
    }

    /**
     * Constructor alternativo de universidad.
     *
     * @param nombre Nombre de la universidad.
     */
    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre de la universidad.
     *
     * @return Nombre de la universidad.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la universidad.
     *
     * @param nombre Nombre de la universidad.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la lista de estudiantes de la universidad.
     *
     * @return Devuelve la lista de estudiantes.
     */
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /**
     * Inserta la lista de estudiantes de la universidad.
     *
     * @param estudiantes Estudiantes a insertar.
     */
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     * Devuelve la lista de facultades de la universidad.
     *
     * @return Devuelve la lista de facultades.
     */
    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }

    /**
     * Inserta la lista de facultades de la universidad.
     *
     * @param facultades Facultades a insertar.
     */
    public void setFacultades(ArrayList<Facultad> facultades) {
        this.facultades = facultades;
    }

}
