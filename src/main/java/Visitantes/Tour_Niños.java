package Visitantes;

public class Tour_Niños extends Visitantes implements TourGuiado{

// Constructor
    public Tour_Niños(String Edad, String InteresVisitante, String fechaVisita, String horaVisita) {
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

    public String getHoraVisita() {
        return horaVisita;
    }

    // Metodo toString
    @Override
    public void realizarTour() {
        System.out.println(("¡Bienvenidos niños! Vamos a explorar el zoológico y aprender sobre los animales."));
    }


}
