package lp3.s02.proy;

import java.util.*;

public class AppCursos {
    public static void main(String[] args) {
        SistemaGestion sg = new SistemaGestion();

        // Profesores
        Profesor p1 = new Profesor("P01", "Karim Guevara", "karim@ucsm.edu", "POO");
        Profesor p2 = new Profesor("P02", "Ángel Montesinos", "angel@ucsm.edu", "Estructuras");

        sg.agregarProfesor(p1);
        sg.agregarProfesor(p2);

        // Estudiantes
        sg.agregarEstudiante(new Estudiante("E01", "Henrik LK", "henrik@ucsm.edu", "Ing. Sistemas"));
        sg.agregarEstudiante(new Estudiante("E02", "Sofía Ruiz", "sofia@ucsm.edu", "Ing. Sistemas"));
        sg.agregarEstudiante(new Estudiante("E03", "Dario Vega", "dario@ucsm.edu", "Ing. Industrial"));

        // Cursos
        Curso c1 = new CursoPresencial("LP3-101", "POO en Java", Categoria.PROGRAMACION, p1, 2, 4, "Lab B-201");
        Curso c2 = new CursoVirtual("MAT-110", "Cálculo I", Categoria.MATEMATICAS, p2, 5, "Teams");
        sg.agregarCurso(c1);
        sg.agregarCurso(c2);

        // Menú simple
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.println("\nD) inscribir  X) desinscribir  L) listar  A) disponibles  C) conteo  S) salir");
            String op = in.next().trim().toUpperCase();
            switch (op) {
                case "D": {
                    System.out.print("ID estudiante: ");
                    String id = in.next();
                    System.out.print("Código curso: ");
                    String cod = in.next();
                    boolean ok = sg.inscribir(id, cod);
                    System.out.println(ok ? "Inscripción OK" : "No se pudo inscribir");
                    break;
                }
                case "X": {
                    System.out.print("ID estudiante: ");
                    String id = in.next();
                    System.out.print("Código curso: ");
                    String cod = in.next();
                    boolean ok = sg.desinscribir(id, cod);
                    System.out.println(ok ? "Desinscripción OK" : "No se pudo desinscribir");
                    break;
                }
                case "L": {
                    sg.imprimirResumen();
                    break;
                }
                case "A": {
                    System.out.println("=== Cursos con cupos ===");
                    for (Curso c : sg.cursosDisponibles()) System.out.println(" - " + c.resumen());
                    break;
                }
                case "C": {
                    System.out.println("=== Matriculados por curso ===");
                    sg.conteoMatriculadosPorCurso().forEach((k,v) -> System.out.println(k + " -> " + v));
                    break;
                }
                case "S": done = true; break;
                default: System.out.println("Opción inválida");
            }
        }
        in.close();
        System.out.println("Fin.");
    }
}
