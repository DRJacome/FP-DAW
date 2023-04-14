/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevabd;

import java.sql.*;

/**
 *
 * @author alumno
 */
public class NuevaBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            // Parámetros de conexión a máquina virtual.
            //String clave = "root";
            //String clave = "";
            //String url = "jdbc:mysql://10.0.3.111/";
            
            String usuario = "root";
            String clave = "root";
            String url = "jdbc:mysql://10.0.3.100/";
            

            Connection con = DriverManager.getConnection(url, usuario, clave);

            Statement sentencia = con.createStatement();

            sentencia.executeUpdate("DROP DATABASE IF EXISTS david");
            sentencia.executeUpdate("CREATE DATABASE IF NOT EXISTS david");
            sentencia.executeUpdate("USE david2");
            sentencia.executeUpdate("CREATE TABLE IF NOT EXISTS factura("
                    + "numeroFactura VARCHAR(30) PRIMARY KEY, "
                    + "fechaEmision DATE NOT NULL, "
                    + "importeTotal INT NOT NULL, "
                    + "direccionFacturacion VARCHAR(30) NOT NULL, "
                    + "dniCliente VARCHAR(30) NOT NULL, "
                    + "nombreCliente VARCHAR(30) NOT NULL, "
                    + "apellidosCliente VARCHAR(30) NOT NULL)");

            sentencia.executeUpdate("CREATE TABLE IF NOT EXISTS lineaDetalle("
                    + "codigoProducto VARCHAR(30) PRIMARY KEY, "
                    + "descripcion VARCHAR(30) NOT NULL, "
                    + "precioUnitario INT NOT NULL, "
                    + "unidades INT NOT NULL, "
                    + "precio INT NOT NULL, "
                    + "iva INT NOT NULL, "
                    + "total INT NOT NULL,"
                    + "numeroFactura VARCHAR(30))");

            sentencia.executeUpdate("ALTER TABLE lineaDetalle "
                    + "ADD CONSTRAINT fk_lineaDetalle_factura foreign key (numeroFactura) REFERENCES factura (numeroFactura)"
                    + " on delete cascade"
                    + " on update cascade;");

            System.out.println("Creación de base de datos realizada correctamente. Sesión terminada.");

            con.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar a la base de datos. Sesión terminada. " + ex);
        }

    }

}
