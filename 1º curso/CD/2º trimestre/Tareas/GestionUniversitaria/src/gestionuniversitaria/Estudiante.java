package gestionuniversitaria;

/**
 * Clase Estudiante. <br/>
 * Alberga información sobre el estudiante. <br/>
 *
 * @author David Rodríguez Jácome.
 */
public class Estudiante {

    private String nombre;
    private String cod;

    private Universidad universidad;
    private Grado grado;

    /**
     * Constructor por defecto de la clase Estudiante.
     */
    public Estudiante() {
    }

    /**
     * Constructor alternativo de la clase Estudiante.
     *
     * @param nombre Nombre del estudiante.
     * @param cod Código del estudiante.
     */
    public Estudiante(String nombre, String cod) {
        this.nombre = nombre;
        this.cod = cod;
    }

    /**
     * Devuelve el nombre del estudiante.
     *
     * @return nombre Nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     *
     * @param nombre Nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el código de identificación del estudiante.
     *
     * @return cod Código del estudiante.
     */
    public String getCod() {
        return cod;
    }

    /**
     * Establece el código de identificación del estudiante.
     *
     * @param cod Código del estudiante.
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * Devuelve la universidad donde se encuentre el estudiante.
     *
     * @return universidad Nombre dela universidad.
     */
    public Universidad getUniversidad() {
        return universidad;
    }

    /**
     * Establece la universidad donde se encuentre el estudiante.
     *
     * @param universidad Nombre de la universidad.
     */
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    /**
     * Devuelve el grado donde se encuentre el estudiante.
     *
     * @return grado Nombre del grado.
     */
    public Grado getGrado() {
        return grado;
    }

    /**
     * Establece el grado donde se encuentre el estudiante.
     *
     * @param grado Nombre del grado.
     */
    public void setGrado(Grado grado) {
        this.grado = grado;
    }
}
