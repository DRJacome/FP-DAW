/*
Escribir un programa que escriba la tabla ASCII,
mostrando carácter junto con el número en decimal (y en binario).
 */
package p02_04;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class p02_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Esta es la tabla ASCII con binario: ");
        int numero = 32;
        while (numero < 256) {
            System.out.println(Integer.toBinaryString(numero)
                    + " - " + numero + " - " + (char) numero);
            ++numero;
        }

    }

}
