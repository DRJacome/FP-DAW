/*

 */
package practicarecuexamen02_1;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class PracticaRecuExamen02_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Notas de alumnos. Introduce el nombre del módulo: ");
        String modulo = tec.nextLine();
        System.out.println("Introduce el nombre del alumno: ");
        String alumno = tec.nextLine();

        double[] notas = new double[3];
        double notaFinal = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota del módulo " + (i + 1));
            notas[i] = Double.parseDouble(tec.nextLine());
            notaFinal += notas[i];
        }
        notaFinal = notaFinal / notas.length;

        String claseNota = "";
        if (notaFinal >= 0 && notaFinal < 5) {
            claseNota = "Insuficiente";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            claseNota = "Suficiente";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            claseNota = "Bien";
        } else if (notaFinal >= 7 && notaFinal < 9) {
            claseNota = "Notable";
        } else if (notaFinal >= 9 && notaFinal <= 10) {
            claseNota = "Sobresaliente";
        }

        System.out.println("La nota final de " + alumno + " "
                + " en el módulo " + modulo + " es " + claseNota + " con nota numérica " + notaFinal);
    }
}
