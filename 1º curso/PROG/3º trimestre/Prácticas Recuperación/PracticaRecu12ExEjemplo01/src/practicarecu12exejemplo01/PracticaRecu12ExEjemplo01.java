
/*

 */
package practicarecu12exejemplo01;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David Rodríguez Jácome
 */
public class PracticaRecu12ExEjemplo01 {

    static Scanner tec = new Scanner(System.in);
    static List<Factura> factura = new ArrayList<>();

    private static void leerFichero() {
        ObjectInputStream leer = null;
        try {
            leer = new ObjectInputStream(new FileInputStream("datos.dat"));
            while (true) {
                factura = (List<Factura>) leer.readObject();
            }
        } catch (ClassNotFoundException ex) {
            try {
                leer.close();
            } catch (IOException entrada) {
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El fichero no existe.");
        } catch (EOFException ex) {
        } catch (IOException ex) {
            System.out.println("Error de lectura de fichero.");
            Logger.getLogger(PracticaRecu12ExEjemplo01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void crearFactura() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void listarFacturas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void mostrarInfoFactura() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void eliminarFactura() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void guardarFichero() {
        try {
            ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream("datos.dat"));
            guardar.writeObject(factura);
            guardar.close();
        } catch (IOException ex) {
            System.out.println("Error de grabación de datos.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        leerFichero();
        if (factura.isEmpty()) {
            System.out.println("No hay facturas disponibles.");
        }
        while (true) {
            System.out.println("Menú principal. \n"
                    + "1- Crear nueva factura.\n"
                    + "2- Listar todas las facturas.\n"
                    + "3- Mostrar info de factura individual.\n"
                    + "4- Eliminar factura.\n"
                    + "5- Salir.");
            int opcion = 0;

            do {
                try {
                    opcion = Integer.parseInt(tec.nextLine());
                } catch (NumberFormatException ex) {
                    System.out.println("Debe introducir una opción entre 1 y 5: ");
                }
            } while (opcion < 1 || opcion > 6);
            switch (opcion) {
                case 1:
                    crearFactura();
                    break;
                case 2:
                    listarFacturas();
                    break;
                case 3:
                    mostrarInfoFactura();
                    break;
                case 4:
                    eliminarFactura();
                    break;
                case 5:
                    guardarFichero();
                    System.exit(0);
            }
        }
    }
}
