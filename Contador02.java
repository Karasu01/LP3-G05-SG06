package Contador02;
public class Contador02 {
    private int valor;
    static int acumulador = 0; 

    public Contador02(int valor) {
        this.valor = valor;
        acumulador += valor;
    }

    public void inc() {
        valor++;
        acumulador++;
    }

    public int getValor() { return valor; }
    public static int getAcumulador() { return acumulador; }
}
