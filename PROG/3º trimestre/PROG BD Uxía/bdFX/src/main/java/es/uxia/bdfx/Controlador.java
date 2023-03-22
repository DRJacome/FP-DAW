package es.uxia.bdfx;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controlador {

    private static final String PATRON_EMAIL = "^(.+)@(.*)$";

    private String nombreTabla = "usuario";

    @FXML
    private Button botonInsertar;

    @FXML
    private Button botonActualizar;

    @FXML
    private Button botonBorrar;

    @FXML
    private Button botonResetear;

    @FXML
    private Label etMensaje;

    @FXML
    private Label etDNI;

    @FXML
    private Label etNombre;

    @FXML
    private Label etApellido1;

    @FXML
    private Label etApellido2;

    @FXML
    private Label etEmail;

    @FXML
    private Label etPassword;

    @FXML
    private Label etNotas;

    @FXML
    private TextField textDNI;

    @FXML
    private TextField textNombre;

    @FXML
    private TextField textApellido1;

    @FXML
    private TextField textApellido2;

    @FXML
    private TextField textEmail;

    @FXML
    private PasswordField password;

    @FXML
    private TextArea textAreaNotas;

    /**
     * Método auxiliar para verificar la validez de los datos
     *
     * @return true si están los datos correctos o false si hay algún fallo en
     * algún campo
     */
    private boolean datosValidos() {
        if (hayNulos()) {
            mensaje(true, "Hay campos requeridos sin valor");
            return false;
        }
        Pattern pattern = Pattern.compile(PATRON_EMAIL);
        Matcher matcher = pattern.matcher(textEmail.getText());
        if (!matcher.matches()) {
            mensaje(true, "Email no válido");
            return false;
        }
        if (password.getText().length() < 8) {
            mensaje(true, "Contraseña demasiado corta. Mínimo 8");
            return false;
        }
        return true;
    }

    /**
     * Método auxiliar para comprobar si los campos obligatorios están vacíos o
     * no
     *
     * @return true si algún campo está vacío o false si todos los campos están
     * completos
     */
    private boolean hayNulos() {
        return textNombre.getText().isBlank()
                || textApellido1.getText().isBlank()
                || textEmail.getText().isBlank()
                || password.getText().isBlank();
    }

    /**
     * Actualiza un registro de la Base de Datos
     *
     * @param event
     */
    @FXML
    void accionActualizar(ActionEvent event) {
        if (!datosValidos()) {
            return;
        }
        boolean exito = App.bd.actualizarRegistro(nombreTabla,
                new String[][]{
                    {"dni", "'" + textDNI.getText() + "'"},
                    {"nombre", "'" + textNombre.getText() + "'"},
                    {"apellido1", "'" + textApellido1.getText() + "'"},
                    {"apellido2", "'" + textApellido2.getText() + "'"},
                    {"email", "'" + textEmail.getText() + "'"},
                    {"password", "'" + password.getText() + "'"},
                    {"notas", "'" + textAreaNotas.getText() + "'"}
                }, "dni = '" + textDNI.getText() + "'"
        );
        if (exito) {
            mensaje(false, "Registro " + textDNI.getText() + " actualizado");
        } else {
            mensaje(true, "Error en la actualización del registro " + textDNI.getText());
        }
        reseteo();
    }

    /**
     * Elimina un registro de la Base de Datos
     *
     * @param event
     */
    @FXML
    void accionBorrar(ActionEvent event) {
        if (!datosValidos()) {
            return;
        }
        boolean exito = App.bd.borrarDatos(nombreTabla, "dni = '"
                + textDNI.getText() + "'");
        if (exito) {
            mensaje(false, "Registro " + textDNI.getText() + " eliminado");
        } else {
            mensaje(true, "Error en la eliminación del registro " + textDNI.getText());
        }
        reseteo();
    }

    /**
     * Inserta un nuevo registro en la Base de Datos
     *
     * @param event
     */
    @FXML
    void accionInsertar(ActionEvent event) {
        if (!datosValidos()) {
            return;
        }
        boolean exito = App.bd.insertarDatos(nombreTabla,
                new String[][]{
                    {"dni", "'" + textDNI.getText() + "'"},
                    {"nombre", "'" + textNombre.getText() + "'"},
                    {"apellido1", "'" + textApellido1.getText() + "'"},
                    {"apellido2", "'" + textApellido2.getText() + "'"},
                    {"email", "'" + textEmail.getText() + "'"},
                    {"password", "'" + password.getText() + "'"},
                    {"notas", "'" + textAreaNotas.getText() + "'"}
                });
        if (exito) {
            mensaje(false, "Registro " + textDNI.getText() + " insertado");
        } else {
            mensaje(true, "Error en la inserción del registro " + textDNI.getText());
        }
        reseteo();
    }

    /**
     * Vuelve a su estado inicial todos los controles
     *
     * @param event
     */
    @FXML
    void accionResetear(ActionEvent event) {
        reseteo();
        etMensaje.setText("");
    }

    void reseteo() {
        resetearCampos();
        reiniciarBotones();
    }

    /**
     * Vacía los campos
     */
    private void resetearCampos() {
        textDNI.setText("");
        textNombre.setText("");
        textApellido1.setText("");
        textApellido2.setText("");
        textEmail.setText("");
        password.setText("");
        textAreaNotas.clear();
    }

    /**
     * Reinicia los botones
     */
    private void reiniciarBotones() {
        botonActualizar.setDisable(true);
        botonInsertar.setDisable(true);
        botonBorrar.setDisable(true);
        textDNI.setEditable(true);
    }

    void mensaje(boolean error, String mensaje) {
        if (error) {
            etMensaje.setTextFill(Color.RED);
        } else {
            etMensaje.setTextFill(Color.WHITE);
        }
        etMensaje.setText(mensaje);
    }

    @FXML
    private void initialize() {
        textDNI.focusedProperty().addListener(new DNIChangeListener());
    }

    private class DNIChangeListener implements ChangeListener<Boolean> {

        public DNIChangeListener() {
        }

        @Override
        public void changed(ObservableValue<? extends Boolean> ov,
                Boolean viejo, Boolean nuevo) {
            if (!nuevo) {
                reiniciarBotones();
                if (textDNI.getText().isBlank()) {
                    textDNI.requestFocus();
                } else {
                    if (recupera()) {
                        botonActualizar.setDisable(false);
                        botonBorrar.setDisable(false);
                        textDNI.setEditable(false);
                    } else {
                        botonInsertar.setDisable(false);
                        textDNI.setEditable(true);
                    }
                }
            }
        }

        private boolean recupera() {
            try {
                ResultSet rs = App.bd.recuperarTodo(nombreTabla, "dni = '"
                        + textDNI.getText() + "'");
                if (rs.next()) {
                    textNombre.setText(rs.getNString(2));
                    textApellido1.setText(rs.getNString(3));
                    textApellido2.setText(rs.getNString(4));
                    textEmail.setText(rs.getNString(5));
                    password.setText(rs.getNString(6));
                    textAreaNotas.setText(rs.getNString(7));
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException ex) {
                System.out.println("ERROR SQL");
            }
            return false;
        }
    }
}
