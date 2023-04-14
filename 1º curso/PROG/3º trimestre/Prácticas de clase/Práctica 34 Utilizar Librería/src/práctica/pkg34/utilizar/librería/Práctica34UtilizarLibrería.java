/*

 */
package práctica.pkg34.utilizar.librería;

import es.rodriguez.david.mates.Recursion;
import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica34UtilizarLibrería {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Calcula el factorial de un número.");
        System.out.print("Introduce un número: ");
        int num = tec.nextInt();
        System.out.println(Recursion.factorial(num));
    }
}
