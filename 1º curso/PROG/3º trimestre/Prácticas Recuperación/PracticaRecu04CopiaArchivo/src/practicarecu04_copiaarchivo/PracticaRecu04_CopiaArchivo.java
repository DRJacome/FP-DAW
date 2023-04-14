/*

 */
package practicarecu04_copiaarchivo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author David Rodríguez Jácome
 */
public class PracticaRecu04_CopiaArchivo {

    /**
     * El método main recibe como parámetros los valores de las variables locales de tipo String en la posición
     * indicada.
     *
     * Las excepciones de los try-catch se tratan en la clase main (throws).
     *
     * @param args Parámetros que recibe el método (valor de las variables ficheroFuente y ficheroSalida).
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // El método necesita la inctroducción de parámentros. Estos se introducen como posiciones de array.
        // En el if se comprueba que se introdujeron parámetros.
        if (args.length != 2) {
            System.out.println("Error. Se necesita archivo de origen y su destino.");

            // Variables locales.
            String ficheroFuente = args[0];
            String ficheroDestino = args[1];

            /**
             * Declarar objetos para el archivo de origen (lectura/entrada de datos) <br/>
             * y el archivo de destino (escritura/salida de datos).
             */
            FileInputStream ficheroEntrada = new FileInputStream(ficheroFuente);
            FileOutputStream ficheroSalida = new FileOutputStream(ficheroDestino);

            // Establecer un bucle para que lea y escriba cuantos datos haya.
            while (true) {
                /**
                 * Try catch para capturar las excepciones. <br/>
                 * EOFException es hija (excepción más específica) de IOException; <br/>
                 * debe ir primero en los catch.
                 */
                try {
                    // Byte leído en ficheroEntrada, byte escrito en ficheroSalida.
                    ficheroSalida.write(ficheroEntrada.read());
                } catch (EOFException ex) {
                    // Si la lectura byte a byte fue bien, se cierra.
                    ficheroEntrada.close();
                } catch (IOException ex) {
                    // Si la lectura no fue bien, se captura el error y se lanza un mensaje.
                    System.out.println("Error en la lectura de datos.");
                }
            }
        }
    }
}
