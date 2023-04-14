/*
 * Crear un vector de 100 enteros. 
 * Rellenar los elementos con índices del 37 al 59 con números aleatorios comprendidos 
 * entre 0 y el máximo números entero posible. 
 * Imprimir los valores generados en orden inverso de índices.
 */
package es.david.p02;

/**
 *
 * @author jacod
 */
public class DavidRodriguezJacome02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declaro un vector simple de enteros de 100 posiciones.
        int[] vector = new int[100];

        /**
         * *
         * Uso tres variables de enteros: dos para delimitar una sección en el vector (MINIMO Y MAXIMO), <br>
         * y otra para establecer el valor de cada posición en la sección.
         */
        int MINIMO = 37;
        int MAXIMO = 59;
        int numeroMaximo = Integer.MAX_VALUE;

        // Uso un bucle para recorrer el vector y rellenarlo con el máximo valor posible para enteros de form aleatoria.
        for (int i = MINIMO; i <= MAXIMO; i++) {
            vector[i] = (int) (Math.random() * (numeroMaximo + 1.0));
        }

        // Uso otro bucle para leer el vector de forma inversa.
        for (int i = MAXIMO; i >= MINIMO; i--) {
            System.out.println("Posición " + i + ": " + vector[i]);
        }
    }

}
