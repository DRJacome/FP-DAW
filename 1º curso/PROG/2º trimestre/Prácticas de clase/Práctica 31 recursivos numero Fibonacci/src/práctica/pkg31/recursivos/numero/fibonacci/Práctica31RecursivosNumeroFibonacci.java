/*

 */
package práctica.pkg31.recursivos.numero.fibonacci;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica31RecursivosNumeroFibonacci {

    private static long fibonacciRecursivo(long numero) {
        if (numero <= 1) {
            return numero;
        }
        return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numero;
        do {
            numero = tec.nextInt();
        } while (numero < 0);

        //System.out.println("El número de Fibonacci de " + numero + " es " + fibonacciIterativo(numero));
        System.out.println("El número de Fibonacci de " + numero + " es " + fibonacciRecursivo(numero));
    }
}
