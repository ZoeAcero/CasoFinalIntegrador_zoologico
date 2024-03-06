package Mantenimiento_Seguridad;

public class Seguridad extends Instalaciones{

    // Atributos
    String tipo_seguridad;
    String fecha_activacion;
    String hora_activacion;

    // Constructor
    public Seguridad(String nombre, String ubicacion, String tipo, String tipo_seguridad, String fecha_activacion, String hora_activacion) {
        super(nombre, ubicacion, tipo);
        this.tipo_seguridad = tipo_seguridad;
        this.fecha_activacion = fecha_activacion;
        this.hora_activacion = hora_activacion;
    }

}
