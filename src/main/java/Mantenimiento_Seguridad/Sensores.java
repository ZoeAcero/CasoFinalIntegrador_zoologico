package Mantenimiento_Seguridad;

public class Sensores extends Seguridad{

    // Atributos
    String tipo_sensor;
    String ubicacion_sensor;
    String fecha_instalacion;

    // Constructor
    public Sensores(String nombre, String ubicacion, String tipo, String tipo_seguridad, String fecha_activacion, String hora_activacion, String tipo_sensor, String ubicacion_sensor, String fecha_instalacion) {
        super(nombre, ubicacion, tipo, tipo_seguridad, fecha_activacion, hora_activacion);
        this.tipo_sensor = tipo_sensor;
        this.ubicacion_sensor = ubicacion_sensor;
        this.fecha_instalacion = fecha_instalacion;
    }

    // Getters y Setters
    public String getTipo_sensor() {
        return tipo_sensor;
    }

    public String getUbicacion_sensor() {
        return ubicacion_sensor;
    }

}
