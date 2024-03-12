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

    public Animales_Terrestres(String setNombre, String setEdad, String setRaza, String setColor, Float setPeso, Float setAltura, Boolean setVacunado, Boolean setEsterilizado, String setPelaje, int setNumeroPatas) {
        super();
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

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public void setGarras(String garras) {
        this.garras = garras;
    }

    public void setTipo_patas(String tipo_patas) {
        this.tipo_patas = tipo_patas;
    }

    // Método toString
    @Override
    public String toString() {
        return "Animales_Terrestres{" + "pelaje=" + pelaje + ", garras=" + garras + ", tipo_patas=" + tipo_patas + '}';
    }
}
