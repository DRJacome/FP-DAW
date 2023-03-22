/*

 */
package practicarecuexamen02_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class PracticaRecuExamen02_5 {

    private static void leerFichero() {
        try {
            BufferedReader leer = new BufferedReader(new FileReader("texto.dat"));
            String texto = leer.readLine() + "\n";
            while (texto != null) {
                texto += (leer.readLine() + "\n");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe.");
        } catch (IOException ex) {
            System.out.println("Error en la lectura de archivo.");
        }
    }

    private static void guardarFichero(String texto) {
        try {
            PrintWriter guardar = new PrintWriter(new BufferedWriter(new FileWriter("texto.dat")));
            guardar.println(texto);
            guardar.close();
        } catch (IOException ex) {
            System.out.println("Error al guardar archivo.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        leerFichero();
        String texto = tec.nextLine();
        while (texto != null) {
            texto += tec.nextLine();
        }
        guardarFichero(texto);
    }
}
