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
    public void mostrarCondiciones() {
        System.out.println("Condiciones del hábitat " + nombre + ":");
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Humedad: " + humedad + "%");
        System.out.println("Limpieza: " + limpieza + "%\n");
    }
}
class HabitatAcuatico extends Habitat {
    private double nivelAgua;
    public HabitatAcuatico(String nombre) {
        super(nombre);
    }
    public void monitorear() {
        super.monitorear();
        System.out.println("Nivel de agua: " + nivelAgua + " metros\n");
    }
    public void setNivelAgua(double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }
}
class HabitatTerrestre extends Habitat {
    private String tipoSuelo;
