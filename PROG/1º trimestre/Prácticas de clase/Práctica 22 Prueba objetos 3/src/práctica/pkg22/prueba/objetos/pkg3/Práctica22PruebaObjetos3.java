/*

 */
package práctica.pkg22.prueba.objetos.pkg3;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica22PruebaObjetos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Prueba x = new Prueba(20);
        x.rellenarLista();
        x.imprimirLista();
        System.out.println("El valor más lato de la lista es: " + x.ValorMasAlto());
        System.out.println("El valor más bajo de la lista es: " + x.ValorMasBajo());
        System.out.println("El número 35 " + (!x.contiene(35) ? "no" : "")
                + " está contenido en la lista");
        x.vaciarLista();
        System.out.println("El número 0 " + (!x.contiene(0) ? "no" : "")
                + " está contenido en la lista");
        x.imprimirLista();
        x.rellenarLista();
        System.out.println("El valor mayor de la nueva lista es: "
                + x.devolverValoresMayorYMenor()[0]);

        int[] v = x.devolverValoresMayorYMenor();
    }
}
//Rellenar lista, devolver valor más alto, más bajo, imprimir lista,
//indicar cuál es el valor más alto y el más bajo a la vez.
//Cuando construyamos el array, debe indicar cuántas posiciones tiene.
