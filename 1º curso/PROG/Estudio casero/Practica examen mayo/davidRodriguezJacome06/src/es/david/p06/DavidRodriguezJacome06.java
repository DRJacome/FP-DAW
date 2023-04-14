/*
 * Crear un proyecto para el código que se muestra a continuación
 * e internacionalizarlo (Español, Inglés y Francés)
 */
package es.david.p06;

import java.sql.*;
import java.util.ResourceBundle;

/**
 *
 * @author David
 */
public class DavidRodriguezJacome06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Uso una variable de la clase ResourceBundle para alternar las traducciones.<br>
         * Recibe por parámetro la dirección del archivo .properties del idioma por defecto.<br>
         * Conviene recordar que se puede internacionalizar con el Wizard de NetBeans,<br>
         * pero se debe tener en cuenta que debemos cambiar el nombre de la variable ResourceBundle en cada línea de
         * texto a traducir.<br>
         * Formato: ResourceBundle nombreVariable = ResourceBundle.getBundle("rutaArchivoIdioma");
         */
        ResourceBundle textos = ResourceBundle.getBundle("es/david/p06/traducciones_es_ES");

        /*
        * Parámetros de conexión a la BD.
         */
        Connection con = null;
        String user = "root";
        String passwd = "root";

        //String url = "jdbc:mysql://10.0.3.100/";
        String url = "jdbc:mysql://localhost/";

        Statement stm = null;
        String bd = "examen11";

        try {
            /**
             * Conexión y Statement para conectar y lanzar peticiones a la BD.<br>
             * Conviene recordar de añadir el Driver JDBC (.jar).
             */

            // Abro los flujos Connection y Statement.
            con = DriverManager.getConnection(url, user, passwd);

            /**
             * En cada texto, cambiamos ResourceBundle.getBundle("es/david/p06/traducciones_es_ES")<br>
             * por el nombre de la variable (textos), llamamos al método getString(),<br>
             * y le pasamos como parámetro la key (clave) correspondiente del archivo nombreArchivo.properties.
             */
            System.out.println(textos.getString("EXITO_CONEXION"));
            stm = con.createStatement();

            stm.executeUpdate("USE " + bd);

            /**
             * En este caso, debemos envolver la varaible "textos" con java.text.MessageFormat.format().<br>
             * Este método recibe como parámetros la variable "textos", y un objeto de la clase Object<br>
             * para conservar la variable que lleva concatenada ({0}).
             */
            System.out.println(java.text.MessageFormat.format(textos.getString("BD_SELECCIONADA"),
                    new Object[]{bd}));

            // Cierro los flujos en el mismo orden en el que los abrí.
            stm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(textos.getString("ERROR_CONEXION"));
        }
    }
}
