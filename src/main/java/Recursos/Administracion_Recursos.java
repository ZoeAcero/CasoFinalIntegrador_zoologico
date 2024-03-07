package Recursos;

public class Administracion_Recursos {

    // Atributos de Administracion de Recursos
    String nombre;
    double precio;
    String ubicacion;

    // Constructor
    public Administracion_Recursos(String nombre, double precio, String ubicacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }


}
