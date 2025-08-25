package Banco05;

public class Ahorro extends Cuenta {
    private double tasaInteres;

    public Ahorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void consultar() {
        double interes = saldo * tasaInteres;
        depositar(interes);
        System.out.println("Intereses acumulados: " + interes);
    }
}
