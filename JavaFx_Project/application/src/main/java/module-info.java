module group.application {
    requires javafx.controls;
    requires javafx.fxml;
    requires exp4j;


    opens group.application to javafx.fxml;
    exports group.application;
}