module com.mycompany.ejemplomaven {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejemplomaven to javafx.fxml;
    exports com.mycompany.ejemplomaven;
}
