import java.util.HashMap;
import java.util.Map;
package Recursos;

public class Inventario {
    public class Inventario {
        private Map<Recurso, Integer> inventario;

        public Inventario() {
            this.inventario = new HashMap<>();
        }
        public void agregarRecurso(Recurso recurso, int cantidad) {
            inventario.put(recurso, cantidad);
        }

        public void actualizarInventario(Recurso recurso, int cantidad) {
            // Actualizar la cantidad en el inventario
        }



    }
