/*
Pedir por teclado las notas de tres evaluaciones de un módulo
y alumno concreto (pedimos el nombre de ambos por teclado).
Imprimir la nota final obtenida (media de las tres evaluaciones) como
cadena de caracteres
("insuficiente", "suficiente", "bien", "notable" o "sobresaliente").

Formato en el que se debe imprimir:

        Marta tiene como nota final Sobresaliente, en el módulo Programación.

No se puede utilizar la sentencia switch.
 */
package p03_05;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Alumno: ");
        String alumno = tec.nextLine();
        System.out.print("Módulo: ");
        String modulo = tec.nextLine();

        int total = 0;
        for (int contador = 0; contador < 3; contador++) {
            //int es variable introducida; el primer "contador" es donde empieza a contar;
            //el segundo "contador" es donde termina de contar;
            //el tercer "contador" es cuántas veces contará;
            //
            // for (inicialización; terminación; incremento) {
            //{
            System.out.print("Nota: ");
            int nota = tec.nextInt();
            while (nota < 0 || nota > 10) {
                System.out.print("Nota no válida."
                        + " Introduce nota válida: ");
                nota = tec.nextInt();
            }
            total = nota + total;
            //System.out.println(total);
        }
        int notaMedia = total / 3;
        //System.out.println("Nota final: " + notaMedia);

        String notaAlfabetica;
        if (notaMedia >= 1 && notaMedia <= 4) {
            notaAlfabetica = "Suspenso";
        } else if (notaMedia == 5) {
            notaAlfabetica = "Aprobado";
        } else if (notaMedia == 6) {
            notaAlfabetica = "Bien";
        } else if (notaMedia == 7 || notaMedia == 8) {
            notaAlfabetica = "Notable";
        } else if (notaMedia == 9 || notaMedia == 10) {
            notaAlfabetica = "Sobresaliente";
        } else {
            notaAlfabetica = "Nota no válida";
        }
        System.out.println(alumno + " tiene como nota final "
                + notaAlfabetica + " en el módulo de " + modulo);
    }

}
