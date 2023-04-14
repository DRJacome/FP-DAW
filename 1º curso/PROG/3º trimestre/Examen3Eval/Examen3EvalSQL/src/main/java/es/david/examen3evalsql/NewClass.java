/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.david.examen3evalsql;

import es.david.practica41_libreriabasedatos.SGBD;
import static es.david.practica41_libreriabasedatos.SGBD.LOG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author alumno
 */
public class NewClass {

    static SGBD bd;

    public static void main(String[] args) {

        bd = new SGBD("jdbc:mysql://10.0.3.124/examen", "alumno", "abc123.");

        bd.redirigeSalidaError("logBD");
        /*String url = "jdbc:mysql://10.0.3.124/examen";
        String usuario = "alumno";
        String password = "abc123";*/

        if (!bd.conectar()) {
            LOG.log(Level.SEVERE, "No hay conexión a la BD.");
            System.exit(0);

            String tabla = "javafx";

            ResultSet rs = bd.recuperarTodo(tabla, null);
            if (rs != null) {
                try {
                    while (rs.next()) {
                        System.out.println(tabla);
                    }
                } catch (SQLException ex) {
                    LOG.log(Level.SEVERE, null, ex);
                }
            }
        }
        if (!bd.cerrarConexion()) {
            LOG.log(Level.SEVERE, "Error en la desconexión de la BD.");
            System.exit(0);
        }
    }
}
