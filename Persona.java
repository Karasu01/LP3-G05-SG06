package Cuenta04;
public class Persona {
    private String nombre;
    private Cuenta cuenta; 

    public Persona(String nombre, double saldoInicial) {
        this.nombre = nombre;
        this.cuenta = new Cuenta(saldoInicial);
    }

    public String toString() {
        return "Persona: " + nombre + ", " + cuenta.toString();
    }
}
