import java.util.Scanner;

/**
 * Anteriores:  se  recogerá  por  teclado  un  número  que  introducirá  el  usuario 
 * y nuestro programa deberá devolver la suma de todos los números anteriores. 
 * Por ejemplo: si el usuario introduce 5 el resultado deberá ser 15 (5+4+3+2+1).
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
		
		System.out.print("Introduce un número entero: ");
		int numero = tec.nextInt();
		tec.close();
		int suma = 0;
		
		for (int i = numero; i > 0; i--) {
			suma = suma + i;
		}
		System.out.print("El resultado de sumar los números anteriores de "
						+ numero + " es " + suma);
	}
}
