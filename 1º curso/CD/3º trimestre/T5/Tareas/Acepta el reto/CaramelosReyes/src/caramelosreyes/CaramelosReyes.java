/*

 */
package caramelosreyes;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class CaramelosReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        while (true) {
            int acumulador = 0;
            int ninos = 0;
            int casoPrueba = tec.nextInt();
            while (casoPrueba != 0) {
                acumulador = acumulador + casoPrueba;
                casoPrueba = tec.nextInt();
                ninos++;
            }
            if (acumulador == 0) {
                System.exit(0);
            } else if (acumulador % ninos == 0) {
                System.out.println("REPARTO JUSTO");
            } else {
                System.out.println("IMPOSIBLE");
            }
        }
    }

}
