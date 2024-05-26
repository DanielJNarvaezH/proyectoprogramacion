package co.edu.uniquindo.pii.proyecto.cliente.model;

import java.util.ArrayList;
import java.util.List;

public class Factura{
    //Atributos
    private Cliente cliente;
    private List<Producto> productos;
    
    //Constructor
    public Factura (Cliente cliente){
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    //Getters y Setters

}