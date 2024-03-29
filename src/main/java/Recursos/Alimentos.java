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

    public Alimentos(String tipoAlimento, String fechaCaducidad) {
    }

    // Getters y Setters
    public String getTipo_alimento() {
        return tipo_alimento;
    }

    public void setTipo_alimento(String tipo_alimento) {
        this.tipo_alimento = tipo_alimento;
    }

    public Boolean getPerecedero() {
        return perecedero;
    }

    public void setPerecedero(Boolean perecedero) {
        this.perecedero = perecedero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    // Método toString
    @Override
    public String toString() {
        return "Alimentos{" + "tipo_alimento=" + tipo_alimento + ", perecedero=" + perecedero + ", cantidad=" + cantidad + ", proveedor=" + proveedor + '}';
    }

    public void setPrecio(Double precio) {
    }
}
