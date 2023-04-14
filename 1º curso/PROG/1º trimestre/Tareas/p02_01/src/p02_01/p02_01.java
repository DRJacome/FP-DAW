/*
Programa que pida un número entero por teclado e indique si es par o impar.
 */
package p02_01;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class p02_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = tec.nextInt();
        System.out.println("El número " + numero + " es "
                + (numero % 2 == 0 ? "par." : "impar."));
    }
}