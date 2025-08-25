package Pulsar03;
public class Motor {
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String toString() {
        return "Motor tipo: " + tipo + ", potencia: " + potencia + " HP";
    }
}
