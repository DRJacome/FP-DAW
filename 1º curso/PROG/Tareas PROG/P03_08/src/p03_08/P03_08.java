
/*
Pedir 10 números enteros por teclado e imprimir la media de aquellos que sean pares.
 */
package p03_08;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numero = 0;
        int total = 0;
        int media = 0;
        int cantidadNumeros = 0;

        System.out.println("Este programa permite calcular "
                + "la media de números pares."
                + " Introduce 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ":");
            numero = tec.nextInt();
            if (numero % 2 == 0) {
                total += numero;
                cantidadNumeros++;
            }
        }
        media = total / cantidadNumeros;
        System.out.println("Media de los números pares introducidos: "
                + media);
    }
}
