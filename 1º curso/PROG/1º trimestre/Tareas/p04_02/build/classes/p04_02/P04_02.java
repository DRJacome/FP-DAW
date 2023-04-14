/*
Juego del tres en raya.

Crear una matriz de 3x3.

Pedir posición a los jugadores de modo alternativo, rellenado la posición
elegida con una marca diferente para cada jugador. Si la posición indicada ya
había sido elegida o bien cae fuera de los límites de la matriz,
pedirla de nuevo hasta que se introduzca una válida.

Después de cada jugada de cada jugador, imprimir la matriz.
 */
package p04_02;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P04_02 {

    /**
     * @param args the command line arguments
     */
    static void imprimeArrayChar(char[][] x) {
        //System.out.printf("%2c%2c%2c", 218 196, 191);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.printf("%4c", x[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //System.out.println("De caracteres");

        char[][] tablero = new char[3][3];
        //ImprimeArrayChar(tablero);
        int fila, columna;
        for (int i = 0; i < 4; i++) {
            System.out.println("Jugada " + (i + 1) + " jugador 1: ");
            do {
                System.out.print("fila: ");
                fila = tec.nextInt() - 1;
                System.out.print("columna: ");
                columna = tec.nextInt() - 1;
            } while (fila < 0 || fila > 2 || columna < 0 || columna > 2
                    || tablero[fila][columna] == '-'
                    || tablero[fila][columna] == 'X');
            tablero[fila][columna] = 'X';
            imprimeArrayChar(tablero);

            System.out.println("Jugada: " + (i + 1) + " jugador 2: ");
            do {
                System.out.print("fila: ");
                fila = tec.nextInt() - 1;
                System.out.print("columna: ");
                columna = tec.nextInt() - 1;
            } while (fila < 0 || fila > 2 || columna < 0 || columna > 2
                    || tablero[fila][columna] == '-'
                    || tablero[fila][columna] == 'X');
            tablero[fila][columna] = '-';
            imprimeArrayChar(tablero);
        }
        System.out.println("Jugada 5, jugador 1: ");
        do {
            System.out.print("fila: ");
            fila = tec.nextInt() - 1;
            System.out.print("columna: ");
            columna = tec.nextInt() - 1;
        } while (fila < 0 || fila > 2 || columna < 0 || columna > 2
                || tablero[fila][columna] == '-'
                || tablero[fila][columna] == 'X');
        tablero[fila][columna] = 'X';
        imprimeArrayChar(tablero);
    }
}
