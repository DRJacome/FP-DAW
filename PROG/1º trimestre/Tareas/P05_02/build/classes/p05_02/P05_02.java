/*
Igual que p05_01, pero con todos los campos private.
Crear una clase para representar un ordenador.
Desde el main asignar valores a sus campos y utilizar sus métodos.
 */
package p05_02;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P05_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Ordenador2 pc;
        pc = new Ordenador2("AMD", "Ryzen 7 2700", 2, 3.4, true);
        pc.cambiarMarcaCPU("nuevaMarca");

        pc.setMarcaCPU("AMD o Intel");

        System.out.println("Datos pc\n "
                + pc);

        pc.cambiarMarcaCPU("Intel");
        System.out.println(pc);
    }
}
