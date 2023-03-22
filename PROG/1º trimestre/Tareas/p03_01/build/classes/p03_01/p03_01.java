/*
Pedir un número de mes por teclado e imprimir
si estamos en primavera, verano, otoño o invierno.
Si coincide con un mes en que hay cambio de estaciones, que aparacezcan ambas.
 */
package p03_01;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class p03_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número de mes");
        byte mes = tec.nextByte();

        switch (mes) {
            case 1:
            case 2:
                System.out.println("Es febrero, por tanto invierno");
                break;
            case 3:
                System.out.println("Es marzo, por tanto invierno/primavera");
                break;
            case 4:
            case 5:
                System.out.println("Es mayo, por tanto primavera");
                break;
            case 6:
                System.out.println("Es junio, por tanto primavera/verano");
                break;
            case 7:
            case 8:
                System.out.println("Es agosto, por tanto verano");
                break;
            case 9:
                System.out.println("Es septiembre, por tanto verano/otoño");
                break;
            case 10:
            case 11:
                System.out.println("Es noviembre, por tanto otoño");
                break;
            case 12:
                System.out.println("Es diciembre, por tanto otoño/invierno");
                break;
            default:
                System.out.println("No es un mes válido");
                break;
        }
    }

}
