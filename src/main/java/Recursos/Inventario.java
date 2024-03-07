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

    public void agregarMedicina(Medicinas medicina){
        this.medicinas.add(medicina);
    }

    public void agregarAlimento(Alimentos alimento){
        this.alimentos.add(alimento);
    }

    public void agregarEquipamiento(Equipamiento equipamiento){
        this.equipamiento.add(equipamiento);
    }

    public void eliminarMedicina(Medicinas medicina){
        this.medicinas.remove(medicina);
    }

    public void eliminarAlimento(Alimentos alimento){
        this.alimentos.remove(alimento);
    }


