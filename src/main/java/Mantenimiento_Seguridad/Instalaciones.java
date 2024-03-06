package Mantenimiento_Seguridad;

public class Instalaciones {

    // Atributos
    String nombre;
    String ubicacion;
    String tipo;

    // Constructor
    public Instalaciones(String nombre, String ubicacion, String tipo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
    }

    // Métodos para realizar mantenimiento y reparaciones
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en " + nombre);
    }

    public void realizarReparaciones() {
        System.out.println("Realizando reparaciones en " + nombre);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método toString
    @Override
    public String toString() {
        return "Instalaciones{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", tipo=" + tipo + '}';
    }

}
