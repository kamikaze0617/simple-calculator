module com.example.simpleguicalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simpleguicalculator to javafx.fxml;
    exports com.example.simpleguicalculator;
}