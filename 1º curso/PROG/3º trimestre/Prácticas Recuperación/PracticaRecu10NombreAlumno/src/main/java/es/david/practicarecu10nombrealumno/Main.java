/*

 */
package es.david.practicarecu10nombrealumno;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Nombre alumno: ");
        String nombreAlumno = tec.nextLine();

        System.out.print("Nombre módulo: ");
        String modulo = tec.nextLine();

        double[] notasParciales = new double[3];
        int notaFinal = 0;
        for (int i = 0; i < notasParciales.length; i++) {
            System.out.println("Nota parcial " + (i + 1) + " de " + notasParciales.length + ": ");
            notaFinal += notasParciales[i] = tec.nextInt();
        }
        notaFinal = Math.round((float) notaFinal / notasParciales.length);

        String resultado = "El alumno " + nombreAlumno + "ha obtenido un ";
        switch (notaFinal) {
            case 10:
            case 9:
                resultado += "Sobresaliente";
                break;
            case 8:
            case 7:
                resultado += "Notable";
                break;
            case 6:
                resultado += "Bien";
                break;
            case 5:
                resultado += "Suficiente";
                break;
            default:
                resultado += "Insuficiente";
                break;
        }
        System.out.println(resultado);
    }
}
