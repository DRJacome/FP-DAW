import java.util.Scanner;

public class TablaMultiplicar {
  
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    
    System.out.print("Tabla de multiplicar.\n"
                + "Introduzca un número entero " 
                + "para calcular la tabla."
                + " Debe estar en el rango [1-10]: ");
    
    int numero = tec.nextInt();
        while (numero < 1 || numero > 10) {
            System.out.print("Número no válido. "
                    + "El número debe estar en el rango [1-10]: ");
            numero = tec.nextInt();
        }
    for (int i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);   
    }
  }
}