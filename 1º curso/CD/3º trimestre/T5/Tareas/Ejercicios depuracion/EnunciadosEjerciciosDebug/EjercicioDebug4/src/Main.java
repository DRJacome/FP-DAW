/**
 * @author Jose
 *
 *         Usa el modo debug de Eclipse para responder a las cuestiones:
 * 
 *         1. ¿Para qué valor de la variable i la variable aux empieza a ser
 *         positiva?
 * 
 *         2. ¿Para qué valor de la variable numero la variable suma es 4700?
 * 
 *         3. ¿Para qué valor de la variable i la variable suma es mayor de
 *         1000?
 * 
 *         4. ¿Con qué valor sale del bucle la variable suma?
 * 
 *         5. ¿Para qué valor de la variable número la variable producto se sale
 *         de rango?
 *
 *         6. Cambia la variable producto a double? ¿Para qué valor de la
 *         variable número la variable producto se sale ahora de rango?
 *
 */
public class Main {

	public static void main(String[] args) {

		int i, auxiliar;
		int numero = 100;
		int suma = 0;
		int producto = 1;

		for (i = 1; i < 50; i++) {
			auxiliar = suma - numero;
			suma = suma + numero;
			producto = producto * numero;
			numero = numero + i;
		}
	}
}