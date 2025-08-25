package Contador02;
public class ContadorTest {
    public static void main(String[] args) {
        Contador02 c1 = new Contador02(5);
        Contador02 c2 = new Contador02(10);

        c1.inc();
        c2.inc();

        System.out.println("Valor de c1: " + c1.getValor());
        System.out.println("Valor de c2: " + c2.getValor());
        System.out.println("Acumulador: " + Contador02.getAcumulador());
    }
}
