package Ej_1;
import java.util.Scanner;
public class Ej_propuesto5 {
    public static double calcularCargo(int horas) {
        double cargo = 3.0; 
        if (horas <= 1) {
            cargo = 3.0;
        } else {
            cargo = 3.0 + (horas - 1) * 0.5;
        }
        if (cargo > 12.0) {
            cargo = 12.0;
        }
        return cargo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de horas: ");
        int horas = sc.nextInt();
        double costo = calcularCargo(horas);
        System.out.println("El cargo es: S/" + costo);
        sc.close();
    }
}
