module com.example.javagraficadorconicas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javagraficadorconicas to javafx.fxml;
    exports com.example.javagraficadorconicas;
}