package Recursos;

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

    public void mostrarInventario() {
        // Mostrar el inventario actual
    }
}


}
