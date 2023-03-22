/*

 */
package ejlibrobucles21;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class EjLibroBucles21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Realiza un programa que vaya pidiendo números hasta que se introduzca un\n"
                + "numero negativo y nos diga cuantos números se han introducido, la media de\n"
                + "los impares y el mayor de los pares. El número negativo sólo se utiliza para\n"
                + "indicar el final de la introducción de datos pero no se incluye en el cómputo.");

        int numero = 0;
        int contador = 0;
        int totalImpar = 0;
        int contadorImpar = 0;
        int mayor = 0;

        do {
            System.out.println("Introduce un número (negativo para salir): ");
            numero = Integer.parseInt(tec.nextLine());
            contador++;
            if (numero % 2 != 0) {
                totalImpar += numero;
                contadorImpar++;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }
            }
        } while (numero >= 0);
        System.out.println("Total de de los números: " + (contador - 1));
        System.out.println("Media impares : " + (totalImpar / contadorImpar));
        System.out.println("Mayor de los pares: " + mayor);
    }
}
