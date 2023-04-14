/*

 */
package práctica.pkg30.factorial.recursivo;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica30FactorialRecursivo {

    private static long factorialIterativo(long numero) {
        if (numero == 0) {
            return 1;
        }
        long factorial = 1;
        for (long i = numero; i > 1; i--) {
            factorial *= i;
        }
        return factorial;

    }

    private static long factorialRecursivo(long numero) {
        if (numero == 0) {
            return 1;
        }
        return numero * factorialRecursivo(numero - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce un número comprendido entre [0 -10]: ");

        int numero;
        do {
            numero = tec.nextInt();
        } while (numero < 0 || numero > 1000000);

        System.out.println("El factorial de " + numero + " es " + factorialIterativo(numero));

        System.out.println("El factorial de " + numero + " es " + factorialRecursivo(numero));
    }
}
