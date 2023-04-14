/*

 */
package práctica.pkg27.colecciones;

import java.util.ArrayList;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica27Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*  int[][] x = new int[2][3];
        x[0][0] = 1;
        x[0][1] = 2;
        x[1][0] = 10;
        x[1][1] = 20;
        x[1][2] = 30;

        for (int filas = 0; filas < x.length; filas++) {
            for (int columnas = 0; columnas < x[filas].length; columnas++) {
                System.out.println(x[filas][columnas]);
            }
        }

        System.out.println("------------------------------------------");

        for (int[] fila : x) {
            for (int columna : fila) {
                System.out.println(columna);
            }
        }*/
        /**
         * ***************************************************************
         */

        /*int[] x = new int[5];

        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;


        //La siguiente línea está mal porque x[5] excede el tamaño del array.
        //        int columnas = x[5];

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%3d", x[i]);
        }
        System.out.println("");

        for (int i : x) {
            System.out.printf("%3d", x[i]);
        }
        System.out.println("");

        System.out.println(x[4] + 54);
        System.out.println("-----------------------------");*/
        /**
         * ************************************************************************
         */
        /*
        * LA siguiente línea es un formato de salida por pantalla.
         */
        //System.out.printf("El precio es %d%d %s\n Descuento %02d",
        //                                  x[3], x[2], "euros");
        System.out.println("");
        /**
         * *****************************************************************
         */

        /*Punto[] y = new Punto[5];

        y[0] = new Punto(10, 10);
        y[1] = new Punto(20, 20);
        y[2] = new Punto(30, 30);
        y[3] = new Punto(40, 40);*/
        /**
         * El siguiente for (for each) es otro tipo de for. Su estructura es: for(tipo de variable + nombre que le
         * quieras poner : variable a la que afecta).
         */
        /*for (Punto item : y) {
            System.out.println(item);
        }*/
        /**
         * Si queremos añadir más elementos a un array, podemos hacerlo de la siguiente manera, pero es mucho lío:
         */
        int[] x = new int[5];

        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%3d", x[i]);
        }
        System.out.println("");

        x[4] = 5;
        int[] y = new int[7];
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }
        y[5] = 6;
        y[6] = 7;

        System.out.println("ARRAY Y");
        for (int i = 0; i < y.length; i++) {
            System.out.printf("%3d", y[i]);
        }
        System.out.println("");

        // Es demasiado complejo para que sea eficaz y sencillo de entender. Otra forma de hacerlo es con Array List.
        /**
         * Esto es un Array List. Con ArrayList se deben usar variables tipo envoltorio (ejemplo: Integer). Importante:
         * se deben usar también los comandos .size y .get en el for para recorrer el ArrayList.
         */
        ArrayList<Integer> alx = new ArrayList(0);
        alx.add(1);
        alx.add(2);
        alx.add(3);
        alx.add(4);

        System.out.println("ArrayList alx");
        for (int i = 0; i < alx.size(); i++) {
            System.out.printf("%3d", alx.get(i));
        }
        System.out.println("");

        alx.add(5);
        alx.add(6);
        alx.add(7);
    }
}
