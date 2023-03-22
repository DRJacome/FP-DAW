module es.david.practicahackeadofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.david.practicahackeadofx to javafx.fxml;
    exports es.david.practicahackeadofx;
}
