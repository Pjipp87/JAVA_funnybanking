module com.funnybanking {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;

    opens com.funnybanking to javafx.fxml;
    exports com.funnybanking;
}
