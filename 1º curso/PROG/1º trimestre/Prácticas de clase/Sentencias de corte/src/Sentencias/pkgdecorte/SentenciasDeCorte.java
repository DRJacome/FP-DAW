/*

 */
package Sentencias.pkgdecorte;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class SentenciasDeCorte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Menú");
        while (true) {
            //1º parte. Mostrar las opciones.
            System.out.println("1- imprimir el alfabeto\n"
                    + "2- Números del 1 al 10\n"
                    + "3- Mostrar día de la semana\n"
                    + "4- Salir");
            //2º parte. Escoger una opción.
            int opcion;
            do {
                opcion = tec.nextInt();
            } while (opcion < 1 || opcion > 4);
            //3º parte. Seleccionar código a realizar.
            switch (opcion) {
                case 1:
                    for (char i = 'a'; i < 'z'; i++) {
                        if (i == 'j') {
                            continue;
                        }
                        System.out.print(i + " ");
                    }
                    System.out.println("");
                    break;
                case 2:
                    for (int i = 1; i < 11; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Lunes");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

}
