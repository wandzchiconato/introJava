module com.wandz.introjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.wandz.introjava to javafx.fxml;
    exports com.wandz.introjava;
}