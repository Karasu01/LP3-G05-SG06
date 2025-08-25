public class Estudiante extends Persona {
    public static final int MAX_CREDITOS = 21;

    private String carrera;
    private int creditosActuales;

    public Estudiante(String id, String nombre, String email, String carrera) {
        super(id, nombre, email);
        this.carrera = carrera;
        this.creditosActuales = 0;
    }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public int getCreditosActuales() { return creditosActuales; }
    public void sumarCreditos(int c) { this.creditosActuales += c; }
    public void restarCreditos(int c) { this.creditosActuales -= c; if (creditosActuales < 0) creditosActuales = 0; }

    @Override public String getRol() { return "Estudiante"; }

    @Override
    public String resumen() {
        return String.format("%s | carrera=%s | créditos=%d/%d :: %s",
                getRol(), carrera, creditosActuales, MAX_CREDITOS, getNombre());
    }
}
