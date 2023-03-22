/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg22.prueba.objetos.pkg3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Prueba {

    Scanner tec = new Scanner(System.in);

    int[] lista;

    public Prueba(int tamanho) {
        lista = new int[tamanho];
    }

    void rellenarLista() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 100);
        }

        //System.out.print("Marca");
        //System.out.println("Modelo");
    }

    void vaciarLista() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = 0;
        }
    }

    void imprimirLista() {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

    int ValorMasAlto() {
        int masAlto = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > masAlto) {
                masAlto = lista[i];
            }
        }
        return masAlto;
    }

    int ValorMasBajo() {
        int masBajo = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] < masBajo) {
                masBajo = lista[i];
            }
        }
        return masBajo;

    }

    boolean contiene(int buscado) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == buscado) {
                return true;
            }
        }
        return false;
    }

    int[] devolverValoresMayorYMenor() {
        //int[] masAB = {lista[0], lista[0]}
        int masBajo = lista[0], masAlto = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < masBajo) {
                masBajo = lista[i];

            } else if (lista[i] > masAlto) {
                masAlto = lista[i];
            }
        }
        return new int[]{masAlto, masBajo};
    }
}
