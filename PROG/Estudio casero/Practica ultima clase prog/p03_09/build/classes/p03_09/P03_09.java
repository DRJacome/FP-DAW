/*

 */
package p03_09;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P03_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Character letra;

        System.out.println("Introduce una letra");
        letra = tec.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'
                || letra == 'u') {
            for (int i = 1; i < 100; i += 4) {
                System.out.println(i);
            }

        } else {
            for (char i = 'z'; i >= 'a'; i--) {
                System.out.println(i);
            }
        }
    }

}

/*Algoritmo p03_09
	Definir letra Como Caracter
	Escribir 'Introduce una letra'
	Leer letra
	Si letra = "a" o letra ="e" o letra ="i" o letra = "o" o letra ="u" Entonces
		Para i<-1 Hasta 99 Con Paso 4 Hacer
			Escribir i
		FinPara
	SiNo
		Para j<-"z" Hasta "a" Con Paso -1 Hacer
			Escribir j
		FinPara
	FinSi
FinAlgoritmo*/
