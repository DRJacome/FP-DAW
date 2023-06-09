package es.david.examen3eval;

import es.david.practica41_libreriabasedatos.SGBD;
import static es.david.practica41_libreriabasedatos.SGBD.LOG;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    static SGBD bd;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {

        bd = new SGBD("jdbc:mysql://10.0.3.124/examen", "alumno", "abc123.");
        if (!bd.conectar()) {
            LOG.log(Level.SEVERE, "No hay conexión a la BD.");
            Platform.exit();
            System.exit(0);

            String tabla = "javafx";

            ResultSet rs = bd.recuperarTodo(tabla, null);
            if (rs != null) {
                try {
                    int cont = 1;
                    while (rs.next()) {
                        System.out.println();
                    }
                } catch (SQLException ex) {
                    LOG.log(Level.SEVERE, null, ex);
                }
            }

            if (!bd.cerrarConexion()) {
                LOG.log(Level.SEVERE, "Error en la desconexión de la BD.");
                System.exit(0);
            }
        }

    }
}
