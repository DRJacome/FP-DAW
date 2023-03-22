/*
Programa compuesto por dos ficheros '.java'. En uno de ellos definiremos la clase Bicicleta la cual estará formada por:

Atributos: (todos privados)

presion array de dos enteros, indicando las presiones de las ruedas delantera y trasera respectivamente.
color entero indicando el color de la bicicleta.
tipo carácter o string indicando el tipo de bicicleta.
kmsCadena entero indicando el número de kilómetros recorridos con la cadena actual.

Métodos:

setter/getter para cada atributo.

Para los métodos relativos a la presión, habrá dos versiones: una que trate ambas ruedas en conjunto y otra que tome como parámetro el número de rueda a tratar.

comprobarEstadoCadena imprimirá un texto en función de los kms recorridos:

<= 1800 La cadena está en buen estado.
>1800 && <=2000 La cadena está demasiado gastada.
>2000 SUSTITUIR INMEDIATAMENTE LA CADENA.

PROGRAMA PRINCIPAL:

a) Crear una bicicleta.

b) Fijar cada uno de sus atributos.

    El color se escogerá aleatoriamente un valor entre 1-10

c) Imprimir su estado (presiones, color, tipo, kms y estado de la cadena).
 */
package p05_04;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P05_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Bicicleta x = new Bicicleta();

        x.setPresion(new int[]{70, 72});
        x.setTipo("Carretera");
        x.setKmsCadena(2000);

        x.setColor((int) (Math.random() * 10) + 1);
        System.out.print("Presiones: " + x.getPresion(0) + " " + x.getPresion(1)
                + "\n Color: " + x.getColor()
                + "\n Tipo: " + x.getTipo()
                + "\n Kilómetros recorridos: " + x.getKmsCadena()
                + "\n Estado de la cadena: ");
        x.comprobarEstadoCadena();
    }
}
