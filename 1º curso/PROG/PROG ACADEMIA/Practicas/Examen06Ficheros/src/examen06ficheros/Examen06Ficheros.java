/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen06ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jacod
 */
public class Examen06Ficheros {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner tec = new Scanner(System.in);

        String nombreFichero = "ArchivoDatos";
        String linea = "";

        /**
         * FileWriter -> se crea un objeto de la clase FileWriter que recibe como parámetros el nombre del archivo donde
         * se grabarán los datos, y un boleano que añadirá cada línea al final del archivo. Se abre el flujo de datos.
         */
        FileWriter fw = new FileWriter(nombreFichero, true);
        System.out.println("Introduce líneas de texto para grabarlas en un archivo.\n"
                + "Para terminar el programa, introduce una línea de texto vacía.");

        // Bucle infinito.
        while (true) {

            // Pedimos línea por teclado.
            linea = tec.nextLine();

            // Si la siguiente línea está vacía, que salga del bucle.
            if (linea.isEmpty()) {
                break;
            }

            // Grabo cada línea en el archivo de datos.
            fw.write(linea + "\n");
        }

        // Cuando se terinan de grabar las líneas, se cierra el flujo de datos.
        fw.close();

        FileReader fr = new FileReader(nombreFichero);
        BufferedReader br = new BufferedReader(fr);

        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
        br.close();
        fr.close();
    }
}
