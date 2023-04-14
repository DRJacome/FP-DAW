import java.util.Scanner;

/**
 * ParesImpares: se recogerá por teclado un número n que introducirá el usuario 
 * y  nuestro  programa  deberá  devolver  la  suma  de  todos  los  números  anteriores pares 
 * y la suma de todos los anteriores impares. 
 * Además, devolverá la suma de los  n  números  posteriorespares  
 * y  la  suma  de  los  n  posteriores  impares.
 * Por ejemplo:  si  el  usuario  introduce  4  el  resultado  deberá  ser anteriores pares (6=4+2),
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
		
		System.out.print("Introduce un número entero: ");
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
		System.out.print("El resultado de la suma de los números anteriores pares de " 
				+ numero + " es " + suma + ";\n"
				+ "y el resultado de la suma de los números anteriores impares de "
			    + numero + " es " + impar + ".\n"
				+ "El resultado de la suma de los números posteriores pares de " 
				+ numero + " es " + anterior + ";\n"
				+ "y el resultado de la suma de los números posteriores impares de "
				+ numero + " es " + posterior + ".");
}
}
