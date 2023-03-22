/*

 */
package control.de.flujo.sentencia.pkgswitch;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class ControlDeFlujoSentenciaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Número del día de la semana");
        byte diaSemana = tec.nextByte();

        if (diaSemana % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        switch (diaSemana) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miércoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sábado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("No es un número válido");
                break;
        }
    }

}
