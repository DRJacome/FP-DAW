/*
Pedir al usuario su edad y mostrar la que tendrá el próximo año.
 */
package p02_01;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P02_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int edad;

        do {
            System.out.println("Introduce tu edad: ");
            edad = tec.nextInt();
            if (edad < 0) {
                System.out.println("Incorrecto. Introduce un número positivo.");
            } else {
                System.out.println("El año que viene tendrás " + (edad + 1) + " años.");
            }
        } while (edad < 0);
    }
}
