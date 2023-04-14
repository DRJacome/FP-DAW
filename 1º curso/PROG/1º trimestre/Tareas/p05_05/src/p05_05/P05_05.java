/*
Partiendo del ejercicio p05_04:

Nuevas clases: BicicletaCarretera y BTT que hereden de Bicicleta.

BicicletaCarretera añade el atributo dropManillar.

BTT añade los atributos recorridoSuspensionDelantera, recorridoSuspensionTrasera.

El método de Bicicleta, comprobarEstadoCadena, dejará de imprimir y en su lugar devolverá un String.

En BicicletaCarretera se debe hacer un override de este último método,
de modo que el primer aviso sea a los 5000km y el segundo a los 7000km.

Crear constructores en todas las clases.
 */
package p05_05;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P05_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Bicicleta x = new Bicicleta();

        x.setPresion(new int[]{70, 72});
        x.setTipo("Trial");
        x.setKmsCadena(2500);
        x.setColor((int) (Math.random() * 10) + 1);
        System.out.println("Bicicleta 1");
        System.out.println(x);

        int color = (int) (Math.random() * 10) + 1;
        BicicletaCarretera y = new BicicletaCarretera (7.5,
                                                       new int[]{73, 75}, 
                                                       color, 
                                                       3000);

        System.out.println("Bicicleta 2");
        System.out.println(y);
        BTT z = new BTT(100, 0, new int[]{25, 30}, color, 3000);

        System.out.println("Bicicleta 3");
        System.out.println(z);
    }
}
