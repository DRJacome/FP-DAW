/*
Programa que imprime tu nombre y apellidos
 */
package prueba2;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce dos números enteros para sumar");
        System.out.println("Primer número");
        int a = tec.nextInt();
        System.out.println("Segundo número");
        int b = tec.nextInt();
        int c = a + b;
        System.out.println("El resultado es " + c);

        System.out.println("Número entero");
        int a = 12530;
        System.out.println(a);
        System.out.println("Máximo entero");
        System.out.println(Integer.MAX_VALUE);

        System.out.println("Número short");
        short b = 12530;
        System.out.println(b);
        System.out.println("Máximo short");
        System.out.println(Short.MAX_VALUE);

        System.out.println("Número flotante");
        float c = 12.644465464f;
        System.out.println(c);
        System.out.println("Máximo float");
        System.out.println(Float.MAX_VALUE);

        System.out.println("Carácter");
        char d = 'g';
        System.out.println(d);

        System.out.println("Boolean");
        boolean e = false;
        System.out.println(e);

        System.out.println("Hola");
        System.out.println("Ho\nla");
        System.out.println("Ho\tla");

        int numero = 20, numero2 = 30;

        char texto = 'f';
        String texto2 = "cvposjd"
                + "gvpwoe pgwingwp"
                + "fgwpigwjhpige";

        System.out.print("Introduce tu nombre");
        String nombre = tec.nextLine();
        System.out.print("Introduzca su año de nacimiento: ");
        int aNacimiento = tec.nextInt();
        int edad = 2020 - aNacimiento;

        System.out.println("Tu nombre es "
                + nombre
                + "\n y tienes "
                + edad
                + " años");

        byte a; // declaración
        a = 15; // inicialización

        short b1 = 15, b2 = 15;

        int c1 = 15, c2 = 15;

        long d1 = 15l, d2 = 15L;

        float e = 3.25F;
        double f1 = 3, f2 = 3.9343;

        int x1 = (int) (c1 + f1);
        int x2 = (int) (c1 + f2);

        System.out.println("x1= " + x1 + "\nx2 = " + x2);

        int x1 = 5;
        int x2 = 15;
        System.out.println("- x1 = " + (-x1));
        System.out.println("++ x1 = " + (x1++));
        System.out.println("-- x1 = " + (--x1));
        System.out.println("+ x1 x2 = " + (x1 + x2));
        System.out.println("+ x1 x2 = " + x1 + x2);

        boolean g1 = true, g2 = false;

        char h1 = 'c', h2 = '\t';
        String i = "hol\ta";

        int numero1, numero2;
        System.out.print("Introduzca dos números enteros ");
        System.out.print("Primer número: ");
        numero1 = tec.nextInt();
        System.out.print("Segundo número: ");
        numero2 = tec.nextInt();

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + (numero1 + numero2));
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + (numero1 - numero2));
        System.out.println("El producto de " + numero1 + " y " + numero2 + " es " + (numero1 * numero2));
        System.out.println("La división de " + numero1 + " y " + numero2 + " es " + (numero1 / numero2));

        int res = numero1 + numero2;
        System.out.println("La mitad de la suma es " + (res / 2));
          */
                 int numero;
        System.out.println("Introduce un número en el intervalo [15-35]: ");
        numero = tec.nextInt();

        //Si el número es mayor o igual que 15 ->
        // y es manor o igual que 35
        //imprimir "Número válido"
        if (numero >= 15 && numero <= 35) {
            System.out.println("Número válido");
        } else {
            System.out.println("No válido");

        }
    }
}
