import java.util.Scanner;

public class Factorial {
  
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    
    System.out.println("Intoduzca un número entero: ");
    int numero = tec.nextInt();
    while (numero < 0) {
      System.out.println("No es posible calcular el factorial de números negativos.\n"
                    + "Introduzca un número entero positivo: ");
      numero = tec.nextInt();
    }
    int factorial = 1;
        for (int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }
    System.out.println("El resultado del factorial de " + numero + " es: " + factorial);
}
}