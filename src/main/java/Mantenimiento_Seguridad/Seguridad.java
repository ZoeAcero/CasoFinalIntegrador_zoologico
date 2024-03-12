package Mantenimiento_Seguridad;

import java.util.List;

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

    public Seguridad(List<Camara> camaras, List<Sensores> sensores) {
    }
}
