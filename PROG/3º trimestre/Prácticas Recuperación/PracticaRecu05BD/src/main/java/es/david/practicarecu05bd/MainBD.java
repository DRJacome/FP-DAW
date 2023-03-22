/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.david.practicarecu05bd;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class MainBD {

    Connection conex;
    Statement sentencia;

    public boolean crearTabla(String tabla, String[][] campos, String[] clave) {
        try {
            sentencia = conex.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS " + tabla + "(";
            for (int i = 0; i < campos.length; i++) {
                sql += campos[i][0] + " " + campos[i][1] + ", ";
            }
            if (clave != null) {
                sql += "PRIMARY KEY (";
                for (int i = 0; i < clave.length; i++) {
                    sql += clave[i] + ", ";
                }
                sql = sql.substring(0, sql.length() - 2);
                sql += ")";
            } else {
                sql = sql.substring(0, sql.length() - 2);
                sql += ")";
            }
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MainBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
