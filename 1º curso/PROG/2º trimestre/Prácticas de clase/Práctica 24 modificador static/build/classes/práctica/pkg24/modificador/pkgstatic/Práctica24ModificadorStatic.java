/*

 */
package práctica.pkg24.modificador.pkgstatic;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica24ModificadorStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        boolean crear = true;
        while (crear) {
            System.out.print("¿Crear ratón? (S/N)");
            crear = tec.nextLine().toLowerCase().charAt(0) == 's';
            if (crear) {
                System.out.print("Número de botones: ");
                int numeroBotones = Integer.parseInt(tec.nextLine());
                System.out.print("Con cable (S/N): ");
                boolean cable = tec.nextLine().toLowerCase().charAt(0) == 's';
                Raton r = new Raton(numeroBotones, cable);
            }
        }
        System.out.println("Se han creado " + Raton.contador + " ratón/es.");
    }

}
