/*

 */
package ejlibrobucles19;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class EjLibroBucles19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int alturaIntroducida = Integer.parseInt(tec.nextLine());

        System.out.print("Introduzca el carácter de relleno: ");
        String relleno = tec.nextLine();
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida - 1;

        while (planta <= alturaIntroducida) {
            // inserta espacios
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            // pinta la línea
            for (int i = 1; i <= longitudDeLinea; i++) {
                System.out.print(relleno);
            }
            System.out.println();
            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }
}
