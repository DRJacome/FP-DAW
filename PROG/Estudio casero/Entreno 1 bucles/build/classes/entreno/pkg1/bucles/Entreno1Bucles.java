/*

*/

package entreno.pkg1.bucles;
import java.util.Scanner;
/**
 *
 * @author David Rodrígez Jácome
 */
public class Entreno1Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        
        int numero;
        int resultado = 1;
        
        System.out.println("Introduce un número: ");
        numero = tec.nextInt();
        
        for (int i = numero; i > 0; i--) {
            resultado = resultado*i;
            
        } System.out.println("El factorial de " + numero + " es " + resultado);
    }

}
