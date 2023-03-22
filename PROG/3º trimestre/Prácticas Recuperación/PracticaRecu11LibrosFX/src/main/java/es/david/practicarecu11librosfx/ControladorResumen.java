package es.david.practicarecu11librosfx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControladorResumen {

    @FXML
    private TextArea areaLibros;

    @FXML
    private TextField fieldPrecio;

    public void initialize() {
        double importeTotal = 0.0;
        for (Libro it : App.libros) {
            importeTotal += it.getPrecio();
            areaLibros.appendText(it.toString() + "\n");
        }
        fieldPrecio.setText("" + importeTotal);

    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("libros");
    }

}
