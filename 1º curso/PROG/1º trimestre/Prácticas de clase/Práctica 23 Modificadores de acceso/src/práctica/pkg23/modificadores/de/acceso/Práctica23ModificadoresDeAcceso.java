/*

 */
package práctica.pkg23.modificadores.de.acceso;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica23ModificadoresDeAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Clase2 objeto = new Clase2(3.14);
        objeto.setB(15);
        System.out.println(objeto.getB());
        System.out.println(objeto.getA());
    }
}
