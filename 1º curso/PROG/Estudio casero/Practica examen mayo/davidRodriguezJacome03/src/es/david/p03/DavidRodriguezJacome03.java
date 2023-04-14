/*
 * Programa que copie un fichero binario, recibiendo los parámetros (fcheroACopiar, ficheroNuevo) 
 * por la línea de comandos.
 */
package es.david.p03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author jacod
 */
public class DavidRodriguezJacome03 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Los ficheros de origen y destino se pasan como parámetros del método main().
        System.out.println(args[0]);
        System.out.println(args[1]);

        /**
         * Con FileInputStream y FileOutputStream se seleccionan los archivos de origen y destino <br>
         * y se les pasan los parámetros del método main(). <br>
         * Se abre el flujo de ficheros.
         */
        FileInputStream ficheroOrigen = new FileInputStream(args[0]);
        FileOutputStream ficheroDestino = new FileOutputStream(args[1]);

        /**
         * Uso DataInputStream y DataOutputStream encapsulamos los ficheros <br>
         * para mejorar su rendimiento de lectura/escritura. Se abre el flujo de datos.
         */
        DataInputStream leerFichero = new DataInputStream(ficheroOrigen);
        DataOutputStream grabarFichero = new DataOutputStream(ficheroDestino);

        // Uso una variable auxiliar "datos" para almacenar temporalmente cada byte a escribir.
        int datos;

        /**
         * Con un bucle y el método read() leo si hay un byte del fichero origen y lo guardo en "datos";<br>
         * si no queda ningún byte, el método read() devuelve -1.
         */
        while ((datos = leerFichero.read()) != -1) {

            // Grabo cada byte leído en "datos" con write();
            grabarFichero.write(datos);
        }

        /**
         * Cierro los flujos de datos en el mismo orden en el que se se abrieron.
         */
        grabarFichero.close();
        leerFichero.close();

        ficheroDestino.close();
        ficheroOrigen.close();

        System.out.println("Fichero copiado. Programa terminado.");
    }
}
