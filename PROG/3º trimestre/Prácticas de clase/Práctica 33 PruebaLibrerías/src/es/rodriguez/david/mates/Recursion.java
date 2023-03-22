/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.rodriguez.david.mates;

/**
 *
 * @author alumno
 */
public class Recursion {

    /**
     * Calcula el factorial de un número.
     *
     * @param numero Número del que se quiere calcular el factorial.
     * @return factorial del número o -1 en caso de error.
     */
    public static long factorial(long numero) {
        if (numero < 0) {
            return -1;
        }
        if (numero == 0) {
            return 1;
        }
        return numero * factorial(numero - 1);
    }

    /**
     * Calcula fibonacci del número suministrado.
     *
     * @param numero Número del que se va a calcular fibonacci.
     * @return fibonacci del número o -1 en caso de error.
     */
    public static long fibonacci(long numero) {
        if (numero < 0) {
            return -1;
        }
        if (numero <= 1) {
            return numero;
        }
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
}
