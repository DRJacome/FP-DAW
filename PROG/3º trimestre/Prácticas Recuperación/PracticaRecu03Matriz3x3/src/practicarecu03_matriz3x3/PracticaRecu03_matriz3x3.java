/*
2) Pedir los datos de una matriz de 3x3 enteros e imprimir la suma de los elementos
de la diagonal principal que sean números primos.
 */
package practicarecu03_matriz3x3;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class PracticaRecu03_matriz3x3 {

    static Scanner tec = new Scanner(System.in);

    static int[][] matriz = new int[3][3];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rellenarMatriz(matriz);
        int suma = sumarDiagonalPrimos(matriz);

        System.out.println(matriz);
        System.out.println(suma);
    }

    private static void rellenarMatriz(int[][] m) {
        for (int fila = 0; fila < m.length; fila++) {
            for (int columna = 0; columna < m[fila].length; columna++) {
                System.out.println("Introduce un número en la posición "
                        + "[" + fila + "] [" + columna + "]: ");
                m[fila][columna] = tec.nextInt();
            }
        }
    }

    private static int sumarDiagonalPrimos(int[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            if (esPrimo(m[i][i])) {
                suma += m[i][i];
            }
        }
        return suma;
    }

    private static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
