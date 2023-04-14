package es.david.pruebafx;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void cambiarPantalla() throws IOException {
        App.setRoot("secondary");
    }
}
