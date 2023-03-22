/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacoordenadas09;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jacod
 */
public class PracticaCoordenadas09 {

    static Scanner tec = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Punto> listaPuntos = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el punto " + (i + 1) + ": ");
            System.out.println("Coordenada X: ");
            int x = tec.nextInt();
            System.out.println("Coordenada Y: ");
            int y = tec.nextInt();

            Punto punto = new Punto(x, y);
            listaPuntos.add(punto);
        }
        Collections.sort(listaPuntos);
        System.out.println("//////////////////////////////////////");
        for (Iterator<Punto> item = listaPuntos.iterator(); item.hasNext();) {
            System.out.println("Punto: " + item.next());
        }
    }
}
