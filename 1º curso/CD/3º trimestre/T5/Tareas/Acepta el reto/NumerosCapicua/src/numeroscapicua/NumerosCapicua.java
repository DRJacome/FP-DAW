/*

 */
package numeroscapicua;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class NumerosCapicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        /*long entrada;
        do {
            entrada = tec.nextInt();
        } while (entrada < 0 || entrada > 100000);
        long numCapicuas = 0;
        long cociente;

        while (entrada != 0) {
            if (entrada == 1) {
                numCapicuas = 10;
            } else {
                if (entrada % 2 == 0) {
                    cociente = (entrada / 2) - 1;
                    numCapicuas = 9 * (long) Math.pow(10, cociente);
                } else {
                    cociente = entrada / 2;
                    numCapicuas = 9 * (long) Math.pow(10, cociente);
                }
            }
            System.out.println(numCapicuas);
            do {
                entrada = tec.nextInt();
            } while (entrada < 0 || entrada > 100000);
        }*/
        long numeroDigitos = tec.nextInt();

        while (numeroDigitos != 0) {
            if (numeroDigitos == 1) {
                System.out.println(10);
            } else {
                String sol = "9";
                if (numeroDigitos % 2 != 0) {
                    ++numeroDigitos;
                }
                long topeS = (numeroDigitos / 2) - 1;
                for (int i = 0; i < topeS; i++) {
                    sol += "0";
                }
                System.out.println(sol);
            }
            numeroDigitos = tec.nextInt();
        }
    }
}
