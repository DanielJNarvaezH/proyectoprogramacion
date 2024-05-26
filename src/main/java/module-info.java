module co.edu.uniquindo.pii.proyecto.cliente {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindo.pii.proyecto.cliente to javafx.fxml;
    exports co.edu.uniquindo.pii.proyecto.cliente;

    opens co.edu.uniquindo.pii.proyecto.cliente.model;
    exports co.edu.uniquindo.pii.proyecto.cliente.model;

    
}
