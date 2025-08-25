package lp3.s02.proy;

public abstract class Persona implements IReportable {
    private final String id;
    private String nombre;
    private String email;

    protected Persona(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public abstract String getRol();

    @Override
    public String resumen() {
        return String.format("%s[id=%s, nombre=%s, email=%s]",
                getRol(), id, nombre, email);
    }

    @Override
    public String toString() { return resumen(); }
}
