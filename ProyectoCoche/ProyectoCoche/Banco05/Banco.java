package Banco05;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Cuenta cuentas[] = new Cuenta[2];
        cuentas[0] = new CuentaAhorro(1000, 0.02);
        cuentas[1] = new CuentaCorriente(1500);

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1) Depositar  2) Retirar  3) Consultar  4) Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cuentas[0].depositar(200);
                    break;
                case 2:
                    cuentas[1].retirar(100);
                    break;
                case 3:
                    for (Cuenta c : cuentas) {
                        c.consultar();
                        System.out.println("Saldo: " + c.getSaldo());
                    }
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}
