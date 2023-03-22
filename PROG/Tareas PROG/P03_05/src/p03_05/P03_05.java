/*
Cálculo del factorial de un número.
Imprimir la serie de factoriales utilizando métodos que trabajen con distintos tipos de datos numéricos.
Indicar cual sería el máximo número para el que se obtienen valores válidos con:
    int
    long
    double
Busca alguna manera de obtener más valores válidos
 */
package p03_05;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_05 {

    /**
     *
     * @param numero
     * @return el factorial o -1 si no se puede calcular (número negativo).
     */
    static int factorialIterativoInt(int numero) {
        if (numero < 0) {
            return -1;
        }
        if (numero < 2) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static long factorialIterativoLong(int numero) {
        if (numero < 0) {
            return -1;
        }
        if (numero < 2) {
            return 1;
        }
        long factorial = 1;
        for (long i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static double factorialIterativoDouble(int numero) {
        if (numero < 0) {
            return -1;
        }
        if (numero < 2) {
            return 1;
        }
        Double factorial = 1.0;
        for (Double i = 1.0; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static BigInteger factorial(BigInteger numero) {
        if (numero.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return numero.multiply(factorial(numero.subtract(BigInteger.ONE)));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numeroInt;
        int numeroLong;
        int numeroDouble;

        System.out.println("Introduce el primer número para calcular el factorial con tipo de dato entero: ");
        numeroInt = tec.nextInt();
        for (int i = 1; i <= numeroInt; i++) {
            System.out.println(i + " -> " + factorialIterativoInt(i));
        }
        System.out.println("Con el tipo de dato int, el límite de producto es 12.\n");

        System.out.println("Introduce el segundo número para calcular el factorial con tipo de dato long: ");
        numeroLong = tec.nextInt();

        for (int i = 1; i <= numeroLong; i++) {
            System.out.println(i + " -> " + factorialIterativoLong(i));
        }
        System.out.println("Con el tipo de dato Long, el límite de producto es 20.\n");

        System.out.println("Introduce el tercer número para calcular el factorial con tipo de dato double: ");
        numeroDouble = tec.nextInt();

        for (int i = 0; i <= numeroDouble; i++) {
            System.out.printf("%d -> %.0f\n", i, factorialIterativoDouble(i));
        }

        System.out.println("Con el tipo de dato double, el límite de producto es 170.\n");

        System.out.println("Probaremos con 1000 para calcular el factorial con BigInteger: ");
        System.out.println(factorial(new BigInteger("5000")));

        System.out.println("Con el tipo de dato BigInteger, éste puede contener un valor entero \n"
                + "de precisión sólo limitado por la cantidad de memoria que el ordenador\n"
                + "asgine al programa que esté usando Big Integer.\n");
    }
}
