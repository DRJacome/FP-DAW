/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevabdsentenciaspreparadas;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class NuevaBDSentenciasPreparadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String usuario = "root";
        String clave = "root";
        String url = "jdbc:mysql://10.0.3.100/david2";

        try {
            Connection con = DriverManager.getConnection(url, usuario, clave);

            Statement sentencia = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = sentencia.executeQuery("SELECT * FROM factura");

            // 
//            if (rs != null) {
//                while (rs.next()) {
//                    rs.previous();
//                    String numeroFactura = rs.getString(1);
//                }
//            }
            // Sentencia para insertar datos con ResultSet:
            // Con "rs.moveToInsertRow();" iniciamos la apertura de datos a insertar.
            rs.moveToInsertRow();
            
            rs.updateInt("numeroFactura", 9);
            rs.updateDate("fechaEmision", java.sql.Date.valueOf("2026-06-06"));
            rs.updateInt("importeTotal", 600);
            rs.updateString("direccionFacturacion", "Calle F");
            rs.updateString("dniCliente", "11223344-T");
            rs.updateString("nombreCliente", "Sara");
            rs.updateString("apellidosCliente", "Pérez");
            
            // Con rs.insertRow(); cerramos y hacemos efectiva la inserción de datos.
            rs.insertRow();
            
            System.out.println("Inserción de datos correcta.");

        } catch (SQLException ex) {
            Logger.getLogger(NuevaBDSentenciasPreparadas.class.getName()).log(Level.SEVERE, "No se pudo conectar a la base de datos.", ex);
        }
    }

}
