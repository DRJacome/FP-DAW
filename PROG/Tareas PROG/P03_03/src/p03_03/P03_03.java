/*
Programa que resuelva una ecuación de segundo grado.
 */
package p03_03;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double a, b, c;
        double solucion1, solucion2;

        System.out.println("Este programa resuelve ecuaciones de 2º grado;\n"
                + "Deberás proporcionar los datos de los coeficientes.\n"
                + "Introduce el valor de a:");
        a = tec.nextDouble();

        System.out.println("Introduce el valor de b:");
        b = tec.nextDouble();

        System.out.println("Introduce el valor de c:");
        c = tec.nextDouble();

        // Fórmula de la ecuación.
        double numero = (Math.pow(b, 2)) - (4 * a * c);

        if (a == 0) {
            System.out.println("Incorrecto. El valor de a no puede ser 0.");
        } else {
            if (numero >= 0) {
                solucion1 = (-b + Math.sqrt(numero)) / (2 * a);
                solucion2 = (-b - Math.sqrt(numero)) / (2 * a);
                System.out.println("Solución 1: " + solucion1);
                System.out.print("Solución 2: ");
                System.out.printf("%.2f", solucion2);
                System.out.println("");
            } else if (numero == 0) {
                solucion1 = -b / 2 * a;
                System.out.println("Solución: " + solucion1);
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        }

    }
}
