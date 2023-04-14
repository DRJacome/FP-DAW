/*

 */
package práctica.pkg17.arrays.multidimensionales.pkg2;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica17ArraysMultidimensionales2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[][] notas = new int[3][6];
        double[] mediasModulo = new double[notas[0].length];
        double[] mediasAlumno = new double[notas.length];
        String[] nombreAlumno = new String[notas.length];
        String[] nombreModulo = {"BD", "CD", "FOL", "LM", "Programación",
            "Sinf"};

        // Array simple de fila de nombres.
        for (int alumno = 0; alumno < notas.length; alumno++) {
            System.out.println("Introduce el nombre del alumno "
                    + (alumno + 1) + ": ");
            nombreAlumno[alumno] = tec.nextLine();
        }
        //Array simple de columna de módulos.
        for (int asignatura = 0; asignatura < notas[0].length; asignatura++) {
            System.out.println("Introduce el módulo "
                    + (asignatura + 1)
                    + ": ");
            nombreModulo[asignatura] = tec.nextLine();
        }
        /* Array bidimensional de notas. El primer for es para leer las filas,
        y el segundo for lee las columnas.
        1º for = lee las filas e introduce la variable "alumno" que es igual a 0,
        y debe terminar donde "alumno" sea menor que la variable "notas" y
        "lo largo que indice la dimensión de las filas" indicado por ".length",
        que en este caso es 3; incrementará en 1 hasta terminar.
        El segundo for es para las columnas y hace lo mismo para las columnas;
        sin embargo en "notas[0].length", el [0] indica que empiece a contar
        hasta el largo de la primera fila*/
        for (int alumno = 0; alumno < notas.length; alumno++) {
            for (int notaModulo = 0; notaModulo < notas[0].length; notaModulo++) {
                /*Que saque por pantalla el texto de la nota introdcida por teclado
                + el nombre del módulo + el nombre del alumno */
                System.out.println("Introduce la nota del parcial "
                        + (notaModulo + 1) + " del módulo " + nombreModulo[notaModulo]
                        + " del alumno: " + nombreAlumno[alumno]);
                /* Aquí se introduce la nota del alumno en qué módulo,
                y lo cogerá de lo que se indtroduzca por teclado
                en la siguiente línea. */
                notas[alumno][notaModulo] = tec.nextInt();
            }
        }
        /* Imprimir los resultados, es decir, la media de las notas
        de los alumnos y en los módulos. Esto se hace con un array bidimensional
        donde el primer for lee las filas y el segundo for lee las columnas. */
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                /* Este es la lecura de las ntoas medias de la fila "alumno"
                + el valor de lo que hay en cada posición de cada columna.
                Se hace la suma de cada posición de cada columa de cada fila.*/
                mediasAlumno[i] += notas[i][j];
                /* Es lo mismo que la operación anterior, sólo que se lee
                la posición de cada columna y el valor que haya en cada fila.*/
                mediasModulo[j] += notas[i][j];
            }
            /* Se saca por pantalla el nombre del alumno + la media del módulo
            partido por las posiciones de cada columna.*/
            System.out.println(nombreAlumno[i] + " tiene una media de "
                    + mediasAlumno[i] / notas[0].length);

            /* Este for es para sacar por pantalla las medias de los módulos.
            /* Se saca por pantalla el nombre del alumno + la media del módulo
            partido por las posiciones de cada fila.*/
            for (int j = 0; j < notas[0].length; j++) {
                System.out.println(" En " + nombreModulo[j]
                        + " hay una media de "
                        + mediasModulo[j] / notas.length);
            }
        }

        // Notas más altas.
        int notaMax = notas[0][0];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > notaMax) {
                    notaMax = notas[i][j];
                }
            }
        }
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] == notaMax) {
                    System.out.println("El alumno " + nombreAlumno[i]
                            + " tiene un " + notas[i][j]
                            + ", que es la nota más alta en "
                            + nombreModulo[j]);
                }
            }
        }
    }
}
