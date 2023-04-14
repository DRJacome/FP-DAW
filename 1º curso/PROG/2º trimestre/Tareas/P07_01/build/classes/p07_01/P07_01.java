/*
Aplicación CRUD para la gestión de Wokstations., utilizando listas .

Una Workstation estará formadas por objetos de las clases:

- Monitor

- Raton

- Teclado

- Ordenador
 */
package p07_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P07_01 {

    static Scanner tec = new Scanner(System.in);
    static List<WorkStation> workStation = new ArrayList<>();

    /**
     * Los métodos están situados a esta altura del código porque facilitan la visión y lectura de un programa.
     *
     * @return
     */
    private static Monitor ConstruyeMonitor() {
        System.out.println("Monitor. Tamaño de monitor: ");
        double tamanho = Double.parseDouble(tec.nextLine());

        System.out.println("Cuántas tasas de refresco admite?");
        int numeroTasas = Integer.parseInt(tec.nextLine());
        double[] tasaRefresco = new double[numeroTasas];
        for (int i = 0; i < numeroTasas; i++) {
            System.out.println("Tasa de refresco " + (i + 1) + ": ");
            tasaRefresco[i] = Double.parseDouble(tec.nextLine());
        }
        System.out.print("Ángulo de visión: ");
        double anguloVision = Double.parseDouble(tec.nextLine());
        System.out.print("Cuantas conexiones tiene? ");

        int numConexion = Integer.parseInt(tec.nextLine());
        String[] conexion = new String[numConexion];
        for (int i = 0; i < numConexion; i++) {
            System.out.println("Conexión " + (i + 1) + ": ");
            conexion[i] = tec.nextLine();
        }
        return new Monitor(tamanho, tasaRefresco, anguloVision, conexion);
    }

    private static Teclado ConstruyeTeclado() {
        System.out.println("Teclado. Inalambrico? [S/N]");
        boolean cable = tec.nextLine().toLowerCase().charAt(0) == 's';

        System.out.println("Tipo de teclado: ");
        String tipo = tec.nextLine();

        return new Teclado(tipo, cable);
    }

    private static Raton ConstruyeRaton() {
        System.out.println("Ratón. Cuantos botones tiene?: ");
        int botones = Integer.parseInt(tec.nextLine());

        System.out.println("Inalámbrico? [S/N]: ");
        boolean cable = tec.nextLine().toLowerCase().charAt(0) == 's';

        System.out.println("Tipo de ratón: ");
        String conexion = tec.nextLine();

        return new Raton(botones, cable, conexion);
    }

    private static Ordenador ConstruyeOrdenador() {
        System.out.println("Ordenador. Cuanta memoria RAM tiene?: ");
        int ram = Integer.parseInt(tec.nextLine());

        System.out.println("Gráfica: ");
        String grafica = tec.nextLine();

        System.out.println("Procesador: ");
        String procesador = tec.nextLine();

        return new Ordenador(ram, grafica, procesador);
    }

    private static void crearWorkStation() {
        Monitor monitor = ConstruyeMonitor();
        Teclado teclado = ConstruyeTeclado();
        Raton raton = ConstruyeRaton();
        Ordenador ordenador = ConstruyeOrdenador();

        workStation.add(new WorkStation(ordenador, monitor, raton, teclado));
    }

    private static void listarWorkStations() {
        /**
         * Con bucle for each. int cont = 1; for (WorkStation item : workStation) { System.out.println(cont + " - " +
         * item); }
         */

        /**
         * con bucle for each de expresiones lambda. workStation.forEach(item -> { System.out.println(" - " + item); });
         */
        for (int i = 0; i < workStation.size(); i++) {
            System.out.println((i + 1) + " - " + workStation.get(i));
        }
    }

    private static void datosWorkStation() {
        int pos = escogerWorkStation();
        if (pos == -1) {
            return;
        }
        System.out.println(workStation.get(pos));
    }

    private static void actualizarWorkStation() {
        int pos = escogerWorkStation();
        if (pos == -1) {
            return;
        }
        System.out.println("Datos de la workStation " + (pos + 1));
        System.out.println("Dejar en blanco si no se desea cambiar su valor");
        System.out.println("Ratón inalámbrico (" + (workStation.get(pos).getRaton().isCable() ? "sí" : "no") + ") : ");
        String x = tec.nextLine();
        if (!x.isEmpty()) {
            workStation.get(pos).getRaton().setCable(x.toLowerCase().charAt(0) == 's');
        }

        System.out.println("Botones de ratón (" + workStation.get(pos).getRaton().getBotones() + ") : ");
        x = tec.nextLine();
        if (!x.isEmpty()) {
            workStation.get(pos).getRaton().setBotones(Integer.parseInt(x));
        }

        System.out.println("Conexión de ratón (" + workStation.get(pos).getRaton().getConexion() + ") : ");
        x = tec.nextLine();
        if (!x.isEmpty()) {
            workStation.get(pos).getRaton().setConexion(x);
        }

        System.out.println("Tipo de teclado (" + workStation.get(pos).getTeclado().getTipo() + ") : ");
        x = tec.nextLine();
        if (!x.isEmpty()) {
            workStation.get(pos).getTeclado().setTipo(x);
        }

        System.out.println("Teclado inalámbrico (" + (workStation.get(pos).getTeclado().isCable() ? "sí" : "no") + ") : ");
        x = tec.nextLine();
        if (!x.isEmpty()) {
            workStation.get(pos).getTeclado().setCable(x.toLowerCase().charAt(0) == 's');
        }
    }

    private static void borrarWorkStation() {
        int pos = escogerWorkStation();
        if (pos == -1) {
            return;
        }
        workStation.remove(pos);
    }

    /**
     * Escoge una workStation entre las disponibles.
     *
     * @return -1 si la lista está vacía o no existe el elemento
     * <br>
     * la posición en la lista en otro caso.
     */
    private static int escogerWorkStation() {
        if (workStation.isEmpty()) {
            System.out.println("No hay ninguna disponible");
            return -1;
        }
        System.out.println("Escoge workstation (1 - " + workStation.size());
        int wk = Integer.parseInt(tec.nextLine());
        if (wk < 1 || wk > workStation.size()) {
            System.out.println("No existe la workStation");
            return -1;
        }
        return wk - 1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Cómo hacer un menú. Se necesita un While para establecer una lista de opciones,
        // un do while para leer las opciones,
        while (true) {
            System.out.println("1- Crear nueva workstation\n"
                    + "2- Listar workstations\n"
                    + "3- Datos workstation\n"
                    + "4- Actualizar datos workstation\n"
                    + "5- Borrar workstation\n"
                    + "6- Salir.");

            int opcion = 0;

            do {
                try {
                    opcion = Integer.parseInt(tec.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Número entre 1-6");
                }
            } while (opcion < 1 || opcion > 6);
            switch (opcion) {
                case 1:
                    crearWorkStation();
                    break;
                case 2:
                    Collections.sort(workStation);
                    listarWorkStations();
                    break;
                case 3:
                    datosWorkStation();
                    break;
                case 4:
                    actualizarWorkStation();
                    break;
                case 5:
                    borrarWorkStation();
                    break;
                case 6:
                    System.out.println("Programa terminado.");
                    // En la opción 6 (la última) no hace falta break, pero sólo en este caso.
                    System.exit(0);
            }
        }
    }
}
