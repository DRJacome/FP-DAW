/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevabdrellenartablas;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NuevaBDRellenarTablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        try {
            String usuario = "root";
            String clave = "root";
            String url = "jdbc:mysql://10.0.3.100/david2";

            Connection con = DriverManager.getConnection(url, usuario, clave);

            Statement sentencia = con.createStatement();

            // Primera tabla.
            String numeroFactura;
            System.out.println("Introduce el número de factura (introduce una 's' o 'S' para terminar): ");
            numeroFactura = tec.nextLine();

            //while (numeroFactura.equalsIgnoreCase("salir")
            //                    ||
            //"salir".equals(numeroFactura.toLowerCase())) {
            while (!numeroFactura.equalsIgnoreCase("s")) {

                System.out.println("Introduce la fecha de emisión con este formato aaaa-mm-dd: ");
                String fechaEmision = tec.nextLine();

                System.out.println("Introduce importe total: ");
                int importeTotal = Integer.parseInt(tec.nextLine());

                System.out.println("Introduce la dirección de facturación: ");
                String direcciónFacturacion = tec.nextLine();

                System.out.println("Introduce el DNI del cliente: ");
                String dniCliente = tec.nextLine();

                System.out.println("Introduce el nombre del cliente: ");
                String nombreCliente = tec.nextLine();

                System.out.println("Introduce el apellido del cliente: ");
                String apellidoCliente = tec.nextLine();

                sentencia.executeUpdate("INSERT INTO factura (numeroFactura, fechaEmision, importeTotal, direccionFacturacion, dniCliente, nombreCliente, apellidosCliente) "
                        + "VALUES ('" + numeroFactura
                        + "', '" + java.sql.Date.valueOf(fechaEmision)
                        + "', '" + importeTotal
                        + "', '" + direcciónFacturacion
                        + "', '" + dniCliente
                        + "', '" + nombreCliente
                        + "', '" + apellidoCliente
                        + "')");

                
                System.out.println("Introduce el número de factura "
                        + "(usa 's' o 'S' para terminar): ");
                numeroFactura = tec.nextLine();
            }
            // Segunda tabla.

//            System.out.println("Introduce el código de producto: ");
//            String codigoProducto = tec.nextLine();
//
//            System.out.println("Introduce descripción: ");
//            String descripcion = tec.nextLine();
//
//            System.out.println("Introduce precio unitario: ");
//            int precioUnitario = Integer.parseInt(tec.nextLine());
//
//            System.out.println("Introduce las unidades: ");
//            int unidades = Integer.parseInt(tec.nextLine());
//
//            System.out.println("Introduce el precio: ");
//            int precio = Integer.parseInt(tec.nextLine());
//
//            System.out.println("Introduce el IVA: ");
//            int iva = Integer.parseInt(tec.nextLine());
//
//            System.out.println("Introduce el total: ");
//            int total = Integer.parseInt(tec.nextLine());
//
//            System.out.println("Introduce la clave de número de factura foránea: ");
//            String numeroFacturaForanea = tec.nextLine();
//            
//            sentencia.executeUpdate("INSERT INTO lineaDEtalle (codigoProducto, descripcion, precioUnitario, unidades, precio, iva, total) "
//                    + "VALUES ('" + codigoProducto
//                    + "', '" + descripcion
//                    + "', '" + precioUnitario
//                    + "', '" + unidades
//                    + "', '" + precio
//                    + "', '" + iva
//                    + "', '" + total
//                    + "')");
            System.out.println("Datos introducidos correctamente. Sesión terminada.");
            con.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo rellenar los campos de las tablas. Sesión terminada." + ex);
        }
    }

}
