/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen03interface;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author jacod
 */
public class Examen03Interface {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        LinkedList<Coche> coches = new LinkedList<>();

        final int MAXIMO = 3;
        final int MINIMO = 0;
        System.out.println("Programa de creación colección de coches.\n"
                + "Se te predirán los datos para rellenar cada coche.");
        for (int i = MINIMO; i < MAXIMO; i++) {
            Coche coche = new Coche();
            System.out.println("Introduce el número de bastidor: ");
            coche.setBastidor(Integer.parseInt(tec.nextLine()));

            System.out.println("Introduce la marca: ");
            coche.setMarca(tec.nextLine());

            System.out.println("Introduce el modelo: ");
            coche.setModelo(tec.nextLine());

            System.out.println("Introduce la matrícula: ");
            coche.setMatricula(tec.nextLine());
            coches.push(coche);
        }
        System.out.println("/////////////////////////");
        System.out.println("Coches almacenados en la colección:");
        System.out.println(coches);

        ImplementarInterfaz coleccionCoches = new ImplementarInterfaz(coches);

        System.out.println("/////////////////////////");
        System.out.println("Primer coche de la lista: \n" + coleccionCoches.primero());

        System.out.println("/////////////////////////");
        System.out.println("Último coche de la lista: \n " + coleccionCoches.ultimo());

        System.out.println("/////////////////////////");
        System.out.println("Coche con el nº de bastidor más alto: " + coleccionCoches.mayor());

        System.out.println("/////////////////////////");
        System.out.println("Coche con el nº de bastidor más bajo: " + coleccionCoches.menor());

        System.out.println("Programa terminado.");
    }
}
