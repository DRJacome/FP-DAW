/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicamapsyconjuntos;

import java.util.*;

/**
 *
 * @author alumno
 */
public class PracticaMapsYConjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        /**
         * Con este for (for normal) sólo se pueden recorrer listas. No vale para Map y Set.<br>
         * Aun así, no se debería usar este for para leer estas listas.<br>
         * for (int i = 0; i < 10; i++) {
         *
         * }
         */
//        boolean xc = true;
//        System.out.println("True");
//        if (xc == false) {
//            System.out.println("False");
//        }
//
//        int aa = 9;
//        aa = aa + 1;
//        System.out.println(aa);
        Set<EquipoFutbol> primera = new TreeSet<>();
        Set<EquipoFutbol> segunda = new TreeSet<>();

        primera.add(new EquipoFutbol("Deportivo de A Coruña", 150, 22, "1900"));
        primera.add(new EquipoFutbol("Osasuna", 430, 16, "1940"));
        primera.add(new EquipoFutbol("Valencia", 64, 40, "1934"));
        primera.add(new EquipoFutbol("Galatasaray", 19, 25, "1965"));

        segunda.add(new EquipoFutbol("Sporting Gijón", 20, 32, "1892"));
        segunda.add(new EquipoFutbol("Galatasaray", 19, 25, "1965"));
        segunda.add(new EquipoFutbol("Real Oviedo", 4, 26, "1902"));

        if (!segunda.add(new EquipoFutbol("Sporting Gijón", 20, 32, "1892"))) {
            System.out.println("Ya existe ese equipo en la lista.");
        }

//        for (EquipoFutbol it : segunda) {
//            System.out.println(it);
//        }
        Set<EquipoFutbol> copiaPrimera = new TreeSet<>(primera);
        Set<EquipoFutbol> equiposRepetidos = new TreeSet<>(primera);

        //equiposFuera.add(new EquipoFutbol("Lalín FC", 99, 50, "2020"));
        System.out.println("Equipos que no están en primera ni en segunda: ");

        // Unión.
        copiaPrimera.addAll(segunda);

        // Intersección.
        equiposRepetidos.retainAll(segunda);

        // Unión - intersección.
        copiaPrimera.removeAll(equiposRepetidos);

        for (EquipoFutbol it : copiaPrimera) {
            System.out.println(it);
        }
    }
}
