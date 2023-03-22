/*
Programa que pida un número entero e imprima una línea
con el resultado de multiplicarlo por 8,
y otra línea con el resultado de dividirlo por cuatro.
No se pueden utilizar los operadores aritméticos (+ - * / %)
 */
package p02_02;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P02_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = tec.nextInt();

        System.out.println(numero + " * 8: " + (numero << 3));
        System.out.println(numero + " / 4: " + (numero >> 2));
    }

}
