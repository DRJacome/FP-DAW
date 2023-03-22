/*

 */
package practicarecuexamen02_4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David Rodríguez Jácome
 */
public class PracticaRecuExamen02_4 {

    static List<Empleado> empleado = new LinkedList<Empleado>();

    private static void leerFichero() {
        ObjectInputStream leer = null;
        try {
            leer = new ObjectInputStream(new FileInputStream("empleado.dat"));
            while (true) {
                empleado = (List<Empleado>) leer.readObject();
            }
        } catch (ClassNotFoundException ex) {
            try {
                leer.close();
            } catch (IOException entrada) {
            }

        } catch (FileNotFoundException ex) {
            System.out.println("El fichero no existe.");
        } catch (EOFException ex) {
            System.out.println("Se encontraron " + empleado.size() + " empleados.");
        } catch (IOException ex) {
            System.out.println("Error de lectura de fichero.");
            Logger.getLogger(PracticaRecuExamen02_4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        leerFichero();
        System.out.println(empleado);
        int antiguedadMaxima = 0;
        for (int i = 0; i < empleado.size(); i++) {
            int antiguedadActual = empleado.get(i).getAntiguedad();
            if (antiguedadActual > antiguedadMaxima) {
                antiguedadMaxima = antiguedadActual;
            }
        }
        int antiguedadMinima = antiguedadMaxima;
        for (int i = 0; i < empleado.size(); i++) {
            int antiguedadActual = empleado.get(i).getAntiguedad();
            if (antiguedadActual < antiguedadMinima) {
                antiguedadMinima = antiguedadActual;
            }
        }
        double antiguedadMedia = 0;
        for (int i = 0; i < empleado.size(); i++) {
            antiguedadMedia += empleado.get(i).getAntiguedad();
        }
        antiguedadMedia = antiguedadMedia / empleado.size();

        double salarioMaximo = 0;
        for (int i = 0; i < empleado.size(); i++) {
            double salarioActual = empleado.get(i).getSalario();
            if (salarioActual > salarioMaximo) {
                salarioMaximo = salarioActual;
            }
        }
        double salarioMinimo = salarioMaximo;
        for (int i = 0; i < empleado.size(); i++) {
            double salarioActual = empleado.get(i).getSalario();
            if (salarioActual < salarioMinimo) {
                salarioMinimo = salarioActual;
            }
        }
        double salarioMedio = 0;
        for (int i = 0; i < empleado.size(); i++) {
            salarioMedio += empleado.get(i).getSalario();
        }
        salarioMedio = salarioMedio / empleado.size();

        System.out.println("Antiguedad máxima: " + antiguedadMaxima
                + "Antiguedad mínima: " + antiguedadMinima
                + "Antiguedad media: " + antiguedadMedia);

        System.out.println("Salario máximo: " + salarioMaximo
                + "Salario mínimo: " + salarioMinimo
                + "Salario medio: " + salarioMedio);
    }
}
