/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamen01;

/**
 *
 * @author jacod
 */
public class PracticaExamen01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int array1[][] = new int[3][3];
        int array2[][] = new int[3][3];

        // Bucle de relleno.
        System.out.println("Matriz 1: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (1 + (Math.random() * 50));
                array2[i][j] = (int) (1 + (Math.random() * 50));
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz 2: ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        // Bucle de lectura.
        int sumaFila = 0;
        int sumaColumna = 0;
        int productoColumna = 0;
        int productoFila = 0;
        for (int i = 0; i < array1.length; i++) {
            sumaFila += array1[0][i];
            sumaColumna += array2[i][1];
            productoColumna *= array1[i][2];
            productoFila *= array2[1][i];
        }

        int sumaTotal = sumaFila + sumaColumna;
        int protuctoTotal = productoColumna * productoFila;

        System.out.println("Suma: " + sumaTotal + "; producto: " + protuctoTotal);
    }

}
