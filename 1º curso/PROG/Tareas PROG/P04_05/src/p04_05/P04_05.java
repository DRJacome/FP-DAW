/*
Utilizando un array tridimensional y dos vectores,
almacenar las notas de los tres parciales de los módulos de 1ª de un determinado curso
obtenidas por todos los alumnos.

El número y nombre de los módulos, el número y nombres
y apellidos de los alumnos y las notas se pedirán por teclado.

Una vez rellenados, imprimir:

   - La nota del primer parcial obtenida en el tercer módulo, por el quinto alumno.
   - La media de las notas obtenidas por el segundo alumno en el primer módulo.

(debe aparecer el nombre completo del alumno y del módulo).
 */
package p04_05;

import java.util.Scanner;

/**
 * NOTA: Han de introducirse cinco alumnos; de lo contrario, la ejecución del programa devolverá un error en la consulta de notas.
 *
 * @author David Rodríguez Jácome
 */
public class P04_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int parcial = 3;
        int mediaAlumno;

        // Pido al usuario que introduzca los datos con los que trabajará el programa.
        System.out.println("¿Cuántos alumnos hay en clase?");
        int alumnos = tec.nextInt();
        tec.nextLine();

        System.out.println("¿Cuántos módulos hay?");
        int modulos = tec.nextInt();
        tec.nextLine();

        // Creo un array tridimensional para almacenar los datos.
        int[][][] notas = new int[parcial][modulos][alumnos];

        // Arrays simples para rellenar nombres de alumnos y módulos.
        String[] nombreAlumno = new String[alumnos];
        for (int i = 0; i < alumnos; i++) {
            System.out.println("¿Cuál es el nombre del alumno/a " + (i + 1) + "?");
            nombreAlumno[i] = tec.nextLine();
        }
        String[] nombreModulo = new String[modulos];
        for (int i = 0; i < modulos; i++) {
            System.out.println("¿Cómo se llama el módulo " + (i + 1) + "?");
            nombreModulo[i] = tec.nextLine();
        }

        // Array tridimensional que lee los alumnos y módulos para almacenar las notas de los parciales donde corresponde.
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                for (int k = 0; k < notas[i][j].length; k++) {
                    System.out.println("Introduce la nota del módulo " + nombreModulo[j]
                            + " del alumno " + nombreAlumno[k]
                            + " en el control parcial " + (i + 1) + ":");
                    notas[i][j][k] = tec.nextInt();
                    tec.nextLine();
                }
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Nota del alumno/a " + nombreAlumno[4] + " en el módulo " + nombreModulo[2] + ": "
                + notas[0][2][4] + "\n");
        System.out.println("-------------------------------------");

        // Media redondeada de un alumno en concreto.
        mediaAlumno = Math.round(((notas[0][0][1] + notas[1][0][1] + notas[2][0][1]) / 3) * 100) / 100;
        System.out.println("Media del alumno/a " + nombreAlumno[1] + " en el módulo " + nombreModulo[0] + ": "
                + mediaAlumno);
    }
}
