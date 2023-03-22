/*
Crear e imprimir una matriz unitaria del orden especificado
por el usuario (pedirlo por teclado).
 */
package p04_03;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P04_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Pide por pantalla lo que quieres introducir
        System.out.print(" Introduce la dimensión de la matriz: ");
        //Pide por teclado el tamaño/dimensiones de la matriz
        int dimension = tec.nextInt();

        //Declara las dimensiones de la matriz
        int[][] matriz = new int[dimension][dimension];

        //crea una matriz unitaria sin imprimirla
        //Como el valor de las dimensiones son iguales, sólo se aplica un for
        for (int i = 0; i < dimension; i++) {
            //Indica qué valro quieres poner en las posiciones
            matriz[i][i] = 1;
            //Sal del bucle
        }
        //Imprime la matriz que tienes creada con un for por fila y columna
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                //sacar por pantalla la matriz
                System.out.print(matriz[i][j] + " ");
                //Salir del bucle
            }
            //Cambia de fila
            System.out.println("");
        }
    }
}
