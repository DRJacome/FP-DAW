/*

 */
package práctica.pkg4.prioridad.operadores;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica4PrioridadOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Diferencia entre ++a y a++");
        System.out.println("Cómo sentencia suelta");
        int a = 10;
        int b = 10;
        ++a;
        b++;
        System.out.println("++a: " + a);
        System.out.println("b++: " + b);
        System.out.println("Dentro de otra sentencia");
        System.out.println("++a: " + (++a));
        System.out.println("b++: " + (b++));

        System.out.println("Ejemplo del operador ?:");

        System.out.print("Introduce un número entero: ");
        int numero = tec.nextInt();
        System.out.print("El número " + numero + " es ");
        if (numero % 2 == 0) {
            System.out.println("par.");
        } else {
            System.out.println("impar.");
        }
        System.out.print("El número " + numero + " es " + (numero % 2 == 0 ? "par." : "impar."));
    }

}
