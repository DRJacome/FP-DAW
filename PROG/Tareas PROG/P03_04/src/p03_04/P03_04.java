/*
Pedir un número entero por teclado y pasarlo a binario.
No se pueden utilizar métodos ya creados, como Integer.toBinaryString(), ...
 */
package p03_04;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numero, exp = 0, digito;
        double binario;

        System.out.println("Este programa es una calculadora de números binarios.");
        do {
            System.out.println("Introduce un número entero mayor que 0: ");
            numero = tec.nextInt();
        } while (numero < 0);

        binario = 0;
        while (numero > 0) {
            digito = numero % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            numero = numero / 2;
        }
        System.out.printf("El número introducido en binario es : %.0f %n", binario);
    }

}
