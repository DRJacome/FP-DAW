/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen04pedirnumeros;

import java.util.Scanner;

/**
 *
 * @author jacod
 */
public class Examen04PedirNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numero = 0,
                suma = 0,
                cantidadNumeros = 0;

        System.out.println("Introduce números enteros para averiguar cuántos"
                + "se han introducido y el valor total de los mismos. \n"
                + "Introduce un cero cuando quieras terminar de introducir números.\n");
        do {
            System.out.println("Número " + (cantidadNumeros + 1 + ":"));
            numero = tec.nextInt();
            suma += numero;
            cantidadNumeros++;
        } while (numero != 0);

        System.out.println("Valor de números introducidos: " + suma + ";\n"
                + " cantidad de números introducidos por teclado: " + --cantidadNumeros + ".");
    }

}
