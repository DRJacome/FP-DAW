/*

 */
package ejlibrobucles22;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class EjLibroBucles22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        boolean primo = true;

        for (int i = 2; i <= 100; i++) {
            primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i + " ");
            }
        }
    }

}
