package es.david.pruebafx;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private Button secondaryButton;

    @FXML
    private ToggleButton botonModoOscuro;

    @FXML
    private void cambiarModoOscuro(ActionEvent event) {
        if (botonModoOscuro.isSelected()) {
            vBox.setBackground(new Background(new BackgroundFill(Color.rgb(64, 128, 192), CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            vBox.setBackground(new Background(new BackgroundFill(Color.rgb(255, 255, 255), CornerRadii.EMPTY, Insets.EMPTY)));
        }

    }

    @FXML
    private VBox vBox;

    @FXML
    private HBox hBox;
}
