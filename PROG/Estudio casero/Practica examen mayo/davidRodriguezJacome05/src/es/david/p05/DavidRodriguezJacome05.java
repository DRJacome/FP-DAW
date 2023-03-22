/*
 * Recuperar los datos creados en el ejercicio 4) (si no lo habéis hecho,
 * podéis crear la BD, tabla y registros del modo que prefiráis – Worbench, phpMyAdmin, …)
 * y volcarlos en un fichero binario de nombre misDatos en el directorio /home/alumno/Descargas
 */
package es.david.p05;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

/**
 * @author David
 */
public class DavidRodriguezJacome05 {

    /**
     * El método main() gestiona las excepciones de SQL con throws.<br>
     * IMPORTANTE: el proyecto debe tener el driver JDBC (archivo.jar).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
        System.out.println("Programa para recuperar datos de bases de datos.");

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
         * -> Una sentencia SQL para operar con la base de datos (Statement sentenciaSQL =
         * conexion.createStatement();).<br>
         * Abro el flujo de conexión y el flujo de sentencias.
         */
        Connection conexion = DriverManager.getConnection(url + nombreBD, user, clave);
        Statement sentenciaSQL = conexion.createStatement();

        // Uso ResultSet para almacenar el conjunto de datos resultado de la consulta de la base de datos.
        ResultSet rs = sentenciaSQL.executeQuery("SELECT * FROM " + nombreTabla);

        /**
         * Necesito tres elementos para grabar los datos de la consulta de la base de datos:<br>
         * -> DataOutputStream: flujo de grabación de datos. -> BufferedOutputStream: encapsulamiento que mejora el
         * rendimiento de grabación. -> FileOutputStream: encapsulamiento que dirige los datos a grabar al fichero de
         * destino.
         */
        DataOutputStream grabarDatos
                = new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("src\\es\\david\\p05\\misDatos")));

        // Acción de grabación de datos:
        // Mientras que el programa siga encontrando datos para grabar, ejecutará el bucle.
        while (rs.next()) {

            /**
             * Del objeto grabarDatos llamo al método adecuado según el tipo de dato correspondiente,<br>
             * y le pasamos como parámetro el método adecuado según el tipo de dato correspondiente,<br>
             * y el nombre de la columna (o posición de la columna) del registro deseado.
             */
            grabarDatos.writeUTF(rs.getString("nombre"));
            grabarDatos.writeInt(rs.getInt("edad"));
            grabarDatos.writeInt(rs.getInt("altura"));
        }

        System.out.println("Consulta y grabación de datos de la tabla " + nombreTabla
                + " de la base de datos " + nombreBD + " realizada correctamente.\n Programa terminado.");

        // Cierro las conexiones en el mismo orden en las que las he abierto.
        grabarDatos.close();
        sentenciaSQL.close();
        conexion.close();
    }

}
