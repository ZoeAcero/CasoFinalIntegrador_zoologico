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

public String getCorales() {
    return corales;
}

public void setTipo_agua(String tipo_agua) {
    this.tipo_agua = tipo_agua;
}

public void setSalinidad(String salinidad) {
    this.salinidad = salinidad;
}

public void setCorales(String corales) {
    this.corales = corales;
}

// Método toString
@Override
public String toString() {
    return "Habitat_Acuatico{" + "tipo_agua=" + tipo_agua + ", salinidad=" + salinidad + ", corales=" + corales + '}';
}
