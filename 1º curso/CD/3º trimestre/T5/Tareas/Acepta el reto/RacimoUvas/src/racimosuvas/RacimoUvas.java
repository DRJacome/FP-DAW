/*

 */
package racimosuvas;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class RacimoUvas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int uvasDisponibles;
        int uvasPorNivel = 0;
        int nivelRacimo = 0;
        do {
            uvasDisponibles = tec.nextInt();
        } while (uvasDisponibles < 1 || uvasDisponibles > 1000000);

        while (uvasDisponibles != 0) {
            while (uvasDisponibles > 0) {
                uvasPorNivel = uvasPorNivel + 1;
                uvasDisponibles = uvasDisponibles - uvasPorNivel;
                nivelRacimo++;
            }
            System.out.println(nivelRacimo);
            uvasPorNivel = 0;
            nivelRacimo = 0;
            do {
                uvasDisponibles = tec.nextInt();
            } while (uvasDisponibles < 0 || uvasDisponibles > 1000000);
        }
    }
}
