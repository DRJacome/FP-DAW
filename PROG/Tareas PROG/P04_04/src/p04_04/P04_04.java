/*
Mediante un array de dos dimensiones imprimir un tablero de ajedrez. 
Representaremos las casillas blancas con un 0 y las negras con un 1.
 */
package p04_04;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P04_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // Creo un array bidimensional para el tablero.
        int[][] tablero = new int[8][8];
        // Creo las casillas del tablero.
        int blancas = 0, negras = 1;

        // Recorro el tablero para colocar las casillas de colores.
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                // Si las posiciones son pares, la casilla es blanca;
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = blancas;
                    // Si las posiciones son impares o si uno es par y otro impar,
                    // la casilla es negra.
                } else {
                    tablero[i][j] = negras;
                }
                // Imprimo en la misma línea con separación entre casillas para ajustar el formato de salida de las filas.
                System.out.print(tablero[i][j] + " ");
            }
            // Imprimo un salto de línea al final de cada fila.
            System.out.println();
        }
    }
}
