/*

 */
package practicarecuexamen02_3;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class PrácticaRecuExamen02_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Bicicleta b = new Bicicleta();

        b.setMarca("Shimano");
        b.setColor((int) (Math.random() * (15) + 17));
        b.setKmsCadena(954);
        b.setPresion(new int[]{9, 9});
        int kmsRestantes = 1200 - b.getKmsCadena();
//        b.setPresion(0, 8);
//       b.setPresion(1, 7);

        if (kmsRestantes >= 0) {
            System.out.println(b
                    + "\n Kilómetros restantes antes de sustituir de la cadena: "
                    + kmsRestantes + "Kms.");
        } else {
            kmsRestantes = -kmsRestantes;
            System.out.println(b + "\n Kilómetros restantes antes de sustituir de la cadena: Debería haberse cambiado hace "
                    + kmsRestantes + " Kms.");
        }

    }
}
