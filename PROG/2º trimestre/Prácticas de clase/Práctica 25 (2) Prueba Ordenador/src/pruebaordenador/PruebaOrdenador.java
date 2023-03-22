/*

 */
package pruebaordenador;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class PruebaOrdenador {

    static Scanner tec = new Scanner(System.in);

    private static Monitor ConstruyeMonitor() {
        System.out.println("Monitor. Tamaño de monitor: ");
        double tamanho = Double.parseDouble(tec.nextLine());
        System.out.println("Cuántas frecuencias de refresco admite?");
        int numeroTasas = Integer.parseInt(tec.nextLine());
        double[] tasaRefresco = new double[numeroTasas];
        for (int i = 0; i < numeroTasas; i++) {
            System.out.println("Tasa de refresco " + (i + 1) + ": ");
            tasaRefresco[i] = Double.parseDouble(tec.nextLine());
        }
        System.out.print("Ángulo de visión: ");
        double anguloVision = Double.parseDouble(tec.nextLine());
        System.out.print("Cuantas conexiones tiene?");
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
        System.out.println("Ordenador. Cuanta memoria tiene?: ");
        int ram = Integer.parseInt(tec.nextLine());
        System.out.println("Gráfica: ");
        String grafica = tec.nextLine();
        System.out.println("Procesador: ");
        String procesador = tec.nextLine();
        return new Ordenador(ram, grafica, procesador);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //ArrayList<WorkStation> sobremesa = new ArrayList();
        //Cambiamos ArrayList por LinkedList para usar liastas enlazadas.
        LinkedList<WorkStation> sobremesa = new LinkedList();
        List<Portatil> portatil = new ArrayList<Portatil>();

        System.out.println("Creación de PCs sobremesa");

        while (true) {
            Monitor monitor = ConstruyeMonitor();
            Teclado teclado = ConstruyeTeclado();
            Raton raton = ConstruyeRaton();
            Ordenador ordenador = ConstruyeOrdenador();
            sobremesa.add(new WorkStation(ordenador, monitor, raton, teclado));
            System.out.println("Introducir más? [S/N]: ");
            if (tec.nextLine().toLowerCase().charAt(0) == 'n') {
                break;
            }
        }
        System.out.println("----------------------------------");

        System.out.println("Creación de ordenadores portátiles");

        do {
            Monitor monitor = ConstruyeMonitor();
            Teclado teclado = ConstruyeTeclado();
            Raton raton = ConstruyeRaton();
            Ordenador ordenador = ConstruyeOrdenador();
            System.out.println("Capacidad de batería?: ");
            int bateria = Integer.parseInt(tec.nextLine());
            portatil.add(new Portatil(bateria, ordenador, monitor, raton, teclado));
            System.out.println("Introducir más? [S/N]: ");
        } while (tec.nextLine().toLowerCase().charAt(0) != 'n');

        System.out.println("------------------------------------");
        System.out.println("Listado PCs sobremesa: ");
        //System.out.println(sobremesa);

        /*for (int i = 0; i < sobremesa.size(); i++) {

        }*/
        int contador = 1;
        for (WorkStation item : sobremesa) {
            System.out.println(contador + " -> " + item + "\n");
        }

        System.out.println("------------------------------------");
        System.out.println("Listado de portátiles: ");
        for (int i = 0; i < portatil.size(); i++) {
            System.out.println((i + 1) + " -> " + portatil.get(i) + "\n");
        }

    }
}
