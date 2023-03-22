/*
Como p08_01, pero utilizando serialización de objetos,
de modo que se grabe Workstation a Workstation sin especificar los campos.
 */
package p08_03;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P08_03 {

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

        System.out.println("Tasa de refresco: ");
        double tasaRefresco = Double.parseDouble(tec.nextLine());

        System.out.println("Ángulo de visión: ");
        double anguloVision = Double.parseDouble(tec.nextLine());

        System.out.println("Conexión: ");
        String conexion = tec.nextLine();

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
        System.out.println("Ratón. Cuántos botones tiene?: ");
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
        /*for (int i = 0; i < workStation.size(); i++) {
            System.out.println((i + 1) + " - " + workStation.get(i));
        }*/
        int i = 0;
        for (Iterator<WorkStation> iterator = workStation.iterator(); iterator.hasNext();) {
            System.out.println("\n Ordenador " + (++i) + "\n" + iterator.next());
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
        System.out.println("¿Con qué criterio desea buscar la workstation?: \n"
                + "1- Componente \n"
                + "2- Posición \n");
        int opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(tec.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción 1 o 2: ");
            }
        } while (opcion < 1 || opcion > 2);
        switch (opcion) {
            case 1:
                System.out.println("¿Qué memoria RAM desea buscar?: ");
                int ram = Integer.parseInt(tec.nextLine());
                System.out.println("¿Qué CPU desea buscar?: ");
                String procesador = tec.nextLine();
                int pos = workStation.indexOf(new WorkStation(new Ordenador(ram, null, procesador), null, null, null));
                return pos;
            case 2:
                System.out.println("Escoge workstation (1 - " + workStation.size() + ")");
                int wk = Integer.parseInt(tec.nextLine());
                if (wk < 1 || wk > workStation.size()) {
                    System.out.println("No existe la workStation");
                    return -1;
                }
                return wk - 1;

            /*  default:
                return -1;*/
        }
        /*
        En este caso es importante escribir el último "return -1" para que el compilador sepa dónde parar el switch por coherencia.
        Se puede escribir en su defecto un "default: return -1", como está escrito arriba.
         */
        return -1;

    }

    private static void ordenarWorkstation() {
        System.out.println("Submenú: \n"
                + "1- Monitor: \n"
                + "2- RAM: \n"
                + "3- Ratón: \n"
                + "4- Procesador: ");
        int opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(tec.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opciones: 1, 2, 3, 4: ");
            }
        } while (opcion < 1 || opcion > 4);
        switch (opcion) {
            case 1:
                // Comparator: usamos nombreObjeto.sort
                workStation.sort(new PorTamañoMonitor());
                break;
            case 2:
                workStation.sort(new PorCantidadRam());
                break;
            case 3:
                workStation.sort((Comparator<WorkStation>) workStation);
                break;
            case 4:
                workStation.sort(new WorkStation.PorProcesador());
                break;
        }
        /**
         * Ordenar: </br>
         * 1. con Comparable: Collections.sort(workStation);
         *
         * 2. con Comparator: workStation.sort(new WorkStation());
         *
         * 3. con clases interna static y Comparator: workStation.sort(new WorkStation.PorTamañoMonitor());
         *
         * 4. con clase anónima y Comparator: </br>
         * workStation.sort(new Comparator<WorkStation>() { </br>
         *
         * @Override </br>
         * public int compare(WorkStation w1, WorkStation w2) { </br>
         * return w1.getRaton().getBotones(); </br>
         * } </br> });
         */

    }

    private static void guardarFichero() {
        try {
            ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream("Fichero.dat"));
            for (WorkStation item : workStation) {
                guardar.writeObject(item);
            }
            guardar.close();
        } catch (IOException e) {
            System.out.println("Error de grabación de fichero.");
        }
    }

    private static void leerFichero() {
        ObjectInputStream leer = null;
        int cantidadWorkstations = 0;
        try {
            leer = new ObjectInputStream(new FileInputStream("Fichero.dat"));
            while (true) {
                WorkStation wk = (WorkStation) leer.readObject();
                ++cantidadWorkstations;
            }
        } catch (ClassNotFoundException e) {
            try {
                leer.close();
            } catch (IOException entrada) {
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe.");
        } catch (EOFException e) {
            System.out.println("Se encontraron " + cantidadWorkstations + " WorkStation/s");
        } catch (IOException e) {
            System.out.println("Error de lectura de fichero.");
        }
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        // Cómo hacer un menú. Se necesita un While para establecer una lista de opciones,
        // un do con try catch para prevenir errores en el menú, y un switch para indicar qué hace cada opción.
        leerFichero();

        while (true) {
            System.out.println("Menú principal. \n"
                    + "1- Crear nueva workstation\n"
                    + "2- Ordenar y listar workstations\n"
                    + "3- Datos workstation\n"
                    + "4- Actualizar datos workstation\n"
                    + "5- Borrar workstation\n"
                    + "6- Eliminar todo \n"
                    + "7- Ordenar workstation según criterio \n"
                    + "8- Guardar y salir.");

            int opcion = 0;

            do {
                try {
                    opcion = Integer.parseInt(tec.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Número entre 1-8");
                }
            } while (opcion < 1 || opcion > 8);
            switch (opcion) {
                case 1:
                    crearWorkStation();
                    break;
                case 2:
                    // Comparable -> usamos Collections.sort
                    Collections.sort(workStation);
                    // Otras formas de ordenar.
                    //workStation.sort((Comparator<WorkStation>)workStation);
                    //workStation.sort((Comparator<? super WorkStation>) workStation);
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
                    workStation.clear();
                    break;
                case 7:
                    ordenarWorkstation();
                    //workStation.remove(new WorkStation(new Ordenador(16, null, "AMD"), null, null, null));
                    break;
                case 8:
                    guardarFichero();
                    System.exit(0);

                // En la opción 6 (la última) no hace falta break, pero sólo en este caso.
                /*case 8:

                case 9:
                    for (int i = 0; i < workStation.size(); i++) {
                        workStation.get(i);
                    }
                    for (WorkStation item : workStation) {
                        System.out.println(item);
                    }
                    // se puede usar "var" en la inicialización del for en vez del "Iterator".
                    for (Iterator<WorkStation> it = workStation.iterator(); it.hasNext();) {
                        System.out.println(it.hasNext());
                    }
                    break;*/
            }
        }
    }
}
