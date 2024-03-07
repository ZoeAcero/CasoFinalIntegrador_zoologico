package Visitantes;

public class Tour_Animales_Aviarios extends Visitantes implements TourGuiado{

    // Constructor
    public Tour_Animales_Aviarios(String Edad, String InteresVisitante, String fechaVisita, String horaVisita) {
        super(Edad, InteresVisitante, fechaVisita, horaVisita);
    }

    // Metodo toString
    @Override
    public void realizarTour() {
        System.out.println(("¡Bienvenidos! Vamos a explorar el aviario y aprender sobre las aves."));
    }
}