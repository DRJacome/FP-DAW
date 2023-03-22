/*

 */
package array;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[] nota = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.println("Introduce la nota del alumno " + (i + 1));
            nota[i] = tec.nextInt();

        }
        System.out.println("Introduce número de alumno [1-12]");
        int alumno = tec.nextInt();
        System.out.println("El alumno " + alumno + " tiene " + (nota[alumno - 1]));
    }

}
