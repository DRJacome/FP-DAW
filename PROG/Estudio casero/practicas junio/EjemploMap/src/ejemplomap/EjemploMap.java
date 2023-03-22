/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author jacod
 */
public class EjemploMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Map<String, String> modulos = new TreeMap<>();
        modulos.put("dwcs", "desenvolvemento web contorno servidor");
        modulos.put("daw", "despregamento apliacións web");
        modulos.put("eie", "empresa e iniciativa emprendedora");
//
//        System.out.print("Dime acrónimo módulo: ");
//        String ab = tec.nextLine();
//        System.out.println(ab + " = "+ modulos.get(ab));
//

        for (Map.Entry<String, String> it : modulos.entrySet()) {
            String valor = it.getValue();
            System.out.println(it.getKey() + " - " + it.getValue());
            System.out.println(valor);
        }
    }
}
