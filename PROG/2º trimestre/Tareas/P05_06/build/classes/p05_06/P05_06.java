/*

 */
package p05_06;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P05_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Cuadrilatero c = new Cuadrilatero(new Punto[]{new Punto(10, 20),
            new Punto(10, 40),
            new Punto(30, 20),
            new Punto(30, 45)});

        Cuadrilatero d = new Cuadrilatero(10, 20, 10, 40, 30, 20, 30, 45);

        /*Creamos un objeto de la clase Cuadrado llamado 'e' y entre paréntesis
        * van los parámetros que coge del constructor de la clase Cuadrado.
        * Los parámetros del constructor son: puntos, lado, color, grados de giro, visibilidad.
         */
        Cuadrado e = new Cuadrado(new Punto(0.0, 0.0), 25, 0, 0, true);

        System.out.println("\n Cuadrado 1: " + e.devolverEstado());
        /* El desplazamiento horizontal y vertical van fuera del constructor
        * porque son métodos que se crearon fuera del constructor.
        *
        * Pintar y ocultar son métodos que se inicializan en 0 en el constructor
        * anterior y luego se les asigna el valor real más adelante.
         */
        e.desplazarHorizontal(20.5);
        e.desplazarVertical(20.5);
        e.redimensionar(6);
        e.pintar(1);
        e.ocultar();

        System.out.println("\n Nuevo cuadrado: " + e.devolverEstado());

        /**
         * Creamos un rectángulo.
         */
        Rectangulo f = new Rectangulo(10, 5, new Punto(0, 0), 3, 0.0, true);

        //System.out.println(" El área del cuadrado es: " + e.area());
        System.out.println("\n Rectángulo 1: " + f.devolverEstado());

        f.desplazarHorizontal(2.0);
        f.desplazarVertical(2.0);
        f.redimensionar(2.0);
        f.pintar(6);
        f.girar(15);
        f.ocultar();

        /**
         * Ahora creamos un triángulo, lo sacamos por pantalla y lo modificamos para imprimirlo otra vez.
         */
        System.out.println("\n Nuevo rectángulo: " + f.devolverEstado());

        Triangulo g = new Triangulo(new Punto(0, 0), 4, 4);

        System.out.println("\n Triángulo 1: " + g.devolverEstado());

        g.desplazarHorizontal(3.0);
        g.desplazarVertical(3.0);
        g.redimensionar(3.0);
        g.pintar(4);
        g.girar(25);
        f.ocultar();

        System.out.println("\n Nuevo triángulo: " + f.devolverEstado());

        /**
         * Por último, creamos un círculo, lo sacamos por pantalla, lo modificamos y lo volvemos a imprimir. Si usamos
         * "Math.PI" para el parámetro radio, por pantalla debemos usar -sout printf- para evitar que el radio escrima
         * demas
         */
        Circulo h = new Circulo(new Punto(2, 2), 9, 40, Math.PI, true);

        System.out.printf("\n Círculo 1: " + h.devolverEstado());

        h.desplazarHorizontal(5.5);
        h.desplazarVertical(5.5);
        g.redimensionar(4.3);
        g.pintar(0);
        g.girar(9);
        g.ocultar();

        System.out.printf("\n Nuevo círculo: " + h.devolverEstado());
    }

}
