/*

 */
package es.david.practicarecu07listaenlazada;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
class Punto implements Comparable<Punto> {

    private Double x;
    private Double y;

    public Punto(double x, double Y) {
        this.x = x;
        this.y = Y;
    }

    @Override
    public String toString() {
        return "Punto{"
                + "x = " + x
                + ", Y = " + y;
    }

    @Override
    public int compareTo(Punto t) {
        return this.y.compareTo(t.y);
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the Y
     */
    public double getY() {
        return y;
    }

    /**
     * @param Y the Y to set
     */
    public void setY(double Y) {
        this.y = Y;
    }
}

public class ListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        List<Punto> puntos = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Punto " + (i + 1) + "/10");
            System.out.println("Coordenada x: ");
            double x = tec.nextDouble();
            System.out.println("Coordenada y: ");
            double y = tec.nextDouble();
            puntos.add(new Punto(x, y));
        }

        // Ordenar lista.
        Collections.sort(puntos);

        for (int i = 0; i < 10; i++) {
            System.out.println(puntos.get(i));
        }

        for (Punto it : puntos) {
            System.out.println(it);
        }

        for (Iterator<Punto> it = puntos.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
