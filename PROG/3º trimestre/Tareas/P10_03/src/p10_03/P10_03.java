/*

 */
package p10_03;

import static es.david.bdrelaciones.SGBD.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P10_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        redirigeSalidaError("logBD");
        String url = "jdbc:mysql://10.0.3.124/java";
        String usuario = "root";
        String password = "root";

        if (!bdConectarSGBD(url, usuario, password)) {
            System.out.println("No se pudo conectar a la BD. Finalizando programa.");
            System.exit(0);
        }

        System.out.println("Introduce el nombre de la tabla que quieras consultar: ");
        String tabla = tec.nextLine();

        System.out.println("Introduce el número de campos a recuperar: ");
        int numCampos = Integer.parseInt(tec.nextLine());

        String[] campos = new String[numCampos];

        for (int i = 0; i < campos.length; i++) {
            System.out.println("Introduce el nombre del campo a consultar: ");
            campos[i] = tec.nextLine();
        }

        System.out.println("¿Qué condición debe cumplir la consulta?");
        String condicion = tec.nextLine();
        if (condicion.isEmpty()) {
            condicion = null;
        }
        ResultSet rs = bdRecuperarDatosCampos(tabla, campos, condicion);
        if (rs != null) {
            try {
                int contador = 1;
                while (rs.next()) {
                    String datos = "";
                    for (int i = 0; i < campos.length; i++) {
                        datos += "\n\t " + campos[i] + ": " + rs.getString(campos[i]);
                    }
                    System.out.println("Portátil " + (contador++) + datos);

                }
            } catch (SQLException ex) {
                LOG.log(Level.SEVERE, null, ex);
            }
        }
        if (!bdCerrarConexion()) {
            System.out.println("Error de cierre de sesión.");
        }
    }
}
