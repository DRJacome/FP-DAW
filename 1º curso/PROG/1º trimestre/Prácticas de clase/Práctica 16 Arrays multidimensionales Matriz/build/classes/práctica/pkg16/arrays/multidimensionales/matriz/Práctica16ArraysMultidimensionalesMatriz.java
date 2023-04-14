/*

 */
package práctica.pkg16.arrays.multidimensionales.matriz;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica16ArraysMultidimensionalesMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numAlumnos = 2, numParciales = 3;
        int[][] notas = new int[numAlumnos][numParciales];

        System.out.println("Introducir las notas de todos los alumnos");
        //int notaFinal;
        /*System.out.println("por defecto se rellena a 0"
                + "\nNota del tercer alumno, primera parcial");*/
        //System.out.println(notas[2][0]);

        // recorre las filas
        //int[] prueba = new int[12];
        for (int i = 0; i < numAlumnos; i++) {
            // recorre las columnas de la fila i
            for (int j = 0; j < numParciales; j++) {
                //notas[i][j] = tec.nextInt();

                System.out.println("Introduce nota del parcial " + (j + 1) + " de "
                        + numParciales + " del alumno " + (i + 1) + " de "
                        + numAlumnos + ": ");
                notas[i][j] = tec.nextInt();

                //System.out.println(notas);
            }
        }
        // imprimir matriz
        System.out.println("\n\nMatriz con los resultados");
        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < numParciales; j++) {
                System.out.print(notas[i][j] + "   ");
            }
            System.out.println("");
        }
        /*System.out.println("Rellenamos con unos la matriz");
        System.out.println("Nota del décimo alumno en el tercer parcial");
        // nota del décimo alumno en el tercer parcial
        System.out.println(notas[9][2]);*/
    }

}
