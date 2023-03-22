/*

 */
package ejlibrobucles18;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class EjLibroBucles18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num1, num2;
        int espacio = 0;
        int menor = 0;
        int mayor = 0;
        int aux = 0;

        System.out.println("Escribe un programa que obtenga los números enteros comprendidos entre dos\n"
                + "números introducidos por teclado y validados como distintos, el programa debe\n"
                + "empezar por el menor de los enteros introducidos e ir incrementando de 7 en\n"
                + "7.");

        do {
            System.out.println("Introduce el primer número: ");
            num1 = Integer.parseInt(tec.nextLine());
            System.out.println("Introduce el segundo número: ");
            num2 = Integer.parseInt(tec.nextLine());

            if (num1 == num2) {
                System.out.println("Introduce dos números distintos.");
            }
        } while (num1 == num2);

        espacio = Math.abs(num1 - num2);

        if (num1 > num2) {
            menor = num2;
            mayor = num1;
        } else {
            menor = num1;
            mayor = num2;
        }

        aux = menor;
        while (aux <= mayor) {
            System.out.print(aux + " ");
            aux += 7;
        }
    }
}
