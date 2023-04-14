/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicafilereaderwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class PracticaFileReaderWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] texto;

        try {
            /**
             * Abro flujo de lectura de fichero de texto y especifico la suta de fichero.
             */
            BufferedReader lecturaFichero = new BufferedReader(new FileReader("Agenda.txt"));

            /**
             * Leo cada lína de texto del fichero y lo almaceno en una variable temporal.
             */
            String todo = lecturaFichero.readLine();

            /**
             * Mientras que encuentre datos a leer en el fichero, ejecuta el bucle.<br>
             * Al inicio, la variable "todo" está vacía (null), pero null se machaca<br>
             * con la lectura de la primera línea del fichero.
             */
            while (todo != null) {

                /**
                 * Divido el String almacenado en "texto" y separo cada palabra<br>
                 * por comas (split();) para poder acceder a cada posición del array y<br>
                 * guardar en cada variable el valor correcto quitando los espacios<br>
                 * entre palabras (trim();).
                 */
                texto = todo.split(",");
                System.out.println("Nombre: " + texto[0].trim()
                        + " Teléfono: " + texto[1].trim()
                        + " Dirección: " + texto[2].trim()
                        + " Número: " + texto[3].trim());

                todo = lecturaFichero.readLine();
            }
            lecturaFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
