/*

 */
package práctica.pkg13.arrays;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica13Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int[] notasDavidProgramacion = new int[3];

        notasDavidProgramacion[0] = 7;
        notasDavidProgramacion[1] = 8;
        notasDavidProgramacion[2] = 9;

        /*if (notasDavidProgramacion[0] >= 5) {
            System.out.println("Aprobó");*/
        int[] notasDavid = new int[3];

        System.out.println("Nota parcial 1: ");
        notasDavid[0] = tec.nextInt();
        System.out.println("Nota parcial 2: ");
        notasDavid[1] = tec.nextInt();
        System.out.println("Nota parcial 3: ");
        notasDavid[2] = tec.nextInt();

        System.out.printf("David tiene una nota final de %.2f\n",
                (notasDavid[0] + notasDavid[1] + notasDavid[2]) / 3.0);
    }
}
