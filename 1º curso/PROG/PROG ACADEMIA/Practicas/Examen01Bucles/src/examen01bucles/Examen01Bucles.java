/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen01bucles;

/**
 *
 * @author jacod
 */
public class Examen01Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];

        // Relleno de las matrices.
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 49) + 1;
                matriz2[i][j] = (int) (Math.random() * 49) + 1;
            }
        }

        // Impresión por pantalla de ambas matrices.
        // Lectura de la primera matriz.
        System.out.println("Primera matriz:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        // Lectura de la segunda matriz.
        System.out.println("-----------------------");
        System.out.println("Segunda matriz:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        int sumaFila = 0;
        int sumaColumna = 0;
        // Con concatenación de producto, se debe inicializar a 1.
        int productoColumna = 1;
        int productoFila = 1;

        // Operaciones.
        for (int i = 0; i < matriz1.length; i++) {
            sumaFila += matriz1[0][i];
            sumaColumna += matriz2[i][1];
            productoColumna *= matriz1[i][2];
            productoFila *= matriz2[1][i];
        }

        int sumaTotal = sumaFila + sumaColumna;
        int productoTotal = productoColumna * productoFila;
        System.out.println("/////////////////////////");
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Producto total: " + productoTotal);
    }
}
