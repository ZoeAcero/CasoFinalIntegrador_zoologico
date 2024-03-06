package Mantenimiento_Seguridad;

public class Camara extends Seguridad {

    // Atributos
    String tipo_camara;
    String ubicacion_camara;
    String fecha_instalacion;

    // Constructor
    public Camara(String nombre, String ubicacion, String tipo, String tipo_seguridad, String fecha_activacion, String hora_activacion, String tipo_camara, String ubicacion_camara, String fecha_instalacion) {
        super(nombre, ubicacion, tipo, tipo_seguridad, fecha_activacion, hora_activacion);
        this.tipo_camara = tipo_camara;
        this.ubicacion_camara = ubicacion_camara;
        this.fecha_instalacion = fecha_instalacion;
    }

    // Getters y Setters
    public String getTipo_camara() {
        return tipo_camara;
    }

    public String getUbicacion_camara() {
        return ubicacion_camara;
    }



}
