package lp3.s02.proy;

public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String id, String nombre, String email, String especialidad) {
        super(id, nombre, email);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    @Override public String getRol() { return "Profesor"; }

    @Override
    public String resumen() {
        return String.format("%s | esp=%s :: %s", getRol(), especialidad, getNombre());
    }
}
