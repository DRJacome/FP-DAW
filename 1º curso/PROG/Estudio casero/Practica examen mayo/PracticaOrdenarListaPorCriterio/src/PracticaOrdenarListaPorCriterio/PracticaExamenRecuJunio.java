/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticaOrdenarListaPorCriterio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alumno
 */
public class PracticaExamenRecuJunio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Creando nave espacial.");

        List<NaveEspacial> lista = new ArrayList<>();

        lista.add(new NaveEspacial(12.5, "Nacionalidad1", true, "tipoReactor1", 30));
        lista.add(new NaveEspacial(30.2, "Nacionalidad2", false, "tipoReactor2", 20));
        lista.add(new NaveEspacial(17.6, "Nacionalidad3", true, "tipoReactor3", 10));
        lista.add(new NaveEspacial(305.2, "Nacionalidad4", false, "tipoReactor4", 20));

        System.out.println("Lista desordenada: ");

        for (NaveEspacial item : lista) {
            System.out.println(item);
        }
        System.out.println("/////////////////////");

        System.out.println("Lista ordenada por cañones: ");

        Collections.sort(lista);
        for (NaveEspacial item : lista) {
            System.out.println(item);
        }

        System.out.println("////////////////////////");
        System.out.println("Lista ordenada por peso: ");
        lista.sort(new PorPeso());
        for (NaveEspacial item : lista) {
            System.out.println(item);
        }
    }

}
