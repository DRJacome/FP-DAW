/*

 */
package práctica.pkg28.colecciones.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica28Colecciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        /**
         * Creamos un array de 5 posiciones pero con un error: declaramos 4 posiciones y nos olvidamos de poner el
         * número 3. Para corregirlo, en la forma for, hacemos lo siguiente:
         */
        int[] x = new int[5];

        x[0] = 1;
        x[1] = 2;
        x[2] = 4;
        x[3] = 5;

        for (int i = 4; i > 2; i--) {
            x[i] = x[i - 1];
        }
        x[2] = 3;
        System.out.println("Array x con el 3");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%3d", x[i]);
        }
        System.out.println("");

        /**
         * En este caso, con Array simple el 4 se machaca con el 3 si queremos desplazar el 3, por lo que primero
         * debemos indicar que empiece el array en la posición que queremos (la tercera), luego debemos desplazar las
         * posiciones desde el final del array (x[i+1), para seguidamente indicar que el número 3 estará en la tercera
         * posiciónx[2] = 3.
         */
        /////////////////////////////////////////////////////////////////////////////////////////////
        /**
         * Ahora crearemos un array con ArrayList repitiendo el mismo error, y corrigiéndolo después.
         */
        ArrayList<Integer> y = new ArrayList(5);
        y.add(1);
        y.add(2);
        y.add(4);
        y.add(5);
        System.out.println("ArrayList y sin el 3");
        for (int i = 0; i < y.size(); i++) {
            System.out.printf("%3d", y.get(i));
        }
        System.out.println("");

        /**
         * ************************************************************
         * La corrección es de la siguiente manera: en ArrayList declarams directamente la posición que queremos cambiar
         * y ArrayList lo desplaza.
         */
        y.add(2, 3);

        System.out.println("ArrayList y con el 3");
        for (int i = 0; i < y.size(); i++) {
            System.out.printf("%3d", y.get(i));
        }
        System.out.println("");
    }

}
