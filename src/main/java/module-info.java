module com.funnybanking {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.funnybanking to javafx.fxml;
    exports com.funnybanking;
}
