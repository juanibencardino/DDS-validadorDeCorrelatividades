package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativasNecesarias;

    public Materia(String nombre){
        this.nombre = nombre;
        this.correlativasNecesarias = new ArrayList<>();
    }

    public void agregarCorrelativas(Materia ... materias){
        Collections.addAll(this.correlativasNecesarias, materias);
    }

    public List<Materia> getCorrelativasNecesarias() {
        return correlativasNecesarias;
    }
}
