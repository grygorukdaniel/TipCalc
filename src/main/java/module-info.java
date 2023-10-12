module com.danielgrygoruk.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.danielgrygoruk.tipcalculator to javafx.fxml;
    exports com.danielgrygoruk.tipcalculator;
}
