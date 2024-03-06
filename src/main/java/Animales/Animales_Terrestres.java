package Animales;

public class Animales_Terrestres extends Animales{

    // Atributos clase Animales_Terrestres
    String pelaje;
    String garras;
    String tipo_patas;

    // Constructor clase Animales_Terrestres
    public Animales_Terrestres(String nombre, String tipo, String raza, String color, String edad, Float peso, Float altura, Boolean vacunado, Boolean esterilizado, String pelaje, String garras, String tipo_patas) {
        super(nombre, tipo, raza, color, edad, peso, altura, vacunado, esterilizado);
        this.pelaje = pelaje;
        this.garras = garras;
        this.tipo_patas = tipo_patas;
    }

    // Getters y Setters
    public String getPelaje() {
        return pelaje;
    }

    public String getGarras() {
        return garras;
    }

    public String getTipo_patas() {
        return tipo_patas;
    }
}
