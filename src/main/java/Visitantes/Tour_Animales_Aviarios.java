package Visitantes;

public class Tour_Animales_Aviarios extends Visitantes implements TourGuiado{

    // Constructor
    public Tour_Animales_Aviarios(String Edad, String InteresVisitante, String fechaVisita, String horaVisita) {
        super(Edad, InteresVisitante, fechaVisita, horaVisita);
    }

    // Getters y Setters
    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getInteresVisitante() {
        return InteresVisitante;
    }

    public void setInteresVisitante(String InteresVisitante) {
        this.InteresVisitante = InteresVisitante;
    }

    public String getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    // Metodo toString
    @Override
    public void realizarTour() {
        System.out.println(("¡Bienvenidos! Vamos a explorar el aviario y aprender sobre las aves."));
    }
}
