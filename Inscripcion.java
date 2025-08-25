package lp3.s02.proy;

import java.time.LocalDateTime;

class Inscripcion {
    private final Curso curso;
    private final Estudiante estudiante;
    private final LocalDateTime fecha;

    // Constructor de paquete: solo Curso puede crear inscripciones
    Inscripcion(Curso curso, Estudiante estudiante) {
        this.curso = curso;
        this.estudiante = estudiante;
        this.fecha = LocalDateTime.now();
    }

    public Curso getCurso() { return curso; }
    public Estudiante getEstudiante() { return estudiante; }
    public LocalDateTime getFecha() { return fecha; }
}
