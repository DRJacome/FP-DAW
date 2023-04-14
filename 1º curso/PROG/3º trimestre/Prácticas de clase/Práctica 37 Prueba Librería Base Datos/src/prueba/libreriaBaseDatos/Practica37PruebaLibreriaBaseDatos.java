/*

 */
package prueba.libreriaBaseDatos;

import static es.david.bdrelaciones.SGBD.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Practica37PruebaLibreriaBaseDatos {

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
        String tabla = "portatil";

        //bdBorrarTabla(tabla);
        String[] cols = {"numReferencia int(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY ",
            "marca VARCHAR(20) NOT NULL ",
            "modelo VARCHAR(30) NOT NULL ",
            "procesador VARCHAR(30) NOT NULL ",
            "potenciaCPU FLOAT NOT NULL ",
            "tipoRAM CHAR(4) NOT NULL ",
            "cantidadModulosRAM int NOT NULL ",
            "capacidadRAM INT NOT NULL ",
            "almacenamiento INT NOT NULL ",
            "tipoAlmacenamiento varchar(20) NOT NULL ",
            "tamanhoPantalla FLOAT NOT NULL ",
            "largo FLOAT NOT NULL ",
            "ancho FLOAT NOT NULL ",
            "alto FLOAT NOT NULL ",
            "precio INT NOT NULL ",
            "IVA FLOAT NOT NULL"};

        /**
         * Comentar los métodos CreaTabla e InsertarDatos permite ejecutar el método RecuperarTodo, que recoge datos de
         * los campos de la tabla existente.
         */
        /*if (!bdCrearTabla(tabla, cols)) {
            System.out.println("Error SQL. Revisar fichero de LOGs para comprobar error/es.");
        }
        while (true) {
            System.out.println("Rellenar datos de portátil. Introduce la marca: ");
            String marca = tec.nextLine();
            if (marca.isEmpty()) {
                break;
            }
            System.out.println("Introduce el modelo: ");
            String modelo = tec.nextLine();
            System.out.println("Introduce el procesador: ");
            String procesador = tec.nextLine();
            System.out.println("Introduce la protencia del procesador: ");
            float potenciaCPU = Float.parseFloat(tec.nextLine());
            System.out.println("Introduce qué tipo de memoria RAM usa: ");
            String tipoRAM = tec.nextLine();
            System.out.println("Introduce cuándos módulos RAM tiene: ");
            int cantidadModulosRAM = Integer.parseInt(tec.nextLine());
            System.out.println("Introduce la capacidad de RAM en GB: ");
            int capacidadRAM = Integer.parseInt(tec.nextLine());
            System.out.println("Introduce el tamaño de la unidad de almacenamiento en GB: ");
            int almacenamiento = Integer.parseInt(tec.nextLine());
            System.out.println("Introduce el tipo de almacenamiento (SSD, HDD, etc.): ");
            String tipoAlmacenamiento = tec.nextLine();
            System.out.println("Introduce el tamaño del monitor en pulgadas: ");
            float tamanhoPantalla = Float.parseFloat(tec.nextLine());
            System.out.println("Dimensiones del equipo. Introduce el largo (cm): ");
            float largo = Float.parseFloat(tec.nextLine());
            System.out.println("Introduce el ancho (cm): ");
            float ancho = Float.parseFloat(tec.nextLine());
            System.out.println("Introduce el alto (cm)");
            float alto = Float.parseFloat(tec.nextLine());
            System.out.println("¿Qué precio tiene? (€): ");
            float precio = Float.parseFloat(tec.nextLine());
            System.out.println("Introduce el IVA: ");
            float IVA = Float.parseFloat(tec.nextLine());

            String[][] datos = {
                {"marca", "'" + marca + "'"},
                {"modelo", "'" + modelo + "'"},
                {"procesador", "'" + procesador + "'"},
                {"potenciaCPU", "" + potenciaCPU},
                {"tipoRAM", "'" + tipoRAM + "'"},
                {"cantidadModulosRAM", "" + cantidadModulosRAM},
                {"capacidadRAM", "" + capacidadRAM},
                {"almacenamiento", "" + almacenamiento},
                {"tipoAlmacenamiento", "'" + tipoAlmacenamiento + "'"},
                {"tamanhoPantalla", "" + tamanhoPantalla},
                {"largo", "" + largo},
                {"ancho", "" + ancho},
                {"alto", "" + alto},
                {"precio", "" + precio},
                {"IVA", "" + IVA}
            };

            if (!bdInsertarDatos(tabla, datos)) {
                System.out.println("Error SQL en la inserción de datos. Revisar el fichero de LOGs.");
            }
        }*/
        ResultSet rs = bdRecuperarTodo(tabla, null);
        if (rs != null) {
            try {
                int cont = 1;
                while (rs.next()) {
                    //int numReferencia = rs.getInt(1);
                    String marca = rs.getString("marca");
                    String procesador = rs.getString("procesador");
                    int cantidadModulosRAM = rs.getInt("cantidadModulosRAM");
                    System.out.println("Portátil " + cont++ + ":\t " + "marca: " + marca
                            + ";\t " + "procesador: " + procesador
                            + ";\t " + "cantidadModulosRAM: " + cantidadModulosRAM);
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
