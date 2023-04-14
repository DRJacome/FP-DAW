/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticaSerializarTiposDatos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class PracticaSerializar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Portatil pc = new Portatil(5000.0, 15.6, true, "HP", new Procesador(8, 4400.0),
                new Memoria[]{
                    new Memoria(3200, "DDR4"),
                    new Memoria(3200, "DDR4")});

        System.out.println("Portátil escrito: \n" + pc);

        DataOutputStream grabarDatos = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("Ordenadores")));

        grabarDatos.writeDouble(pc.capacidadBateria);
        grabarDatos.writeDouble(pc.diagonalPantalla);
        grabarDatos.writeBoolean(pc.gaming);
        grabarDatos.writeUTF(pc.marca);
        grabarDatos.writeInt(pc.procesador.nucleos);
        grabarDatos.writeDouble(pc.procesador.frecuencia);

        int cantidadMemorias = pc.memoria.length;
        grabarDatos.writeInt(cantidadMemorias);

        for (int i = 0; i < pc.memoria.length; i++) {
            grabarDatos.writeInt(pc.memoria[i].velocidad);
            grabarDatos.writeUTF(pc.memoria[i].tipo);
        }

        grabarDatos.close();

        DataInputStream leerDatos = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("Ordenadores")));

        double capacidadBateria = leerDatos.readDouble();
        double diagonalPantalla = leerDatos.readDouble();
        boolean gaming = leerDatos.readBoolean();
        String marca = leerDatos.readUTF();
        int nucleos = leerDatos.readInt();
        double frecuencia = leerDatos.readDouble();

        cantidadMemorias = leerDatos.readInt();
        Memoria[] memorias = new Memoria[cantidadMemorias];
        for (int i = 0; i < cantidadMemorias; i++) {
            int velocidad = leerDatos.readInt();
            String tipo = leerDatos.readUTF();
            memorias[i] = new Memoria(velocidad, tipo);
        }
        leerDatos.close();

        Portatil pc2 = new Portatil(capacidadBateria,
                diagonalPantalla,
                gaming,
                marca,
                new Procesador(nucleos, frecuencia),
                memorias);
        System.out.println("Portátil leído: \n" + pc2);
    }
}
