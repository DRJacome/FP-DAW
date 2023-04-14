/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.david.utils;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Utilidades {

    static Scanner tec = new Scanner(System.in);

    /**
     * Muestra el texto suministrado y devuelve un String leído por teclado.
     *
     * @param texto Texto a mostrar.
     * @return Un texto leído por teclado.
     */
    public static String pideString(String texto) {
        System.out.print(texto);
        return tec.nextLine();
    }

    /**
     * Muestra el texto suministrado y devuelve un entero leído por teclado.
     *
     * @param texto Texto a mostrar.
     * @return Un entero leído por teclado.
     */
    public static int pideInt(String texto) {
        System.out.print(texto);
        int dato;
        try {
            dato = Integer.parseInt(tec.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
        return dato;
    }

    /**
     * Muestra el texto suministrado y devuelve un decimal leído por teclado.
     *
     * @param texto Texto a mostrar.
     * @return Un decimal leído por teclado.
     */
    public static double pideDouble(String texto) {
        System.out.print(texto);
        double dato;
        try {
            dato = Double.parseDouble(tec.nextLine());
        } catch (NumberFormatException e) {
            return .0;
        }
        return dato;
    }

    public static void redirigeSalidaError(String nombreFichero) {
        try {
            PrintStream ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(nombreFichero, true)), true);
            System.setErr(ps);
        } catch (FileNotFoundException ex) {
            System.err.println("Fichero de log erróneo");
        }
    }
}
