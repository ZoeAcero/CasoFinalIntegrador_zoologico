package Hábitats;

public class Habitat_Acuatico extends Hábitat {
    // Atributos clase Habitat_Acuatico
    String tipo_agua;
String salinidad;
String corales;

// Constructor clase Habitat_Acuatico
public Habitat_Acuatico(String nombre, String humedad, String temperatura, String tipo, String tamaño, String limpieza, String tipo_agua, String salinidad, String corales) {
    super(nombre, humedad, temperatura, tipo, tamaño, limpieza);
}

// Getters y Setters
public String getTipo_agua() {
    return tipo_agua;
}

public String getSalinidad() {
    return salinidad;
}
