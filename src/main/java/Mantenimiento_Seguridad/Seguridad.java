package Mantenimiento_Seguridad;

public class Seguridad{

    // Atributos
    String tipo_seguridad;
    String fecha_activacion;
    String hora_activacion;
    String nombre;

    // Constructor
    public Seguridad(String nombre, String ubicacion, String tipo, String tipo_seguridad, String fecha_activacion, String hora_activacion) {
        this.tipo_seguridad = tipo_seguridad;
        this.fecha_activacion = fecha_activacion;
        this.hora_activacion = hora_activacion;
    }

    // Métodos para activar y desactivar seguridad
    public void activarSeguridad() {
        System.out.println("Activando seguridad en " + nombre);
    }

    public void desactivarSeguridad() {
        System.out.println("Desactivando seguridad en " + nombre);
    }

    // Getters y Setters
    public String getTipo_seguridad() {
        return tipo_seguridad;
    }

    public String getFecha_activacion() {
        return fecha_activacion;
    }

    public String getHora_activacion() {
        return hora_activacion;
    }

    public void setTipo_seguridad(String tipo_seguridad) {
        this.tipo_seguridad = tipo_seguridad;
    }

    public void setFecha_activacion(String fecha_activacion) {
        this.fecha_activacion = fecha_activacion;
    }

    public void setHora_activacion(String hora_activacion) {
        this.hora_activacion = hora_activacion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Seguridad{" + "tipo_seguridad=" + tipo_seguridad + ", fecha_activacion=" + fecha_activacion + ", hora_activacion=" + hora_activacion + '}';
    }

}
