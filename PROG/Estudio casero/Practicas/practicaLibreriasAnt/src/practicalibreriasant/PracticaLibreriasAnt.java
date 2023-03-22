/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicalibreriasant;

import static es.david.bdrelaciones.SGBDAnt.*;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jacod
 */
public class PracticaLibreriasAnt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//            SGBDAnt bd = new SGBDAnt();

        redirigeSalidaError("logBD");
        String url = "jdbc:mysql://localhost:3306/pruebaprogrep";
        String usuario = "root";
        String password = "";

        if (!bdConectarSGBD(url, usuario, password)) {
            System.out.println("No se pudo conectar a la BD. Programa terminado.");
            System.exit(0);

            String tabla = "usuarios";

            ResultSet rs = bdRecuperarTodo(tabla, null);
            if (rs != null) {
                try {
                    int cont = 1;
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String nombre = rs.getString("nombre");
                        String apellido = rs.getString("apelllidos");
                        int edad = rs.getInt("edad");
                        System.out.println("id " + cont++ + ":\t " 
                                + "Usuario " + usuario
                                + ";\t " + "nombre: " + nombre
                                + ";\t " + "apellidos: " + apellido
                                + ";\t " + "edad: " + edad);
                    }
                } catch (SQLException ex) {
                    LOG.log(Level.SEVERE, null, ex);
                }
            }

            if (!bdCerrarConexion()) {
                System.out.println("Error en el cierre de sesión.");
            }
        }
    }
}
