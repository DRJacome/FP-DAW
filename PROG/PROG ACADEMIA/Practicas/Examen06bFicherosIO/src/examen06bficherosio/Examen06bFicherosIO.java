/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen06bficherosio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jacod
 */
public class Examen06bFicherosIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        FileInputStream fis = null;
        DataInputStream dis = null;

        FileOutputStream fos = null;
        DataOutputStream dos = null;

        int numero;
        String nombreFichero = "fichero";

        try {
            // File/DataOutputStream() es equivalente a FileWriter().
            fos = new FileOutputStream(nombreFichero, true);
            dos = new DataOutputStream(fos);

            System.out.println("Introduce números enteros; "
                    + "para terminar, introduce un cero:");

            numero = tec.nextInt();

            while (numero != 0) {
                dos.writeInt(numero);
                System.out.println("Número introducido.\n "
                        + "Puedes añadir otro número ahora "
                        + "o terminar el programa: ");
                numero = tec.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (fos != null) {
                fos.close();
            }
            if (dos != null) {
                dos.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            fis = new FileInputStream(nombreFichero);
            dis = new DataInputStream(fis);

            System.out.println("Lectura de archivo binario: ");
            String linea = "";
            while (true) {
                numero = dis.readInt();
                System.out.println(numero);
            }

        } catch (EOFException e) {
            System.out.println("Fin de fichero.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (fis != null) {
                fis.close();
            }
            if (dis != null) {
                dis.close();
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }

}
