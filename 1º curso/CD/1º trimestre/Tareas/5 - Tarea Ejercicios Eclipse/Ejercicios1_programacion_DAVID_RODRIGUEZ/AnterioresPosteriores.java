import java.util.Scanner;

/**
 * AnterioresPosteriores: se recoger� por teclado un n�mero n que introducir� el usuario  
 * y  nuestro  programa  deber�  devolver  la  suma  de  todos  los  n�meros anteriores 
 * m�s los n n�meros posteriores. Por ejemplo: si el usuario introduce 3 
 * el resultado deber� ser 21 (3+2+1+4+5+6).
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
		
		System.out.print("Introduce un n�mero entero: ");
		int numero = tec.nextInt();
		tec.close();
		int suma = 0;
		
		for (int i = numero + numero; i > 0; i--) {
			suma = suma + i;
		}
		System.out.print("El resultado es " + suma);
	}
}
