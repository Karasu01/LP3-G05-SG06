public class CursoPresencial extends Curso {
    private String aula;

    public CursoPresencial(String codigo, String nombre, Categoria categoria,
                           Profesor profesor, int capacidad, int creditos, String aula) {
        super(codigo, nombre, categoria, profesor, capacidad, creditos);
        this.aula = aula;
    }

    public String getAula() { return aula; }
    public void setAula(String aula) { this.aula = aula; }

    @Override public String getTipo() { return "Presencial"; }

    @Override
    public String resumen() {
        return super.resumen() + String.format(" | aula=%s", aula);
    }
}
