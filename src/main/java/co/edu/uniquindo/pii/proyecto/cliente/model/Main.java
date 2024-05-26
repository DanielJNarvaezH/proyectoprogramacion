package co.edu.uniquindo.pii.proyecto.cliente.model;

public class Main {

    public static void main(String[] args) {
        // Obtener la instancia de Tienda
        Camisa camisa = new Camisa(null);
        camisa.setColor("Amarillo");
        camisa.setTalla("16");
        camisa.setPrecio(10000.0);
        camisa.build();
    
    }
}