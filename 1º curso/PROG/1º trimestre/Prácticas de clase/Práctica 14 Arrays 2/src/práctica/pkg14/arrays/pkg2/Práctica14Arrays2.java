/*
Pedir una nota por cada uno de los 12 alumnos que hay en clase.
 */
package práctica.pkg14.arrays.pkg2;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica14Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[] notasalumnos = new int[12];

        int total = 0;
        for (int i = 0; i < 12; i++) {
            System.out.print("Nota alumno" + (i + 1) + ": ");

            total += notasalumnos[i] = tec.nextInt();
        }
        System.out.printf("La media de la clase es %.2f\n", total / 12.0);
    }

}
