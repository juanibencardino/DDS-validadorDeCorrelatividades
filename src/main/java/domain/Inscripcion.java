package domain;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private List<Materia> materias;
    private Alumno alumno;
    public Inscripcion(){
        this.materias = new ArrayList<>();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public boolean aprobada(){
        // Si el alumno cumple las correlativas de todas las materias a las que se inscibio.
        return this.materias.stream().allMatch(m -> this.alumno.getMateriasAprobadas().containsAll(m.getCorrelativasNecesarias()));
    }

    public void agregarMaterias(Materia ... materias) {
        Collections.addAll(this.materias, materias);
    }
}
