package Mantenimiento_Seguridad;

public class Mantenimiento {

    //Atributos
    String nombre;
    String tipo;
    boolean mantenimientoProgramado;

    //Constructor
    public Mantenimiento(String nombre, String tipo, boolean mantenimientoProgramado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.mantenimientoProgramado = mantenimientoProgramado;
    }
}
