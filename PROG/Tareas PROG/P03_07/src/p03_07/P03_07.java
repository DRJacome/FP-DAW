
/*
Generar e imprimir números aleatorios en el rango [22-560], hasta que el número generado sea 327.
 */
package p03_07;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int MIN = 22;
        int MAX = 560;
        int numero;

        System.out.println("Este programa generará números alatorios y parará cuando se genere 327.\n"
                + "Introduce cualquier número para continuar:");
//        Pido cualquier número para que sea el usuario el que inicie el programa y que los números
//        no se generen instantáneamente al ejecutarlo.
        numero = tec.nextInt();

        do {
            numero = (int) (Math.random() * (MIN - MAX - 1) + MAX + 1);
            System.out.println("Número generado: " + numero);
        } while (numero != 327);
    }
}
