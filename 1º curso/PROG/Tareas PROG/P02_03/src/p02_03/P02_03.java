/*
Pedir dos números y calcular su media. Imprimir la media  y la media redondeada, ambas con 3 decimales.
 */
package p02_03;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P02_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce dos números para calcular su media.\n"
                + " Introduce el primer número:");
        double num1 = Double.parseDouble(tec.nextLine());
        System.out.println("Introduce el segundo número: ");
        double num2 = Double.parseDouble(tec.nextLine());

        double media = (num1 + num2) / 2;
        //double media = 5.14648445;
        System.out.printf("La media de los números es: %.3f\n", Math.floor(media * 1000) / 1000);
        System.out.println("Media redondeada: " + Math.round(media * 1000) / 1000.0);
    }
}
