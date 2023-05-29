module part13 {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    opens part14 to javafx.fxml;
    exports part14;
}
