package ej1;

import javax.swing.JOptionPane;

/**
 * @author Jose
 *
 * El siguiente codigo pretende rellenar una matriz con numeros aleatorios entre 0 y 100.
 *
 * Usa el modo debug de Eclipse para encontrar el error y corrigelo para que funcione correctamente.
 *
 */
public class Ej1 {

    public static void main(String[] args) {

        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero de elementos de la matriz "));

        int num_aleat[] = new int[elementos];

        for (int i = 0; i < num_aleat.length; i++) {
            /**
             * La instrucción --> num_aleat[i] = (int) Math.random() * 100; tiene un error. <br\>
             * El método Math.random() devuelve un decimal entre 0 y 1, en en este caso se multiplica por lo <br\>
             * que pide el enunciado. Sin embargo, el casteo del tipo de dato a entero hace que primero corte <br\>
             * y se quede con la parte entera del valor de la variable num_aleat, y luego haga el producto, <br\>
             * por lo que el resultado siempre dará 0. <br\>
             * La instrucción correcta sería: <br\>
             * --> num_aleat[i] = (int) (Math.random() * 100);
             */
            num_aleat[i] = (int) (Math.random() * 100);
        }

        for (int elem : num_aleat) {

            System.out.println(elem);
        }
    }
}
