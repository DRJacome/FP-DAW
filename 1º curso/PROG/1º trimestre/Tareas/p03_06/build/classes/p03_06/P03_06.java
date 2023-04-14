/*
Programa que pida números enteros hasta recibir un cero como entrada.
Para cada número indicar si es o no primo.
Recordad que los primos son los naturales mayores que 1
que tienen exactamente dos divisiores.
Además, al finalizar debe impirmir cual es la media de los números introducidos.
 */
package p03_06;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int total = 0;
        int contador = 0;

        System.out.println("Introduce número natural (0 Salir): ");

        int numero = tec.nextInt();

        while (numero != 0) {
            // ! = "distinto de"
            total += numero;
            ++contador;

            boolean primo;
            if (numero < 2) {
                primo = false;
            } else {
                primo = true;
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            System.out.println("El número es "
                    + (primo == true ? "Primo" : " No Primo"));
            System.out.println("Introduce número entero (0 Salir): ");
            numero = tec.nextInt();
        }
        System.out.println("La media de los números introducidos es "
                + total / contador);
    }
}
