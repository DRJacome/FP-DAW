import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    
    System.out.print("Introduce un número entero: ");
    int numero = tec.nextInt();
    while (numero <=0) {
    System.out.print("El número no es par ni impar."
                    + " Introduzca otro número: ");
    numero = tec.nextInt();
    }
    if (numero % 2 == 0 ){
            System.out.println("El número es par");
    } else {
            System.out.println("El número es impar");
    }
  }
  }