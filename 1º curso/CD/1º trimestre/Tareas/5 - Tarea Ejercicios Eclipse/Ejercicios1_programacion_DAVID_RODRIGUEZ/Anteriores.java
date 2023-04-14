import java.util.Scanner;

/**
 * Anteriores:  se  recoger�  por  teclado  un  n�mero  que  introducir�  el  usuario 
 * y nuestro programa deber� devolver la suma de todos los n�meros anteriores. 
 * Por ejemplo: si el usuario introduce 5 el resultado deber� ser 15 (5+4+3+2+1).
 */

/**
 * @author jacod
 *
 */
public class Anteriores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduce un n�mero entero: ");
		int numero = tec.nextInt();
		tec.close();
		int suma = 0;
		
		for (int i = numero; i > 0; i--) {
			suma = suma + i;
		}
		System.out.print("El resultado de sumar los n�meros anteriores de "
						+ numero + " es " + suma);
	}
}
