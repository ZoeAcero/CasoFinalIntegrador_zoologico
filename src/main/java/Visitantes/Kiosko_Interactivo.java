package Visitantes;
import Animales.Animales;
import Hábitats.Hábitat;

public class Kiosko_Interactivo {
public void interactuarConAnimales(Animales animal) {

    System.out.println("Informacion del Animal: ");
    System.out.println("Nombre: " + animal.getNombre());
    System.out.println("tipo: " + animal.getTipo());
    System.out.println("Edad: " + animal.getEdad());
    System.out.println("raza: " + animal.getRaza());
    System.out.println("Peso: " + animal.getPeso());
    System.out.println("Altura: " + animal.getAltura());
    System.out.println("Color: " + animal.getColor());
    System.out.println("Vacunado: " + animal.getVacunado());
    System.out.println("Esterilizado: " + animal.getEsterilizado());
   }

    public void interactuarConHabitat(Hábitat habitat) {
     System.out.println("Informacion del Habitat: ");
     System.out.println("Nombre: " + habitat.getNombre());
     System.out.println("tipo: " + habitat.getTipo());
     System.out.println("Tamaño: " + habitat.getTamaño());
     System.out.println("Humedad: " + habitat.getHumedad());
     System.out.println("Temperatura: " + habitat.getTemperatura());
     System.out.println("Limpieza: " + habitat.getLimpieza());
    }





}
