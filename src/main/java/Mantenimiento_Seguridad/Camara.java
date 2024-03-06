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

    // Método para activar y desactivar cámaras
    public void activarCamara() {
        System.out.println("Activando cámara en " + nombre);
    }

    public void desactivarCamara() {
        System.out.println("Desactivando cámara en " + nombre);
    }


    // Getters y Setters
    public String getTipo_camara() {
        return tipo_camara;
    }

    public String getUbicacion_camara() {
        return ubicacion_camara;
    }

    public String getFecha_instalacion() {
        return fecha_instalacion;
    }

    public void setTipo_camara(String tipo_camara) {
        this.tipo_camara = tipo_camara;
    }

    public void setUbicacion_camara(String ubicacion_camara) {
        this.ubicacion_camara = ubicacion_camara;
    }

    public void setFecha_instalacion(String fecha_instalacion) {
        this.fecha_instalacion = fecha_instalacion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Camara{" + "tipo_camara=" + tipo_camara + ", ubicacion_camara=" + ubicacion_camara + ", fecha_instalacion=" + fecha_instalacion + '}';
    }



}
