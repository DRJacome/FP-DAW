import java.util.Scanner;

/**
 * ParesImpares: se recoger� por teclado un n�mero n que introducir� el usuario 
 * y  nuestro  programa  deber�  devolver  la  suma  de  todos  los  n�meros  anteriores pares 
 * y la suma de todos los anteriores impares. 
 * Adem�s, devolver� la suma de los  n  n�meros  posteriorespares  
 * y  la  suma  de  los  n  posteriores  impares.
 * Por ejemplo:  si  el  usuario  introduce  4  el  resultado  deber�  ser anteriores pares (6=4+2),
 * anterioresimpares   (4=3+1), 
 * posteriores pares (6+8+10+12) y posteriores impares (5+7+9+11).
 */

/**
 * @author jacod
 *
 */
public class ParesImpares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduce un n�mero entero: ");
		int numero = tec.nextInt();
		tec.close();
		int suma = 0;
		int impar = 0;
		int anterior = 0, posterior = 0;
		
		for (int i = numero; i > 0; i--) {
		if (i %2 == 0) {
			suma = suma + i;
		} else {
			impar = impar + i;
	}
	}
		for (int i = 3 * numero; i> numero; i--) {
			if (i %2 == 0) {
				anterior = anterior + i;
			} else {
			posterior = posterior + i;
			}
	}
		System.out.print("El resultado de la suma de los n�meros anteriores pares de " 
				+ numero + " es " + suma + ";\n"
				+ "y el resultado de la suma de los n�meros anteriores impares de "
			    + numero + " es " + impar + ".\n"
				+ "El resultado de la suma de los n�meros posteriores pares de " 
				+ numero + " es " + anterior + ";\n"
				+ "y el resultado de la suma de los n�meros posteriores impares de "
				+ numero + " es " + posterior + ".");
}
}
