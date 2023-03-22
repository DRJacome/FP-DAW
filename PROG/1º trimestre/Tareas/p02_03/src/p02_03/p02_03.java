/*
Programa que pida un número en el intervalo [32-255].
De no introducirse correctamente, se dará una segunda oportunidad.
Al final, si el número es correcto se imprimirá
su carácter ASCII correspondiente, o bien un mensaje de error en caso contrario.
 */
package p02_03;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class p02_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número entero "
                + "en el intervalo [32-255]: ");
        int numero = tec.nextInt();
        if (numero < 32 || numero > 255) {
            System.out.println("Tiene que estar en el intervalo [32-255]: ");
            numero = tec.nextInt();
        }
        if (numero < 32 || numero > 255) {
            System.out.println("El número no es correcto");
        } else {
            System.out.println("El ASCII de " + numero + "es: "
                    + (char) numero);
        }
    }
}
