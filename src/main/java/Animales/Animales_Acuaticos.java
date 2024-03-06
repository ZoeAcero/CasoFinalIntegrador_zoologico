package Animales;

public class Animales_Acuaticos extends Animales{

    // Atributos clase Animales_Acuaticos
    String escamas;
    String aletas;
    String branquias;

    // Constructor clase Animales_Acuaticos
public Animales_Acuaticos(String nombre, String tipo, String raza, String color, String edad, Float peso, Float altura, Boolean vacunado, Boolean esterilizado, String escamas, String aletas, String branquias) {
        super(nombre, tipo, raza, color, edad, peso, altura, vacunado, esterilizado);
        this.escamas = escamas;
        this.aletas = aletas;
        this.branquias = branquias;
    }

    // Getters y Setters
    public String getEscamas() {
        return escamas;
    }

    public String getAletas() {
        return aletas;
    }

    public String getBranquias() {
        return branquias;
    }

    public void setEscamas(String escamas) {
        this.escamas = escamas;
    }


}
