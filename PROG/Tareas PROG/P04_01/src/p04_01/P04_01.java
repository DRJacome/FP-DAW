/*
Rellenar un vector con los números pares del intervalo [6-54].
Imprimir el vector de modo que cada número ocupe 4 espacios.
 */
package p04_01;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P04_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // Creo un vector con 25 posiciones.
        int[] vector = new int[25];
        int auxiliar = 0;

        // Relleno el vector.
        for (int i = 6; i <= 54; i += 2) {
            // Compruebo que cada número es par o no.
            // Almaceno en una variable cada número par.
            vector[auxiliar] = i;
            auxiliar++;
        }
        // Recorro el vector e imprimo cada posición con el formato concreto.
        for (int i = 0; i < vector.length; i++) {
            /*"%4d" = imprime una variable con tipo de dato entero 
             * con cuatro espacios a su izquierda.
             */
            System.out.printf("%4d", vector[i]);
            // Imprimo cada iteracción en la siguiente línea.
            
        }
        System.out.println("");
    }
}
