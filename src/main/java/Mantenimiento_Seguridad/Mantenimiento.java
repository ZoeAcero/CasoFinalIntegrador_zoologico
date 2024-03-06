package Mantenimiento_Seguridad;

public class Mantenimiento extends Instalaciones{

    // Atributos
    String tipo_mantenimiento;
    String fecha_mantenimiento;
    String hora_mantenimiento;

    // Constructor
    public Mantenimiento(String nombre, String ubicacion, String tipo, String tipo_mantenimiento, String fecha_mantenimiento, String hora_mantenimiento) {
        super(nombre, ubicacion, tipo);
        this.tipo_mantenimiento = tipo_mantenimiento;
        this.fecha_mantenimiento = fecha_mantenimiento;
        this.hora_mantenimiento = hora_mantenimiento;
    }

    // Getters y Setters
    public String getTipo_mantenimiento() {
        return tipo_mantenimiento;
    }

}
