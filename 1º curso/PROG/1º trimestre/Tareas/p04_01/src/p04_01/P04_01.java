/*
Crear un array de dos dimensiones para almacenar las notas de los 3 parciale
de todos los alumnos del módulo de programación.

Pedir todas las notas por teclado.

Imprimir la matriz resultante.

Pedir por teclado un número de alumno (comprobar su validez)
e imprimir su nota final (media de los parciales).
 */
package p04_01;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P04_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int alumnos = 5, parciales = 3;
        int[][] notas = new int[alumnos][parciales];
        String[] nombreAlumno = new String[alumnos];

        System.out.println("Introduce las notas de los alumnos");

        for (int alumno = 0; alumno < alumnos; alumno++) {
            System.out.println("Nombre: ");
            nombreAlumno[alumno] = tec.nextLine();
            for (int parcial = 0; parcial < parciales; parcial++) {

                do {
                    System.out.println("Introduce nota del parcial "
                            + (parcial + 1)
                            + " de " + parciales
                            + " del alumno "
                            + (alumno + 1)
                            + " de " + alumnos + ": ");
                    notas[alumno][parcial] = tec.nextInt();
                } while (notas[alumno][parcial] < 1
                        || notas[alumno][parcial] > 10);
            }
        }
        System.out.println("\n\nMatriz con los resultados de los parciales");
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < parciales; j++) {
                System.out.print(notas[i][j] + "   ");
            }
            System.out.println("");
        }

        int numeroAlumno;
        do {
            System.out.println("Introduzca un número de "
                    + "alumno válido a consultar: ");
            numeroAlumno = tec.nextInt();
        } while (numeroAlumno < 1 || numeroAlumno > alumnos);

        int total = 0;
        for (int i = 0; i < parciales; i++) {
            total += notas[numeroAlumno - 1][i];
        }
        System.out.printf("La nota final del alumno %s es %.2f ", nombreAlumno[numeroAlumno - 1],
                total / (double) parciales);
    }

}
