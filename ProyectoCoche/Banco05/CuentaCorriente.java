package Banco05;

public class CuentaCorriente extends Cuenta {
    private int retiros;
    private static final int LIMITE_RETIROS = 3;

    public CuentaCorriente(double saldoInicial) {
        super(saldoInicial);
        this.retiros = 0;
    }

    @Override
    public void retirar(double monto) {
        retiros++;
        if (retiros > LIMITE_RETIROS) {
            saldo -= 3; // comisión
        }
        super.retirar(monto);
    }

    @Override
    public void consultar() {
        retiros = 0; // reinicia retiros
    }
}
