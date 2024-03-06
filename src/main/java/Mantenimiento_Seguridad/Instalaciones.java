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

}
