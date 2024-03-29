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

    // Método para activar y desactivar sensores
    public void activarSensor() {
        System.out.println("Activando sensor en " + nombre);
    }

    public void desactivarSensor() {
        System.out.println("Desactivando sensor en " + nombre);
    }


    // Getters y Setters
    public String getTipo_sensor() {
        return tipo_sensor;
    }

    public String getUbicacion_sensor() {
        return ubicacion_sensor;
    }

    public String getFecha_instalacion() {
        return fecha_instalacion;
    }

    public void setTipo_sensor(String tipo_sensor) {
        this.tipo_sensor = tipo_sensor;
    }

    public void setUbicacion_sensor(String ubicacion_sensor) {
        this.ubicacion_sensor = ubicacion_sensor;
    }

    public void setFecha_instalacion(String fecha_instalacion) {
        this.fecha_instalacion = fecha_instalacion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Sensores{" + "tipo_sensor=" + tipo_sensor + ", ubicacion_sensor=" + ubicacion_sensor + ", fecha_instalacion=" + fecha_instalacion + '}';
    }

}
