/*
 * Realizar mediante Maps y Sets. Todos los datos han de ser introducidos por teclado.
 * Introducir los nombres (abreviaturas) de los todos los módulos de los ciclos que se imparten
 * en el instituto, clasificándolos correctamente por ciclo (no importa el curso).
 * Sacar un listado ordenado por orden alfabético de los módulos
 * que se imparten en 2 ciclos distintos (SMR/ASIR o DAW/ASIR) pero no en los 3
 * y otro de los que se imparten en los 3 ciclos.
 * El listado será de la forma: abreviatura – descripción.
 * Serializar las colecciones de modo que la próxima vez que se ejecute el programa
 * no sea necesario volver a introducir los datos.

 * Los módulos son los siguientes (las descripciones las podéis consultar en el Aula Virtual
o directamente inventároslas):
  - SMR                   - DAW                   - ASIR
    ///                     ///                     ///
    SOM                     SINF                    LM
    MMEI                    LM                      IMSO
    AO                      FOL                     BD
    RL                      BD                      PAR
    FOL                     CD                      FH
    AW                      P                       FOL
    SER                     DWCS                    SRI
    SI                      DAW                     SAD
    SOR                     DWCC                    ASO
    EIE                     DIW                     EIE
    IAW                     EIE                     ASXBD
                                                    IAW
 * Nota: IAW no se da en SMR, está puesto solo para forzar el resultado esperado
 */
package es.david.p08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class DavidRodriguezJacome08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner tec = new Scanner(System.in);

        Map<String, String> modulos = new TreeMap<>();
        Set<String> smr = new TreeSet<>();
        Set<String> daw = new TreeSet<>();
        Set<String> asir = new TreeSet<>();

////////////////////////////// Lectura de fichero con conjuntos ////////////////////////////////////
        /**
         * Si el programa ya se ejecutó y se grabaron datos, leerá el archivo y lo sacará por pantalla;<br>
         * Si no, pedirá los datos para grabarlos en un nuevo archivo.
         */
        try {
            ObjectInputStream leerFichero
                    = new ObjectInputStream(
                            new FileInputStream("ficheroConjuntos"));

            modulos = (Map<String, String>) leerFichero.readObject();
            smr = (Set<String>) leerFichero.readObject();
            daw = (Set<String>) leerFichero.readObject();
            asir = (Set<String>) leerFichero.readObject();

            leerFichero.close();

            // Diccionario modulos: salida por pantalla:
            for (Map.Entry<String, String> entry : modulos.entrySet()) {
                Object key = entry.getKey();
                Object val = entry.getValue();
                System.out.println("Módulo: " + key + "; descripción: " + val);
            }

            // Diccionario modulos (forma alternativa para salida por pantalla):
            System.out.println("////////////////////////////////////////");
            for (String key : modulos.keySet()) {
                String valor = modulos.get(key);
                System.out.println("Módulo: " + key + ", descripción: " + valor);
            }

            // Conjuntos de ciclos:
            System.out.println("");
            System.out.println("/////////////////////////////////////////////////////////////////");
            System.out.println("Módulos almacenados en el conjunto SMR: ");
            for (String item : smr) {
                System.out.println(item + " - " + modulos.get(item));
            }

            System.out.println("");
            System.out.println("/////////////////////////////////////////////////////////////////");
            System.out.println("Módulos almacenados en el conjunto DAW: ");
            for (String item : daw) {
                System.out.println(item + " - " + modulos.get(item));
            }

            System.out.println("");
            System.out.println("/////////////////////////////////////////////////////////////////");
            System.out.println("Módulos almacenados en el conjunto ASIR: ");
            for (String item : asir) {
                System.out.println(item + " - " + modulos.get(item));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El fichero no se encuentra disponible.");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error en la grabación de datos.");
        }

///////////////////////////////////// Conjunto SMR /////////////////////////////////////////////////
        System.out.println("");
        System.out.println("Programa para almacenar ciclos y módulos de FP.");
        System.out.println("Introduce los módulos de SMR (nombre el blanco para continuar): ");
        while (true) {
            /**
             * Introducción de los módulos de SMR y almacenamiento<br>
             * en el Set smr y en el map módulos
             */
            System.out.println("Nombre del módulo SMR: ");
            String nombre = tec.nextLine();
            if (nombre.isBlank()) {
                break;
            }

            // Añado el módulo al conjunto SMR.
            smr.add(nombre);

            if (!modulos.containsKey(nombre)) {
                System.out.println("Descripción del módulo " + nombre + " del ciclo SMR: ");
                String descripcion = tec.nextLine();

                // Añado el módulo al mapa modulos.
                modulos.put(nombre, descripcion);
            }
        }
        System.out.println("Módulos almacenados en el conjunto SMR: ");
        for (String item : smr) {
            System.out.println(item + " - " + modulos.get(item));
        }

///////////////////////////////////// Conjunto DAW /////////////////////////////////////////////////
        System.out.println("Introduce los módulos de DAW (nombre en blanco para continuar): ");
        while (true) {
            System.out.println("Nombre del módulo DAW: ");
            String nombre = tec.nextLine();
            if (nombre.isBlank()) {
                break;
            }
            // Añado el módulo al conjunto DAW.
            daw.add(nombre);
            if (!modulos.containsKey(nombre)) {
                System.out.println("Descripción del módulo " + nombre + " del ciclo DAW: ");
                String descripcion = tec.nextLine();

                // Añado el módulo al mapa modulos.
                modulos.put(nombre, descripcion);
            }
        }
        System.out.println("Módulos almacenados en el conjunto DAW: ");
        for (String item : daw) {
            System.out.println(item + " - " + modulos.get(item));
        }

///////////////////////////////////// Conjunto ASIR /////////////////////////////////////////////////
        System.out.println("Introduce los módulos de ASIR (nombre en blanco para continuar): ");
        while (true) {
            System.out.println("Nombre del módulo ASIR: ");
            String nombre = tec.nextLine();
            if (nombre.isBlank()) {
                break;
            }
            // Añado el módulo al conjunto ASIR.
            asir.add(nombre);
            if (!modulos.containsKey(nombre)) {
                System.out.println("Descripción del módulo " + nombre + " del ciclo ASIR: ");
                String descripcion = tec.nextLine();

                // Añado el módulo al mapa modulos.
                modulos.put(nombre, descripcion);
            }
        }

        System.out.println("Módulos almacenados en el conjunto ASIR: ");
        for (String item : asir) {
            System.out.println(item + " - " + modulos.get(item));
        }
        System.out.println("");
        System.out.println("/////////////////////////////////////////////////////////////////");

        // Listado de módulos comunes:
        /**
         * Hago una copia del conjunto original SMR y lo almaceno<br>
         * en un nuevo conjunto auxiliar (comunesSmr_daw_asir) para<br>
         * no perder los datos originales del conjunto SMR.
         */
        Set<String> comunesSmr_daw_asir = new TreeSet<>(smr);

        /**
         * 1º Intersección = retainAll():<br>
         * Este método elimina de comunesSmr_daw_asir todos los elementos que no estén<br>
         * contenidos en el conjunto DAW. Conjunto auxiliar comunesSmr_daw_asir se queda con los comunes entre SMR y
         * DAW.
         */
        comunesSmr_daw_asir.retainAll(daw);

        /**
         * 2º Intersección: el conjunto comunesSmr_daw_asir se queda con los<br>
         * comunes entre lo que queda de SMR y ASIR.<br>
         * Con esto, tengo los módulos comunes en los tres ciclos.
         */
        comunesSmr_daw_asir.retainAll(asir);

        // Salida por pantalla de módulos comunes:
        System.out.println("Módulos comunes en todos los ciclos: ");
        for (String item : comunesSmr_daw_asir) {
            System.out.println(item + " - " + modulos.get(item));
        }

        ///////////////////////////////////////////////////////////////////////
        // Listado de módulos comunes a SMR y DAW.
        Set<String> comunesSmr_daw = new TreeSet<>(smr);
        comunesSmr_daw.retainAll(daw);
        comunesSmr_daw.removeAll(comunesSmr_daw_asir);

        // Salida por pantalla de módulos comunes a SMR y DAW.
        System.out.println("");
        System.out.println("/////////////////////////////////////////////////////////////////");
        System.out.println("Módulos comunes a los ciclos SMR y DAW: ");
        for (String item : comunesSmr_daw) {
            System.out.println(item + " - " + modulos.get(item));
        }

        ///////////////////////////////////////////////////////////////////////
        // Listado de módulos comunes a SMR y ASIR.
        Set<String> comunes_smr_asir = new TreeSet<>(smr);
        comunes_smr_asir.retainAll(asir);
        comunes_smr_asir.removeAll(comunesSmr_daw_asir);

        // Salida por pantalla de módulos comunes a SMR y ASIR.
        System.out.println("");
        System.out.println("/////////////////////////////////////////////////////////////////");
        System.out.println("Módulos comunes a los ciclos SMR y ASIR: ");
        for (String item : comunes_smr_asir) {
            System.out.println(item + " - " + modulos.get(item));
        }

        //////////////////////////////////////////////////////////////////////////
        // Listado de módulos comunes a DAW y ASIR.
        Set<String> comunes_daw_asir = new TreeSet<>(daw);
        comunes_daw_asir.retainAll(asir);
        comunes_daw_asir.removeAll(comunesSmr_daw_asir);

        // Salida por pantalla de módulos comunes a DAW y ASIR.
        System.out.println("");
        System.out.println("/////////////////////////////////////////////////////////////////");
        System.out.println("Módulos comunes a los ciclos DAW y ASIR: ");
        for (String item : comunes_daw_asir) {
            System.out.println(item + " - " + modulos.get(item));
        }

        ////////////////////// Escritura de conjuntos en fichero ///////////////////////////////////
        try {
            ObjectOutputStream grabarFichero
                    = new ObjectOutputStream(
                            new FileOutputStream("FicheroConjuntos"));

            grabarFichero.writeObject(modulos);
            grabarFichero.writeObject(smr);
            grabarFichero.writeObject(daw);
            grabarFichero.writeObject(asir);

            grabarFichero.close();
        } catch (IOException ex) {
            System.out.println("El fichero no se encuntra disponible.");
        }
    }
}
