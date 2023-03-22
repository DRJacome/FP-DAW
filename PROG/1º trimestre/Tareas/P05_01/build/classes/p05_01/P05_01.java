/*
Crear una clase para representar un ordenador.

Desde el main asignar valores a sus campos y utilizar sus métodos.
 */
package p05_01;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P05_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Ordenador pc = new Ordenador("AMD", "Ryzen 7 2700", 2, 3.4, true);

        System.out.println("Datos pc\n "
                + pc);

        pc.cambiarMarcaCPU("Intel");

        System.out.println(pc);
    }
}
