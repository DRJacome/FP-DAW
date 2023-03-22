package es.david.bdfx;

import es.david.practica41_libreriabasedatos.SGBDMaven;
import static es.david.practica41_libreriabasedatos.SGBDMaven.LOG;
import java.io.IOException;
import java.util.logging.Level;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    static SGBDMaven bd;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("principal"), 900, 600);
        stage.setScene(scene);
        stage.setTitle("Probando FX MariaDB");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("mysql-mariadb.png")));
        stage.show();
        // stage.setResizable(false);
    }

    /*static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }*/
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        // Parámetros del constructor: (String url, String user, String passwd).
        bd = new SGBDMaven("jdbc:mysql://10.0.3.124/java", "root", "root");
        if (!bd.conectar()) {
            LOG.log(Level.SEVERE, "No hay conexión a la BD.");
            Platform.exit();
            System.exit(0);
        }

        // Abrir la conexión.
        String[] columnas = {"dni VARCHAR(9) PRIMARY KEY ",
            "nombre VARCHAR(15) NOT NULL",
            "apellido1 VARCHAR (15) NOT NULL",
            "apellido2 VARCHAR(15)",
            "email VARCHAR(30) NOT NULL",
            "password VARCHAR(15) NOT NULL",
            "notas VARCHAR(500)"};

        // Creo la tabla.
        if (!bd.crearTabla("usuario", columnas)) {
            LOG.log(Level.SEVERE, "Error en la creación de la tabla.");
        }

        launch();
        // Cierro la conexión.
        if (!bd.cerrarConexion()) {
            LOG.log(Level.SEVERE, "Error en la desconexión de la BD.");
            System.exit(0);
        }
    }
}
