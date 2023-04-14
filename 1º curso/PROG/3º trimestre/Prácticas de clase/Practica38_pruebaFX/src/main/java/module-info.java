module es.david.pruebafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.david.pruebafx to javafx.fxml;
    exports es.david.pruebafx;
}
