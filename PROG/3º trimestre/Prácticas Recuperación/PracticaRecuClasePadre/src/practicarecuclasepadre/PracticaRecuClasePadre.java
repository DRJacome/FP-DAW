/*

 */
package practicarecuclasepadre;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class PracticaRecuClasePadre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //String pB = null;

        Hijo x = new Hijo(true, "hijo", 100, "padre", 2.5);
        System.out.println(x);
    }
}
