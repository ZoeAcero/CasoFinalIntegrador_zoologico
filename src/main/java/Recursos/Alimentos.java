package Recursos;

public class Alimentos extends Administracion_Recursos{

    // Atributos
    String tipo_alimento;
    Boolean perecedero;

    // Constructor
    public Alimentos(String nombre, double precio, String ubicacion, String tipo_alimento, Boolean perecedero) {
        super(nombre, precio, ubicacion);
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

}
