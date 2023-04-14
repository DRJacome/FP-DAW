/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevabdeliminardatostabla;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class NuevaBDEliminarDatosTabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        es.david.utils.Utilidades.redirigeSalidaError("erroresSGBD");
        Scanner tec = new Scanner(System.in);

        try {
            String usuario = "root";
            String clave = "root";
            String url = "jdbc:mysql://10.0.3.100/";

            Connection con = DriverManager.getConnection(url, usuario, clave);

            Statement sentencia = con.createStatement();
            sentencia.executeUpdate("USE david2");
            //sentencia.executeUpdate("DELETE FROM factura where numeroFactura = 1");
            int filasAfectadas = sentencia.executeUpdate("DELETE FROM factura WHERE fechaEmision = '2025-05-05'");

//            System.out.println("Introduce el nombre del campo que quieres borrar: ");
//            int columna = Integer.parseInt(tec.nextLine());
//            int n = sentencia.executeUpdate("DELETE FROM factura where numeroFactura = " + columna);
//            System.out.println("Se borraron "+n+ " filas");
            System.out.println("Se borraron " + filasAfectadas + " filas.");
            System.out.println("Datos de tabla borrados correctamente. Sesión terminada.");

        } catch (SQLException ex) {
            Logger.getLogger(NuevaBDEliminarDatosTabla.class.getName()).log(Level.SEVERE, "No se pudo conectar a la base de datos.", ex);
        }
    }

}
