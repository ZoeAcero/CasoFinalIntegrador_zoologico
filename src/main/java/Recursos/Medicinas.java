package Recursos;

public class Medicinas extends Administracion_Recursos{

    // Atributos
    String tipo_medicina;
    String fecha_caducidad;
    Float precio;

    // Constructor
    public Medicinas(String nombre, double precio, String ubicacion, String tipo_medicina, String fecha_caducidad) {
        super(nombre, precio, ubicacion);
        this.tipo_medicina = tipo_medicina;
        this.fecha_caducidad = fecha_caducidad;
    }

    // Getters y Setters
    public String getTipo_medicina() {
        return tipo_medicina;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public Float getPrecio() {
        return precio;
    }
}
