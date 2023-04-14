/*

 */
package práctica.pkg29.flujos.de.entrada.salida;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author David Rodríguez Jácome Programa para leer ficheros y guardar los datos introducidos.
 */
public class Práctica29FlujosDeEntradaSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Si el flujo es de lectura se usa "reader; si es de escritura se usa "writer".
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("prueba.txt")));

        salida.println("Este es un ejemplo de escritura y lectura de datos.");
        salida.close();

        //Abrir flujo:
        BufferedReader reader = new BufferedReader(new FileReader("a.txt"));

        // Tratar la información:
        String linea = reader.readLine();
        while (linea != null) {
            System.out.println("linea");
            linea = reader.readLine();
        }

        // Cerrar flujo:
        reader.close();
    }

}
