package Animales;

public class Animales_Aviarios extends Animales{

    // Atributos clase Animales_Aviarios
    String plumaje;
    String pico;
    String tipo_patas;

// Constructor clase Animales_Aviarios
    public Animales_Aviarios(String nombre, String tipo, String raza, String color, String edad, Float peso, Float altura, Boolean vacunado, Boolean esterilizado, String plumaje, String pico, String tipo_patas) {
        super(nombre, tipo, raza, color, edad, peso, altura, vacunado, esterilizado);
        this.plumaje = plumaje;
        this.pico = pico;
        this.tipo_patas = tipo_patas;
    }

    public Animales_Aviarios(String setNombre, String setEdad, String setRaza, String setColor, Float setPeso, Float setAltura, Boolean setVacunado, Boolean setEsterilizado, String setTipoPico, Boolean setVuela, Boolean setPlumas) {
        super();
    }

    // getters y setters
    public String getPlumaje() {
        return plumaje;
    }

    public String getPico() {
        return pico;
    }

    public String getTipo_patas() {
        return tipo_patas;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public void setTipo_patas(String tipo_patas) {
        this.tipo_patas = tipo_patas;
    }

    // Método toString
    @Override
    public String toString() {
        return "Animales_Aviarios{" + "plumaje=" + plumaje + ", pico=" + pico + ", tipo_patas=" + tipo_patas + '}';
    }

}
