package es.uxia.bdfx;

import es.uxia.bdrelacionesm.SGBD;
import static es.uxia.bdrelacionesm.SGBD.LOG;
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
    static SGBD bd;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("principal"), 640, 480);
        stage.setScene(scene);
        stage.setTitle("Probando JavaFX y MariaDB");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("dato.png")));
        stage.show();
        stage.setResizable(false);
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        bd = new SGBD("jdbc:mysql://10.0.3.125/java", "root", "root");
        bd.redirigeSalida("logBdFX");
        if (!bd.conectarSGBD()) {
            LOG.log(Level.SEVERE, "No hay conexión con la BD");
            Platform.exit();
            System.exit(0);
        }
        if (!bd.crearTabla("usuario", new String[]{"dni VARCHAR(9) PRIMARY KEY",
            "nombre VARCHAR(35) NOT NULL",
            "apellido1 VARCHAR(35) NOT NULL",
            "apellido2 VARCHAR(35)",
            "email VARCHAR(35) NOT NULL",
            "password VARCHAR(35) NOT NULL",
            "notas VARCHAR(500)"})) {
            LOG.log(Level.SEVERE, "ERROR en la creación de la tabla");
        }
        launch();
        //cierro la conexión
        if (!bd.cerrarConexion()) {
            LOG.log(Level.SEVERE, "Error en desconexión");
        }
    }
}
