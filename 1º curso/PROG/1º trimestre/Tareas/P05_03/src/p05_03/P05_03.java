/*
Clase prueba con los siguientes componentes:

Atributos (todos privados):

    private int[] lista; ->  sin ningún tipo de acceso desde fuera de la clase.
    private String nombre; -> dejamos que se consulte y/o cambie desde fuera.
    private int factor; -> permitimos su consulta desde fuera.

Métodos:

    RellenarLista() -> rellena la lista con valores aletorios entre [0-factor).
    VaciarLista() -> pone todos los valores a cero.
    DevolverValorMasAlto() -> devuelve el valor más alto de la lista.
    DevolverValorMasBajo() -> devuleve el valor más bajo de la lista.

    ImprimirLista()-> imprime la lista (formato libre).

    Contiene -> le pasamos un valor y mira si está contenido en la lista,
    indicando en qué posición de la misma está la primera ocurrencia.

    Contiene2 -> le pasamos un valor y mira si está contenido en la lista,
    indicando en qué posición de la misma está la última ocurrencia.

    DevolverValoresMayorYMenor -> devuelve los valores mayor y menor de la lista.
 */
package p05_03;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P05_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Prueba x = new Prueba(20, 100);
        x.rellenarLista();
        x.imprimirLista();
        System.out.println("El valor más alto de la lista es: " + x.ValorMasAlto());
        System.out.println("El valor más bajo de la lista es: " + x.ValorMasBajo());
        System.out.println("El número 35 " + (x.contiene(35)[0] == 0 ? "no" : "")
                + " está contenido en la lista"
                + (x.contiene(35)[0] != 0 ? (", en la posición " + x.contiene(35)[1]) : ""));

        System.out.println("El número 35 " + (!x.contiene2(35).encontrado ? "no" : "")
                + " está contenido en la lista"
                + (x.contiene2(35).encontrado ? (", en la posición " + x.contiene2(35).posicion) : ""));

        x.vaciarLista();
        System.out.println("El número 0 " + (x.contiene(0)[0] == 0 ? "no" : "")
                + " está contenido en la lista"
                + (x.contiene(0)[0] != 0 ? (", en la posición " + x.contiene(0)[1]) : ""));

        System.out.println("El número 0 " + (!x.contiene2(0).encontrado ? "no" : "")
                + " está contenido en la lista"
                + (x.contiene2(0).encontrado ? (", en la posición " + x.contiene2(0).posicion) : ""));
        x.imprimirLista();
        x.rellenarLista();
        System.out.println("El valor mayor de la nueva lista es: "
                + x.devolverValoresMayorYMenor()[0]
                + " \ny el valor menor es: "
                + x.devolverValoresMayorYMenor()[1]);

        //int[] v = x.devolverValoresMayorYMenor();
    }
}
