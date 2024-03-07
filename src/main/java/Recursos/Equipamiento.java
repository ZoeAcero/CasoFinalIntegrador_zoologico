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

    public String getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public String getFecha_ultima_revision() {
        return fecha_ultima_revision;
    }

    public void setTipo_equipamiento(String tipo_equipamiento) {
        this.tipo_equipamiento = tipo_equipamiento;
    }

    public void setFecha_adquisicion(String fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public void setFecha_ultima_revision(String fecha_ultima_revision) {
        this.fecha_ultima_revision = fecha_ultima_revision;
    }
}
