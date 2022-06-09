module com.funnybanking {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.funnybanking to javafx.fxml;
    exports com.funnybanking;
}
