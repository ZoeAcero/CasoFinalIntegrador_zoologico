package Recursos;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Medicinas> medicinas;
    private List<Alimentos> alimentos;
    private List<Equipamiento> equipamiento;

    public Inventario() {
        this.medicinas = new ArrayList<>();
        this.alimentos = new ArrayList<>();
        this.equipamiento = new ArrayList<>();
    }

    
}
