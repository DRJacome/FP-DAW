package es.david.practica_app_java;

import java.io.IOException;
import javafx.fxml.FXML;

public class Controlador {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
