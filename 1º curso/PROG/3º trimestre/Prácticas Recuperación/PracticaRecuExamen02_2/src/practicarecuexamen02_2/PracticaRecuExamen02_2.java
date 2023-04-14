/*

 */
package practicarecuexamen02_2;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class PracticaRecuExamen02_2 {

    private static int[][] rellenarMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = (int) (Math.random() * (22) + 3);
            }
        }
        return matriz;
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println(" ");
        }
    }

    private static void sumarFilas(int[][] matriz) {
        int sumaFila = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (!(matriz[fila][columna] % 2 == 0)) {
                    sumaFila += matriz[fila][columna];
                }
            }
            System.out.println("Suma de los elementos impares de la fila " + fila + " --> " + sumaFila);
            sumaFila = 0;
        }
    }

    private static void sumarColumnas(int[][] matriz) {
        int sumaColumna = 0;
        for (int columna = 0; columna < matriz[0].length; columna++) {
            for (int fila = 0; fila < matriz.length; fila++) {
                if (matriz[fila][columna] % 2 == 0) {
                    sumaColumna += matriz[fila][columna];
                }
            }
            System.out.println("Suma de los elementos pares de la columna " + columna + " --> " + sumaColumna);
            sumaColumna = 0;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[][] matriz = new int[4][5];
        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        sumarFilas(matriz);
        sumarColumnas(matriz);
    }
}
