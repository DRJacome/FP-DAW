/*
Imprimir los números impares en el intervalo [1-50] al revés.
 */
package p03_03;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Números impares entre 50 y 1");
        for (int contador = 49; contador > 0; contador -= 2) {
            System.out.println(contador);
        }
    }

}
