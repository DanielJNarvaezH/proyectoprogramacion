package co.edu.uniquindo.pii.proyecto.cliente;

import co.edu.uniquindo.pii.proyecto.cliente.model.Camisa;

public class Main {
    public static void main(String[] args) {
        // Crear una camisa usando el patrón Builder
        Camisa camisa = new Camisa.Builder()
                .setColor("Amarillo")
                .setTalla("S")
                .setPrecio(10000.0)
                .build();

        Camisa camisa2 = camisa.clone();

        // Imprimir la instancia de Camisa
        System.out.println(camisa);
        System.out.println(camisa2);
    }
}
