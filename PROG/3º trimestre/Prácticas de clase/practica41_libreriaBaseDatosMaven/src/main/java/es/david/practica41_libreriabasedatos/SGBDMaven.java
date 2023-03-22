/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.david.practica41_libreriabasedatos;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class SGBDMaven {

    Connection conex;
    Statement sentencia;
    public static final Logger LOG = Logger.getLogger(SGBDMaven.class.getName());

    private String url;
    private String user;
    private String passwd;

    /**
     * Constructor de bd para el main de la clase App.
     *
     * @param url IP de conexión a la base de datos.
     * @param user Usuario autorizado para conectarse.
     * @param passwd Contraseña del usuario.
     */
    public SGBDMaven(String url, String user, String passwd) {
        this.url = url;
        this.user = user;
        this.passwd = passwd;
    }

    /**
     * Redirige la salida estándar de error al fichero.
     *
     * @param fileName Nombre del fichero destino.
     */
    public void redirigeSalidaError(String fileName) {
        try {
            PrintStream ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(new File(fileName), true)), true);
            System.setErr(ps);
        } catch (FileNotFoundException ex) {
            System.err.println("Fichero de LOG no encontrado" + ex);
        }
    }

    /**
     * Conecta a una BD.
     *
     * @param url url de la máquina, puerto y BD a la que nos conectamos.
     * @param usuario usuario con permisos sobre la BD.
     * @param passwd true si se pudo establecer la conexión o false en caso contrario.
     * @return
     */
    public boolean conectar() {
        try {
            conex = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Cierra una conexión a una BD.
     *
     * @return true si se pudo cerrar la conexión o false en caso contrario.
     */
    public boolean cerrarConexion() {
        try {
            conex.close();
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Crea una tabla en la BD.
     *
     * @param tabla Nombre de la tabla a crear.
     * @param cols Columnas que componen la tabla.
     * @return true si se pudo crear la tabla, false en caso contrario.
     */
    public boolean crearTabla(String tabla, String[] cols) {
        String sql = "create table if not exists " + tabla + "(";

        for (String it : cols) {
            sql += it + ", ";
        }
        sql = sql.substring(0, sql.length() - 2) + ")";
        try {
            sentencia = conex.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        try {
            sentencia.close();
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
        return true;
    }

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
            LOG.log(Level.SEVERE, null, ex);
        }
        return true;
    }

    /**
     * Borra una tabla de la BD.
     *
     * @param tabla Nombre de la tabla a borrar.
     * @return true si pudo borrarla, false en caso contrario.
     */
    public boolean borrarTabla(String tabla) {
        try {
            sentencia = conex.createStatement();
            sentencia.executeUpdate("DROP TABLE IF EXISTS " + tabla);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        try {
            sentencia.close();
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public boolean borrarDatos(String tabla, String where) {
        try {
            sentencia = conex.createStatement();
            sentencia.executeUpdate("DELETE FROM " + tabla + " WHERE " + where);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        try {
            sentencia.close();
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
        return true;
    }

    /**
     * Inserta filas en una tabla.
     *
     * @param tabla Nombre de la tabla.
     * @param datos Array de dos dimensiones <ol><li>primera dimensión: nombre de los campos.</li><li>segunda dimensión:
     * valores de los campos (entre comillas '' si son de tipos char y sus variantes)</li></ol>
     * @return True si se pudieron insertar los datos o false en caso contrario.
     */
    public boolean insertarDatos(String tabla, String[][] datos) {
        String sql = "INSERT INTO " + tabla + "(";
        for (String[] dato : datos) {
            sql += dato[0] + ", ";
        }
        sql = sql.substring(0, sql.length() - 2) + ") VALUES ( ";
        for (String[] dato : datos) {
            sql += dato[1] + ", ";
        }
        sql = sql.substring(0, sql.length() - 2) + ") ";
        try {
            sentencia = conex.createStatement();
            sentencia.execute(sql);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        try {
            sentencia.close();
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
        return true;
    }

    /**
     * Método que recupera todos los datos de los campos de la tabla seleccionada.
     *
     * @param tabla Nombre de la tabla a seleccionar.
     * @param condicion Condición a cumplir. Escribir null si no se quiere ninguna condición.
     * @return rs.
     */
    public ResultSet recuperarTodo(String tabla, String condicion) {
        String sql = "SELECT * FROM " + tabla;
        if (condicion != null) {
            sql += " WHERE " + condicion;
        }
        ResultSet rs;
        try {
            sentencia = conex.createStatement();
            rs = sentencia.executeQuery(sql);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return null;
        }
        return rs;
    }

    /**
     * Método para recuperar datos de uan tabla especificando los campos a recuperar con una condición.
     *
     * @param tabla: nombre de la tabla desde la que recuperar datos.
     * @param campo: campo de la tabla desde donde recuperar datos (FROM).
     * @param condicion: condición que debe cumpplir si hay alguna.
     * @return
     */
    public ResultSet recuperarDatosCampos(String tabla, String[] campo, String condicion) {
        String sql = "SELECT ";

        for (String campos : campo) {
            sql += campos + ", ";
        }
        sql = sql.substring(0, sql.length() - 2) + " FROM " + tabla;
        if (condicion != null) {
            sql += " WHERE " + condicion;
        }
        ResultSet rsm;
        try {
            sentencia = conex.createStatement();
            rsm = sentencia.executeQuery(sql);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return null;
        }
        return rsm;
    }

    /**
     * Recupera datos de una tabla especificando las columnas a obtener.
     *
     * @param nombreTabla nombre de la tabla.
     * @param columnas
     * @param where condición que tienen que cumplir.
     * @return un ArrayList<ArrayList<String>> conteniendo todas las filas recuperadas o null si no se pudo ejecutar la
     * sentencia.
     */
    public ArrayList<ArrayList<String>> recuperar(String nombreTabla, ArrayList<String> columnas, String where) {
        ArrayList<ArrayList<String>> tabla = new ArrayList<>();
        String sql = "SELECT " + columnas.toString().replace("[", " ").replace("]", " ") + " FROM " + nombreTabla
                + " WHERE " + where;
        ResultSet rs;
        try {
            sentencia = conex.createStatement();
            rs = sentencia.executeQuery(sql);

            int columnCount = 0;
            try {
                columnCount = rs.getMetaData().getColumnCount();
            } catch (SQLException ex) {
                Logger.getLogger(SGBDMaven.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (ArrayList<String> row; rs.next(); tabla.add(row)) {
                row = new ArrayList<>(columnCount);
                for (int c = 1; c <= columnCount; ++c) {
                    row.add(rs.getString(c));
                }
            }
            rs.close();
            sentencia.close();
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return null;
        }
        return tabla;

    }

    /**
     *
     * @param tabla
     * @param datos
     * @param where
     * @return
     */
    public boolean actualizarDatos(String tabla, String[][] datos, String where) {
        String sql = "update " + tabla + " set ";
        for (String[] dato : datos) {
            sql += dato[0] + " = " + dato[1] + ", ";
        }
        sql = sql.substring(0, sql.length() - 2) + (where.isEmpty() ? "" : " where " + where);
        try {
            sentencia = conex.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        try {
            sentencia.close();
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
