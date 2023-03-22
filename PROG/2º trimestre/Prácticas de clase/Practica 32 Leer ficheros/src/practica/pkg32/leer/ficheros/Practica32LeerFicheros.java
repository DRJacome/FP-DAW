/*

 */
package practica.pkg32.leer.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Practica32LeerFicheros {

    static private class Ejemplo {

        String nombre;
        double salario;
        int edad;
        String direccion;

        public Ejemplo(String nombre, double salario, int edad, String direccion) {
            this.nombre = nombre;
            this.salario = salario;
            this.edad = edad;
            this.direccion = direccion;
        }

        @Override
        public String toString() {
            return "Ejemplo{" + "nombre=" + nombre + ", salario=" + salario + ", edad=" + edad + ", direccion=" + direccion + '}';
        }
    }

    static List<Ejemplo> ejemplo = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ejemplo.add(new Ejemplo("Alma", 2000, 20, "calle 1"));
        ejemplo.add(new Ejemplo("Pedro", 1000.50, 21, "calle 2"));
        ejemplo.add(new Ejemplo("Andrés", 1000, 22, "calle 3"));

        // Abrir en modo sobreescritura.
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("ejemplo.dat")));

        for (Ejemplo it : ejemplo) {
            salida.println(it.nombre);
            salida.println(it.salario);
            salida.println(it.edad);
            salida.println(it.direccion);
        }

        // Cerrar fichero.
        salida.close();

        // Abrir flujo.
        // Lectura de datos.
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ejemplo.dat"));

            // Tratar la información.
            String nombre = reader.readLine();
            double salario;
            int edad;
            String direccion;
            while (nombre != null) {
                salario = Double.parseDouble(reader.readLine());
                edad = Integer.parseInt(reader.readLine());
                direccion = reader.readLine();
                ejemplo.add(new Ejemplo(nombre, salario, edad, direccion));
                nombre = reader.readLine();
            }

            // Cerrar flujo.
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no se encontró.");
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero.");
        }

        for (Ejemplo it : ejemplo) {
            System.out.println(it);
        }
    }
}
