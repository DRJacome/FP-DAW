/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package davidrodriguezjacome04;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author jacod
 */
public class DavidRodriguezJacome04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        try {
//            String usuario = "root";
//            String clave = "root";
//            String url = "jdbc:mysql://10.0.3.100/";

            String usuario = "root";
            String clave = "";
            String url = "jdbc:mysql://localhost/";

            String nombreBD = "examen11";
            String nombreTabla = "usuario";

            Connection conex = DriverManager.getConnection(url, usuario, clave);
            Statement sentenciaSQL = conex.createStatement();

            sentenciaSQL.executeUpdate("CREATE DATABASE IF NOT EXISTS " + nombreBD);
            sentenciaSQL.executeUpdate("USE " + nombreBD);

            System.out.println("Creación de base de datos '" + nombreBD + "' realizada correctamente.");

            sentenciaSQL.executeUpdate("CREATE TABLE IF NOT EXISTS " + nombreTabla + "("
                    + "nombre VARCHAR(30) PRIMARY KEY, "
                    + "edad INT NOT NULL, "
                    + "altura INT NOT NULL)");

            String user;
            System.out.println("Introduce el nombre de usuario. Para terminar, introduce 's' o 'S': ");
            user = tec.nextLine();

            while (!user.equalsIgnoreCase("s")) {
                System.out.println("Introduce la edad del usuario: ");
                int edad = Integer.parseInt(tec.nextLine());

                System.out.println("Introduce la altura del usuario: ");
                int altura = Integer.parseInt(tec.nextLine());

                sentenciaSQL.executeUpdate("INSERT INTO usuario (nombre, edad, altura) "
                        + "VALUES ('" + user
                        + "', '" + edad
                        + "', '" + altura
                        + "')");

                System.out.println("Introduce el nombre del siguiente usuario. Para terminar, introduce 's' o 'S': ");
                user = tec.nextLine();

                System.out.println("Datos introducidos correctamente. Sesión terminada.");
            }
            sentenciaSQL.close();
            conex.close();
        } catch (Exception e) {
            System.out.println("No se pudo conectar a la base de datos y/o no se pudo rellenar con registros. Sesión terminada. " + e);

        }
    }

}
