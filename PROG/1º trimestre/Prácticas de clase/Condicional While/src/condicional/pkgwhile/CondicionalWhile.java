/*

 */
package condicional.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class CondicionalWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Con for de 2 en 2 [23-9] ");
        for (int contador = 3; contador < 10; contador += 2) {
            System.out.println((contador) + " - David");
        }
        System.out.println("Con while de 2 en 2 [3-9]");
        int contador2 = 3;
        while (contador2 < 10) {
            System.out.println((contador2) + " - David");
            contador2 += 2;
        }
        System.out.println("Con do while de 2 en 2 [3-9]");
        int contador3 = 3;
        do {
            System.out.println((contador3) + " - David");
            contador3 += 2;
        } while (contador3 < 10);
    }

}
