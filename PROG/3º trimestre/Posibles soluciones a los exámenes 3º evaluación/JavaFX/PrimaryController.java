package org.openjfx.examanfx;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField textDia;

    @FXML
    private TextField textMes;

    @FXML
    private TextField textAno;

    @FXML
    private TextField textEdad;

    @FXML
    private Button botonCalcular;

    @FXML
    private Label etMensaje;

    private boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private int calculoAnosTrancurridos(String fechaInicial) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaAlta = LocalDate.parse(fechaInicial, formato);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaAlta, ahora);
        return periodo.getYears();
    }

    @FXML
    void calcularEDad(ActionEvent event) {
        String dia = textDia.getText();
        String mes = textMes.getText();
        String ano = textAno.getText();
        textEdad.setText("");
        if (dia.isBlank() || mes.isBlank() || ano.isBlank()) {
            etMensaje.setText("Faltan datos");

            return;
        }
        if (!isNumeric(dia)) {
            etMensaje.setText("El día no es un número");
            return;
        }
        if (!isNumeric(mes)) {
            etMensaje.setText("El mes no es un número");
            return;
        }
        if (!isNumeric(ano)) {
            etMensaje.setText("El año no es un número");
            return;
        }
        String fechaNacimiento = String.format("%02d/%02d/%04d", Integer.parseInt(dia),
                Integer.parseInt(mes), Integer.parseInt(ano));
        textEdad.setText(calculoAnosTrancurridos(fechaNacimiento) + " años");
        etMensaje.setText("");
    }

}
