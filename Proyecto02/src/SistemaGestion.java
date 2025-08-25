import java.util.*;

public class SistemaGestion {
    private final Map<String, Estudiante> estudiantes = new HashMap<>();
    private final Map<String, Profesor> profesores = new HashMap<>();
    private final Map<String, Curso> cursos = new HashMap<>();

    // Altas
    public void agregarEstudiante(Estudiante e) { estudiantes.put(e.getId(), e); }
    public void agregarProfesor(Profesor p) { profesores.put(p.getId(), p); }
    public void agregarCurso(Curso c) { cursos.put(c.getCodigo(), c); }

    // Búsquedas
    public Estudiante buscarEstudiante(String id) { return estudiantes.get(id); }
    public Profesor buscarProfesor(String id) { return profesores.get(id); }
    public Curso buscarCurso(String codigo) { return cursos.get(codigo); }

    // Inscripciones
    public boolean inscribir(String idEstudiante, String codCurso) {
        Estudiante e = estudiantes.get(idEstudiante);
        Curso c = cursos.get(codCurso);
        if (e == null || c == null) return false;
        return c.inscribir(e);
    }

    public boolean desinscribir(String idEstudiante, String codCurso) {
        Curso c = cursos.get(codCurso);
        if (c == null) return false;
        return c.desinscribir(idEstudiante);
    }

    // Reportes
    public List<Curso> cursosDisponibles() {
        List<Curso> res = new ArrayList<>();
        for (Curso c : cursos.values()) if (c.hayCupos()) res.add(c);
        res.sort(Comparator.comparing(Curso::getCodigo));
        return res;
    }

    public void imprimirResumen() {
        System.out.println("=== PROFESORES ===");
        profesores.values().forEach(p -> System.out.println(" - " + p.resumen()));
        System.out.println("\n=== ESTUDIANTES ===");
        estudiantes.values().forEach(e -> System.out.println(" - " + e.resumen()));
        System.out.println("\n=== CURSOS ===");
        cursos.values().forEach(c -> System.out.println(" - " + c.resumen()));
    }

    public Map<String, Integer> conteoMatriculadosPorCurso() {
        Map<String, Integer> m = new TreeMap<>();
        for (Curso c : cursos.values()) m.put(c.getCodigo(), c.getMatriculados());
        return m;
    }
}
