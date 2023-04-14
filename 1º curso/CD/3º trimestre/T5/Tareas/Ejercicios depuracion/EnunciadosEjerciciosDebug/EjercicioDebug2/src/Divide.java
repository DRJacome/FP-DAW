
/**
 * @author Jose
 *
 */
public class Divide {

    public float calculo(float num1, float num2) {
        /**
         * Los tipos de datos están mal. El método intenta hacer una división con enteros, <br\>
         * pero al dividir un dividendo de valor más pequeño que el valor del divisor <br\>
         * (que da un resultado < 1), devuelve la parte entera, que es 0. <br\> Solución: cambiar el tipo de dato usado
         * en la firma del método float. <br\>
         */
        return num1 / num2;
    }
}
