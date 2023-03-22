/*
Crear una tabla en la BD java con los datos necesarios para representar un objeto del tipo ordenador portátil,
pensado desde el punto de vista de una tienda informática.
 */
package p10_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P10_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection conexion = null;
        String url = "jdbc:mysql://10.0.3.124/java";
        String usuario = "root";
        String password = "root";
        Statement sentencia = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión establecida.");
            sentencia = conexion.createStatement();
            sentencia.executeUpdate("CREATE TABLE IF NOT EXISTS portatil("
                    + "numReferencia int(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY, "
                    + "marca VARCHAR(20) NOT NULL, "
                    + "modelo VARCHAR(30) NOT NULL, "
                    + "procesador VARCHAR(30) NOT NULL, "
                    + "protenciaCPU FLOAT NOT NULL, "
                    + "tipoRAM CHAR(4) NOT NULL, "
                    + "cantidadModulosRAM int NOT NULL, "
                    + "capacidadRAM INT NOT NULL, "
                    + "almacenamiento INT NOT NULL, "
                    + "tipoAlmacenamiento varchar(20) NOT NULL, "
                    + "tamanhoPantalla FLOAT NOT NULL, "
                    + "largo FLOAT NOT NULL, "
                    + "ancho FLOAT NOT NULL, "
                    + "alto FLOAT NOT NULL, "
                    + "precio INT NOT NULL, "
                    + "IVA FLOAT NOT NULL)");

        } catch (SQLException ex) {
            System.out.println("No se pudo conectar a la base de datos. Cerrando programa."
                    + "\n." + ex.getMessage());
            System.exit(0);
        }
        System.out.println("Se creó la tabla correctamente.");

        Scanner tec = new Scanner(System.in);
        try {
            sentencia = conexion.createStatement();
            while (true) {
                System.out.println("Rellenar datos de portátil. Introduce la marca: ");
                String marca = tec.nextLine();
                if (marca.isEmpty()) {
                    break;
                }
                System.out.println("Introduce el modelo: ");
                String modelo = tec.nextLine();
                System.out.println("Introduce el procesador: ");
                String procesador = tec.nextLine();
                System.out.println("Introduce la protencia del procesador: ");
                float potenciaCPU = Float.parseFloat(tec.nextLine());
                System.out.println("Introduce qué tipo de memoria RAM usa: ");
                String tipoRAM = tec.nextLine();
                System.out.println("Introduce cuándos módulos RAM tiene: ");
                int cantidadModulosRAM = Integer.parseInt(tec.nextLine());
                System.out.println("Introduce la capacidad de RAM en GB: ");
                int capacidadRAM = Integer.parseInt(tec.nextLine());
                System.out.println("Introduce el tamaño de la unidad de almacenamiento en GB: ");
                int almacenamiento = Integer.parseInt(tec.nextLine());
                System.out.println("Introduce el tipo de almacenamiento (SSD, HDD, etc.): ");
                String tipoAlmacenamiento = tec.nextLine();
                System.out.println("Introduce el tamaño del monitor en pulgadas: ");
                float tamanhoPantalla = Float.parseFloat(tec.nextLine());
                System.out.println("Dimensiones del equipo. Introduce el largo (cm): ");
                float largo = Float.parseFloat(tec.nextLine());
                System.out.println("Introduce el ancho (cm): ");
                float ancho = Float.parseFloat(tec.nextLine());
                System.out.println("Introduce el alto (cm)");
                float alto = Float.parseFloat(tec.nextLine());
                System.out.println("¿Qué precio tiene? (€): ");
                float precio = Float.parseFloat(tec.nextLine());
                System.out.println("Introduce el IVA: ");
                float IVA = Float.parseFloat(tec.nextLine());

                sentencia.executeUpdate("INSERT INTO portatil "
                        + "(marca, modelo, procesador, potenciaCPU, "
                        + "tipoRAM, cantidadModulosRAM, "
                        + "alamacenamiento, tipoAlmacenamiento, "
                        + "tamanhoPantalla, largo, ancho, alto, "
                        + "precio, IVA)" + "VALUES ('" + marca + "', '" + modelo + "', '" + procesador + "', '"
                        + potenciaCPU + ", '" + tipoRAM + "', " + cantidadModulosRAM + ", " + capacidadRAM + ", "
                        + almacenamiento + ", '" + tipoAlmacenamiento + "', " + tamanhoPantalla + ", "
                        + largo + ", " + ancho + ", " + alto + ", " + precio + ", "
                        + IVA + ")");
            }
        } catch (SQLException ex) {
            System.out.println("No se puede conectar a al base de datos. Finalizando programa.");
            System.exit(0);
        }

        try {
            sentencia.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar.");
        }
    }
}
