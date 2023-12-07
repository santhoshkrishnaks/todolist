module com.example.loginapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.loginapp.Controller to javafx.fxml;
    exports com.example.loginapp;
    exports com.example.loginapp.Controller;
}