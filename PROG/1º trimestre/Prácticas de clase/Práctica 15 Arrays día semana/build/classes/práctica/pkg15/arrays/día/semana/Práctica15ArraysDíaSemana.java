/*

 */
package práctica.pkg15.arrays.día.semana;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica15ArraysDíaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Indica el día de la semana [1-7]: ");

        int diaSemana;
        do {
            diaSemana = tec.nextInt();
        } while (diaSemana < 1 || diaSemana > 7);

        String[] nombreDia = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
            "Sábado", "Domingo"};
        System.out.println(nombreDia[diaSemana - 1]);

        /* switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        } */
    }

}
