
/*Obtener la password.

Tenemos una clave de prueba formada por tres caracteres
(solo son válidos los comprendidos entre 'a' y 'z' del alfabeto inglés),
que se nos suministrará por teclado.

Utilizando un algoritmo de fuerza bruta, debemos encontrar dicha clave.
Hay que encontrarla, imprimirla indicanco además
el tiempo invertido en su búsqueda (sin contar el tiempo de entrada de datos).
 */
package p03_08;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce una contraseña de tres letras: ");

        String combinacion = tec.nextLine();

        long t1 = System.currentTimeMillis();

        fin:
        for (char i = 'a'; i <= 'z'; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                for (char k = 'a'; k <= 'z'; k++) {
                    if (i == combinacion.charAt(0) && j == combinacion.charAt(1)
                            && k == combinacion.charAt(2)) {
                        System.out.println("La clave buscada es : "
                                + "[" + i + j + k + "]");
                        break fin;
                    }
                }
            }
        }
        long t2 = System.currentTimeMillis();
        long dif = t2 - t1;
        System.out.printf("Has tardado: %.3f segundos\n\n)", (double) dif / 1000);
    }
}
