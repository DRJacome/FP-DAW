/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticaSerializarSencillo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 *
 * @author alumno
 */
public class PracticaSerializarSencillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,
            IOException,
            ClassNotFoundException {

        List<Portatil> listaPCs = new ArrayList<>();

        Portatil pc = new Portatil(200, 17, false, "ASUS", new Procesador(30, 5.5),
                new Memoria[]{
                    new Memoria(6000, "DDR5"),
                    new Memoria(6000, "DDR5")});

        listaPCs.add(pc);

        for (Portatil item : listaPCs) {
            System.out.println("PC escrito: " + item);
        }

        ObjectOutputStream grabarDatos = new ObjectOutputStream(
                new FileOutputStream("ListaPortatiles"));

        grabarDatos.writeObject(listaPCs);

        grabarDatos.close();

        ObjectInputStream leerDatos = new ObjectInputStream(
                new FileInputStream("ListaPortatiles"));

        List<Portatil> listaPCs2 = new ArrayList<>();

        listaPCs2 = (List<Portatil>) leerDatos.readObject();

        leerDatos.close();

        for (Portatil item : listaPCs2) {
            System.out.println("Portátil leído: " + item);
        }

    }
}
