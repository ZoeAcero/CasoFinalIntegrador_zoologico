package Hábitats;

public class Habitat_Terrestre extends Hábitat {
    // Atributos clase Habitat_Terrestre
    String tipo_suelo;
    String vegetacion;
    String rocas;

        // Constructor clase Habitat_Terrestre
        public Habitat_Terrestre(String nombre, String humedad, String temperatura, String tipo, String tamaño, String limpieza, String tipo_suelo, String vegetacion, String rocas) {
            super(nombre, humedad, temperatura, tipo, tamaño, limpieza);
            this.tipo_suelo = tipo_suelo;
            this.vegetacion = vegetacion;
            this.rocas = rocas;
        }

        // Getters y Setters
        public String getTipo_suelo() {
            return tipo_suelo;
        }

        public String getVegetacion() {
            return vegetacion;
        }

        public String getRocas() {
            return rocas;
        }

        public void setTipo_suelo(String tipo_suelo) {
            this.tipo_suelo = tipo_suelo;
        }

        public void setVegetacion(String vegetacion) {
            this.vegetacion = vegetacion;
        }







}
