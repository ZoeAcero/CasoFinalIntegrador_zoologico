package Recursos;

public class Medicinas extends Administracion_Recursos{

    // Atributos
    String tipo_medicina;
    String fecha_caducidad;
    Double precio;

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

    public double getPrecio() {
        return precio;
    }

    public void setTipo_medicina(String tipo_medicina) {
        this.tipo_medicina = tipo_medicina;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

// Método toString
    @Override
    public String toString() {
        return "Medicinas{" + "tipo_medicina=" + tipo_medicina + ", fecha_caducidad=" + fecha_caducidad + '}';
    }
    
}
