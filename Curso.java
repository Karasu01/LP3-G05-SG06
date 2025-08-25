package lp3.s02.proy;

import java.util.*;

public abstract class Curso implements IReportable {
    private final String codigo;
    private String nombre;
    private final Categoria categoria;
    private Profesor profesor;              // agregación (puede existir sin el curso)
    private int capacidad;
    private int creditos;

    // Composición: las inscripciones "viven" dentro del curso
    private final List<Inscripcion> inscripciones = new ArrayList<>();

    // Variable de clase
    private static int totalCursos = 0;

    protected Curso(String codigo, String nombre, Categoria categoria, Profesor profesor, int capacidad, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.profesor = profesor;
        this.capacidad = capacidad;
        this.creditos = creditos;
        totalCursos++;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Categoria getCategoria() { return categoria; }
    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }

    public int getMatriculados() { return inscripciones.size(); }
    public List<Inscripcion> getInscripciones() { return Collections.unmodifiableList(inscripciones); }

    public static int getTotalCursos() { return totalCursos; }

    public boolean hayCupos() { return getMatriculados() < capacidad; }

    public boolean inscribir(Estudiante e) {
        if (e.getCreditosActuales() + creditos > Estudiante.MAX_CREDITOS) return false;
        if (!hayCupos()) return false;
        // evitar duplicados
        for (Inscripcion i : inscripciones) if (i.getEstudiante().getId().equals(e.getId())) return false;
        inscripciones.add(new Inscripcion(this, e));
        e.sumarCreditos(creditos);
        return true;
    }

    public boolean desinscribir(String idEstudiante) {
        Iterator<Inscripcion> it = inscripciones.iterator();
        while (it.hasNext()) {
            Inscripcion i = it.next();
            if (i.getEstudiante().getId().equals(idEstudiante)) {
                it.remove();
                i.getEstudiante().restarCreditos(creditos);
                return true;
            }
        }
        return false;
    }

    @Override
    public String resumen() {
        return String.format("%s %s | %s | prof=%s | cupo %d/%d | créditos=%d",
                getTipo(), codigo, nombre,
                (profesor!=null? profesor.getNombre() : "-"),
                getMatriculados(), capacidad, creditos);
    }

    public abstract String getTipo();

    @Override
    public String toString() { return resumen(); }
}
