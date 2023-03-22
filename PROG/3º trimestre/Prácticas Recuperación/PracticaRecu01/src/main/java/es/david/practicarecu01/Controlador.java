package es.david.practicarecu01;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private Label labelNum1;

    @FXML
    private Label labelNum2;

    @FXML
    private Label labelNum3;

    @FXML
    private Label labelNum4;

    @FXML
    private TextField fieldNum1;

    @FXML
    private TextField fieldNum2;

    @FXML
    private TextField fieldNum3;

    @FXML
    private TextField fieldNum4;

    @FXML
    private TextField fieldResultado;

    @FXML
    private Label labelResultado;

    @FXML
    private Button botonCalcular;

    private int minimo(int a, int b) {
        return a < b ? a : b;
    }

    private boolean isNumero(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @FXML
    void calcularNumero() {
        if (!isNumero(fieldNum1.getText()) || !isNumero(fieldNum2.getText())
                || !isNumero(fieldNum3.getText()) || !isNumero(fieldNum4.getText())) {
            System.out.println("Campos no numéricos");
            return;
        }

        int a = Integer.parseInt(fieldNum1.getText());
        int b = Integer.parseInt(fieldNum2.getText());
        int c = Integer.parseInt(fieldNum3.getText());
        int d = Integer.parseInt(fieldNum4.getText());
        fieldResultado.setText("El resultado es: " + minimo(a, minimo(b, minimo(c, d))));
    }
}
