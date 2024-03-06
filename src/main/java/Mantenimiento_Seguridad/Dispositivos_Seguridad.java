package Mantenimiento_Seguridad;

public class Dispositivos_Seguridad extends Seguridad{

    public abstract class DispositivoSeguridad {
        protected int id;

        // Constructor
        public DispositivoSeguridad(int id) {
            this.id = id;
        }
}
