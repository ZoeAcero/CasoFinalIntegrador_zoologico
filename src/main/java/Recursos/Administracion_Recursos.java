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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

// Método toString
    @Override
    public String toString() {
        return "Administracion_Recursos{" + "nombre=" + nombre + ", precio=" + precio + ", ubicacion=" + ubicacion + '}';
    }


}
