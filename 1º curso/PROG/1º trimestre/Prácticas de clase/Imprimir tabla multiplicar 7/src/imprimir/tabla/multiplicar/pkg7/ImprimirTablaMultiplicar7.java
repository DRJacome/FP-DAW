/*

 */
package imprimir.tabla.multiplicar.pkg7;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class ImprimirTablaMultiplicar7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Tabla de multiplicar del ");
        int numero = tec.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i
                    + " = " + numero * i);
        }

    }

}
