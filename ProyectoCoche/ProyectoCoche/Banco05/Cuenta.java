package Banco05;
public class Cuenta {
    protected double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) { saldo += monto; }
    public void retirar(double monto) { saldo -= monto; }
    public double getSaldo() { return saldo; }

    public void consultar() {

    }
}
