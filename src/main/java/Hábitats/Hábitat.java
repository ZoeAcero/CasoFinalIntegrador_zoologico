package Hábitats;

public class Hábitat {

    // Atributos clase Hábitat
    String nombre;
    String humedad;
    String temperatura;
    String tipo;
    String tamaño;
    String limpieza;

    // Constructor clase Hábitat
    public Hábitat(String nombre, String humedad, String temperatura, String tipo, String tamaño, String limpieza) {
        this.nombre = nombre;
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.limpieza = limpieza;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getHumedad() {
        return humedad;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getLimpieza() {
        return limpieza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
