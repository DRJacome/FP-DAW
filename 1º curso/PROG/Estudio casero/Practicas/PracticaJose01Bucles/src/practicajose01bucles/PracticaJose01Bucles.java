/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicajose01bucles;

/**
 *
 * @author alumno
 */
public class PracticaJose01Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pintarPiramide5(10);
    }

    public static void pintarPiramide(int fila) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pintarPiramide2(int fila) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < fila; j++) {
                if (i < (fila - j - 1)) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pintarPiramide3(int fila) {
        // Triángulo izquierdo.
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < fila; j++) {
                if (i < (fila - j - 1)) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }

            // Triángulo derecho.
            for (int j = 0; j < (fila * 2 - 1); j++) {
                if (j < i) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static void pintarPiramide4(int fila) {
        for (int i = 0; i < fila - 1; i++) {
            System.out.println("*");
        }

        for (int j = 0; j < fila; j++) {
            System.out.print("*");
        }
    }

    public static void pintarPiramide5(int fila) {
        for (int i = 1; i < fila; i++) {
            System.out.print("*");
        }
    }

}
