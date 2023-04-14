package ej4;

/**
 * @author Jose
 *
 * Usa el modo debug de Eclipse para responder a las cuestiones:
 *
 * 1. ¿Para qué valor de la variable i la variable aux empieza a ser positiva? <br\>
 * R: Para el valor 3.
 *
 * 2. ¿Para qué valor de la variable numero la variable suma es 4700? <br\>
 * R: Para el valor 376.
 *
 * 3. ¿Para qué valor de la variable i la variable suma es mayor de 1000? <br\>
 * R: Para el valor 9.
 *
 * 4. ¿Con qué valor sale del bucle la variable suma? <br\>
 * R: con un valor de 24500.
 *
 * 5. ¿Para qué valor de la variable número la variable producto se sale de rango? <br\>
 * R: Con valor 110. Esto se produce porque la variable producto se sale de rango para el tipo de dato int.
 *
 * 6. Cambia la variable producto a double. ¿Para qué valor de la variable número la variable producto se sale ahora de
 * rango? <br\>
 * R: No sale del rango. El bucle termina antes de que el tamaño del rango double desborde. <br\>
 * El valor de la variable número para la última iteración es 1325.
 *
 */
public class Ej4 {

    public static void main(String[] args) {

        int i, auxiliar;
        int numero = 100;
        int suma = 0;
        double producto = 1;

        for (i = 1; i < 50; i++) {
            auxiliar = suma - numero;
            suma = suma + numero;
            producto = producto * numero;
            numero = numero + i;
        }
    }
}
