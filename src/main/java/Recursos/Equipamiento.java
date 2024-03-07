package Recursos;

public class Equipamiento extends Administracion_Recursos{

    // Atributos
    String tipo_equipamiento;
    String fecha_adquisicion;
    String fecha_ultima_revision;

    // Constructor
    public Equipamiento(String nombre, double precio, String ubicacion, String tipo_equipamiento, String fecha_adquisicion, String fecha_ultima_revision) {
        super(nombre, precio, ubicacion);
        this.tipo_equipamiento = tipo_equipamiento;
        this.fecha_adquisicion = fecha_adquisicion;
        this.fecha_ultima_revision = fecha_ultima_revision;
    }

    // Getters y Setters
    public String getTipo_equipamiento() {
        return tipo_equipamiento;
    }
}
