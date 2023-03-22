package es.david.practicarecu11librosfx;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControladorLibros {

    @FXML
    private TextField fieldISBN;

    @FXML
    private TextField fieldTitulo;

    @FXML
    private TextField fieldAutor;

    @FXML
    private TextField fieldNumeroPaginas;

    @FXML
    private TextField fieldAnhoPublicacion;

    @FXML
    private TextField fieldPrecio;

    @FXML
    private Label labelNumLibros;

    @FXML
    void accionAnadir(ActionEvent event) {
        App.libros.add(new Libro(fieldISBN.getText(),
                fieldTitulo.getText(),
                fieldAutor.getText(),
                Integer.parseInt(fieldNumeroPaginas.getText()),
                Integer.parseInt(fieldAnhoPublicacion.getText()),
                Double.parseDouble(fieldPrecio.getText())));
        accionLimpiar(event);
        labelNumLibros.setText("" + App.libros.size());
    }

    @FXML
    void accionLimpiar(ActionEvent event) {
        fieldISBN.setText("");
        fieldAutor.setText("");
        fieldTitulo.setText("");
        fieldNumeroPaginas.setText("");
        fieldAnhoPublicacion.setText("");
        fieldPrecio.setText("");
    }

    @FXML
    void accionResumen(ActionEvent event) throws IOException {
        App.setRoot("resumen");
    }
}
