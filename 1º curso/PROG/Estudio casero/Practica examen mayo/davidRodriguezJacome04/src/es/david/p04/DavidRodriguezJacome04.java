/*
 * Programa que cree una BD llamada examenXX (siendo XX los dos últimos dígitos de vuestra IP)
 * en el SXBD del servidor. Bajo esta BD, crear una tabla de nombre libre, con tres campos,
 * uno de tipo texto y dos numéricos (a vuestra elección) e insertar 2 registros en la misma.
 */
package es.david.p04;

import java.sql.*;

/**
 *
 * @author David
 */
public class DavidRodriguezJacome04 {

    /**
     * El método main() gestiona las excepciones de SQL con throws.<br>
     * IMPORTANTE: el proyecto debe tener el driver JDBC (archivo.jar).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        System.out.println("Programa para crear bases de datos.");

        // Variables de conexión a la base de datos.
        String url = "jdbc:mysql://localhost/";
        String user = "root";
        String clave = "";

        String nombreBD = "examen11";
        String nombreTabla = "usuarios";

        /**
         * Necesito dos elementos para conectar a una base de datos:<br>
         * -> Un conector de la clase Connection (Connection conexion = DriverManager.getConnection(url, user,
         * clave);),<br>
         * -> Una sentencia SQL para operar con la base de datos (Statement sentenciaSQL = conexion.createStatement();).
         * Abro el flujo de conexión y el flujo de sentencias.
         */
        Connection conexion = DriverManager.getConnection(url, user, clave);
        Statement sentenciaSQL = conexion.createStatement();

        // Con el método sentenciaSQL.executeUpdate(); pasamos como parámetro las instrucciones SQL.
        sentenciaSQL.executeUpdate("CREATE DATABASE IF NOT EXISTS " + nombreBD);
        sentenciaSQL.executeUpdate("USE " + nombreBD);

        sentenciaSQL.executeUpdate("CREATE TABLE IF NOT EXISTS " + nombreTabla + "("
                + "nombre VARCHAR(20),"
                + "edad INT(2),"
                + "altura INT(3))");

        sentenciaSQL.executeUpdate("INSERT INTO " + nombreTabla + " VALUES"
                + "('Laura', 21, 167),"
                + "('Sandra', 32, 171)");

        System.out.println("Base de datos y tabla creadas correctamente. Programa terminado.");

        // Cierro las conexiones en el mismo orden en las que las he abierto.
        sentenciaSQL.close();
        conexion.close();
    }
}
