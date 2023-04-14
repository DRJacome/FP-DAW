/*

 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a = 0;
        while (a < 10) {
            System.out.println(a);
            ++a;
        }
        System.out.println("Se acabó el bucle");
    }
}
