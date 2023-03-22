/*

 */
package práctica.pkg26.excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica26Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream x;

        x = new FileInputStream("a.dat");
        int a = x.read();
        x.close();

        System.out.println("Mi programa seguirá aquí.");
    }

}
