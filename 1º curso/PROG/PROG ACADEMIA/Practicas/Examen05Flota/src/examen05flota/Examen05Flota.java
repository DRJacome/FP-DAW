/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen05flota;

import java.util.Scanner;

/**
 *
 * @author jacod
 */
public class Examen05Flota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barco barco = new Barco();

        Scanner tec = new Scanner(System.in);
        int[][] tablero = new int[10][10];
        int eslora = 3;
        int posicionFinal;
        int casillas = 1;

        System.out.println("Introduce las coordenadas de la posición inicial del barco"
                + " (ejes X-Y), Deben ser números entre 0 y 10: ");

        System.out.println("X: ");
        barco.setX(tec.nextInt());

        System.out.println("Y: ");
        barco.setY(tec.nextInt());

        System.out.println("Introduce la dirección del barco según este criterio:\n"
                + " (0 -> arriba, 1 -> derecha, 2 -> abajo, 3 -> izquierda): ");
        barco.setDireccion(tec.nextInt());

        switch (barco.getDireccion()) {
            case 0:
                if ((barco.getX() - eslora) >= 0) {
                    posicionFinal = barco.getX() - eslora;
                    for (int i = barco.getX(); i >= posicionFinal; i--) {
                        tablero[i][barco.getY()] = casillas++;
                    }
                }
                break;
            case 1:
                if ((barco.getY() + eslora) <= tablero[barco.getX()].length - 1) {
                    posicionFinal = barco.getY() + eslora;
                    for (int i = barco.getY(); i <= posicionFinal; i++) {
                        tablero[barco.getX()][i] = casillas++;
                    }
                }
                break;
            case 2:
                if ((barco.getX() + eslora) <= tablero[barco.getY()].length - 1) {
                    posicionFinal = barco.getX() + eslora;
                    for (int i = barco.getX(); i <= posicionFinal; i++) {
                        tablero[i][barco.getY()] = casillas++;
                    }
                }
                break;
            case 3:
                if ((barco.getY() - eslora) >= 0) {
                    posicionFinal = barco.getY() - eslora;
                    for (int i = barco.getY(); i >= posicionFinal; i--) {
                        tablero[barco.getX()][i] = casillas++;
                    }
                }
                break;
            default:
                System.out.println("No se puede establecer la dirección del barco.");
                System.exit(0);
        }
        System.out.println("///////////////////////");
        System.out.println("Tablero y barco:");

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + "");
            }
            System.out.println();
        }
    }

}
