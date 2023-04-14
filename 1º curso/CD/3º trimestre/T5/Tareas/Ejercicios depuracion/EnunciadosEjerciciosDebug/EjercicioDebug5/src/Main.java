/**
 * @author Jose
 * 
 *         El objetivo de esta actividad es comprender el funcionamiento de
 *         funciones recursivas con la ayuda de la herramienta de debug (una
 *         función es recursiva cuando se llama llama a sí misma). Lo haremos
 *         con dos ejemplos, el factorial y la serie de Fibonacci.
 * 
 *         Puedes buscar información sobre recursividad, o sobre la serie de
 *         Fibonacci en Internet si lo consideras oportuno.
 * 
 *         - Factorial
 * 
 *         Se puede calcular de manera iterativa como: N! = 1 * 2 * 3 * ….. * (N
 *         -1) * N  o tb  N! = N * (N -1) ….. * 3 * 2 * 1
 * 
 *         Pero el cálculo también se puede calcular de la siguiente manera
 *         empleando recursividad: N! = N * (N-1)!
 * 
 *         La función calculoFactorial está desarrollada usando la recursividad.
 *         Vamos a ver primero su funcionamiento. Haz el debug del programa para
 *         ver cómo va desarrollándose la ejecución. Prueba con 5 por ejemplo
 *         para ver suficientes iteraciones (la entrada es como argumento del
 *         main para que sea menos pesado el debug)
 * 
 * 
 *         - Fibonacci
 * 
 *         Es una serie en la que un valor se calcula a partir de los dos
 *         anteriores Fin (N) = Fib (N-1) + Fib (N-2)
 * 
 * 
 *         Una vez comprendido esto, realiza la siguiente tarea:
 * 
 *         Comenta las líneas del factorial y descomenta las del cálculo de
 *         Fibonacci. Al ejecutarlo da error. Haz el Debug del programa para ver
 *         qué sucede e indica la solución
 * 
 */

public class Main {

	public static void main(String[] args) {
		int num;
		int factorial;
		int fibonacci;

		if (args.length == 1) {
			num = Integer.parseInt(args[0]);
			if (num >= 0) {
				factorial = calculoFactorial(num);
				System.out.println("El factorial de " + num + " es " + factorial);
				// fibonacci = calculoFibonacci(num);
				// System.out.println("El fibonncacci " + num + " es " + fibonacci );
			} else
				System.out.println("De un negativo no existe");
		} else
			System.out.println("Error número parámetros");

	}

	public static int calculoFactorial(int n) {
		int fact;
		if (n == 0)
			fact = 1;
		else
			fact = n * calculoFactorial(n - 1);
		return fact;
	}

	public static int calculoFibonacci(int num) {
		int fibonacci;
		if (num == 0)
			fibonacci = 1;
		else
			fibonacci = calculoFibonacci(num - 1) + calculoFibonacci(num - 2);
		return fibonacci;

	}

}
