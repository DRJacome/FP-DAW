/*
Programa que pida un número entero mayor que 1, e indique el total de
números primos existentes entre el número 2 y el número introducido,
ambos inclusive.

Se debe imprimir también el tiempo invertido en el cálculo.
Se empezará a contar después de haber recibido un número correcto.
 */
package p03_07;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número entero mayor que 1: ");

        int numero;
        do {
            numero = tec.nextInt();
        } while (numero < 2);

        long t1 = System.currentTimeMillis();
        int contador = 0;

        for (int num = 2; num <= numero; num++) {

            boolean primo = true;
            for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
                if (num % divisor == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                ++contador;
            }
        }
        long t2 = System.currentTimeMillis();
        long dif = t2 - t1;
        System.out.println("Hay " + contador + " primos entre 2 y " + numero);
        System.out.printf("Has tardado: %.3f segundos\n\n", (double) dif / 1000);
    }
}