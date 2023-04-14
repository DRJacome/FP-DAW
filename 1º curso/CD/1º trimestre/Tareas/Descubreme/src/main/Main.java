/*

 */
package main;

import libreria.Libreria;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Main {

    /**
     * Descrubre el cometido de la funcion desconocida. Para ello es recomendable que realices invocaciones de prueba
     * desde el metodo main. Si la función tiene algún error, corrígelo. Cuando descubras su cometido, realiza varias
     * llamadas de prueba con distintas cadenas que permitan ver su funcionamiento. Busca algún caso en que la función
     * falle. Crea un nuevo metodo auxiliar mejorado. Invocalo desde el main.
     *
     * Modifica el proyecto para que reciba como parámetros de ejecución una lista de cadenas sobre las que realizar la
     * comprobacion. Si no se reciben parámetros, se comprobará una cadena definida dentro del codigo.
     */
    public static void main(String[] args) {

        Libreria libreria1 = new Libreria();
        String prueba = "Sé verla al revés";

        /*
	 * Primero comrobamos si el programa recibe argumentos. Se usa if para comprobar si el largo del array de strings (args)
	 * es igual a 0 (no le llega nada) o si le llega algún parámetro. Si el largo del array de strings es igual a 0,
	 * y si libreria1 invocando al método funcionDesconocida actuando sobre un string declarado anteriormente (prueba) es verdadero,
         * muesta por pantalla "Es un palíndromo"; y si es falso, muestra por pantalla "No es un palindromo".
         */
        if (args.length == 0) {
            if (libreria1.funcionDesconocida(prueba)) {
                System.out.println("Es un palíndromo");
            } else {
                System.out.println("No es un palindromo");
            }

            /*
             * Si llegan parámetros, se realiza el bucle for. Este comienza en 0 y termina en el final del array de strings
             * incrementando una unidad y repitiendo las sentencias de su interior por cada vuelta. En cada vuelta muestra
             * por pantalla lo que está contenido en la posición correspondiente del array, además de mostrar por pantalla
             * el resultado de invocar al método funcionDesconocida de la clase Libreria actuando sobre el contenido de la
             * posición correspondiente del array.
             */
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
                System.out.println(Libreria.funcionDesconocida(args[i]));
            }
            /*
             * Prueba de mejora de código: clonar los métodos funcionDesconocida y auxiliar, renombrarlas,
             * cambiar la clase del método auxiliar a "public" para que pueda ser invocada
             * y que el programa devuelva la corrección mejorada de los parámetros.
             */
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
                System.out.println(Libreria.auxiliarMejorada(args[i]));
                System.out.println(Libreria.funcionDesconocidaMejorada(args[i]));
            }
        }
    }
}
