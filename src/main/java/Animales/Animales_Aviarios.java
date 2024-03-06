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

}
