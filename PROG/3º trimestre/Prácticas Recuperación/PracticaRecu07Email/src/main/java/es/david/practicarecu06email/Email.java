/*

 */
package es.david.practicarecu06email;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Email {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println(validarEmail("david@gmail.com"));

    }

    public static boolean validarEmail(String email) {
        return email.matches("^[a-z]+@[a-z]+(\\.)[a-z]{2,3}$");
    }
}
