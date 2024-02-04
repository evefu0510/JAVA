module com.example.comp1008fall2023thursday10amgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1008fall2023thursday10amgui to javafx.fxml;
    exports com.example.comp1008fall2023thursday10amgui;
}