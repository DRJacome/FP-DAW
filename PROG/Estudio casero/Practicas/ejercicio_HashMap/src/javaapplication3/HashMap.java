/*

 */
package javaapplication3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Ricardo Fraga Méndez
 */
public class HashMap {

    static Scanner tec = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<Integer, Persona> mapa = new TreeMap<>();

        mapa.put(121321, new Persona("nombre", "apellido1", "apellido2", "dni", "calle", 10, 32000, "poblacion", "provincia"));

        while (true) {
            System.out.println("1: "
                    + "2: "
                    + "3:   ");

            int opcion;
            do {
                opcion = Integer.parseInt(tec.nextLine());
            } while (opcion < 1 || opcion > 3);

            switch (opcion) {
                case 1:
                    buscar(mapa);
                case 2:
                    listar(mapa);
                case 3:
                    System.exit(0);
            }
        }

    }

    private static void buscar(Map<Integer, Persona> mapa) {
        System.out.println("dfjdf dsaklfj adsklfña");
        int tel = Integer.parseInt(tec.nextLine());
        Persona p = mapa.get(tel);
        if (p == null) {
            System.out.println("Errr");
        } else {
            System.out.println(p);
        }
    }

    private static void listar(Map<Integer, Persona> mapa) {
        for (Map.Entry it : mapa.entrySet()) {
            Persona x = (Persona) it.getValue();
            System.out.println(it.getKey() + x.istCorto());
        }

    }

}
