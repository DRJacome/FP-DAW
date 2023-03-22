/*

 */
package ejlibrobucles17;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class EjLibroBucles17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numero = 0;

        do {
            System.out.println("Realiza un programa que sume los 100 números siguientes a un número entero\n"
                    + "y positivo introducido por teclado. Se debe comprobar que el dato introducido\n"
                    + "es correcto (que es un número positivo):");
            numero = Integer.parseInt(tec.nextLine());

            if (numero < 0) {
                System.out.println("Número incorrecto.");
            }
        } while (numero < 0);

        int suma = 0;
        for (int i = numero; i < numero + 100; i++) {
            suma += i;
        }

        System.out.println("La suma de los 100 números siguientes a "
                + numero + " es " + suma + ".");
    }
}
