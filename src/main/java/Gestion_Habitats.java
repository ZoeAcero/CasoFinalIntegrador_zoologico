public class Gestion_Habitats {
}

class Habitat {
    protected String nombre;
    protected double temperatura;
    protected double humedad;
    protected double limpieza;
    public Habitat(String nombre) {
        this.nombre = nombre;
    }
    public void monitorear() {
        System.out.println("Monitoreando el hábitat " + nombre + "...");
    }
