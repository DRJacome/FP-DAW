/*
 * Tenemos que almacenar un menú para 12 personas para cada uno de los días de la semana. 
 * El menú en si se puede codificar como un String, y sus datos introducidos hard-coded. 
 * Sin utilizar ninguna clase auxiliar ni crear ninguna nueva, 
 * almacenar toda la información en una sola variable. 
 * Comprobar la corrección pidiendo una persona (número del 0 al 11), 
 * un día de semana (número del 0 al 6) y mostrando el menú correspondiente.
 */
package es.david.p01;

import java.util.Scanner;

/**
 *
 * @author jacod
 */
public class DavidRodriguezJacome01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        /**
         * Introduzco la información en una sola variable matriz usando hard-code. <br>
         * Hard-code: meter la información directamente en el código del programa.
         */
        String[][] menu = {
            {"sopa", "filete", "mejillones", "sopa", "merluza", "filete", "sopa"},
            {"calameres", "filete", "mejillones", "sopa", "merluza", "filete", "sopa"},
            {"ensalada", "filete", "mejillones", "sopa", "merluza", "filete", "\n\t1º Sopa\n\t2º Churrasco\n\tPostre Helado"},
            {"sopa", "filete", "mejillones", "sopa", "ensalada", "filete", "sopa"},
            {"sopa", "ensalada", "calamares", "sopa", "merluza", "ensalada", "merluza"},
            {"sopa", "filete", "mejillones", "filete", "merluza", "filete", "sopa"},
            {"ensalada", "calamares", "mejillones", "sopa", "merluza", "filete", "sopa"},
            {"sopa", "filete", "mejillones", "sopa", "calamares", "filete", "sopa"},
            {"ensalada", "filete", "ensalada", "sopa", "merluza", "ensalada", "sopa"},
            {"sopa", "filete", "calamares", "sopa", "merluza", "merluza", "sopa"},
            {"calamares", "filete", "ensalada", "calamares", "merluza", "filete", "sopa"},
            {"ensalada", "filete", "merluza", "sopa", "ensalada", "filete", "sopa"}};

        // Uso dos variables de enteros cliente y día para indicar el menú seleccionado.
        int cliente, dia;

        // Los pido por teclado.
        System.out.println("Selector de menú. Introduce un cliente: ");
        cliente = tec.nextInt();
        System.out.println("Selecciona un día: ");
        dia = tec.nextInt();

        // Imprimo la selección introduciendo los enteros en la matriz.
        System.out.println("El cliente " + cliente + " ha seleccionado " + menu[cliente][dia]);
    }

}
