import java.util.Scanner;

/**
 * AnterioresPosteriores: se recogerá por teclado un número n que introducirá el usuario  
 * y  nuestro  programa  deberá  devolver  la  suma  de  todos  los  números anteriores 
 * más los n números posteriores. Por ejemplo: si el usuario introduce 3 
 * el resultado deberá ser 21 (3+2+1+4+5+6).
 */

/**
 * @author jacod
 *
 */
public class AnterioresPosteriores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduce un número entero: ");
		int numero = tec.nextInt();
		tec.close();
		int suma = 0;
		
		for (int i = numero + numero; i > 0; i--) {
			suma = suma + i;
		}
		System.out.print("El resultado es " + suma);
	}
}
