/*

 */
package practica.examen.pkg2.eva;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class PracticaExamen2Eva {

    static Scanner tec = new Scanner(System.in);

    static List<Coche> coches = new ArrayList<>();

    private static void crearCoche() {
        Chasis chasis = construirChasis();
        Motor motor = construirMotor();
        List<Rueda> ruedas = construirRuedas();
        DepositoCombustible depositoCombustible = construirDepositoCombustible();

        coches.add(new Coche(chasis, motor, depositoCombustible));
    }

    private static void ordenarCoches() {
        int i = 0;
        for (Iterator<Coche> iterator = coches.iterator(); iterator.hasNext();) {
            System.out.println("\n Coche " + (++i) + "\n" + iterator.next());
        }
    }

    private static void actualizarCoche() {
        int pos = escogerCoche();
        if (pos == -1) {
            return;
        }
        System.out.println("Datos del coche " + (pos + 1));
        System.out.println("Dejar en blanco si no se desea cambiar su valor.");
        System.out.println("Motor (" + (coches.get(pos).getMotor().isEcologico() ? "sí" : "no") + ") : ");
        String x = tec.nextLine();
        if (!x.isEmpty()) {
            coches.get(pos).getMotor().setEcologico(x.toLowerCase().charAt(0) == 's');
        }
    }

    private static int escogerCoche() {
        if (coches.isEmpty()) {
            System.out.println("No existe ningún coche.");
            return -1;
        }
        System.out.println("Escoge un coche (1 - " + coches.size() + ")");
        int ch = Integer.parseInt(tec.nextLine());
        if (ch < 1 || ch > coches.size()) {
            System.out.println("No existe el coche.");
            return -1;
        }
        return ch - 1;
    }

    private static void borrarCoche() {
        int pos = escogerCoche();
        if (pos == -1) {
            return;
        }
        coches.remove(pos);
    }

    private static Chasis construirChasis() {
        System.out.println("Construir chasis. Material: ");
        String material = tec.nextLine();

        System.out.println("Peso del chasis: ");
        int peso = Integer.parseInt(tec.nextLine());

        return new Chasis(material, peso);
    }

    private static Motor construirMotor() {
        System.out.println("Construir motor. Cilindrada: ");
        double cilindrada = Double.parseDouble(tec.nextLine());

        System.out.println("¿El motor es ecológico?");
        boolean ecologico = Boolean.parseBoolean(tec.nextLine());

        return new Motor(cilindrada, ecologico);
    }

    private static List<Rueda> construirRuedas() {
        List<Rueda> neumaticos = new ArrayList<>();
        for (int rueda = 0; rueda < 4; rueda++) {
            System.out.println("Construir ruedas. Rueda " + rueda + ": ");
            System.out.println("Fabricante de la rueda " + rueda + ": ");
            String ruedas = tec.nextLine();

            System.out.println("Tamaño de rueda " + ruedas + ": ");
            int neumatico = Integer.parseInt(tec.nextLine());

            neumaticos.add(new Rueda(ruedas, neumatico));
        }
        return neumaticos;
    }

    private static DepositoCombustible construirDepositoCombustible() {
        System.out.println("Construir Depósito de combustible. "
                + "Tipo de combustible: ");
        String combustible = tec.nextLine();

        System.out.println("Capacidad del depósito: ");
        int capacidad = Integer.parseInt(tec.nextLine());

        return new DepositoCombustible(combustible, capacidad);
    }

    private static void guardarFichero() {
        try {
            ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream("Archivo.txt"));
            guardar.writeObject(coches);
            guardar.close();
        } catch (IOException e) {
            System.out.println("Error de grabación de archivo.");
        }
    }

    private static void leerFichero() {
        ObjectInputStream leer = null;
        try {
            leer = new ObjectInputStream(new FileInputStream("Archivo.txt"));
            while (true) {
                coches = (List) leer.readObject();
            }
        } catch (ClassNotFoundException e) {
            try {
                leer.close();
            } catch (IOException ex) {
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe.");
        } catch (EOFException e) {
            System.out.println("Se encontraron " + coches.size() + " coches.");
        } catch (IOException e) {
            System.out.println("Error de lectura de archivo.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        leerFichero();
        while (true) {
            System.out.println("Menú principal.\n"
                    + "1- Crear coche\n"
                    + "2- Ordenar y listar coches\n"
                    + "3- Actualizar datos coche\n"
                    + "4- Borrar coche\n"
                    + "5- Borrar todo"
                    + "6- Guardar y salir.");

            int opcion = 0;

            do {
                try {
                    opcion = Integer.parseInt(tec.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Número entre 1 y 6: ");
                }
            } while (opcion < 1 || opcion > 7);
            switch (opcion) {
                case 1:
                    crearCoche();
                    break;
                case 2:
                    Collections.sort(coches);
                    ordenarCoches();
                    break;
                case 3:
                    actualizarCoche();
                    break;
                case 4:
                    borrarCoche();
                    break;
                case 5:
                    coches.clear();
                    break;
                case 6:
                    guardarFichero();
                    System.exit(0);
            }
        }
    }
}
