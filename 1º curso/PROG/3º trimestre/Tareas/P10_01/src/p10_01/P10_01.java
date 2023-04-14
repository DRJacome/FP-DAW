/*
Crear una tabla en la BD java con los datos necesarios para representar un objeto del tipo ordenador portátil,
pensado desde el punto de vista de una tienda informática.
 */
package p10_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P10_01 {

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
            System.out.println("No se pudo conectar a la base de datos\n." + ex);
            System.exit(0);
        }
        System.out.println("Se creó la tabla correctamente.");

        try {
            sentencia.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar.");
        }
    }
}
