package Recursos;

public class Alimentos {

    // Atributos
    String tipo_alimento;
    Boolean perecedero;
    int cantidad;
    String proveedor;

    // Constructor
    public Alimentos(String tipo_alimento, Boolean perecedero, int cantidad, String proveedor) {
        this.tipo_alimento = tipo_alimento;
        this.perecedero = perecedero;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

}
