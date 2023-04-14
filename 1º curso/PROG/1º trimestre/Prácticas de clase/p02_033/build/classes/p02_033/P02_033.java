/*

 */
package p02_033;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P02_033 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        System.out.println("Introduce un número entre [32-255]");

        num = tec.nextInt();

        if (num >= 32 && num <= 255) {
            System.out.println((char) num);
        } else {
            System.out.println("Tiene que estar en el rango [32-255]");
            num = tec.nextInt();
            if (num >= 32 && num <= 255) {
                System.out.println((char) num);
            } else {
                System.out.println("Número no válido");
            }
        }
    }
}
