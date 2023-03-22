/*
Pedir por teclado tres enteros correspondientes al día mes y año de una fecha, y comprobar si es correcta.
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

        System.out.println("Este programa verifica si una fecha introducida por teclado es correcta."
                + "\n La fecha debe ir en el siguiente formato: dd/mm/aaaa.");

        System.out.println("Introduce el día:");
        int dia = tec.nextInt();

        System.out.println("Introduce el mes:");
        int mes = tec.nextInt();

        System.out.println("Introduce el año:");
        int ano = tec.nextInt();

//            Condición para años bisiestos:
//            Un año es bisiesto si es múltiplo de 4 y no de 100.
//            También es bisiesto si es múltiplo de 400.
        if (ano < 0) {
            System.out.println("Fecha incorrecta. El año debe ser mayor que 0.");
        } else {
            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    if (dia <= 31) {
                        System.out.println(dia + "/" + mes + "/" + ano + ". Tu fecha es correcta.");
                    } else {
                        System.out.println("Fecha incorrecta.");
                    }
                } else if (mes == 2) {
                    if (dia <= 29) {
                        System.out.println("El año es bisiesto.\n");
                        System.out.println(dia + "/" + mes + "/" + ano + ". Tu fecha es correcta.");
                    } else {
                        System.out.println("Fecha incorrecta.");
                    }
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia <= 30) {
                        System.out.println(dia + "/" + mes + "/" + ano + ". Tu fecha es correcta.");
                    } else {
                        System.out.println("Fecha incorrecta.");
                    }
                }
                // Condición para años normales.
            } else {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    if (dia <= 31) {
                        System.out.println(dia + "/" + mes + "/" + ano + ". Tu fecha es correcta.");
                    } else {
                        System.out.println("Fecha incorrecta.");
                    }
                } else if (mes == 2) {
                    if (dia <= 28) {
                        System.out.println("El año es bisiesto.");
                        System.out.println(dia + "/" + mes + "/" + ano + ". Tu fecha es correcta.");
                    } else {
                        System.out.println("Fecha incorrecta.");
                    }
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia <= 30) {
                        System.out.println(dia + "/" + mes + "/" + ano + ". Tu fecha es correcta.");
                    } else {
                        System.out.println("Fecha incorrecta.");
                    }
                }
            }
        }
    }
}
