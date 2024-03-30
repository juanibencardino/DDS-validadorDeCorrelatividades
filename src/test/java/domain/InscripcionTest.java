package domain;

import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {
    @Test
    public void verificaInscripcionApdp() {
        //Primero creo Materias
        Materia pdp = new Materia("Paradigmas de Programacion");
        Materia aed = new Materia("Algoritmos y Estructuras de Datos");
        Materia dds = new Materia("Diseño de Sistemas");
        Materia discreta = new Materia("Matematica Discreta");

        pdp.agregarCorrelativas(aed, discreta);

        dds.agregarCorrelativas(aed, pdp, discreta);

        //Creo un alumno
        Alumno alumno1 = new Alumno("Juan", "Perez");
        alumno1.agregarMateriasAprobadas(aed, discreta);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno1);
        inscripcion.agregarMaterias(pdp);

        Assert.assertTrue(inscripcion.aprobada());

    }
    @Test
    public void verificaInsripcionNoAprobada() {
        //Primero creo Materias
        Materia pdp = new Materia("Paradigmas de Programacion");
        Materia aed = new Materia("Algoritmos y Estructuras de Datos");
        Materia dds = new Materia("Diseño de Sistemas");
        Materia discreta = new Materia("Matematica Discreta");

        pdp.agregarCorrelativas(aed, discreta);

        dds.agregarCorrelativas(aed, pdp, discreta);

        //Creo un alumno
        Alumno alumno1 = new Alumno("Juan", "Perez");
        alumno1.agregarMateriasAprobadas(aed, discreta);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno1);
        inscripcion.agregarMaterias(pdp, dds);

        Assert.assertFalse(inscripcion.aprobada());

    }

}
