package Domain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorAcademico {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;
    private Map<Curso, List<Estudiante>> inscripciones;

    // Constructor
    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscripciones = new HashMap<>();
    }

    // Métodos  estudiantes
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Estudiante> obtenerEstudiantes() {
        return estudiantes;
    }

    // Métodos para gestionar cursos
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        inscripciones.put(curso, new ArrayList<>());
    }

    public List<Curso> obtenerCursos() {
        return cursos;
    }

    // Métodos  inscripciones
    public void inscribirEstudianteEnCurso(Estudiante estudiante, Curso curso) {
        List<Estudiante> estudiantesInscritos = inscripciones.get(curso);
        estudiantesInscritos.add(estudiante);
    }

    public List<Estudiante> obtenerEstudiantesInscritosEnCurso(Curso curso) {
        return inscripciones.get(curso);
    }


}
