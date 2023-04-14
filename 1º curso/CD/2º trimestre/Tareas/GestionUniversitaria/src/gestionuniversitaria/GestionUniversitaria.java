/*
 * Programa para la gestión de matriculación de alumnos en universidades.
 */
package gestionuniversitaria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase principal (main). El orden del código del programa es:<br/>
 * <ol>
 * <li> Métodos llamados desde el menú principal.</li>
 * <li> Construcción del menú principal del programa.</li>
 * </ol>
 *
 * @author David Rodríguez Jácome
 */
public class GestionUniversitaria {

    /**
     * Se puede modificar un objeto como constante (final), pero no sus variables constantes.
     */
    private static final ArrayList<Universidad> universidades = new ArrayList();

    // Métodos correspondientes del menú principal de la interfaz. Opciones del 1 al 12.
    /**
     * 1. Dar de alta una universidad.
     */
    private static void crearUniversidad() {
        String nombreUniversidad = JOptionPane.showInputDialog("Introduce el nombre de la universidad: ");
        universidades.add(new Universidad(nombreUniversidad));
    }

    /**
     * 12. Listar las universidades dadas de alta en el sistema.
     */
    private static void listarUniversidades() {
        for (int i = 0; i < universidades.size(); i++) {
            JOptionPane.showMessageDialog(null, universidades.get(i).getNombre());
        }
    }

    /**
     * 2. Matricular estudiante en universidad.
     */
    private static void matricularEstudiante() {
        int pos = 0;
        boolean encontrado = false;
        String nombreUniversidad = JOptionPane.showInputDialog("Selecciona en qué universidad será matriculado el estudiante: ");
        for (int i = 0; !encontrado && (i < universidades.size()); i++) {
            if (universidades.get(i).getNombre().equals(nombreUniversidad)) {
                pos = i;
                encontrado = true;
            }
        }
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del estudiante: ");
        String cod = JOptionPane.showInputDialog("Introduce el código del estudiante: ");

        /**
         * @param Estudiante Necesitamos un objeto de tipo Estudiante para matricular a un nuevo estudiante.
         * @param Universidad Lo mismo ocurre con el objeto de tipo universidad. <\br>
         * Ambos objetos están destinados para funcionar únicamente en el ámbito del método matricularEstudiante.
         */
        Estudiante alumno = new Estudiante(nombre, cod);
        Universidad uni = new Universidad(nombreUniversidad);
        alumno.setUniversidad(uni);
        universidades.get(pos).getEstudiantes().add(alumno);
    }

    /**
     * 7. Listar el alumnado que estudia en una universidad.
     */
    private static void listarEstudiantes() {
        String listadoUnis = JOptionPane.showInputDialog("¿De qué universidad quieres listar los estudiantes?");
        for (int i = 0; i < universidades.size(); i++) {
            if (universidades.get(i).getNombre().equals(listadoUnis)) {
                for (int j = 0; j < universidades.get(i).getEstudiantes().size(); j++) {
                    JOptionPane.showMessageDialog(null, universidades.get(i).getEstudiantes().get(j).getNombre());
                }
            }
        }
    }

    /**
     * 3. Añadir facultad a una universidad.
     */
    private static void crearFacultad() {
        int pos = 0;
        boolean encontrado = false;
        String nombreUniversidad = JOptionPane.showInputDialog("Selecciona en qué universidad quieres crear la facultad: ");
        for (int i = 0; !encontrado && i < universidades.size(); i++) {
            if (universidades.get(i).getNombre().equals(nombreUniversidad)) {
                encontrado = true;
                pos = i;
            }
        }
        String nombre = JOptionPane.showInputDialog("Introduce el nombre de la facultad: ");

        Facultad facu = new Facultad(nombre);
        Universidad uni = new Universidad(nombreUniversidad);
        facu.setUniversidad(uni);
        universidades.get(pos).getFacultades().add(facu);
    }

    /**
     * 8. Consultar la lista de facultades asociadas a una universidad.
     */
    private static void listarFacultades() {
        String listadoFacus = JOptionPane.showInputDialog("¿De qué universidad quieres listar las facultades?");
        for (int i = 0; i < universidades.size(); i++) {
            if (universidades.get(i).getNombre().equals(listadoFacus)) {
                for (int j = 0; j < universidades.get(i).getFacultades().size(); j++) {
                    JOptionPane.showMessageDialog(null, universidades.get(i).getFacultades().get(j).getNombre());
                }
            }
        }
    }

    /**
     * 4. Añadir un grado a una facultad.
     */
    private static void crearGrado() {
        int pos = 0;
        boolean encontrado = false;
        String nombreUniversidad = JOptionPane.showInputDialog("Selecciona en qué universidad quieres crear el grado: ");
        for (int i = 0; !encontrado && i < universidades.size(); i++) {
            if (universidades.get(i).getNombre().equals(nombreUniversidad)) {
                encontrado = true;
                pos = i;
            }
        }
        int puesto = 0;
        boolean localizada = false;
        String nombreFacultad = JOptionPane.showInputDialog("Introduce el nombre de la facultad: ");
        for (int i = 0; !localizada && i < universidades.get(pos).getFacultades().size(); i++) {
            if (universidades.get(pos).getFacultades().get(i).getNombre().equals(nombreFacultad)) {
                localizada = true;
                puesto = i;
            }
        }
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del grado: ");
        String cod = JOptionPane.showInputDialog("Introduce el código: ");

        Grado carrera = new Grado(nombre, cod);
        Facultad facu = new Facultad(nombreFacultad);
        carrera.setFacultad(facu);
        universidades.get(pos).getFacultades().get(puesto).getGrados().add(carrera);
    }

    /**
     * 9. Listar los grados impartidos en una facultad .
     */
    private static void listarGrados() {
        String listadoUnis = JOptionPane.showInputDialog("Introduce primero la universidad para consultar las facultades: ");
        String listadoFacus = JOptionPane.showInputDialog("¿De qué facultad quieres listar los grados?");

        for (int i = 0; i < universidades.size(); i++) {
            if (universidades.get(i).getNombre().equals(listadoUnis)) {
                for (int j = 0; j < universidades.get(i).getFacultades().size(); j++) {
                    if (universidades.get(i).getFacultades().get(j).getNombre().equals(listadoFacus)) {
                        for (int k = 0; k < universidades.get(i).getFacultades().get(j).getGrados().size(); k++) {
                            JOptionPane.showMessageDialog(null, universidades.get(i).getFacultades().get(j).getGrados().get(k).getNombre());
                        }
                    }
                }
            }
        }
    }

    /**
     * 5. Matricular un alumno en un grado.
     */
    private static void matricularEstudianteGrado() {
        int pos = 0;
        boolean encontrado = false;
        String nombreUniversidad = JOptionPane.showInputDialog("Selecciona en qué universidad quieres añadir al estudiante: ");
        for (int i = 0; !encontrado && i < universidades.size(); i++) {
            if (universidades.get(i).getNombre().equals(nombreUniversidad)) {
                encontrado = true;
                pos = i;
            }
        }
        int puesto = 0;
        boolean localizada = false;
        String nombreFacultad = JOptionPane.showInputDialog("Selecciona en qué facultad quieres añadir al estudiante: ");
        for (int i = 0; !localizada && i < universidades.get(pos).getFacultades().size(); i++) {
            if (universidades.get(pos).getFacultades().get(i).getNombre().equals(nombreFacultad)) {
                localizada = true;
                puesto = i;
            }
        }
        int lugar = 0;
        boolean situado = false;
        String nombreGrado = JOptionPane.showInputDialog("Selecciona en qué grado quieres añadir al estudiante: ");
        for (int i = 0; !situado && i < universidades.get(pos).getFacultades().get(puesto).getGrados().size(); i++) {
            if (universidades.get(pos).getFacultades().get(puesto).getGrados().get(i).getNombre().equals(nombreGrado)) {
                situado = true;
                lugar = i;
            }
        }
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del estudiante: ");
        String cod = JOptionPane.showInputDialog("Introduce el código del estudiante: ");

        /*En este caso sólo interesa crear el objeto Grado con el parámetro nombre (nombreGrado),
        * ya que no es necesario el parámetro código (cod).
         */
        Estudiante alumno = new Estudiante(nombre, cod);
        Grado carrera = universidades.get(pos).getFacultades().get(puesto).getGrados().get(lugar);
        alumno.setGrado(carrera);
        universidades.get(pos).getFacultades().get(puesto).getGrados().get(lugar).getEstudiantes().add(alumno);
    }

    /**
     * 10. Listar el alumnado matriculado en un grado.
     */
    private static void listarEstudiantesGrado() {
        String listadoUnis = JOptionPane.showInputDialog("Introduce primero la universidad para consultar sus facultades: ");
        String listadoFacus = JOptionPane.showInputDialog("Introduce la facultad a consultar: ");
        String listadoGrados = JOptionPane.showInputDialog("¿De qué grado quieres consultar los estudiantes?");

        for (int i = 0; i < universidades.size(); i++) {
            if (universidades.get(i).getNombre().equals(listadoUnis)) {
                for (int j = 0; j < universidades.get(i).getFacultades().size(); j++) {
                    if (universidades.get(i).getFacultades().get(j).getNombre().equals(listadoFacus)) {
                        for (int k = 0; k < universidades.get(i).getFacultades().get(j).getGrados().size(); k++) {
                            if (universidades.get(i).getFacultades().get(j).getGrados().get(k).getNombre().equals(listadoGrados)) {
                                for (int l = 0; l < universidades.get(i).getFacultades().get(j).getGrados().get(k).getEstudiantes().size(); l++) {
                                    JOptionPane.showMessageDialog(null, universidades.get(i).getFacultades().get(j).getGrados().get(k).getEstudiantes().get(l).getNombre());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * 6. Asignar un profesor a un grado
     */
    private static void asignarProfesorGrado() {
        int pos = 0;
        boolean encontrado = false;
        String nombreUniversidad = JOptionPane.showInputDialog("Selecciona en qué universidad quieres asignar al profesor/a: ");
        for (int i = 0; !encontrado && i < universidades.size(); i++) {
            if (universidades.get(i).getNombre().equals(nombreUniversidad)) {
                encontrado = true;
                pos = i;
            }
        }
        int puesto = 0;
        boolean localizada = false;
        String nombreFacultad = JOptionPane.showInputDialog("Selecciona en qué facultad quieres asignar al profesor/a: ");
        for (int i = 0; !localizada && i < universidades.get(pos).getFacultades().size(); i++) {
            if (universidades.get(pos).getFacultades().get(i).getNombre().equals(nombreFacultad)) {
                localizada = true;
                puesto = i;
            }
        }
        int lugar = 0;
        boolean situado = false;
        String nombreGrado = JOptionPane.showInputDialog("Selecciona en qué grado quieres asignar al profesor/a: ");
        for (int i = 0; !situado && i < universidades.get(pos).getFacultades().get(puesto).getGrados().size(); i++) {
            if (universidades.get(pos).getFacultades().get(puesto).getGrados().get(i).getNombre().equals(nombreGrado)) {
                situado = true;
                lugar = i;
            }
        }
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del profesor/a: ");
        String cod = JOptionPane.showInputDialog("Introduce el código del profesor/a: ");

        Profesor maestro = new Profesor(nombre, cod);
        Grado carrera = universidades.get(pos).getFacultades().get(puesto).getGrados().get(lugar);
        maestro.setGrado(carrera);
        universidades.get(pos).getFacultades().get(puesto).getGrados().get(lugar).getProfesores().add(maestro);
    }

    /**
     * 11. Listar los profesores que imparten clases en un grado.
     */
    private static void listarProfesorGrado() {
        String listadoUnis = JOptionPane.showInputDialog("Introduce primero la universidad para consultar las facultades: ");
        String listadoFacus = JOptionPane.showInputDialog("Introduce la facultad a consultar: ");
        String listadoGrados = JOptionPane.showInputDialog("¿De qué grado quieres consultar los profesores?");

        for (int i = 0; i < universidades.size(); i++) {
            if (universidades.get(i).getNombre().equals(listadoUnis)) {
                for (int j = 0; j < universidades.get(i).getFacultades().size(); j++) {
                    if (universidades.get(i).getFacultades().get(j).getNombre().equals(listadoFacus)) {
                        for (int k = 0; k < universidades.get(i).getFacultades().get(j).getGrados().size(); k++) {
                            if (universidades.get(i).getFacultades().get(j).getGrados().get(k).getNombre().equals(listadoGrados)) {
                                for (int l = 0; l < universidades.get(i).getFacultades().get(j).getGrados().get(k).getProfesores().size(); l++) {
                                    JOptionPane.showMessageDialog(null, universidades.get(i).getFacultades().get(j).getGrados().get(k).getProfesores().get(l).getNombre());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Programa principal. Vista de las opciones del menú.<br/>
     * Las opciones se visualizan mediante interfaz gráfica. Los datos deberán ser introducidos por teclado.
     *
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        String menu;
        int opcion = 0;
        while (opcion != 13) {
            menu = (">>> Programa de gestión de universidades. Elige entre las siguientes opciones: \n\n"
                    + "1. Dar de alta una universidad.\n"
                    + "2. Matricular un estudiante en una universidad.\n"
                    + "3. Añadir facultad a una universidad.\n"
                    + "4. Añadir un grado a una facultad.\n"
                    + "5. Matricular un alumno en un grado.\n"
                    + "6. Asignar un profesor a un grado.\n"
                    + "7. Listar el alumnado que estudia en una universidad.\n"
                    + "8. Listar las facultades que forman una universidad.\n"
                    + "9. Listar los grados impartidos en una facultad.\n"
                    + "10. Listar el alumnado impartido en un grado.\n"
                    + "11. Listar los profesores que imparten las clases de un grado.\n"
                    + "12. Listar las universidades dadas de alta en el sistema.\n"
                    + "13. Salir.");
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            } while (opcion < 1 || opcion > 13);
            switch (opcion) {
                case 1:
                    crearUniversidad();
                    break;
                case 2:
                    matricularEstudiante();
                    break;
                case 3:
                    crearFacultad();
                    break;
                case 4:
                    crearGrado();
                    break;
                case 5:
                    matricularEstudianteGrado();
                    break;
                case 6:
                    asignarProfesorGrado();
                    break;
                case 7:
                    listarEstudiantes();
                    break;
                case 8:
                    listarFacultades();
                    break;
                case 9:
                    listarGrados();
                    break;
                case 10:
                    listarEstudiantesGrado();
                    break;
                case 11:
                    listarProfesorGrado();
                    break;
                case 12:
                    listarUniversidades();
                    break;
                case 13:
                    System.exit(0);
                    break;
            }
        }
    }
}
