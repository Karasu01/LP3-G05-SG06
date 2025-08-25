package lp3.s02.proy;

public class CursoVirtual extends Curso {
    private String plataforma;

    public CursoVirtual(String codigo, String nombre, Categoria categoria,
                        Profesor profesor, int creditos, String plataforma) {
        // capacidad muy alta para virtual
        super(codigo, nombre, categoria, profesor, Integer.MAX_VALUE / 2, creditos);
        this.plataforma = plataforma;
    }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    @Override public String getTipo() { return "Virtual"; }

    @Override
    public boolean hayCupos() { return true; } // virtual siempre disponible

    @Override
    public String resumen() {
        return super.resumen() + String.format(" | plataforma=%s", plataforma);
    }
}
