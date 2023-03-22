/*

 */
package p03_01;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce 3 números. Primer número: ");
        int num1 = tec.nextInt();

        System.out.println("Segundo número: ");
        int num2 = tec.nextInt();

        System.out.println("Tercer número: ");
        int num3 = tec.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es el más grande de todos los números.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es el más grande de todos los números.");
        } else {
            System.out.println(num3 + " es el más grande de todos los números.");
        }
    }
}
