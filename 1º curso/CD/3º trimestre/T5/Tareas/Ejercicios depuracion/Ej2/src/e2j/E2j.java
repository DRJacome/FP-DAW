/*

 */
package e2j;

/**
 * @author Jose
 *
 * Usa el modo debug de Eclipse para encontrar los errores en las clases de Suma, Resta, Multiplica y Divide y corr�gelo
 * para que funcione correctamente.
 *
 */
public class E2j {

    public static void main(String[] args) {

        Suma suma = new Suma();

        Resta resta = new Resta();

        Multiplica multiplica = new Multiplica();

        Divide divide = new Divide();

        System.out.println("suma: " + suma.calculo(7, 8));

        System.out.println("resta: " + resta.calculo(7, 8));

        System.out.println("multiplicaci�n: " + multiplica.calculo(7, 8));

        System.out.println("Divisi�n: " + divide.calculo(7, 8));
    }
}
