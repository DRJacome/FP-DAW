/*
Calcular la longitud y el área de una circunferencia con la máxima precisión posible.
 */
package p02_04;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P02_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce el radio de la circunferencia: ");
        double radio = tec.nextInt();

        double longitud = (2 * Math.PI * radio);
        double areaCirculo = Math.PI * (Math.pow(radio, 2));

        System.out.println("El área del círculo es: " + areaCirculo + " cm².");
        System.out.println("La longitud de la circunferencia son " + longitud + " cm.");
    }
}
