package examen.eval;

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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Biblioteca con métodos para trabajar con BD relacionales
 *
 * @author Amador Abelleira G�mez
 */
public class BD {

    // variable para establecer la conexión
    private Connection conn = null;
    // almacenará las sentencias SQL
    private Statement stmt = null;
    // datos necesarios para la conexión
    private final String url, user, passwd;
    // Establecemos el sistema de Logs
    static final Logger LOG = Logger.getLogger(BD.class.getName());

    /**
     * Crea el objeto BD
     *
     * @param user usuario con permisos sobre la BD
     * @param passwd password del usuario
     * @param url cadena de conexi�n contra la BD
     */
    public BD(String user, String passwd, String url) {
        this.url = url;
        this.user = user;
        this.passwd = passwd;
    }

    /**
     * Redirige la salida estándar de error a fichero
     *
     * @param fileName Nombre del fichero destino
     */
    public void redirigeSalidaError(String fileName) {
        try {
            // Creación del fichero en modo sobreescritura y flush automático
            PrintStream ps = new PrintStream(new BufferedOutputStream(
                    new FileOutputStream(new File(fileName), true)), true);
            // asignamos la salida de error al fichero
            System.setErr(ps);
        } catch (FileNotFoundException ex) {
            System.err.println("Se ha producido una excepción FileNotFoundException");
        }
    }

    /**
     * Conecta a una BD
     *
     * @return true si se pudo establecer la conexion, false en caso contrario
     */
    public boolean conectar() {
        try {
            conn = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Cierra una conexión a una BD
     *
     * @return true si se pudo cerrar la conexión, false en caso contrario
     */
    public boolean desconectar() {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                LOG.log(Level.SEVERE, null, ex);
                return false;
            }
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Crea una tabla en la BD
     *
     * @param tabla Nombre de la tabla a crear
     * @param cols Columnas que componen la tabla
     * @return true si se pudo crear la tabla false en otro caso
     */
    public boolean crearTabla(String tabla, String[] cols) {
        String sql = "CREATE TABLE IF NOT EXISTS " + tabla + "(";
        for (String it : cols) {
            sql += it + ", ";
        }
        sql = sql.substring(0, sql.length() - 2) + ")";
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Borra una tabla de la BD
     *
     * @param tabla
     * @return true si se pudo borrar la tabla false en caso contrario
     */
    public boolean borrarTabla(String tabla) {
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("DROP TABLE " + tabla);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Inserta filas en la BD
     *
     * @param tabla Tabla en que se van a insertar los datos
     * @param datos array de dos dimensiones <ol> <li>primera dimensi�n: nombres
     * de los campos</li> <li>segunda dimesni�n: valores de los campos (entre ''
     * si son de tipos char y sus variantes)</li></ol>
     * @return true si se pudieron insertar los datos false en caso contrario
     */
    public boolean insertar(String tabla, String[][] datos) {
        String sql = "INSERT INTO " + tabla + " (";
        for (String[] dato : datos) {
            sql += dato[0] + ", ";
        }
        sql = sql.substring(0, sql.length() - 2) + ") VALUES (";
        for (String[] dato : datos) {
            sql += dato[1] + ", ";
        }
        sql = sql.substring(0, sql.length() - 2) + ")";
        System.out.println(sql);
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Actualizar datos en la BD
     *
     * @param tabla Tabla en que se van a actualizar los datos
     * @param datos array de dos dimensiones <ol> <li>primera dimensi�n: nombres
     * de los campos</li> <li>segunda dimesni�n: valores de los campos (entre ''
     * si son de tipos char y sus variantes)</li></ol>
     * @param where condici�n que se ha de cumplir para realizar la
     * actualizaci�n. En blanco si no hay condici�n
     * @return true si se pudieron insertar los datos false en caso contrario
     */
    public boolean actualizar(String tabla, String[][] datos, String where) {
        String sql = "UPDATE " + tabla + " SET ";
        for (String[] dato : datos) {
            sql += dato[0] + " = " + dato[1] + ", ";
        }
        sql = sql.substring(0, sql.length() - 2) + (where.isEmpty() ? "" : " WHERE " + where);
        System.out.println(sql);
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Elimina resgistros de una BD
     *
     * @param tabla tabla de la cual se va a borrar
     * @param where condici�n que ha de cumplirse. En blanco si no queremos
     * condici�n
     * @return true si se pudieron insertar los datos false en caso contrario
     */
    public boolean eliminar(String tabla, String where) {
        String sql = "delete from  " + tabla
                + (!where.isEmpty() ? " where " + where : "");
        System.out.println(sql);
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Devuelte todos los datos de una tabla
     *
     * @param tabla Tabla a consultar
     * @param where contenido de la cl�usula where. En blanco si no la hay
     * @param order orden a aplicar a los resltados. En blanco si no se desea
     * ordenar
     * @return ReustSet conteniendo los datos o null en caso de error
     */
    public ResultSet recuperarTodo(String tabla, String where, String order) {
        String sql = "SELECT * FROM " + tabla
                + (!where.isEmpty() ? " WHERE " + where : "")
                + (!order.isEmpty() ? " ORDER BY " + order : "");
        ResultSet rs;
        try {
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return null;
        }
        return rs;
    }

    /**
     * Recupar datos de una talba
     *
     * @param tabla Tabla a la que se accede
     * @param campos Array de campos a recuperar
     * @param where contenido de la cl�usula where. En blanco si no la hay
     * @param order criterio de ordenaci�n de los datos, En blanco para
     * ignorarlo
     * @return
     */
    public ResultSet recuperar(String tabla, String[] campos,
            String where, String order) {
        String sql = "SELECT ";
        for (int i = 0; i < campos.length - 1; i++) {
            sql += campos[i] + ", ";
        }
        sql += campos[campos.length - 1] + " FROM  " + tabla
                + (!where.isEmpty() ? " WHERE " + where : "")
                + (!order.isEmpty() ? " ORDER BY " + order : "");
        ResultSet rs;
        try {
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
            return null;
        }
        return rs;

    }
}
