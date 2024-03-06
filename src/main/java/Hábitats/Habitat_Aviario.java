package Hábitats;

public class Habitat_Aviario extends Hábitat{

    // Atributos clase Habitat_Aviario
    String tipo_aves;
    String tipo_alimentacion;
    String tipo_nidos;

    // Constructor clase Habitat_Aviario
    public Habitat_Aviario(String nombre, String humedad, String temperatura, String tipo, String tamaño, String limpieza, String tipo_aves, String tipo_alimentacion, String tipo_nidos) {
        super(nombre, humedad, temperatura, tipo, tamaño, limpieza);
        this.tipo_aves = tipo_aves;
        this.tipo_alimentacion = tipo_alimentacion;
        this.tipo_nidos = tipo_nidos;
    }

    // Getters y Setters
    public String getTipo_aves() {
        return tipo_aves;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public String getTipo_nidos() {
        return tipo_nidos;
    }
}
