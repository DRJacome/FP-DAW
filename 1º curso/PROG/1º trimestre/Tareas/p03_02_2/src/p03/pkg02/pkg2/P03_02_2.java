/*

 */
package p03.pkg02.pkg2;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_02_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Alumno: ");
        String alumno = tec.nextLine();
        System.out.print("Módulo: ");
        String modulo = tec.nextLine();
        /*
        System.out.print("Nota: ");
        int nota = tec.nextInt();
         */
        int nota;
        String nombreNota;
        do {
            System.out.print("Nota (entre 1 y 10): ");
            nota = tec.nextInt();

        } while (nota < 1 || nota > 10);
        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
                nombreNota = "No promociona";
                break;
            default:
                nombreNota = "Promociona";
                break;
        }
        System.out.println(" " + alumno + "  " + modulo
                + " " + nombreNota);
    }
}
