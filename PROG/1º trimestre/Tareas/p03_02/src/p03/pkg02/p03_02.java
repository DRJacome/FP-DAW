/*
Pedir por teclado la nota de una evaluación de un módulo
y alumno concreto (pedimos el nombre de ambos por teclado).
Imprimir la nota  como cadena de caracteres
("insuficiente", "suficiente", "bien", "notable" o "sobresaliente").

Formato en el que se debe imprimir:
                Marta tiene como nota  Sobresaliente, en el módulo Programación.
 */
package p03.pkg02;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class p03_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Alumno: ");
        String alumno = tec.nextLine();
        System.out.print("Módulo: ");
        String modulo = tec.nextLine();
        System.out.print("Nota: ");
        int nota = tec.nextInt();
        String nombreNota;

        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
                nombreNota = "Insuficiente";
                break;
            case 5:
                nombreNota = "Suficiente";
                break;
            case 6:
                nombreNota = "bien";
                break;
            case 7:
            case 8:
                nombreNota = "Notable";
                break;
            case 9:
            case 10:
                nombreNota = "Sobresaliente";
                break;
            default:
                nombreNota = "[Nota no válida]";
                break;
        }
        System.out.println("El alumno " + alumno + " en " + modulo
                + " tiene " + nombreNota);
    }

}
