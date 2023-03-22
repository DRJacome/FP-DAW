/*

 */
package practicarecu06ficherobd;

import es.david.bdrelaciones.SGBDAnt;
import static es.david.bdrelaciones.SGBDAnt.LOG;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author David Rodríguez Jácome
 */
public class PracticaRecu06FicheroBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner tec = new Scanner(System.in);

        SGBDAnt.bdConectarSGBD("jdbc:mysql://10.0.3.124/java", "root", "root");

        SGBDAnt.bdCrearTabla("modulos", new String[]{
            "abreviatura varchar(10) primary key",
            "nombre varchar(50) not null",
            "horasSemanales tinyint not null",
            "profesor varchar(30) not null",
            "numAlumnos tinyint not null",
            "repetidores tinyint not null",}
        );

//        SGBDAnt.bdInsertarDatos("modulos", new String[][]{
//            {"abreviatura", "'P'"},
//            {"nombre", "'Programación'"},
//            {"horasSemanales", "9"},
//            {"profesor", "'Amador'"},
//            {"numAlumnos", "15"},
//            {"repetidores", "0"}});
//
//        SGBDAnt.bdInsertarDatos("modulos", new String[][]{
//            {"abreviatura", "'BD'"},
//            {"nombre", "'Bases de Datos'"},
//            {"horasSemanales", "7"},
//            {"profesor", "'Agustín'"},
//            {"numAlumnos", "15"},
//            {"repetidores", "2"}});
        try {
            BufferedWriter ficheroSalida = new BufferedWriter(new FileWriter("resultados.txt"));

            ResultSet rs = SGBDAnt.bdRecuperarTodo("modulos", "repetidores >= 2");
            while (rs.next()) {
                ficheroSalida.write(rs.getString(1) + " - "
                        + rs.getString(2) + " - "
                        + rs.getString(3) + " - "
                        + rs.getString(4) + " - "
                        + rs.getString(5) + " - "
                        + rs.getString(6) + "\n");

            }
            ficheroSalida.close();
        } catch (SQLException | IOException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
        SGBDAnt.bdCerrarConexion();
    }
}
