package Recursos;

public class Alimentos {

    // Atributos
    String tipo_alimento;
    Boolean perecedero;
    int cantidad;
    String proveedor;

    // Constructor
    public Alimentos(String nombre, double precio, String ubicacion, String tipo_alimento, Boolean perecedero) {
        this.tipo_alimento = tipo_alimento;
    }

    // Getters y Setters
    public String getTipo_alimento() {
        return tipo_alimento;
    }

    public Boolean getPerecedero() {
        return perecedero;
    }

    public void setTipo_alimento(String tipo_alimento) {
        this.tipo_alimento = tipo_alimento;
    }

    public void setPerecedero(Boolean perecedero) {
        this.perecedero = perecedero;
    }

    // Método toString
    @Override
    public String toString() {
        return "Alimentos{" + "tipo_alimento=" + tipo_alimento + ", perecedero=" + perecedero + '}';
    }

}
