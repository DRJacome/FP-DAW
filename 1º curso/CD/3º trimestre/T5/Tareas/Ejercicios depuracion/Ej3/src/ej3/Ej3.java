package ej3;

import java.util.Arrays;

/**
 * @author Jose
 *
 * El siguiente c�digo pretende rellenar una matriz con n�meros aleatorios entre 0 y 100 y posteriormente ordenarla
 * invocando al metodo ordenarArray.
 *
 * Usa el modo debug de Eclipse para encontrar el error y corr�gelo para que funcione correctamente.
 *
 * Comenta el m�todo ordenarArray explicando su funcionamiento
 *
 */
public class Ej3 {

    public static void main(String[] args) {

        int nums[] = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(nums));

        ordenarArray(nums);

        System.out.println(Arrays.toString(nums));

    }

    private static int[] ordenarArray(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            /**
             * En el 2º for, que ordena los elementos del array, el parámetro -1 que hay después <br\>
             * de la función "numbers.length" no debe tener el parámetro "-1", porque se mantendría en la <br\>
             * posición anterior del array. Solución --> for (int j = i + 1; j < numbers.length; j++)
             */
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int auxiliar = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = auxiliar;
                }
            }
        }
        return numbers;
    }
}
