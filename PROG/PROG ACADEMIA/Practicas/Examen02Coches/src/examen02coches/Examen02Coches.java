/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen02coches;

import java.util.Scanner;

/**
 *
 * @author jacod
 */
public class Examen02Coches {
    //static Scanner tec = New Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Coche[] coches = new Coche[5];

        System.out.println("Creador de coches.");
        for (int i = 0; i < coches.length; i++) {
            coches[i] = new Coche();
            System.out.println("Introduce la matrícula del coche " + (i + 1));
            String matricula = tec.nextLine();
            coches[i].setMatricula(matricula);

            System.out.println("Introduce la marca del mismo coche:");
            String marca = tec.nextLine();
            coches[i].setMarca(marca);

            System.out.println("Ahora, introduce el modelo:");
            String modelo = tec.nextLine();
            coches[i].setModelo(modelo);
        }

        System.out.println("Coches creados correctamente.");

        System.out.println("////////////////////////");

        for (int i = 0; i < coches.length; i++) {
            System.out.println(coches[i]);
        }

        Coche coche = new Coche();
        System.out.println(coche.getMatricula());
    }

}
