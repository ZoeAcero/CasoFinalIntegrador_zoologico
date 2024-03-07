package Visitantes;

public class Tour_Niños extends Visitantes implements TourGuiado{

// Constructor
    public Tour_Niños(String Edad, String InteresVisitante, String fechaVisita, String horaVisita) {
        super(Edad, InteresVisitante, fechaVisita, horaVisita);
    }

    // Método
    @Override
    public void realizarTour() {
        System.out.println(("¡Bienvenidos niños! Vamos a explorar el zoológico y aprender sobre los animales.");
    }


}
