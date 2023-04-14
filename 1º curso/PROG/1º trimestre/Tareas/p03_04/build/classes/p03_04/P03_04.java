/*
Pedir un número por teclado en el intervalo [35-97].
El número debe ser correcto; en otro caso, se debe volver a pedir.
Imprimir la 7ª potencia de ese número.
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
        int numero;
        do {
            System.out.print("Introduce un número entre [35-97]: ");
            numero = tec.nextInt();
        } while (numero < 35 || numero > 97);
        System.out.println(numero + " ^ 7 = " + (long) Math.pow(numero, 7));
    }

}
