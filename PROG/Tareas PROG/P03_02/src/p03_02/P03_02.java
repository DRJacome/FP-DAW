/*
Rellenar tres variables int desde teclado.
Imprimir sus valores ordenados de mayor a menor.
 */
package p03_02;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int auxiliar;

        System.out.println("Este programa te permite ordenar hasta 3 números de mayor a menor.\n"
                + " Primer número: ");
        int a = tec.nextInt();

        System.out.println("Segundo número: ");
        int b = tec.nextInt();

        System.out.println("Tercer número: ");
        int c = tec.nextInt();

        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("Orden de mayor a menor: " + a + ", " + b + ", " + c + ".");
                } else {
                    System.out.println("Orden de mayor a menor: " + a + ", " + c + ", " + b + ".");
                }
            } else {
                System.out.println("Orden de mayor a menor: " + c + ", " + a + ", " + b + ".");
            }
        } else {
            if (b > c) {
                if (a > c) {
                    System.out.println("Orden de mayor a menor: " + b + ", " + a + ", " + c + ".");
                } else {
                    System.out.println("Orden de mayor a menor: " + b + ", " + c + ", " + a + ".");
                }
            } else {
                System.out.println("Orden de mayor a menor: " + c + ", " + b + ", " + a + ".");
            }
        }
    }
}
