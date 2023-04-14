/*
1) Método que calcule si una frase es un palíndromo.
 */
package practica_palindromo;

import java.util.Scanner;

/**
 * @author David Rodríguez Jácome
 */
public class Practica_Palindromo {

    static Scanner tec = new Scanner(System.in);
    String palabra;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe una palabra para saber si es palíndromo o no:");
        String palabra = tec.nextLine();
        System.out.println(hallarPalindromo(palabra));
    }

    public static boolean hallarPalindromo(String palabra) {
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
