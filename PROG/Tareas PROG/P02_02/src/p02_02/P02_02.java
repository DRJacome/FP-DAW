/*
Con datos de tipo short, programa que compruebe que el rango de valores se comporta de modo cíclico
(el siguiente al máximo es el mínimo y viceversa).
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

        short a = Short.MAX_VALUE;
        System.out.println("Máximo valor short: " + a + ".");

        System.out.print("Al incrementar 1 unidad en su parte positiva pasa a su mínimo valor: ");
        a++;
        System.out.println(a + ".\n");

        a = Short.MIN_VALUE;
        System.out.println("Mínimo valor short: " + a + ".");

        System.out.print("Al incrementar 1 unidad en su parte negativa pasa a su máximo valor: ");
        a--;
        System.out.println(a + ".");
    }
}
