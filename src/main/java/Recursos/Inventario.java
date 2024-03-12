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

    public void eliminarMedicina(String medicina){
        this.medicinas.remove(medicina);
    }

    public void eliminarAlimento(String alimento){
        this.alimentos.remove(alimento);
    }

    public void eliminarEquipamiento(String equipamiento){
        this.equipamiento.remove(equipamiento);
    }

    // Metodos para verificar la cantidad de un recurso
    public int cantidadMedicinas(){
        return this.medicinas.size();
    }

    public int cantidadAlimentos(){
        return this.alimentos.size();
    }

    public int cantidadEquipamiento(){
        return this.equipamiento.size();
    }

}


