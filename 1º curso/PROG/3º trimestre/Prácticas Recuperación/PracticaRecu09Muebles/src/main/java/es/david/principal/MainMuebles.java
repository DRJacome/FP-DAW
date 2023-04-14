/*

 */
package es.david.principal;

import es.david.mobiliario.Mueble;
import es.david.mobiliario.Silla;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class MainMuebles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner tec = new Scanner(System.in);
        Mueble x = new Mueble();
        x.setMaterial("Madera");
        Silla y = new Silla(true, 4, true, false, "bambú", 60.5, 90.7, 50.5, 20);

        System.out.println(y);
        System.out.println("Precio de la silla: " + y.getPrecio());

        ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream("datos"));
        ficheroSalida.writeObject(y);
        ficheroSalida.close();

        ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream("datos"));
        Silla nuevaSilla = (Silla) ficheroEntrada.readObject();
        ficheroEntrada.close();
    }
}
