/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionuniversitaria;

import java.util.ArrayList;

/**
 * Clase Grado. <\br>
 * Alberga información sobre el grado. <\br>
 * Contiene dos listas: <ol>
 * <li> una con estudiantes.</li>
 * <li> una con profesores</li>
 * </ol>
 *
 * @author David Rodríguez Jácome.
 */
public class Grado {

    private String nombre;
    private String cod;

    private Facultad facultad;

    private ArrayList<Estudiante> estudiantes = new ArrayList();
    private ArrayList<Profesor> profesores = new ArrayList();

    /**
     * Constructor por defecto de grado.
     */
    public Grado() {
    }

    /**
     * Constructor alternativo de grado.
     *
     * @param nombre Nombre del grado.
     * @param cod Código del grado.
     */
    public Grado(String nombre, String cod) {
        this.nombre = nombre;
        this.cod = cod;
    }

    /**
     * Devuelve el nombre del grado.
     *
     * @return nombre Nombre del grado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del grado.
     *
     * @param nombre Nombre del grado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el código de identificación del grado.
     *
     * @return Código del grado.
     */
    public String getCod() {
        return cod;
    }

    /**
     * Establece el código de identificación del grado.
     *
     * @param cod Código de grado.
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * Devuelve la lista de estudiantes en el grado.
     *
     * @return the estudiantes Nombre de los alumnos matriculados en el grado.
     */
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /**
     * Inserta la lista de estudiantes en el grado.
     *
     * @param estudiantes Alumnos a matricular en el grado.
     */
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     * Devuelve la lista de profesores del grado.
     *
     * @return profesores Nombre de los profesores inscritos en el grado.
     */
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    /**
     * Inserta la lista de profesores en el grado.
     *
     * @param profesores Profesores a inscribir en el grado.
     */
    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    /**
     * Devuelve la facultad donde se encuentra el grado.
     *
     * @return Nombre de la facultad.
     */
    public Facultad getFacultad() {
        return facultad;
    }

    /**
     * Establece la facultad del grado.
     *
     * @param facultad Facultades a crear en el grado.
     */
    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
}
