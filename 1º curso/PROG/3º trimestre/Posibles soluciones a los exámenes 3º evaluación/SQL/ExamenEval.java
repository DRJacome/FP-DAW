/*

 */
package examen.eval;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amador Abelleira Gómez
 */
public class ExamenEval {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        String tabla = "javafx";
        BD bd = new BD("alumno", "abc123.", "jdbc:mysql://localhost/examen");

        if (!bd.conectar()) {
            System.out.println("No se puede conectar con la BD");
            return;
        }
        ResultSet rs = bd.recuperarTodo(tabla, "", "");
        if (rs != null) {
            while (rs.next()) {
                int id = rs.getInt(1);
                String texto = rs.getString(2);
                System.out.println(id + "- " + texto);
            }
            rs.close();
        } else {
            System.out.println("ResultSet nulo");
        }
        if (!bd.desconectar()) {
            System.out.println("Error al desconectar de la BD");
        }

    }

}
